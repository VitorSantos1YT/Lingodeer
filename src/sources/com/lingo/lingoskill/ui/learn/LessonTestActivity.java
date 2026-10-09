package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.e1;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import gp.a;
import i.c;
import jp.i1;
import jp.p0;
import jp.r0;
import kotlin.jvm.internal.m;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LessonTestActivity extends r0 {
    public static final /* synthetic */ int X = 0;
    public long P;
    public long Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public String V;
    public final c W;

    public LessonTestActivity() {
        super(BuildConfig.VERSION_NAME, i1.f36496a);
        this.V = BuildConfig.VERSION_NAME;
        this.W = registerForActivityResult(new e1(4), new hh.c(this, 6));
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof p0) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        p0 p0Var = (p0) k();
        m.c(p0Var);
        p0Var.G(i11, event);
        return true;
    }

    @Override // jp.r0
    public final void u(Bundle bundle) {
        this.P = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG_2, -1L);
        this.T = getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN, false);
        this.U = getIntent().getBooleanExtra(INTENTS.EXTRA_BOOLEAN_2, false);
        this.R = getIntent().getIntExtra(INTENTS.EXTRA_INT, 1);
        this.S = getIntent().getIntExtra(INTENTS.EXTRA_INT_2, 1);
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.V = stringExtra;
        if (bundle == null) {
            if (this.S >= 3 && ((o0) l()).f27733a.isUnloginUser()) {
                e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a(this, null, 16), 3);
                return;
            }
            long j11 = this.P;
            long j12 = this.Q;
            int i11 = this.R;
            int i12 = this.S;
            boolean z11 = this.T;
            boolean z12 = this.U;
            String mode = this.V;
            m.f(mode, "mode");
            Bundle bundle2 = new Bundle();
            bundle2.putLong(INTENTS.EXTRA_LONG, j11);
            bundle2.putLong(INTENTS.EXTRA_LONG_2, j12);
            bundle2.putInt(INTENTS.EXTRA_INT, i11);
            bundle2.putInt(INTENTS.EXTRA_INT_2, i12);
            bundle2.putBoolean(INTENTS.EXTRA_BOOLEAN, z11);
            bundle2.putBoolean(INTENTS.EXTRA_BOOLEAN_2, z12);
            bundle2.putString(INTENTS.EXTRA_STRING, mode);
            p0 p0Var = new p0();
            p0Var.setArguments(bundle2);
            h.A(this, p0Var);
            return;
        }
        k0 k0VarK = k();
        if (k0VarK != null && !(k0VarK instanceof p0)) {
            k1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.n(k0VarK);
            aVar.h();
            return;
        }
        long j13 = this.P;
        long j14 = this.Q;
        int i13 = this.R;
        int i14 = this.S;
        boolean z13 = this.T;
        boolean z14 = this.U;
        String mode2 = this.V;
        m.f(mode2, "mode");
        Bundle bundle3 = new Bundle();
        bundle3.putLong(INTENTS.EXTRA_LONG, j13);
        bundle3.putLong(INTENTS.EXTRA_LONG_2, j14);
        bundle3.putInt(INTENTS.EXTRA_INT, i13);
        bundle3.putInt(INTENTS.EXTRA_INT_2, i14);
        bundle3.putBoolean(INTENTS.EXTRA_BOOLEAN, z13);
        bundle3.putBoolean(INTENTS.EXTRA_BOOLEAN_2, z14);
        bundle3.putString(INTENTS.EXTRA_STRING, mode2);
        p0 p0Var2 = new p0();
        p0Var2.setArguments(bundle3);
        h.A(this, p0Var2);
    }
}
