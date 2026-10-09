package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.m;
import lf.c1;
import lf.p;
import qf.a;
import re.s;
import tf.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f7707a;

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            m.f(prefix, "prefix");
            m.f(writer, "writer");
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // f.n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        m.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        k0 k0Var = this.f7707a;
        if (k0Var != null) {
            k0Var.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        k0 k0Var;
        k0 k0Var2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!s.f49215p.get()) {
            Context applicationContext = getApplicationContext();
            m.e(applicationContext, "applicationContext");
            synchronized (s.class) {
                s.k(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            Intent requestIntent = getIntent();
            m.e(requestIntent, "requestIntent");
            FacebookException facebookExceptionJ = c1.j(c1.m(requestIntent));
            Intent intent2 = getIntent();
            m.e(intent2, "intent");
            setResult(0, c1.f(intent2, null, facebookExceptionJ));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        k1 supportFragmentManager = getSupportFragmentManager();
        m.e(supportFragmentManager, "supportFragmentManager");
        k0 k0VarD = supportFragmentManager.D("SingleFragment");
        if (k0VarD == null) {
            if ("FacebookDialogFragment".equals(intent3.getAction())) {
                k0Var = k0VarD;
                p pVar = new p();
                pVar.setRetainInstance(true);
                pVar.u(supportFragmentManager, "SingleFragment");
                k0Var2 = pVar;
            } else {
                k0Var = k0VarD;
                x xVar = new x();
                xVar.setRetainInstance(true);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.d(R.id.com_facebook_fragment_container, xVar, "SingleFragment", 1);
                aVar.h();
                k0Var2 = xVar;
            }
            k0Var = k0Var2;
        }
        k0Var = k0VarD;
        this.f7707a = k0Var;
    }
}
