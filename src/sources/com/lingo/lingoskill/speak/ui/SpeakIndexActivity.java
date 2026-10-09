package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import ji.b;
import nv.p;
import oo.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakIndexActivity extends b {
    public static final /* synthetic */ int R = 0;
    public int P;
    public long Q;

    public SpeakIndexActivity() {
        super(BuildConfig.VERSION_NAME, a.f45630a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getIntExtra(INTENTS.EXTRA_INT, -1);
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        if (this.P != -1) {
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
                                            go.a aVar = new go.a();
                                            aVar.setArguments(bundleD);
                                            h.A(this, aVar);
                                            return;
                                        }
                                        Bundle bundleD2 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                        bm.b bVar = new bm.b();
                                        bVar.setArguments(bundleD2);
                                        h.A(this, bVar);
                                        return;
                                    }
                                    Bundle bundleD3 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                    wn.a aVar2 = new wn.a();
                                    aVar2.setArguments(bundleD3);
                                    h.A(this, aVar2);
                                    return;
                                }
                                Bundle bundleD4 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                                rj.a aVar3 = new rj.a();
                                aVar3.setArguments(bundleD4);
                                h.A(this, aVar3);
                                return;
                            }
                            Bundle bundleD5 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                            wk.a aVar4 = new wk.a();
                            aVar4.setArguments(bundleD5);
                            h.A(this, aVar4);
                            return;
                        }
                        Bundle bundleD6 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                        jk.a aVar5 = new jk.a();
                        aVar5.setArguments(bundleD6);
                        h.A(this, aVar5);
                        return;
                    }
                    Bundle bundleD7 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                    cn.b bVar2 = new cn.b();
                    bVar2.setArguments(bundleD7);
                    h.A(this, bVar2);
                    return;
                }
                Bundle bundleD8 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
                jm.a aVar6 = new jm.a();
                aVar6.setArguments(bundleD8);
                h.A(this, aVar6);
                return;
            }
            Bundle bundleD9 = p.d(this.P, INTENTS.EXTRA_INT, INTENTS.EXTRA_LONG, this.Q);
            gj.a aVar7 = new gj.a();
            aVar7.setArguments(bundleD9);
            h.A(this, aVar7);
        }
    }

    @Override // ji.b
    public final void q() {
    }
}
