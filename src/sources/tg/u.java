package tg;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import j0.v1;
import java.util.List;
import l1.q1;
import l1.x1;
import rt.m9;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f52373a = j3.A(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f52374b = j3.A(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f52375c = j3.A(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final st.a f52376d = new st.a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final st.a f52377e = new st.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l1.d0 f52378f = new l1.d0(new m9(10));

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void a(i0 i0Var, d0 listType, List list, int i11, t1.d dVar, l1.n nVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        x1 x1VarT;
        int i17;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        kotlin.jvm.internal.m.f(listType, "listType");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(991783985);
        if ((i12 & 6) == 0) {
            i14 = (sVar.f(i0Var) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.f(listType) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= sVar.h(list) ? 256 : 128;
        }
        int i18 = i13 & 4;
        if (i18 == 0) {
            if ((i12 & 3072) == 0) {
                i15 = i11;
                i14 |= sVar.d(i15) ? 2048 : 1024;
            }
            if ((i12 & 24576) == 0) {
                if (sVar.h(dVar)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i14 |= i17;
            }
            if ((i14 & 9363) == 9362 || !sVar.F()) {
                if (i18 != 0) {
                    i16 = 0;
                } else {
                    i16 = i15;
                }
                c0 c0Var = k0.c(k0.b(i0Var, sVar)).f52301c;
                kotlin.jvm.internal.m.c(c0Var);
                v3.c cVar = (v3.c) sVar.j(g1.f58547h);
                v3.o oVar = c0Var.f52259a;
                kotlin.jvm.internal.m.c(oVar);
                float fW = cVar.w(oVar.f53502a);
                v3.o oVar2 = c0Var.f52260b;
                kotlin.jvm.internal.m.c(oVar2);
                float fW2 = cVar.w(oVar2.f53502a);
                v3.o oVar3 = c0Var.f52261c;
                kotlin.jvm.internal.m.c(oVar3);
                float fW3 = cVar.w(oVar3.f53502a);
                int iIntValue = ((Number) sVar.j(f52378f)).intValue();
                b(list.size(), fW3, j0.c.f(fW, CropImageView.DEFAULT_ASPECT_RATIO, fW2, CropImageView.DEFAULT_ASPECT_RATIO, 10), t1.e.d(936007618, new o(listType, c0Var, i0Var, iIntValue, i16), sVar), t1.e.d(1128938819, new r(i0Var, c0Var, iIntValue, dVar, list), sVar), sVar, 27648);
                i15 = i16;
            } else {
                sVar.W();
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new jr.k(i0Var, listType, list, i15, dVar, i12, i13);
            }
        }
        i14 |= 3072;
        i15 = i11;
        if ((i12 & 24576) == 0) {
            if (sVar.h(dVar)) {
                i17 = 16384;
            } else {
                i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i14 |= i17;
        }
        if ((i14 & 9363) == 9362) {
            if (i18 != 0) {
                i16 = 0;
            } else {
                i16 = i15;
            }
            c0 c0Var2 = k0.c(k0.b(i0Var, sVar)).f52301c;
            kotlin.jvm.internal.m.c(c0Var2);
            v3.c cVar2 = (v3.c) sVar.j(g1.f58547h);
            v3.o oVar4 = c0Var2.f52259a;
            kotlin.jvm.internal.m.c(oVar4);
            float fW4 = cVar2.w(oVar4.f53502a);
            v3.o oVar5 = c0Var2.f52260b;
            kotlin.jvm.internal.m.c(oVar5);
            float fW5 = cVar2.w(oVar5.f53502a);
            v3.o oVar6 = c0Var2.f52261c;
            kotlin.jvm.internal.m.c(oVar6);
            float fW6 = cVar2.w(oVar6.f53502a);
            int iIntValue2 = ((Number) sVar.j(f52378f)).intValue();
            b(list.size(), fW6, j0.c.f(fW4, CropImageView.DEFAULT_ASPECT_RATIO, fW5, CropImageView.DEFAULT_ASPECT_RATIO, 10), t1.e.d(936007618, new o(listType, c0Var2, i0Var, iIntValue2, i16), sVar), t1.e.d(1128938819, new r(i0Var, c0Var2, iIntValue2, dVar, list), sVar), sVar, 27648);
            i15 = i16;
        } else {
            if (i18 != 0) {
                i16 = 0;
            } else {
                i16 = i15;
            }
            c0 c0Var3 = k0.c(k0.b(i0Var, sVar)).f52301c;
            kotlin.jvm.internal.m.c(c0Var3);
            v3.c cVar3 = (v3.c) sVar.j(g1.f58547h);
            v3.o oVar7 = c0Var3.f52259a;
            kotlin.jvm.internal.m.c(oVar7);
            float fW7 = cVar3.w(oVar7.f53502a);
            v3.o oVar8 = c0Var3.f52260b;
            kotlin.jvm.internal.m.c(oVar8);
            float fW8 = cVar3.w(oVar8.f53502a);
            v3.o oVar9 = c0Var3.f52261c;
            kotlin.jvm.internal.m.c(oVar9);
            float fW9 = cVar3.w(oVar9.f53502a);
            int iIntValue3 = ((Number) sVar.j(f52378f)).intValue();
            b(list.size(), fW9, j0.c.f(fW7, CropImageView.DEFAULT_ASPECT_RATIO, fW8, CropImageView.DEFAULT_ASPECT_RATIO, 10), t1.e.d(936007618, new o(listType, c0Var3, i0Var, iIntValue3, i16), sVar), t1.e.d(1128938819, new r(i0Var, c0Var3, iIntValue3, dVar, list), sVar), sVar, 27648);
            i15 = i16;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jr.k(i0Var, listType, list, i15, dVar, i12, i13);
        }
    }

    public static final void b(int i11, float f5, v1 v1Var, t1.d dVar, t1.d dVar2, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1888378294);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.c(f5) ? 32 : 16) | (sVar.f(v1Var) ? 256 : 128);
        if ((i13 & 9363) == 9362 && sVar.F()) {
            sVar.W();
        } else {
            sVar.d0(874495906);
            boolean z11 = ((i13 & 112) == 32) | ((i13 & 14) == 4);
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new t(i11, f5);
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            sVar.p(false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            se.p.G(t1.e.d(-1117232110, new n0.z(i11, v1Var, dVar), sVar), sVar, 6);
            sVar.d0(1936501445);
            for (int i14 = 0; i14 < i11; i14++) {
                dVar2.invoke(Integer.valueOf(i14), sVar, 48);
            }
            sVar.p(false);
            sVar.p(true);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jl.k(i11, f5, v1Var, dVar, dVar2, i12);
        }
    }

    public static final void c(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(824663458);
        if ((i11 & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.a(f52378f.a(0), t1.e.d(20615394, new j0.l0(dVar, 1), sVar), sVar, 56);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 11);
        }
    }
}
