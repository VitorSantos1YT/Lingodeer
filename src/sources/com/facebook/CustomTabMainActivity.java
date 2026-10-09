package com.facebook;

import a0.b2;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import lf.c1;
import lf.e;
import lf.j1;
import lf.k;
import lf.w0;
import o20.i;
import qf.a;
import qp.m4;
import re.n;
import re.s;
import tf.d;
import tf.g0;
import tf.h0;
import x6.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7704c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7705a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f7706b;

    public final void a(Intent intent, int i11) {
        Bundle bundle;
        e eVar = this.f7706b;
        if (eVar != null) {
            b.a(this).d(eVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = j1.E(uri.getQuery());
                bundle.putAll(j1.E(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            m.e(intent2, "intent");
            Intent intentF = c1.f(intent2, bundle, null);
            if (intentF != null) {
                intent = intentF;
            }
            setResult(i11, intent);
        } else {
            Intent intent3 = getIntent();
            m.e(intent3, "intent");
            setResult(i11, c1.f(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        h0 h0Var;
        b2 b2Var;
        boolean z11;
        Uri uriA;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        g0 g0Var = h0.Companion;
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        g0Var.getClass();
        h0[] h0VarArrValues = h0.values();
        int length = h0VarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                h0Var = h0.FACEBOOK;
                break;
            }
            h0Var = h0VarArrValues[i11];
            if (m.a(h0Var.toString(), stringExtra3)) {
                break;
            } else {
                i11++;
            }
        }
        if (n.f49191a[h0Var.ordinal()] == 1) {
            b2Var = new w0(stringExtra, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriA = j1.a(k.e(), "oauth/authorize", bundleExtra);
            } else {
                uriA = j1.a(k.e(), s.e() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!a.b(b2Var)) {
                try {
                    b2Var.f27b = uriA;
                } catch (Throwable th2) {
                    a.a(b2Var, th2);
                }
            }
        } else {
            b2Var = new b2(stringExtra, bundleExtra);
        }
        if (a.b(b2Var)) {
            z11 = false;
        } else {
            try {
                ReentrantLock reentrantLock = d.f52153d;
                reentrantLock.lock();
                m4 m4Var = d.f52152c;
                d.f52152c = null;
                reentrantLock.unlock();
                Intent intent = new Intent("android.intent.action.VIEW");
                if (m4Var != null) {
                    intent.setPackage(((ComponentName) m4Var.f48062d).getPackageName());
                    v.b bVar = (v.b) m4Var.f48061c;
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", bVar);
                    intent.putExtras(bundle2);
                }
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle3);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                Intent intent2 = (Intent) new i(intent, 26).f44522b;
                intent2.setPackage(stringExtra2);
                try {
                    intent2.setData((Uri) b2Var.f27b);
                    startActivity(intent2, null);
                    z11 = true;
                } catch (ActivityNotFoundException unused) {
                    z11 = false;
                }
            } catch (Throwable th3) {
                a.a(b2Var, th3);
            }
        }
        this.f7705a = false;
        if (!z11) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            e eVar = new e(this, 7);
            this.f7706b = eVar;
            b.a(this).b(eVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        m.f(intent, "intent");
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            b.a(this).c(new Intent("CustomTabActivity.action_destroy"));
            a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f7705a) {
            a(null, 0);
        }
        this.f7705a = true;
    }
}
