package com.lingo.lingoskill.turskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.t1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dl.h;
import fz.c;
import h1.k7;
import h1.p7;
import h1.ua;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.u;
import j0.v1;
import j0.z1;
import j3.y0;
import java.util.List;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import md.a;
import mt.k6;
import oz.q;
import pr.a0;
import pr.y;
import r0.f;
import se.i;
import wo.e;
import xg.d;
import y2.j;
import y2.k;
import z1.o;
import z1.r;
import zo.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TURSyllableIntroductionActivity extends d {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f22037t = "A a\tB b\tC c\tÇ ç\tD d\tE e\tF f\tG g\tĞ ğ\tH h\tI ı\tİ i\tJ j\tK k\tL l\tM m\tN n\tO o\tÖ ö\tP p\tR r\tS s\tŞ ş\tT t\tU u\tÜ ü\tV v\tY y\tZ z";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1540622222);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            s(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 16, bundle);
        }
    }

    public final void p(b bVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-2115702743);
        int i12 = (sVar.h(bVar) ? 4 : 2) | i11 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = q.W0(this.f22037t, new String[]{"\t"}, 0, 6);
                sVar.o0(objQ);
            }
            List list = (List) objQ;
            m0.b bVar2 = new m0.b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            boolean zH = sVar.h(this) | sVar.h(list) | sVar.h(bVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new a0(list, this, bVar, 29);
                sVar.o0(objQ2);
            }
            a.a(bVar2, null, null, v1Var, null, null, null, false, null, (c) objQ2, sVar, 0, 1014);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(this, bVar, i11, 0);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-48101263);
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
            x1VarT.f39502d = new t1(this, i11, 27, str);
        }
    }

    public final void r(String str, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1097081594);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), f.d(4), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(1495515896, new h(aVar, str, 3), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(this, str, false, aVar, i11, 23);
        }
    }

    public final void s(b bVar, n nVar, int i11) {
        b bVar2;
        b bVar3;
        b bVar4;
        s sVar = (s) nVar;
        sVar.f0(1088705431);
        int i12 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                bVar3 = (b) ViewModelKt.viewModel(z.a(b.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
                bVar3 = bVar;
            }
            sVar.q();
            b1 b1VarO = t.o(bVar3.f59262b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(-1969263139);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
                bVar4 = bVar3;
            } else {
                sVar.d0(-1969160064);
                bVar4 = bVar3;
                p7.a(null, t1.e.d(-1182117121, new wo.d(this, 1), sVar), null, null, null, 0, 0L, 0L, null, t1.e.d(-1002023734, new wo.f(this, bVar3, 1), sVar), sVar, 805306416, 509);
                sVar.p(false);
            }
            bVar2 = bVar4;
        } else {
            sVar.W();
            bVar2 = bVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(this, bVar2, i11, 1);
        }
    }

    public final void t(String str, String str2, String str3, c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1935691668);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024) | (sVar.h(this) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = j.f56915d;
            t.J(hVar4, rVarC, sVar);
            q(str, sVar, ((i12 >> 9) & 112) | (i12 & 14));
            r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            float f5 = 52;
            r rVarG = e2.g(oVar, f5);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            r rVarI = rVarG.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            float f11 = 4;
            k7.d(rVarI, f.d(f11), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(848034616, new in.d(cVar, str2, 2), sVar), sVar, 196608, 24);
            j0.c.g(sVar, e2.s(oVar, 2));
            r rVarG2 = e2.g(oVar, f5);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k7.d(rVarG2.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f.d(f11), k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(1844905135, new in.d(cVar, str3, 3), sVar), sVar, 196608, 24);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(this, str, str2, str3, cVar, i11, 17);
        }
    }
}
