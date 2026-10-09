package com.lingo.lingoskill.idnskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.t1;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fz.c;
import g2.v0;
import h1.e0;
import h1.k7;
import h1.ua;
import j0.e2;
import j0.u;
import j0.v1;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.b2;
import l1.d0;
import l1.g;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import m0.b;
import mt.k6;
import n3.p;
import oz.q;
import pr.y;
import r0.f;
import se.i;
import t1.e;
import u3.l;
import wl.a;
import xg.d;
import y2.h;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class IDNSyllableIntroductionActivity extends d {
    public static final /* synthetic */ int P = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21888t = "A a\tB b\tC c\tD d\tE e\tF f\tG g\tH h\tI i\tJ j\tK k\tL l\tM m\tN n\tO o\tP p\tQ q\tR r\tS s\tT t\tU u\tV v\tW w\tX x\tY y\tZ z";
    public final String H = "a\tapa\nwhat\ti\tini\nthis\to\ttoko\nstore\tu\tguru\nteacher";
    public final String K = "e\nthe schwa\tenam\nsix\te\nthe open “e” sound\tes\nice";
    public final String L = "b\tibu\nmother\t \tc\tcuaca\nwater\t \td\tdia\nhe, she\t \tf\tfilm\nmovie\tmaaf\nsorry\tg\tgigi\ntooth\t \th\thari\nday\ttujuh\nseven\tj\tjeruk\norange\t \tk\tkucing\ncat\tanak\nchild\tl\tlima\nfive\tmahal\nexpensive\tm\tmakan\nto eat\tayam\nchicken\tn\tnaik\nto ride\tjalan\nroad\tp\tpagi\nmorning\tlaptop\nlaptop\tq\tQuran\nQuran\t \tr\tribut\nnoisy\tair\nwater\ts\tsaya\nI\tbagus\nnice\tt\ttiga\nthree\tempat\nfour\tv\tvoli\nvolleyball\t \tw\twaktu\ntime\t \ty\tya\nyes\t \tz\tzebra\nzebra\t ";
    public final String M = "laptop\nlaptop\tempat\nfour\tanak\nchild";
    public final String N = "sangat\nvery\tkucing\ncat";
    public final String O = "hanya\nonly\tpenyanyi\nsinger";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-51314224);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            t(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 11, bundle);
        }
    }

    public final void p(a aVar, n nVar, int i11) {
        int i12;
        s sVar;
        b bVar;
        s sVar2 = (s) nVar;
        sVar2.f0(111964069);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(this) ? 32 : 16;
        }
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar2.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = q.W0(this.f21888t, new String[]{"\t"}, 0, 6);
                sVar2.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = ry.m.g1(q.W0(this.H, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ2);
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = ry.m.g1(q.W0(this.K, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ3);
            }
            List list3 = (List) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = ry.m.g1(q.W0(this.L, new String[]{"\t"}, 0, 6), 3, 3);
                sVar2.o0(objQ4);
            }
            List list4 = (List) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = ry.m.g1(q.W0(this.M, new String[]{"\t"}, 0, 6), 3, 3);
                sVar2.o0(objQ5);
            }
            List list5 = (List) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = ry.m.g1(q.W0(this.N, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ6);
            }
            List list6 = (List) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = ry.m.g1(q.W0(this.O, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ7);
            }
            List list7 = (List) objQ7;
            b bVar2 = new b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, f5);
            boolean zH = sVar2.h(this) | sVar2.h(list) | sVar2.h(aVar) | sVar2.h(list2) | sVar2.h(list3) | sVar2.h(list4) | sVar2.h(list5) | sVar2.h(list6) | sVar2.h(list7);
            Object objQ8 = sVar2.Q();
            if (zH || objQ8 == gVar) {
                bVar = bVar2;
                b2 b2Var = new b2(list, this, aVar, list2, list3, list4, list5, list6, list7);
                sVar2.o0(b2Var);
                objQ8 = b2Var;
            } else {
                bVar = bVar2;
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (c) objQ8, sVar, 0, 1014);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, 26, aVar);
        }
    }

    public final void q(String str, n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1441206735);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, j3.v(1.8d), null, 16646142), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, 25, str);
        }
    }

    public final void r(String str, c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1972510043);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, e.d(620087447, new in.d(cVar, str, 1), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(this, str, cVar, i11, 17);
        }
    }

    public final void s(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-881521292);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 54, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 10, str);
        }
    }

    public final void t(a aVar, n nVar, int i11) {
        a aVar2;
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-978595053);
        int i13 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar2 = (a) ViewModelKt.viewModel(z.a(a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
                i12 = i13 & (-15);
            } else {
                sVar.W();
                aVar2 = aVar;
                i12 = i13 & (-15);
            }
            sVar.q();
            b1 b1VarO = t.o(aVar2.f55176b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(913042657);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
            } else {
                sVar.d0(913140958);
                u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, o.f58481a);
                k.J.getClass();
                y2.i iVar = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, uVarA, sVar);
                t.J(j.f56916e, q1VarL, sVar);
                h hVar = j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                t.J(j.f56915d, rVarC, sVar);
                e0.c(tl.a.f52428a, null, e.d(1313306919, new mt.r(this, 16), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                sVar = sVar;
                p(aVar2, sVar, i12 & 126);
                sVar.p(true);
                sVar.p(false);
            }
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 12, aVar2);
        }
    }

    public final void u(String str, String str2, r rVar, c cVar, n nVar, int i11) {
        s sVar;
        boolean z11;
        boolean z12;
        s sVar2 = (s) nVar;
        sVar2.f0(651316775);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str2) ? 32 : 16;
        }
        int i13 = i12 | (sVar2.f(rVar) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            float f5 = 4;
            r rVarB = d2.h.b(d0.n.h(j0.c.A(rVar, 1), i.k(sVar2, R.color.white), f.d(f5)), f.d(f5));
            boolean z13 = !q.K0(str);
            boolean z14 = ((i13 & 14) == 4) | ((i13 & 7168) == 2048);
            Object objQ = sVar2.Q();
            if (z14 || objQ == m.f39353a) {
                objQ = new in.h(cVar, str, 19);
                sVar2.o0(objQ);
            }
            r rVarO = d0.n.o(rVarB, z13, null, (fz.a) objQ, 14);
            u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarO);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, uVarA, sVar2);
            t.J(j.f56916e, q1VarL, sVar2);
            h hVar = j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar2);
            List listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
            StringBuilder sb2 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            String str3 = (String) listW0.get(0);
            sb2.append(str3);
            if (!q.K0(str2)) {
                int i14 = 0;
                while (true) {
                    int iF0 = q.F0(str3, str2, i14, true);
                    if (iF0 == -1) {
                        break;
                    }
                    int length = str2.length() + iF0;
                    arrayList.add(new j3.d(iF0, length, 8, new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), null));
                    i14 = length;
                }
            }
            String string = sb2.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList2.add(((j3.d) arrayList.get(i15)).a(sb2.length()));
            }
            j3.h hVar2 = new j3.h(string, arrayList2);
            d0 d0Var = ua.f31167a;
            ua.c(hVar2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(d0Var), i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 131070);
            sVar = sVar2;
            if (listW0.size() == 2) {
                sVar.d0(-1389225075);
                j0.c.g(sVar, e2.g(o.f58481a, 2));
                z11 = true;
                ua.b((String) listW0.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                sVar = sVar;
                z12 = false;
            } else {
                z11 = true;
                z12 = false;
                sVar.d0(-1407022671);
            }
            sVar.p(z12);
            sVar.p(z11);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.e2(this, str, str2, rVar, cVar, i11, 12);
        }
    }
}
