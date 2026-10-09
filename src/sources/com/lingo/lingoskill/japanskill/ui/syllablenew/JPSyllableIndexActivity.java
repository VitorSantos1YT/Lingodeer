package com.lingo.lingoskill.japanskill.ui.syllablenew;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.lingo.lingoskill.japanskill.ui.syllable.YinTuActivity;
import com.lingo.lingoskill.japanskill.ui.syllablenew.JPSyllableIndexActivity;
import com.lingodeer.R;
import fz.a;
import fz.c;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import ot.e2;
import pr.y;
import qy.b0;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JPSyllableIndexActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21908t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-294606399);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean booleanExtra = getIntent().getBooleanExtra("extra_open_introduction", false);
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 0;
                objQ = new a(this) { // from class: qm.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ JPSyllableIndexActivity f47814b;

                    {
                        this.f47814b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        b0 b0Var = b0.f48488a;
                        JPSyllableIndexActivity jPSyllableIndexActivity = this.f47814b;
                        switch (i14) {
                            case 0:
                                int i15 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.finish();
                                break;
                            case 1:
                                int i16 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.startActivity(new Intent(jPSyllableIndexActivity, (Class<?>) YinTuActivity.class));
                                break;
                            default:
                                int i17 = JPSyllableIndexActivity.f21908t;
                                Toast.makeText(jPSyllableIndexActivity, R.string.please_complete_previous_lesson, 0).show();
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ);
            }
            a aVar = (a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new e2(this, 6);
                sVar.o0(objQ2);
            }
            c cVar = (c) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i14 = 1;
                objQ3 = new a(this) { // from class: qm.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ JPSyllableIndexActivity f47814b;

                    {
                        this.f47814b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        b0 b0Var = b0.f48488a;
                        JPSyllableIndexActivity jPSyllableIndexActivity = this.f47814b;
                        switch (i15) {
                            case 0:
                                int i16 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.finish();
                                break;
                            case 1:
                                int i17 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.startActivity(new Intent(jPSyllableIndexActivity, (Class<?>) YinTuActivity.class));
                                break;
                            default:
                                int i18 = JPSyllableIndexActivity.f21908t;
                                Toast.makeText(jPSyllableIndexActivity, R.string.please_complete_previous_lesson, 0).show();
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ3);
            }
            a aVar2 = (a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i15 = 2;
                objQ4 = new a(this) { // from class: qm.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ JPSyllableIndexActivity f47814b;

                    {
                        this.f47814b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        b0 b0Var = b0.f48488a;
                        JPSyllableIndexActivity jPSyllableIndexActivity = this.f47814b;
                        switch (i16) {
                            case 0:
                                int i17 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.finish();
                                break;
                            case 1:
                                int i18 = JPSyllableIndexActivity.f21908t;
                                jPSyllableIndexActivity.startActivity(new Intent(jPSyllableIndexActivity, (Class<?>) YinTuActivity.class));
                                break;
                            default:
                                int i19 = JPSyllableIndexActivity.f21908t;
                                Toast.makeText(jPSyllableIndexActivity, R.string.please_complete_previous_lesson, 0).show();
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ4);
            }
            iv.a.x(booleanExtra, aVar, cVar, aVar2, (a) objQ4, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 4, bundle);
        }
    }
}
