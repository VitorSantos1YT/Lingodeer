package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import androidx.appcompat.widget.Toolbar;
import bp.g1;
import bp.s4;
import bp.w3;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f10.k;
import fr.o0;
import hh.p0;
import hj.q0;
import java.util.Objects;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import mf.sOm.txBUGYhC;
import org.greenrobot.eventbus.ThreadMode;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteUrlActivity extends b {
    public static final /* synthetic */ int R = 0;
    public String P;
    public String Q;

    public RemoteUrlActivity() {
        super(BuildConfig.VERSION_NAME, s4.f4806a);
        this.P = BuildConfig.VERSION_NAME;
        this.Q = BuildConfig.VERSION_NAME;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        m.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_nevigation_webview, menu);
        return true;
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        m.f(event, "event");
        if (event.getKeyCode() == 4) {
            if (((q0) j()).f33132c.canGoBack()) {
                ((q0) j()).f33132c.goBack();
                return true;
            }
            super.onBackPressed();
        }
        return super.onKeyDown(i11, event);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        m.f(item, "item");
        if (item.getItemId() == R.id.item_open_url) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.P));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(Object refreshEvent) {
        m.f(refreshEvent, "refreshEvent");
        if ((refreshEvent instanceof np.b) && ((np.b) refreshEvent).f43921a == 26) {
            this.f36392t.getContent();
            if (this.f36392t.getContent().length() > 0) {
                Uri uriBuild = Uri.parse(this.f36392t.getContent()).buildUpon().appendQueryParameter("uid", ((o0) l()).w()).build();
                Objects.toString(uriBuild);
                boolean z11 = false;
                for (String str : uriBuild.getQueryParameterNames()) {
                    if (m.a(str, "oib")) {
                        try {
                            z11 = Boolean.parseBoolean(uriBuild.getQueryParameter(str));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                }
                if (z11 || this.f36392t.getOib()) {
                    startActivity(new Intent("android.intent.action.VIEW", uriBuild));
                    return;
                }
                finish();
                String string = uriBuild.toString();
                m.e(string, "toString(...)");
                startActivity(g1.q(this, string, this.Q));
            }
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        String str = BuildConfig.VERSION_NAME;
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.P = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(INTENTS.EXTRA_STRING_2);
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.Q = str;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(this.Q);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new aj.b(this, 2));
        String str2 = this.P;
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            if (se.k.s("ALGORITHMIC_DARKENING")) {
                va.a.b(((q0) j()).f33132c.getSettings());
            }
            if (se.k.s("FORCE_DARK")) {
                va.a.c(((q0) j()).f33132c.getSettings());
            }
        }
        ((q0) j()).f33132c.getSettings().setJavaScriptEnabled(true);
        ((q0) j()).f33132c.getSettings().setDomStorageEnabled(true);
        ((q0) j()).f33132c.setWebViewClient(new w3(this, 2));
        ((q0) j()).f33132c.setWebChromeClient(new WebChromeClient());
        ((q0) j()).f33132c.loadUrl(str2);
    }

    @Override // ji.b
    public final boolean t() {
        return true;
    }

    @Override // ji.b, androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (m.a(this.Q, "Privacy Policy")) {
            m().d("LdPrivacyPolicy");
        } else if (x.s0(this.P, txBUGYhC.JWzCnWSCDYVG, false)) {
            m().d("LdHelpCenter");
        }
    }
}
