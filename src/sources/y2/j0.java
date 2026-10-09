package y2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.g1 f56920a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f56927h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f56929j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56921b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f56928i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public j0(a aVar, int i11) {
        this.f56929j = i11;
        this.f56920a = (w2.g1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [fz.e, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v6, types: [w2.g1, y2.a] */
    public static final void a(j0 j0Var, w2.n nVar, int i11, k1 k1Var) {
        HashMap map = j0Var.f56928i;
        float f5 = i11;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f5)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f5)) & 4294967295L;
        while (true) {
            long jX = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (j0Var.f56929j) {
                    case 0:
                        s1 s1Var = k1Var.f56957n0;
                        if (s1Var != null) {
                            jX = s1Var.g(jX, false);
                        }
                        jX = ew.a.x(jX, k1Var.f56945b0);
                        break;
                    default:
                        r0 r0VarA1 = k1Var.a1();
                        kotlin.jvm.internal.m.c(r0VarA1);
                        long j11 = r0VarA1.R;
                        jX = f2.b.h((((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32), jX);
                        break;
                }
                k1Var = k1Var.S;
                kotlin.jvm.internal.m.c(k1Var);
                if (k1Var.equals(j0Var.f56920a.e())) {
                    int iRound = Math.round(nVar instanceof w2.n ? Float.intBitsToFloat((int) (jX & 4294967295L)) : Float.intBitsToFloat((int) (jX >> 32)));
                    if (map.containsKey(nVar)) {
                        int iIntValue = ((Number) ry.x.U(nVar, map)).intValue();
                        w2.n nVar2 = w2.c.f54475a;
                        iRound = ((Number) nVar.f54549a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(nVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!j0Var.b(k1Var).containsKey(nVar));
            float fC = j0Var.c(k1Var, nVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(k1 k1Var) {
        switch (this.f56929j) {
            case 0:
                return k1Var.K0().a();
            default:
                r0 r0VarA1 = k1Var.a1();
                kotlin.jvm.internal.m.c(r0VarA1);
                return r0VarA1.K0().a();
        }
    }

    public final int c(k1 k1Var, w2.n nVar) {
        switch (this.f56929j) {
            case 0:
                return k1Var.X(nVar);
            default:
                r0 r0VarA1 = k1Var.a1();
                kotlin.jvm.internal.m.c(r0VarA1);
                return r0VarA1.X(nVar);
        }
    }

    public final boolean d() {
        return this.f56922c || this.f56924e || this.f56925f || this.f56926g;
    }

    public final boolean e() {
        h();
        return this.f56927h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w2.g1, y2.a] */
    public final void f() {
        this.f56921b = true;
        ?? r9 = this.f56920a;
        a aVarI = r9.i();
        if (aVarI == null) {
            return;
        }
        if (this.f56922c) {
            aVarI.R();
        } else if (this.f56924e || this.f56923d) {
            aVarI.requestLayout();
        }
        if (this.f56925f) {
            r9.R();
        }
        if (this.f56926g) {
            r9.requestLayout();
        }
        aVarI.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [w2.g1, y2.a] */
    public final void g() {
        HashMap map = this.f56928i;
        map.clear();
        y.p0 p0Var = new y.p0(this, 2);
        ?? r9 = this.f56920a;
        r9.N(p0Var);
        map.putAll(b(r9.e()));
        this.f56921b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [w2.g1, y2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y2.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        a aVar;
        j0 j0VarA;
        j0 j0VarA2;
        boolean zD = d();
        ?? r9 = this.f56920a;
        ?? r11 = r9;
        if (!zD) {
            a aVarI = r9.i();
            if (aVarI == null) {
                return;
            }
            aVar = aVarI.a().f56927h;
            if (aVar == null || !aVar.a().d()) {
                r11 = aVar;
                a aVar2 = this.f56927h;
                if (aVar2 == null || aVar2.a().d()) {
                    return;
                }
                a aVarI2 = aVar2.i();
                if (aVarI2 != null && (j0VarA2 = aVarI2.a()) != null) {
                    j0VarA2.h();
                }
                a aVarI3 = aVar2.i();
                r11 = (aVarI3 == null || (j0VarA = aVarI3.a()) == null) ? 0 : j0VarA.f56927h;
            }
        }
        r11 = aVar;
        this.f56927h = r11;
    }
}
