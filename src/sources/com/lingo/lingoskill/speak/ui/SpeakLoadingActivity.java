package com.lingo.lingoskill.speak.ui;

import android.os.Bundle;
import bm.d;
import cn.c;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import ji.b;
import oo.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeakLoadingActivity extends b {
    public int P;
    public long Q;
    public int R;

    public SpeakLoadingActivity() {
        super(BuildConfig.VERSION_NAME, j.f45685a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        this.P = getIntent().getIntExtra(INTENTS.EXTRA_INT, -1);
        this.Q = getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L);
        this.R = getIntent().getIntExtra(INTENTS.EXTRA_INT_2, -1);
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
                                            int i12 = this.P;
                                            int i13 = this.R;
                                            long j11 = this.Q;
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putInt(INTENTS.EXTRA_INT, i12);
                                            bundle2.putInt(INTENTS.EXTRA_INT_2, i13);
                                            bundle2.putLong(INTENTS.EXTRA_LONG, j11);
                                            go.b bVar = new go.b();
                                            bVar.setArguments(bundle2);
                                            h.A(this, bVar);
                                            return;
                                        }
                                        int i14 = this.P;
                                        int i15 = this.R;
                                        long j12 = this.Q;
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putInt(INTENTS.EXTRA_INT, i14);
                                        bundle3.putInt(INTENTS.EXTRA_INT_2, i15);
                                        bundle3.putLong(INTENTS.EXTRA_LONG, j12);
                                        d dVar = new d();
                                        dVar.setArguments(bundle3);
                                        h.A(this, dVar);
                                        return;
                                    }
                                    int i16 = this.P;
                                    int i17 = this.R;
                                    long j13 = this.Q;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putInt(INTENTS.EXTRA_INT, i16);
                                    bundle4.putInt(INTENTS.EXTRA_INT_2, i17);
                                    bundle4.putLong(INTENTS.EXTRA_LONG, j13);
                                    wn.b bVar2 = new wn.b();
                                    bVar2.setArguments(bundle4);
                                    h.A(this, bVar2);
                                    return;
                                }
                                int i18 = this.P;
                                int i19 = this.R;
                                long j14 = this.Q;
                                Bundle bundle5 = new Bundle();
                                bundle5.putInt(INTENTS.EXTRA_INT, i18);
                                bundle5.putInt(INTENTS.EXTRA_INT_2, i19);
                                bundle5.putLong(INTENTS.EXTRA_LONG, j14);
                                rj.b bVar3 = new rj.b();
                                bVar3.setArguments(bundle5);
                                h.A(this, bVar3);
                                return;
                            }
                            int i21 = this.P;
                            int i22 = this.R;
                            long j15 = this.Q;
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(INTENTS.EXTRA_INT, i21);
                            bundle6.putInt(INTENTS.EXTRA_INT_2, i22);
                            bundle6.putLong(INTENTS.EXTRA_LONG, j15);
                            wk.b bVar4 = new wk.b();
                            bVar4.setArguments(bundle6);
                            h.A(this, bVar4);
                            return;
                        }
                        int i23 = this.P;
                        int i24 = this.R;
                        long j16 = this.Q;
                        Bundle bundle7 = new Bundle();
                        bundle7.putInt(INTENTS.EXTRA_INT, i23);
                        bundle7.putInt(INTENTS.EXTRA_INT_2, i24);
                        bundle7.putLong(INTENTS.EXTRA_LONG, j16);
                        jk.b bVar5 = new jk.b();
                        bVar5.setArguments(bundle7);
                        h.A(this, bVar5);
                        return;
                    }
                    int i25 = this.P;
                    int i26 = this.R;
                    long j17 = this.Q;
                    Bundle bundle8 = new Bundle();
                    bundle8.putInt(INTENTS.EXTRA_INT, i25);
                    bundle8.putInt(INTENTS.EXTRA_INT_2, i26);
                    bundle8.putLong(INTENTS.EXTRA_LONG, j17);
                    c cVar = new c();
                    cVar.setArguments(bundle8);
                    h.A(this, cVar);
                    return;
                }
                int i27 = this.P;
                int i28 = this.R;
                long j18 = this.Q;
                Bundle bundle9 = new Bundle();
                bundle9.putInt(INTENTS.EXTRA_INT, i27);
                bundle9.putInt(INTENTS.EXTRA_INT_2, i28);
                bundle9.putLong(INTENTS.EXTRA_LONG, j18);
                jm.b bVar6 = new jm.b();
                bVar6.setArguments(bundle9);
                h.A(this, bVar6);
                return;
            }
            int i29 = this.P;
            int i30 = this.R;
            long j19 = this.Q;
            Bundle bundle10 = new Bundle();
            bundle10.putInt(INTENTS.EXTRA_INT, i29);
            bundle10.putInt(INTENTS.EXTRA_INT_2, i30);
            bundle10.putLong(INTENTS.EXTRA_LONG, j19);
            gj.b bVar7 = new gj.b();
            bVar7.setArguments(bundle10);
            h.A(this, bVar7);
        }
    }
}
