package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k0;
import bm.f;
import cn.e;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import go.d;
import ji.b;
import kotlin.jvm.internal.m;
import nv.p;
import oo.d0;
import oo.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakTestActivity extends b {
    public static final /* synthetic */ int R = 0;
    public int P;
    public long Q;

    public SpeakTestActivity() {
        super(BuildConfig.VERSION_NAME, u.f45705a);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        k0 k0VarK;
        m.f(event, "event");
        if (i11 != 4) {
            return super.onKeyDown(i11, event);
        }
        if (k() == null || !(k() instanceof d0) || (k0VarK = k()) == null || !k0VarK.isAdded()) {
            return super.onKeyDown(i11, event);
        }
        d0 d0Var = (d0) k();
        if (d0Var != null && i11 == 4 && d0Var.getActivity() != null) {
            d0Var.C();
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
                                        d dVar = new d();
                                        dVar.setArguments(bundleD);
                                        h.A(this, dVar);
                                        return;
                                    }
                                    Bundle bundleD2 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                    f fVar = new f();
                                    fVar.setArguments(bundleD2);
                                    h.A(this, fVar);
                                    return;
                                }
                                Bundle bundleD3 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                wn.d dVar2 = new wn.d();
                                dVar2.setArguments(bundleD3);
                                h.A(this, dVar2);
                                return;
                            }
                            Bundle bundleD4 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                            rj.d dVar3 = new rj.d();
                            dVar3.setArguments(bundleD4);
                            h.A(this, dVar3);
                            return;
                        }
                        Bundle bundleD5 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                        wk.d dVar4 = new wk.d();
                        dVar4.setArguments(bundleD5);
                        h.A(this, dVar4);
                        return;
                    }
                    Bundle bundleD6 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                    jk.d dVar5 = new jk.d();
                    dVar5.setArguments(bundleD6);
                    h.A(this, dVar5);
                    return;
                }
                Bundle bundleD7 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                e eVar = new e();
                eVar.setArguments(bundleD7);
                h.A(this, eVar);
                return;
            }
            Bundle bundleD8 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
            jm.d dVar6 = new jm.d();
            dVar6.setArguments(bundleD8);
            h.A(this, dVar6);
            return;
        }
        Bundle bundleD9 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
        gj.d dVar7 = new gj.d();
        dVar7.setArguments(bundleD9);
        h.A(this, dVar7);
    }
}
