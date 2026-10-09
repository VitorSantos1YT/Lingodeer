package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3.z f31015a = new z3.z(false, 14);

    public static final void a(boolean z11, fz.a aVar, z1.r rVar, long j11, d0.d2 d2Var, z3.z zVar, g2.w0 w0Var, long j12, float f5, float f11, t1.d dVar, l1.n nVar, int i11) {
        long jFloatToRawIntBits;
        z3.z zVar2;
        d0.d2 d2Var2;
        g2.w0 w0Var2;
        long j13;
        float f12;
        float f13;
        z1.r rVar2;
        long j14;
        z3.z zVar3;
        z1.r rVar3;
        d0.d2 d2Var3;
        g2.w0 w0Var3;
        long j15;
        float f14;
        float f15;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1431928300);
        if (((i11 | (sVar.g(z11) ? 4 : 2) | 910896512) & 306783379) == 306783378 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            j14 = j11;
            d2Var3 = d2Var;
            zVar3 = zVar;
            w0Var3 = w0Var;
            j15 = j12;
            f14 = f5;
            f15 = f11;
        } else {
            sVar.Y();
            int i12 = 0;
            if ((i11 & 1) == 0 || sVar.C()) {
                float f16 = 0;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                d0.d2 d2VarU = d0.n.u(sVar);
                float f17 = v4.f31186a;
                g2.w0 w0VarA = y7.a(k1.r.f37747c, sVar);
                long jD = v1.d(k1.r.f37745a, sVar);
                float f18 = v4.f31186a;
                float f19 = v4.f31187b;
                z1.o oVar = z1.o.f58481a;
                zVar2 = f31015a;
                d2Var2 = d2VarU;
                w0Var2 = w0VarA;
                j13 = jD;
                f12 = f18;
                f13 = f19;
                rVar2 = oVar;
            } else {
                sVar.W();
                rVar2 = rVar;
                jFloatToRawIntBits = j11;
                d2Var2 = d2Var;
                zVar2 = zVar;
                w0Var2 = w0Var;
                j13 = j12;
                f12 = f5;
                f13 = f11;
            }
            sVar.q();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new b0.p0(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b0.p0 p0Var = (b0.p0) objQ;
            p0Var.f3633d.setValue(Boolean.valueOf(z11));
            if (((Boolean) p0Var.f3632c.getValue()).booleanValue() || ((Boolean) p0Var.f3633d.getValue()).booleanValue()) {
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(new g2.z0(g2.z0.f28631b));
                    sVar.o0(objQ2);
                }
                l1.b1 b1Var = (l1.b1) objQ2;
                v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
                boolean zF = sVar.f(cVar);
                Object objQ3 = sVar.Q();
                if (zF || objQ3 == gVar) {
                    objQ3 = new i1.e0(jFloatToRawIntBits, cVar, new q(i12, b1Var));
                    sVar.o0(objQ3);
                }
                z3.k.a((i1.e0) objQ3, aVar, zVar2, t1.e.d(2126968933, new o(rVar2, p0Var, b1Var, d2Var2, w0Var2, j13, f12, f13, dVar), sVar), sVar, 3504, 0);
            }
            j14 = jFloatToRawIntBits;
            zVar3 = zVar2;
            rVar3 = rVar2;
            d2Var3 = d2Var2;
            w0Var3 = w0Var2;
            j15 = j13;
            f14 = f12;
            f15 = f13;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(z11, aVar, rVar3, j14, d2Var3, zVar3, w0Var3, j15, f14, f15, dVar, i11);
        }
    }

    public static final void b(t1.d dVar, fz.a aVar, z1.r rVar, boolean z11, w4 w4Var, j0.t1 t1Var, l1.n nVar, int i11) {
        w4 w4Var2;
        int i12;
        boolean z12;
        z1.r rVar2;
        j0.t1 t1Var2;
        w4 w4Var3;
        z1.r rVar3;
        boolean z13;
        w4 w4Var4;
        j0.t1 t1Var3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1826340448);
        int i13 = i11 | (sVar.h(aVar) ? 32 : 16) | 113995136;
        if ((38347923 & i13) == 38347922 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            z13 = z11;
            w4Var4 = w4Var;
            t1Var3 = t1Var;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                float f5 = v4.f31186a;
                s1 s1Var = (s1) sVar.j(v1.f31180a);
                w4 w4Var5 = s1Var.V;
                if (w4Var5 == null) {
                    w4Var2 = new w4(v1.c(s1Var, k1.q.f37740g), v1.c(s1Var, k1.q.f37741h), v1.c(s1Var, k1.q.f37742i), g2.x.c(v1.c(s1Var, k1.q.f37734a), k1.q.f37735b), g2.x.c(v1.c(s1Var, k1.q.f37736c), k1.q.f37737d), g2.x.c(v1.c(s1Var, k1.q.f37738e), k1.q.f37739f));
                    s1Var.V = w4Var2;
                } else {
                    w4Var2 = w4Var5;
                }
                i12 = i13 & (-3670017);
                j0.v1 v1Var = v4.f31188c;
                z12 = true;
                rVar2 = z1.o.f58481a;
                t1Var2 = v1Var;
                w4Var3 = w4Var2;
            } else {
                sVar.W();
                i12 = i13 & (-3670017);
                rVar2 = rVar;
                z12 = z11;
                w4Var3 = w4Var;
                t1Var2 = t1Var;
            }
            sVar.q();
            b5.b(dVar, aVar, rVar2, z12, w4Var3, t1Var2, sVar, i12 & 268435454);
            rVar3 = rVar2;
            z13 = z12;
            w4Var4 = w4Var3;
            t1Var3 = t1Var2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r(dVar, aVar, rVar3, z13, w4Var4, t1Var3, i11);
        }
    }
}
