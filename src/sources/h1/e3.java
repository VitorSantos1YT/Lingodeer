package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30193a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public static final void a(Long l9, Long l11, fz.e eVar, i1.x xVar, lz.g gVar, p2 p2Var, t7 t7Var, m2 m2Var, l1.n nVar, int i11) {
        int i12;
        ?? r14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-607499086);
        int i13 = i11 | (sVar.f(l9) ? 4 : 2) | (sVar.f(l11) ? 32 : 16) | (sVar.h(eVar) ? 256 : 128) | (sVar.h(xVar) ? 2048 : 1024) | (sVar.h(gVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(p2Var) ? 131072 : 65536) | (sVar.f(t7Var) ? 1048576 : 524288) | (sVar.f(m2Var) ? 8388608 : 4194304);
        if ((4793491 & i13) == 4793490 && sVar.F()) {
            sVar.W();
        } else {
            Locale localeR = k7.r(sVar);
            boolean zF = sVar.f(localeR);
            Object objQ = sVar.Q();
            Object obj = l1.m.f39353a;
            if (zF || objQ == obj) {
                objQ = xVar.c(localeR);
                sVar.o0(objQ);
            }
            i1.a0 a0Var = (i1.a0) objQ;
            String strI = i1.p.i(sVar, R.string.m3c_date_input_invalid_for_pattern);
            String strI2 = i1.p.i(sVar, R.string.m3c_date_input_invalid_year_range);
            String strI3 = i1.p.i(sVar, R.string.m3c_date_input_invalid_not_allowed);
            String strI4 = i1.p.i(sVar, R.string.m3c_date_range_input_invalid_range_input);
            boolean zF2 = ((i13 & 458752) == 131072) | sVar.f(a0Var);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new l2(gVar, t7Var, a0Var, p2Var, strI, strI2, strI3, strI4);
                sVar.o0(objQ2);
            }
            l2 l2Var = (l2) objQ2;
            l2Var.f30586i = l9;
            l2Var.f30587j = l11;
            z1.r rVarZ = j0.c.z(z1.o.f58481a, k2.f30523a);
            j0.b bVar = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f30193a), z1.c.L, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarZ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            String upperCase = r19.f33967a.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strI5 = i1.p.i(sVar, R.string.m3c_date_range_picker_start_headline);
            if (0.5f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var = new j0.i1(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            int i14 = i13 & 896;
            int i15 = i13 & 112;
            boolean z11 = (i14 == 256) | (i15 == 32);
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == obj) {
                i12 = 0;
                objQ3 = new z2(eVar, l11, 0);
                sVar.o0(objQ3);
            } else {
                i12 = 0;
            }
            int i16 = i13 & 7168;
            int i17 = (i13 >> 21) & 14;
            k2.a(i1Var, l9, (fz.c) objQ3, xVar, t1.e.d(801434508, new b3(strI5, upperCase, i12), sVar), t1.e.d(665407211, new c3(upperCase, i12), sVar), 1, l2Var, r19, localeR, m2Var, sVar, ((i13 << 3) & 112) | 1794048 | i16, i17);
            String strI6 = i1.p.i(sVar, R.string.m3c_date_range_picker_end_headline);
            if (0.5f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            boolean z12 = (i14 == 256) | ((i13 & 14) == 4);
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == obj) {
                r14 = 1;
                objQ4 = new z2(eVar, l9, 1);
                sVar.o0(objQ4);
            } else {
                r14 = 1;
            }
            k2.a(i1Var2, l11, (fz.c) objQ4, xVar, t1.e.d(911487285, new b3(strI6, upperCase, r14), sVar), t1.e.d(-961726252, new c3(upperCase, r14), sVar), 2, l2Var, a0Var, localeR, m2Var, sVar, i15 | 1794048 | i16, i17);
            sVar.p(r14);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d3(l9, l11, eVar, xVar, gVar, p2Var, t7Var, m2Var, i11);
        }
    }
}
