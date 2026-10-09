package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import bm.g;
import cn.f;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import go.e;
import ji.b;
import kotlin.jvm.internal.m;
import nv.p;
import oo.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakTryActivity extends b {
    public static final /* synthetic */ int R = 0;
    public int P;
    public long Q;

    public SpeakTryActivity() {
        super(BuildConfig.VERSION_NAME, e0.f45647a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof oo.k0) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        oo.k0 k0Var = (oo.k0) k();
        if (k0Var != null && i11 == 4 && k0Var.getActivity() != null) {
            k0Var.F();
        }
        return true;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getIntExtra(INTENTS.EXTRA_INT, 1);
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG, 1L);
        int i11 = ((o0) l()).f27733a.keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 6) {
                                if (i11 != 8) {
                                    if (i11 != 20) {
                                        if (i11 != 22) {
                                            if (i11 != 40) {
                                                switch (i11) {
                                                }
                                                return;
                                            }
                                        }
                                        Bundle bundleD = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                        e eVar = new e();
                                        eVar.setArguments(bundleD);
                                        h.A(this, eVar);
                                        return;
                                    }
                                    Bundle bundleD2 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                    g gVar = new g();
                                    gVar.setArguments(bundleD2);
                                    h.A(this, gVar);
                                    return;
                                }
                                Bundle bundleD3 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                wn.e eVar2 = new wn.e();
                                eVar2.setArguments(bundleD3);
                                h.A(this, eVar2);
                                return;
                            }
                            Bundle bundleD4 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                            rj.e eVar3 = new rj.e();
                            eVar3.setArguments(bundleD4);
                            h.A(this, eVar3);
                            return;
                        }
                        Bundle bundleD5 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                        wk.e eVar4 = new wk.e();
                        eVar4.setArguments(bundleD5);
                        h.A(this, eVar4);
                        return;
                    }
                    Bundle bundleD6 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                    jk.e eVar5 = new jk.e();
                    eVar5.setArguments(bundleD6);
                    h.A(this, eVar5);
                    return;
                }
                Bundle bundleD7 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                f fVar = new f();
                fVar.setArguments(bundleD7);
                h.A(this, fVar);
                return;
            }
            Bundle bundleD8 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
            jm.e eVar6 = new jm.e();
            eVar6.setArguments(bundleD8);
            h.A(this, eVar6);
            return;
        }
        Bundle bundleD9 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
        gj.e eVar7 = new gj.e();
        eVar7.setArguments(bundleD9);
        h.A(this, eVar7);
    }
}
