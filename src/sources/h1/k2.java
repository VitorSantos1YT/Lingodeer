package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0.v1 f30523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30524b = 16;

    static {
        float f5 = 24;
        f30523a = j0.c.f(f5, 10, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8);
    }

    public static final void a(z1.r rVar, Long l9, fz.c cVar, i1.x xVar, t1.d dVar, t1.d dVar2, int i11, l2 l2Var, i1.a0 a0Var, Locale locale, m2 m2Var, l1.n nVar, int i12, int i13) {
        int i14;
        l1.g gVar;
        int i15;
        int i16;
        l1.s sVar;
        i1.a0 a0Var2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-857008589);
        int i17 = i12 | (sVar2.f(rVar) ? 4 : 2);
        if ((i12 & 48) == 0) {
            i17 |= sVar2.f(l9) ? 32 : 16;
        }
        int i18 = i17 | (sVar2.h(cVar) ? 256 : 128) | (sVar2.h(xVar) ? 2048 : 1024) | (sVar2.f(l2Var) ? 8388608 : 4194304) | (sVar2.f(a0Var) ? 67108864 : 33554432) | (sVar2.h(locale) ? 536870912 : 268435456);
        if ((i13 & 6) == 0) {
            i14 = i13 | (sVar2.f(m2Var) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((306783379 & i18) == 306783378 && (i14 & 3) == 2 && sVar2.F()) {
            sVar2.W();
            a0Var2 = a0Var;
        } else {
            l1.b1 b1Var = (l1.b1) w1.j.e(new Object[0], null, t1.f31091e, sVar2, 3072, 6);
            Object[] objArr = new Object[0];
            int i19 = 234881024 & i18;
            boolean zH = ((i18 & 112) == 32) | sVar2.h(xVar) | (i19 == 67108864) | sVar2.h(locale);
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zH || objQ == gVar2) {
                gVar = gVar2;
                i15 = 0;
                i16 = i18;
                androidx.fragment.app.p pVar = new androidx.fragment.app.p(l9, xVar, a0Var, locale, 2);
                sVar2.o0(pVar);
                objQ = pVar;
            } else {
                i16 = i18;
                gVar = gVar2;
                i15 = 0;
            }
            l1.b1 b1Var2 = (l1.b1) w1.j.e(Arrays.copyOf(objArr, i15), new qp.o2(6, new rz.w(24), new vr.a(3)), (fz.a) objQ, sVar2, 0, 0);
            o3.w wVar = (o3.w) b1Var2.getValue();
            int i21 = (((((((i19 == 67108864 ? 1 : i15) | (sVar2.f(b1Var2) ? 1 : 0)) == true ? 1 : 0) | (sVar2.f(b1Var) ? 1 : 0)) | ((i16 & 896) == 256 ? 1 : i15)) | (sVar2.h(xVar) ? 1 : 0)) == true ? 1 : 0) | ((29360128 & i16) == 8388608 ? 1 : i15) | (sVar2.h(locale) ? 1 : 0);
            Object objQ2 = sVar2.Q();
            l1.g gVar3 = gVar;
            if (i21 != 0 || objQ2 == gVar3) {
                sVar = sVar2;
                b6.d dVar3 = new b6.d(a0Var, b1Var, cVar, xVar, l2Var, i11, locale, b1Var2);
                a0Var2 = a0Var;
                sVar.o0(dVar3);
                objQ2 = dVar3;
            } else {
                a0Var2 = a0Var;
                sVar = sVar2;
            }
            fz.c cVar2 = (fz.c) objQ2;
            z1.r rVarE = j0.c.E(rVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, !oz.q.K0((CharSequence) b1Var.getValue()) ? i15 : f30524b, 7);
            boolean zF = sVar.f(b1Var);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar3) {
                objQ3 = new i2(0, b1Var);
                sVar.o0(objQ3);
            }
            l1.s sVar3 = sVar;
            t6.b(wVar, cVar2, g3.r.b(rVarE, i15, (fz.c) objQ3), false, null, dVar, dVar2, null, null, t1.e.d(-591991974, new q(1, b1Var), sVar), !oz.q.K0((CharSequence) b1Var.getValue()), new b10.b(a0Var2), new s0.r0(3, 7, 113), null, true, 0, 0, null, m2Var.f30662y, sVar3, 14155776, 12779904, 4001592);
            sVar2 = sVar3;
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j2(rVar, l9, cVar, xVar, dVar, dVar2, i11, l2Var, a0Var2, locale, m2Var, i12, i13);
        }
    }
}
