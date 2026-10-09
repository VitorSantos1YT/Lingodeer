package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import bm.e;
import cn.d;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import go.c;
import ji.b;
import nv.p;
import oo.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakPreviewActivity extends b {
    public static final /* synthetic */ int R = 0;
    public int P;
    public long Q;

    public SpeakPreviewActivity() {
        super(BuildConfig.VERSION_NAME, n.f45694a);
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
                                        c cVar = new c();
                                        cVar.setArguments(bundleD);
                                        h.A(this, cVar);
                                        return;
                                    }
                                    Bundle bundleD2 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                    e eVar = new e();
                                    eVar.setArguments(bundleD2);
                                    h.A(this, eVar);
                                    return;
                                }
                                Bundle bundleD3 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                wn.c cVar2 = new wn.c();
                                cVar2.setArguments(bundleD3);
                                h.A(this, cVar2);
                                return;
                            }
                            Bundle bundleD4 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                            rj.c cVar3 = new rj.c();
                            cVar3.setArguments(bundleD4);
                            h.A(this, cVar3);
                            return;
                        }
                        Bundle bundleD5 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                        wk.c cVar4 = new wk.c();
                        cVar4.setArguments(bundleD5);
                        h.A(this, cVar4);
                        return;
                    }
                    Bundle bundleD6 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                    jk.c cVar5 = new jk.c();
                    cVar5.setArguments(bundleD6);
                    h.A(this, cVar5);
                    return;
                }
                Bundle bundleD7 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                d dVar = new d();
                dVar.setArguments(bundleD7);
                h.A(this, dVar);
                return;
            }
            Bundle bundleD8 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
            jm.c cVar6 = new jm.c();
            cVar6.setArguments(bundleD8);
            h.A(this, cVar6);
            return;
        }
        Bundle bundleD9 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
        gj.c cVar7 = new gj.c();
        cVar7.setArguments(bundleD9);
        h.A(this, cVar7);
    }
}
