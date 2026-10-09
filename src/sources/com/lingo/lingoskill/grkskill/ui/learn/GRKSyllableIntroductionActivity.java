package com.lingo.lingoskill.grkskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import at.p;
import bt.p3;
import ch.z;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import dl.h;
import dl.j;
import fr.j3;
import fz.c;
import gl.a;
import h1.k7;
import h1.p7;
import h1.ua;
import j0.e2;
import j0.i1;
import j0.v1;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import m0.b;
import oz.q;
import r0.f;
import se.i;
import xg.d;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GRKSyllableIntroductionActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21882t = "Α α\n[alfa]\nΒ β\n[vita]\nΓ γ\n[ghama]\nΔ δ\n[delta]\nΕ ε\n[epsilon]\nΖ ζ\n[zita]\nΗ η\n[ita]\nΘ θ\n[thita]\nΙ ι\n[yota]\nΚ κ\n[kapa]\nΛ λ\n[lamda]\nΜ μ\n[mi]\nΝ ν\n[ni]\nΞ ξ\n[ksi]\nΟ ο\n[omikron]\nΠ π\n[pi]\nΡ ρ\n[ro]\nΣ σ,ς\n[sigma]\nΤ τ\n[taf]\nΥ υ\n[ipsilon]\nΦ φ\n[fi]\nΧ χ\n[hi]\nΨ ψ\n[psi]\nΩ ω\n[omega]\n\n";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1156094627);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            w(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 18, bundle);
        }
    }

    public final void p(a aVar, n nVar, int i11) {
        s sVar;
        String str;
        s sVar2;
        GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = this;
        a aVar2 = aVar;
        s sVar3 = (s) nVar;
        sVar3.f0(-1985484245);
        int i12 = i11 | (sVar3.h(aVar2) ? 4 : 2) | (sVar3.h(gRKSyllableIntroductionActivity) ? 32 : 16);
        if (sVar3.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar3.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                List listW0 = q.W0(gRKSyllableIntroductionActivity.f21882t, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ = ry.m.g1(arrayList, 2, 2);
                sVar3.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar3.Q();
            if (objQ2 == gVar) {
                String string = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_8);
                String string2 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_9);
                String string3 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_10);
                String string4 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_11);
                String string5 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_12);
                String string6 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_13);
                String string7 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_14);
                str = "\n";
                StringBuilder sbS = e.s("Α α\na\nκαλά / kalá\n", string, "\n[kala2]\nΕ ε\ne\nπέντε / pénde\n", string2, "\n[pe2nde]\nΗ η\ni\nφτηνή / ftiní\n");
                com.google.android.material.datepicker.d.w(sbS, string3, "\n[ftini2]\nΙ ι\ni\nφιστίκι / fistíki\n", string4, "\n[fisti2ki]\nΟ ο\no\nμόνο / móno\n");
                com.google.android.material.datepicker.d.w(sbS, string5, "\n[mo2no]\nΥ υ\ni\nμύτη / míti\n", string6, "\n[mi2ti]\nΩ ω\no\nπώς / pós\n");
                List listW1 = q.W0(ep.a.k(sbS, string7, "\n[po2s]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listW1) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                objQ2 = ry.m.g1(arrayList2, 5, 5);
                sVar3.o0(objQ2);
            } else {
                str = "\n";
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar) {
                String string8 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_15);
                String string9 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_16);
                String string10 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_17);
                String string11 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_18);
                String string12 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_19);
                String string13 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_20);
                String string14 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_21);
                String string15 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_22);
                StringBuilder sbS2 = e.s("ΑΙ αι\ne\nναι / ne\n", string8, "\n[ne]\nΕΙ ει\ni\nείμαι / íme\n", string9, "\n[i2me]\nΟΙ οι\ni\nφίλοι / fíli\n");
                com.google.android.material.datepicker.d.w(sbS2, string10, "\n[fi2li]\nΟΥ ου\nu\nούζο / úzo\n", string11, "\n[ou2zo]\nΑΥ αυ\naf\nαυτή / aftí\n");
                com.google.android.material.datepicker.d.w(sbS2, string12, "\n[afti2]\nΑΥ αυ\nav\nαυγό / avgó\n", string13, "\n[avgo2]\nΕΥ ευ\nef\nευχαριστώ / efharistó\n");
                List listW2 = q.W0(e.p(sbS2, string14, "\n[efharisto2]\nΕΥ ευ\nev\nευρώ / evró\n", string15, "\n[evro2]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listW2) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                objQ3 = ry.m.g1(arrayList3, 5, 5);
                sVar3.o0(objQ3);
            }
            List list3 = (List) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == gVar) {
                String string16 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_23);
                String string17 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_24);
                String string18 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_25);
                String string19 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_26);
                String string20 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_27);
                String string21 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_28);
                String string22 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_29);
                String string23 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_30);
                String string24 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_31);
                String string25 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_32);
                String string26 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_33);
                String string27 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_34);
                String string28 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_35);
                String string29 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_36);
                String string30 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_37);
                String string31 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_38);
                String string32 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_39);
                String string33 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_40);
                String string34 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_41);
                StringBuilder sbS3 = e.s("Β β\nv\nβίζα / víza\n", string16, "\n[vi2za]\nΓ γ\ng\nΓαλλία / gallía\n", string17, "\n[galli2a]\nΓ γ\ny\nγιορτή / yiortí\n");
                com.google.android.material.datepicker.d.w(sbS3, string18, "\n[yiorti2]\nΔ δ\nd*\nδεν / den\n", string19, "\n[den]\nΖ ζ\nz\nζάχαρη / záhari\n");
                com.google.android.material.datepicker.d.w(sbS3, string20, "\n[za2hari]\nΘ θ\nth\nθέλω / thélo\n", string21, "\n[the2lo]\nΚ κ\nk\nκαλά / kalá\n");
                com.google.android.material.datepicker.d.w(sbS3, string22, "\n[kala2]\nΛ λ\nl\nλύκος / líkos\n", string23, "\n[li2kos]\nΜ μ\nm\nΑμερική / amerikí\n");
                com.google.android.material.datepicker.d.w(sbS3, string24, "\n[ameriki2]\nΝ ν\nn\nνερό / neró\n", string25, "\n[nero2]\nΞ ξ\nks\nξινός / ksinós\n");
                com.google.android.material.datepicker.d.w(sbS3, string26, "\n[ksino2s]\nΠ π\np\nπώς / pós\n", string27, "\n[po2s]\nΡ ρ\nr\nπάρκο / párko\n");
                com.google.android.material.datepicker.d.w(sbS3, string28, "\n[pa2rko]\nΣ σ,ς\ns\nσας / sas\n", string29, "\n[sas]\nΣ σ,ς\nz\nκουρασμένος / kourazménos\n");
                com.google.android.material.datepicker.d.w(sbS3, string30, "\n[kourazme2nos]\nΤ τ\nt\nτέσσερα / téssera\n", string31, "\n[te2ssera]\nΦ φ\nf\nφίλη / fíli\n");
                com.google.android.material.datepicker.d.w(sbS3, string32, "\n[fi2li]\nΧ χ\nh\nζάχαρη / záhari\n", string33, "\n[za2hari]\nΨ ψ\nps\nψωμί / psomí\n");
                List listW3 = q.W0(ep.a.k(sbS3, string34, "\n[psomi2]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listW3) {
                    if (((String) obj4).length() > 0) {
                        arrayList4.add(obj4);
                    }
                }
                objQ4 = ry.m.g1(arrayList4, 5, 5);
                sVar2 = sVar3;
                sVar2.o0(objQ4);
            } else {
                sVar2 = sVar3;
            }
            List list4 = (List) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                gRKSyllableIntroductionActivity = this;
                String string35 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_42);
                String string36 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_43);
                String string37 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_44);
                String string38 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_45);
                String string39 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_46);
                String string40 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_47);
                String string41 = gRKSyllableIntroductionActivity.getString(R.string.grk_alp_section_content_48);
                StringBuilder sbS4 = e.s("γγ\nng\nΑγγλικά / angliká\n", string35, "\n[anglika2]\nγχ\nnh\nμε συγχωρείτε / me sinhoríte\n", string36, "\n[me0sinhori2te]\nμπ\nb\nμπύρα / bíra\n");
                com.google.android.material.datepicker.d.w(sbS4, string37, "\n[bi2ra]\nμπ\nmb\nομπρέλα / ombréla\n", string38, "\n[ombre2la]\nντ\nnd\nσάντουιτς / sánduits\n");
                com.google.android.material.datepicker.d.w(sbS4, string39, "\n[sa2nduits]\nτζ\ntz\nτζιν / tzin\n", string40, "\n[tzin]\nτσ\nts\nτσάι / tsái\n");
                List listW4 = q.W0(ep.a.k(sbS4, string41, "\n[tsa2i]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : listW4) {
                    if (((String) obj5).length() > 0) {
                        arrayList5.add(obj5);
                    }
                }
                objQ5 = ry.m.g1(arrayList5, 5, 5);
                sVar2.o0(objQ5);
            } else {
                gRKSyllableIntroductionActivity = this;
            }
            List list5 = (List) objQ5;
            b bVar = new b(6);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            boolean zH = sVar2.h(gRKSyllableIntroductionActivity) | sVar2.h(list) | sVar2.h(aVar) | sVar2.h(list2) | sVar2.h(list3) | sVar2.h(list4) | sVar2.h(list5);
            Object objQ6 = sVar2.Q();
            if (zH || objQ6 == gVar) {
                aVar2 = aVar;
                dl.d dVar = new dl.d(list, gRKSyllableIntroductionActivity, aVar2, list2, list3, list4, list5);
                sVar2.o0(dVar);
                objQ6 = dVar;
            } else {
                aVar2 = aVar;
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (c) objQ6, sVar, 0, 1014);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dl.c(gRKSyllableIntroductionActivity, aVar2, i11, 1);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1646351710);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(this, str, i11, 0);
        }
    }

    public final void r(String str, String str2, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1338615616);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 131) != 130)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(533675662, new h(aVar, str, 0), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dl.i(this, str, str2, aVar, i11, 0);
        }
    }

    public final void s(String str, String str2, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1979033963);
        int i12 = (sVar.f(str) ? 32 : 16) | i11 | (sVar.f(str2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            r rVarA = j0.c.A(o.f58481a, 1);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k7.d(e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 72), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(1681783779, new dl.g(aVar, str, str2, 0), sVar), sVar, 196608, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dl.i(this, str, str2, aVar, i11, 1);
        }
    }

    public final void t(List list, c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1455038438);
        int i12 = (sVar.h(list) ? 32 : 16) | i11 | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            r rVarA = j0.c.A(o.f58481a, 1);
            if (3.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k7.d(e2.g(rVarA.i(new i1(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true)), 72), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(949416756, new p3(1, cVar, list), sVar), sVar, 196608, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(this, list, cVar, i11, 21);
        }
    }

    public final void u(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1885809057);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.C(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(this, str, i11, 2);
        }
    }

    public final void v(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(325887559);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(this, str, i11, 1);
        }
    }

    public final void w(a aVar, n nVar, int i11) {
        a aVar2;
        a aVar3;
        a aVar4;
        s sVar = (s) nVar;
        sVar.f0(1218923929);
        int i12 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar3 = (a) ViewModelKt.viewModel(kotlin.jvm.internal.z.a(a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
                aVar3 = aVar;
            }
            sVar.q();
            b1 b1VarO = t.o(aVar3.f29279b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(-985457509);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
                aVar4 = aVar3;
            } else {
                sVar.d0(-985354434);
                aVar4 = aVar3;
                p7.a(null, t1.e.d(-1051898623, new dl.e(this, 1), sVar), null, null, null, 0, 0L, 0L, null, t1.e.d(-871805236, new p(3, this, aVar3), sVar), sVar, 805306416, 509);
                sVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dl.c(this, aVar2, i11, 0);
        }
    }
}
