package s0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f51253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f51254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3.w f51255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3.p f51256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v3.c f51257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f51258f;

    public y(s0 s0Var, fz.c cVar, o3.w wVar, o3.p pVar, v3.c cVar2, int i11) {
        this.f51253a = s0Var;
        this.f51254b = cVar;
        this.f51255c = wVar;
        this.f51256d = pVar;
        this.f51257e = cVar2;
        this.f51258f = i11;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        s0 s0Var2;
        j3.u0 u0Var;
        j3.u0 u0Var2;
        j3.u0 u0Var3;
        y yVar;
        s0 s0Var3;
        int i11;
        int iP;
        w2.x xVar;
        s0 s0Var4 = this.f51253a;
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            o1 o1VarD = s0Var4.d();
            re.q.t(fVarN, fVarR, cVarE);
            j3.u0 u0Var4 = o1VarD != null ? o1VarD.f51124a : null;
            z0 z0Var = s0Var4.f51166a;
            v3.m layoutDirection = s0Var.getLayoutDirection();
            int i12 = z0Var.f51271f;
            boolean z11 = z0Var.f51270e;
            int i13 = z0Var.f51268c;
            if (u0Var4 != null) {
                j3.x xVar2 = u0Var4.f35798b;
                j3.t0 t0Var = u0Var4.f35797a;
                j3.h hVar = z0Var.f51266a;
                j3.y0 y0Var = z0Var.f51267b;
                List list2 = z0Var.f51274i;
                v3.c cVar = z0Var.f51272g;
                n3.h hVar2 = z0Var.f51273h;
                j3.u0 u0Var5 = u0Var4;
                if (!xVar2.f35813a.a()) {
                    j3.h hVar3 = t0Var.f35784a;
                    s0Var2 = s0Var4;
                    long j12 = t0Var.f35793j;
                    if (kotlin.jvm.internal.m.a(hVar3, hVar) && t0Var.f35785b.c(y0Var) && kotlin.jvm.internal.m.a(t0Var.f35786c, list2) && t0Var.f35787d == i13 && t0Var.f35788e == z11 && t0Var.f35789f == i12 && kotlin.jvm.internal.m.a(t0Var.f35790g, cVar) && t0Var.f35791h == layoutDirection && kotlin.jvm.internal.m.a(t0Var.f35792i, hVar2) && v3.a.j(j11) == v3.a.j(j12) && ((!z11 && i12 != 2) || (v3.a.h(j11) == v3.a.h(j12) && v3.a.g(j11) == v3.a.g(j12)))) {
                        u0Var3 = new j3.u0(new j3.t0(t0Var.f35784a, z0Var.f51267b, t0Var.f35786c, t0Var.f35787d, t0Var.f35788e, t0Var.f35789f, t0Var.f35790g, t0Var.f35791h, t0Var.f35792i, j11), xVar2, v3.b.d(j11, (((long) o0.p(xVar2.f35817e)) & 4294967295L) | (((long) o0.p(xVar2.f35816d)) << 32)));
                        u0Var2 = u0Var5;
                    }
                    long j13 = u0Var3.f35799c;
                    Integer numValueOf = Integer.valueOf((int) (j13 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j13 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (kotlin.jvm.internal.m.a(u0Var2, u0Var3)) {
                        yVar = this;
                        s0Var3 = s0Var2;
                        i11 = 0;
                    } else {
                        if (o1VarD != 0) {
                            xVar = o1VarD.f51126c;
                        } else {
                            xVar = null;
                        }
                        s0Var3 = s0Var2;
                        s0Var3.f51174i.setValue(new o1(u0Var3, xVar));
                        i11 = 0;
                        s0Var3.f51180p = false;
                        yVar = this;
                        yVar.f51254b.invoke(u0Var3);
                        o0.w(s0Var3, yVar.f51255c, yVar.f51256d);
                    }
                    if (yVar.f51258f == 1) {
                        iP = o0.p(u0Var3.f35798b.b(i11));
                    } else {
                        iP = i11;
                    }
                    s0Var3.f51172g.setValue(new v3.f(yVar.f51257e.Q(iP)));
                    return s0Var.q0(iIntValue, iIntValue2, ry.x.Y(new qy.l(w2.c.f54475a, Integer.valueOf(Math.round(u0Var3.f35800d))), new qy.l(w2.c.f54476b, Integer.valueOf(Math.round(u0Var3.f35801e)))), new com.lingo.lingoskill.object.a(27));
                }
                s0Var2 = s0Var4;
                u0Var = u0Var5;
            } else {
                j11 = j11;
                s0Var2 = s0Var4;
                u0Var = u0Var4;
            }
            z0Var.a(layoutDirection);
            int iJ = v3.a.j(j11);
            int iH = ((z11 || i12 == 2) && v3.a.d(j11)) ? v3.a.h(j11) : Integer.MAX_VALUE;
            int i14 = (z11 || i12 != 2) ? i13 : 1;
            if (iJ != iH) {
                a9.i iVar = z0Var.f51275j;
                if (iVar == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                iH = hz.b.l(o0.p(iVar.c()), iJ, iH);
            }
            a9.i iVar2 = z0Var.f51275j;
            if (iVar2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            j3.x xVar3 = new j3.x(iVar2, com.bumptech.glide.f.q(0, iH, 0, v3.a.g(j11)), i14, z0Var.f51271f);
            long jD = v3.b.d(j11, (((long) o0.p(xVar3.f35816d)) << 32) | (((long) o0.p(xVar3.f35817e)) & 4294967295L));
            u0Var2 = u0Var;
            u0Var3 = new j3.u0(new j3.t0(z0Var.f51266a, z0Var.f51267b, z0Var.f51274i, z0Var.f51268c, z0Var.f51270e, z0Var.f51271f, z0Var.f51272g, layoutDirection, z0Var.f51273h, j11), xVar3, jD);
            long j14 = u0Var3.f35799c;
            Integer numValueOf3 = Integer.valueOf((int) (j14 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j14 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (kotlin.jvm.internal.m.a(u0Var2, u0Var3)) {
                if (o1VarD != 0) {
                    xVar = o1VarD.f51126c;
                } else {
                    xVar = null;
                }
                s0Var3 = s0Var2;
                s0Var3.f51174i.setValue(new o1(u0Var3, xVar));
                i11 = 0;
                s0Var3.f51180p = false;
                yVar = this;
                yVar.f51254b.invoke(u0Var3);
                o0.w(s0Var3, yVar.f51255c, yVar.f51256d);
            } else {
                yVar = this;
                s0Var3 = s0Var2;
                i11 = 0;
            }
            if (yVar.f51258f == 1) {
                iP = o0.p(u0Var3.f35798b.b(i11));
            } else {
                iP = i11;
            }
            s0Var3.f51172g.setValue(new v3.f(yVar.f51257e.Q(iP)));
            return s0Var.q0(iIntValue3, iIntValue4, ry.x.Y(new qy.l(w2.c.f54475a, Integer.valueOf(Math.round(u0Var3.f35800d))), new qy.l(w2.c.f54476b, Integer.valueOf(Math.round(u0Var3.f35801e)))), new com.lingo.lingoskill.object.a(27));
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        s0 s0Var = this.f51253a;
        s0Var.f51166a.a(sVar.getLayoutDirection());
        a9.i iVar = s0Var.f51166a.f51275j;
        if (iVar != null) {
            return o0.p(iVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
