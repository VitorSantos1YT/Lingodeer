package com.lingo.syllable.ko;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOSyllableIntroductionActivity;
import com.lingo.syllable.ko.KOSyllableActivity;
import com.lingodeer.R;
import fz.a;
import fz.c;
import fz.e;
import k9.p;
import kp.j;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import mt.r;
import qy.b0;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class KOSyllableActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22233t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-450463594);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 0;
                objQ = new a(this) { // from class: or.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ KOSyllableActivity f45713b;

                    {
                        this.f45713b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        b0 b0Var = b0.f48488a;
                        KOSyllableActivity kOSyllableActivity = this.f45713b;
                        switch (i14) {
                            case 0:
                                int i15 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.finish();
                                break;
                            case 1:
                                int i16 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.startActivity(new Intent(kOSyllableActivity, (Class<?>) KOSyllableIntroductionActivity.class));
                                break;
                            default:
                                int i17 = KOSyllableActivity.f22233t;
                                Toast.makeText(kOSyllableActivity, R.string.please_complete_previous_lesson, 0).show();
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
                final int i14 = 1;
                objQ2 = new a(this) { // from class: or.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ KOSyllableActivity f45713b;

                    {
                        this.f45713b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        b0 b0Var = b0.f48488a;
                        KOSyllableActivity kOSyllableActivity = this.f45713b;
                        switch (i15) {
                            case 0:
                                int i16 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.finish();
                                break;
                            case 1:
                                int i17 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.startActivity(new Intent(kOSyllableActivity, (Class<?>) KOSyllableIntroductionActivity.class));
                                break;
                            default:
                                int i18 = KOSyllableActivity.f22233t;
                                Toast.makeText(kOSyllableActivity, R.string.please_complete_previous_lesson, 0).show();
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ2);
            }
            a aVar2 = (a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i15 = 2;
                objQ3 = new a(this) { // from class: or.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ KOSyllableActivity f45713b;

                    {
                        this.f45713b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        b0 b0Var = b0.f48488a;
                        KOSyllableActivity kOSyllableActivity = this.f45713b;
                        switch (i16) {
                            case 0:
                                int i17 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.finish();
                                break;
                            case 1:
                                int i18 = KOSyllableActivity.f22233t;
                                kOSyllableActivity.startActivity(new Intent(kOSyllableActivity, (Class<?>) KOSyllableIntroductionActivity.class));
                                break;
                            default:
                                int i19 = KOSyllableActivity.f22233t;
                                Toast.makeText(kOSyllableActivity, R.string.please_complete_previous_lesson, 0).show();
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ3);
            }
            a aVar3 = (a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                objQ4 = new r(this, 10);
                sVar.o0(objQ4);
            }
            e eVar = (e) objQ4;
            boolean zH5 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                objQ5 = new j(this, 29);
                sVar.o0(objQ5);
            }
            nv.a.k(aVar, aVar2, aVar3, eVar, (c) objQ5, null, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(this, i11, 24, bundle);
        }
    }
}
