package ct;

import ch.z;
import com.lingodeer.data.env.FontSizeStyleKt;
import cr.m;
import fr.j3;
import fr.o0;
import h1.ua;
import j3.y0;
import l1.b1;
import l1.c3;
import l1.g;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import n3.i;
import ry.l;
import t1.e;
import v3.o;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c3 f22476a = new c3(new m(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c3 f22477b = new c3(new m(2));

    public static final void a(n0 envRepository, t1.d dVar, n nVar, int i11) {
        long jA;
        Object oVar;
        y0 y0VarA;
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        s sVar = (s) nVar;
        sVar.f0(-915433782);
        int i12 = (sVar.h(envRepository) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            o0 o0Var = (o0) envRepository;
            b1 b1VarO = t.o(o0Var.f27745n, sVar);
            b1 b1VarO2 = t.o(o0Var.f27736d, sVar);
            b1 b1VarO3 = t.o(o0Var.f27738f, sVar);
            b1 b1VarO4 = t.o(o0Var.f27740h, sVar);
            b1 b1VarO5 = t.o(o0Var.f27744l, sVar);
            boolean zD = sVar.d(((Number) b1VarO2.getValue()).intValue());
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (zD || objQ == gVar) {
                if (xt.d.u(((Number) b1VarO2.getValue()).intValue())) {
                    jA = j3.A(20);
                } else if (l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) b1VarO2.getValue()).intValue()))) {
                    jA = j3.A(28);
                } else {
                    jA = xt.d.z(((Number) b1VarO2.getValue()).intValue()) ? j3.A(26) : j3.A(22);
                }
                o oVar2 = new o(jA);
                sVar.o0(oVar2);
                objQ = oVar2;
            }
            long j11 = ((o) objQ).f53502a;
            boolean zD2 = sVar.d(((Number) b1VarO2.getValue()).intValue());
            Object objQ2 = sVar.Q();
            if (zD2 || objQ2 == gVar) {
                objQ2 = new o(xt.d.u(((Number) b1VarO2.getValue()).intValue()) ? j3.A(20) : j3.A(22));
                sVar.o0(objQ2);
            }
            long j12 = ((o) objQ2).f53502a;
            boolean zD3 = sVar.d(((Number) b1VarO3.getValue()).intValue());
            Object objQ3 = sVar.Q();
            if (zD3 || objQ3 == gVar) {
                objQ3 = new o(((Number) b1VarO3.getValue()).intValue() == 51 ? j3.A(18) : j3.A(16));
                sVar.o0(objQ3);
            }
            long j13 = ((o) objQ3).f53502a;
            boolean zD4 = sVar.d(((Number) b1VarO2.getValue()).intValue());
            Object objQ4 = sVar.Q();
            if (zD4 || objQ4 == gVar) {
                oVar = new o(l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) b1VarO2.getValue()).intValue())) ? j3.A(28) : j3.A(25));
                sVar.o0(oVar);
            } else {
                oVar = objQ4;
            }
            long j14 = ((o) oVar).f53502a;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = new o(j3.A(25));
                sVar.o0(objQ5);
            }
            long j15 = ((o) objQ5).f53502a;
            boolean zD5 = sVar.d(((Number) b1VarO.getValue()).intValue());
            Object objQ6 = sVar.Q();
            if (zD5 || objQ6 == gVar) {
                objQ6 = Float.valueOf(FontSizeStyleKt.fontSizeStyleScale(((Number) b1VarO.getValue()).intValue()));
                sVar.o0(objQ6);
            }
            float fFloatValue = ((Number) objQ6).floatValue();
            if (l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) b1VarO2.getValue()).intValue()))) {
                sVar.d0(1356135468);
                y0 y0Var = (y0) sVar.j(ua.f31167a);
                q3.a aVarD = xt.d.d(((Number) b1VarO2.getValue()).intValue());
                y0VarA = y0.a(y0Var, 0L, 0L, null, null, i.f43153a, 0L, aVarD != null ? new q3.b(l.k0(new q3.a[]{aVarD})) : null, null, 0, 0, 0L, null, 16776159);
                sVar.p(false);
            } else {
                sVar.d0(1356342393);
                y0 y0Var2 = (y0) sVar.j(ua.f31167a);
                q3.a aVarD2 = xt.d.d(((Number) b1VarO2.getValue()).intValue());
                y0VarA = y0.a(y0Var2, 0L, 0L, null, null, null, 0L, aVarD2 != null ? new q3.b(l.k0(new q3.a[]{aVarD2})) : null, null, 0, 0, 0L, null, 16776191);
                sVar.p(false);
            }
            y0 y0Var3 = y0VarA;
            boolean zC = sVar.c(fFloatValue) | sVar.e(j11) | sVar.e(j13) | sVar.d(((Number) b1VarO4.getValue()).intValue()) | sVar.c(((Number) b1VarO5.getValue()).floatValue());
            Object objQ7 = sVar.Q();
            if (zC || objQ7 == gVar) {
                long jA2 = j3.A(18);
                j3.i(j11);
                long jL = j3.L(j11 & 1095216660480L, o.c(j11) * fFloatValue);
                j3.i(j12);
                long jL2 = j3.L(j12 & 1095216660480L, o.c(j12) * fFloatValue);
                j3.i(j13);
                long jL3 = j3.L(j13 & 1095216660480L, o.c(j13) * fFloatValue);
                long jA3 = j3.A(42);
                j3.i(jA3);
                long jL4 = j3.L(jA3 & 1095216660480L, o.c(jA3) * fFloatValue);
                j3.i(j15);
                long jL5 = j3.L(j15 & 1095216660480L, o.c(j15) * fFloatValue);
                j3.i(j14);
                objQ7 = new b(jA2, jL, jL2, jL3, jL4, jL5, j3.L(j14 & 1095216660480L, o.c(j14) * fFloatValue), ((Number) b1VarO4.getValue()).intValue(), ((Number) b1VarO5.getValue()).floatValue(), y0Var3);
                sVar.o0(objQ7);
            }
            t.a(f22476a.a((b) objQ7), e.d(-1737147510, new br.m(dVar, 1), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(envRepository, i11, 16, dVar);
        }
    }

    public static final y0 b(n nVar) {
        return ((b) ((s) nVar).j(f22476a)).f22475j;
    }

    public static final long c(n nVar) {
        return ((b) ((s) nVar).j(f22476a)).f22467b;
    }

    public static final float d(n nVar) {
        s sVar = (s) nVar;
        if (!((Boolean) sVar.j(f22477b)).booleanValue()) {
            sVar.d0(-364559815);
            sVar.p(false);
            return 1.0f;
        }
        sVar.d0(-364625659);
        float f5 = ((b) sVar.j(f22476a)).f22474i;
        sVar.p(false);
        return f5;
    }

    public static final long e(n nVar) {
        return ((b) ((s) nVar).j(f22476a)).f22469d;
    }
}
