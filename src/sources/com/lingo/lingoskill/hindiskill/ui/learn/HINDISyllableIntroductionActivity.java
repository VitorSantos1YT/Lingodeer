package com.lingo.lingoskill.hindiskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import bp.a0;
import bp.o5;
import bt.p3;
import bw.ORXQ.ADSb;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dl.g;
import fr.j3;
import fz.a;
import h1.k7;
import h1.p7;
import h1.ua;
import j0.a2;
import j0.c;
import j0.e2;
import j0.i1;
import j0.v1;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import m0.b;
import oz.q;
import r0.f;
import se.i;
import t1.e;
import xg.d;
import y2.h;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HINDISyllableIntroductionActivity extends d {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21883t = "अ\na\n[a]\nआ\naa\n[aa]\nइ\ni\n[i]\nई\nee\n[ee]\nउ\nu\n[u]\nऊ\noo\n[oo]\nए\ne\n[e]\nऐ\nai\n[ai]\nओ\no\n[o]\nऔ\nau\n[au]\n\n";
    public final String H = "क\nka \n[ka]\n ख \nkha\n[kha]\nग \nga\n[ga]\nघ\ngha\n[gha]\nख़\nKha\n[kha1]\nच \nca\n[ca]\nछ\ncha\n[cha]\nज \nja\n[ja]\nझ\njha\n[jha]\nज़\nza\n[za]\nट \nTa\n[ta1]\nठ \nTha\n[tha1]\n ड\nDa\n[da1]\nढ \nDha\n[dha1]\nण\nNa\n[na1]\nत \nta\n[ta]\nथ \ntha\n[tha]\nद \nda\n[da]\nध \ndha\n[dha]\nन\nna\n[na]\nप \npa\n[pa]\nफ \npha\n[pha]\nब \nba\n[ba]\nभ \nbha\n[bha]\n म\nma\n[ma]\nय \nya\n[ya]\nर\nra\n[ra]\nल \nla\n[la]\nव\nva\n[va]\nड़\nRa\n[ra1]\nश \nsha\n[sha]\nष \nSa\n[sa1]\nस \nsa\n[sa]\nह\nha\n[ha]\nफ़\nfa\n[fa]\n\n";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-625221967);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            w(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 19, bundle);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1375712112);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.i(this, str, i11, 0);
        }
    }

    public final void r(String str, String str2, a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1235758322);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            k7.d(c.j(e2.e(c.A(o.f58481a, 1), 1.0f), 1.0f), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, e.d(-1741380004, new g(aVar, str, str2, 1), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(this, str, str2, aVar, i11, 0);
        }
    }

    public final void s(String str, String str2, a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(839474467);
        int i12 = (sVar.f(str) ? 32 : 16) | i11 | (sVar.f(str2) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            r rVarA = c.A(o.f58481a, 1);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k7.d(e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 72), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, e.d(-598519823, new g(aVar, str, str2, 2), sVar), sVar, 196608, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(this, str, str2, aVar, i11, 1);
        }
    }

    public final void t(List list, float f5, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1842734548);
        int i12 = (sVar.h(list) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, a2VarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, -1013121906, list);
            int i13 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str = (String) next;
                r rVarA = c.A(oVar, 1);
                float f11 = i13 == 0 ? 1.0f : f5;
                if (f11 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (f11 > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                }
                k7.d(e2.g(rVarA.i(new i1(f11, true)), 52), f.d(4), k7.p(i.k(sVar, R.color.colorAccent), sVar, 0), null, null, e.d(-2070407184, new a0(str, 10), sVar), sVar, 196608, 24);
                i13 = i14;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.s(this, list, f5, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r12v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    public final void u(List list, int i11, float f5, fz.c cVar, n nVar, int i12) {
        ?? r9;
        ?? r11;
        ?? r12 = (s) nVar;
        r12.f0(700897366);
        int i13 = i12 | (r12.h(list) ? 4 : 2) | (r12.h(cVar) ? 2048 : 1024);
        if (r12.T(i13 & 1, (i13 & 1171) != 1170)) {
            Object objQ = r12.Q();
            if (objQ == l1.m.f39353a) {
                objQ = i11 == 3 ? ry.m.h0(list.subList(2, list.size()), 3) : ry.m.h0(list, 3);
                r12.o0(objQ);
            }
            List list2 = (List) objQ;
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, r12, 0);
            int iHashCode = Long.hashCode(r12.T);
            q1 q1VarL = r12.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(r12, oVar);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r12.h0();
            if (r12.S) {
                r12.k(iVar);
            } else {
                r12.r0();
            }
            t.J(y2.j.f56917f, a2VarA, r12);
            t.J(y2.j.f56916e, q1VarL, r12);
            h hVar = y2.j.f56918g;
            if (r12.S || !m.a(r12.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r12, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, r12);
            if (i11 == 3) {
                r12.d0(853246353);
                r rVarA = c.A(oVar, 1);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                r9 = 1;
                r11 = 0;
                k7.d(e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 72), f.d(4), k7.p(i.k(r12, R.color.white), r12, 0), null, null, e.d(794981061, new o5(1, list), r12), r12, 196608, 24);
            } else {
                r9 = 1;
                r11 = 0;
                r12.d0(830614896);
            }
            r12.p(r11);
            r12.d0(1274500739);
            ?? r13 = r11;
            for (Object obj : list2) {
                int i14 = r13 + 1;
                if (r13 < 0) {
                    ns.o.V();
                    throw null;
                }
                List list3 = (List) obj;
                r rVarA2 = c.A(oVar, (float) r9);
                if (f5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                k7.d(e2.g(rVarA2.i(new i1(f5 > r1 ? Float.MAX_VALUE : f5, r9)), 72), f.d(4), k7.p(i.k(r12, R.color.white), r12, r11), null, null, e.d(1820300903, new p3(2, cVar, list3), r12), r12, 196608, 24);
                r13 = i14;
            }
            r12.p(r11);
            r12.p(r9);
        } else {
            r12.W();
        }
        x1 x1VarT = r12.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.k(this, list, i11, f5, cVar, i12);
        }
    }

    public final void v(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(2118754133);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.i(this, str, i11, 1);
        }
    }

    public final void w(ml.a aVar, n nVar, int i11) {
        ml.a aVar2;
        ml.a aVar3;
        ml.a aVar4;
        s sVar = (s) nVar;
        sVar.f0(883458037);
        int i12 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar3 = (ml.a) ViewModelKt.viewModel(z.a(ml.a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
                aVar3 = aVar;
            }
            sVar.q();
            b1 b1VarO = t.o(aVar3.f41167b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(-460946305);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
                aVar4 = aVar3;
            } else {
                sVar.d0(-460843230);
                aVar4 = aVar3;
                p7.a(null, e.d(-1632856227, new jl.c(this, 0), sVar), null, null, null, 0, 0L, 0L, null, e.d(68918824, new jl.d(this, aVar3, 0), sVar), sVar, 805306416, 509);
                sVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.e(this, aVar2, i11, 0);
        }
    }

    public final void p(ml.a aVar, n nVar, int i11) {
        s sVar;
        String str;
        ml.a aVar2 = aVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1202427257);
        int i12 = i11 | (sVar2.h(aVar2) ? 4 : 2) | (sVar2.h(this) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                List listW0 = q.W0(this.f21883t, new String[]{"\n"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                objQ = ry.m.g1(arrayList, 3, 3);
                sVar2.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                List listW1 = q.W0(this.H, new String[]{"\n"}, 0, 6);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listW1) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                objQ2 = ry.m.g1(arrayList2, 3, 3);
                sVar2.o0(objQ2);
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                String string = getString(R.string.hindi_alp_section_content_21);
                String string2 = getString(R.string.hindi_alp_section_content_22);
                String string3 = getString(R.string.hindi_alp_section_content_23);
                String string4 = getString(R.string.hindi_alp_section_content_24);
                String string5 = getString(R.string.hindi_alp_section_content_25);
                String string6 = getString(R.string.hindi_alp_section_content_26);
                String string7 = getString(R.string.hindi_alp_section_content_27);
                String string8 = getString(R.string.hindi_alp_section_content_28);
                str = "\n";
                String string9 = getString(R.string.hindi_alp_section_content_29);
                StringBuilder sbS = defpackage.e.s("◌ा\naa\nम→मा \nma→maa*\n[ma-maa]\nमाफ़ / maaf\n", string, "\n[maaf]\nि\ni\nम→मि\nma→mi\n[ma-mi]\nमिलकर / milakar\n", string2, "\n[milakar]\n◌ी\nee\nम→मी\nma→mee\n[ma-mee]\nनमी / namee\n");
                com.google.android.material.datepicker.d.w(sbS, string3, "\n[namee]\nे\ne\nम→मे\nma→me\n[ma-me]\nमेरा / mera\n", string4, "\n[mera]\n◌ै\nai\nम→मै\nma→mai\n[ma-mai]\nमैं / main\n");
                com.google.android.material.datepicker.d.w(sbS, string5, "\n[main]\n◌ु\nu\nम→मु\nma→mu\n[ma-mu]\nमुंबई / munbaee\n", string6, "\n[munbaee]\n◌ू\noo\nम→मू\nma→moo\n[ma-moo]\nमूंगफली / moongaphalee\n");
                com.google.android.material.datepicker.d.w(sbS, string7, "\n[moongaphalee]\n◌ो\no\nम→मा→मो\nma→maa→mo\n[ma-maa-mo]\nमोबाइल / mobaail\n", string8, "\n[mobaail]\n◌ौ\nau\nम→मा→मौ\nma→maa→mau\n[ma-maa-mau]\nमौसम / mausam\n");
                List listW2 = q.W0(ep.a.k(sbS, string9, "\n[mausam]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listW2) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                objQ3 = ry.m.g1(arrayList3, 8, 8);
                sVar2.o0(objQ3);
            } else {
                str = "\n";
            }
            List list3 = (List) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                String string10 = getString(R.string.hindi_alp_section_content_30);
                String string11 = getString(R.string.hindi_alp_section_content_31);
                String string12 = getString(R.string.hindi_alp_section_content_32);
                String string13 = getString(R.string.hindi_alp_section_content_33);
                String string14 = getString(R.string.hindi_alp_section_content_34);
                String string15 = getString(R.string.hindi_alp_section_content_35);
                String string16 = getString(R.string.hindi_alp_section_content_36);
                StringBuilder sbS2 = defpackage.e.s("ग+ल=ग्ल\ng+l=gl\n[g-l-gl]\nइंग्लैंड / inglainD\n", string10, "\n[inglaind]\nल+ल=ल्ल\nl+l=ll\n[l-l-ll]\nनई दिल्ली / naee dillee\n", string11, "\n[naee-dillee]\nल+म=ल्म\nl+m=lm\n[l-m-lm]\nफ़िल्म / film\n");
                com.google.android.material.datepicker.d.w(sbS2, string12, "\n[film]\nन+म=न्म\nn+m=nm\n[n-m-nm]\nजन्मदिन / janmadin\n", string13, "\n[janmadin]\nत+व=त्व\nt+v=tv\n[t-v-tv]\nत्वचा / tvaca\n");
                com.google.android.material.datepicker.d.w(sbS2, string14, "\n[tvaca]\nच+छ=च्छ\nc+ch=cch\n[c-ch-chh]\nअच्छा / acchaa\n", string15, "\n[acchaa]\nर+म=र्म\nr+m=rm\n[r-m-rm]\nगर्मी / garmee\n");
                List listW3 = q.W0(ep.a.k(sbS2, string16, "\n[garmee]\n\n"), new String[]{str}, 0, 6);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listW3) {
                    if (((String) obj4).length() > 0) {
                        arrayList4.add(obj4);
                    }
                }
                objQ4 = ry.m.g1(arrayList4, 6, 6);
                sVar2.o0(objQ4);
            }
            List list4 = (List) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                List listW4 = q.W0(ep.a.k(defpackage.e.s("ऑ\nǒ\n[ka-o1]\nकॉफ़ी / kofee\n", getString(R.string.hindi_alp_section_content_37), "\n[kofee]\nट्र\nTr\n[tr1]\nमेट्रो / meTro\n", getString(R.string.hindi_alp_section_content_38), "\n[metro]\nढ़\ndha\n[rha]\nपढ़ना / padhana\n"), getString(R.string.hindi_alp_section_content_39), ADSb.BEikqKSJrZTuPh), new String[]{str}, 0, 6);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : listW4) {
                    if (((String) obj5).length() > 0) {
                        arrayList5.add(obj5);
                    }
                }
                objQ5 = ry.m.g1(arrayList5, 6, 6);
                sVar2.o0(objQ5);
            }
            List list5 = (List) objQ5;
            b bVar = new b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            aVar2 = aVar;
            boolean zH = sVar2.h(this) | sVar2.h(list) | sVar2.h(aVar2) | sVar2.h(list2) | sVar2.h(list3) | sVar2.h(list4) | sVar2.h(list5);
            Object objQ6 = sVar2.Q();
            if (zH || objQ6 == gVar) {
                dl.d dVar = new dl.d(list2, this, list, aVar2, list3, list4, list5);
                sVar2.o0(dVar);
                objQ6 = dVar;
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (fz.c) objQ6, sVar, 0, 1014);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.e(this, aVar2, i11, 1);
        }
    }
}
