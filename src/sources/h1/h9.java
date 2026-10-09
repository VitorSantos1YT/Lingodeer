package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h9 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ fz.a K;
    public final /* synthetic */ float L;
    public final /* synthetic */ t1.d M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.v f30347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30348f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h0.i f30349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(z1.r rVar, g2.w0 w0Var, long j11, float f5, d0.v vVar, boolean z11, h0.i iVar, boolean z12, fz.a aVar, float f11, t1.d dVar) {
        super(2);
        this.f30343a = rVar;
        this.f30344b = w0Var;
        this.f30345c = j11;
        this.f30346d = f5;
        this.f30347e = vVar;
        this.f30348f = z11;
        this.f30349t = iVar;
        this.H = z12;
        this.K = aVar;
        this.L = f11;
        this.M = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0091  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                l1.c3 c3Var = s4.f31053a;
                sVar = (l1.s) nVar;
                z1.r rVarA = q0.c.a(i9.d(this.f30343a.i(c5.f30080a), this.f30344b, i9.e(this.f30345c, this.f30346d, nVar), this.f30347e, ((v3.c) sVar.j(z2.g1.f58547h)).e0(this.L)), this.f30348f, this.f30349t, l7.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7), this.H, null, this.K);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarA);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                hh.p0.x(0, this.M, sVar, true);
            }
        } else {
            l1.c3 c3Var2 = s4.f31053a;
            sVar = (l1.s) nVar;
            z1.r rVarA2 = q0.c.a(i9.d(this.f30343a.i(c5.f30080a), this.f30344b, i9.e(this.f30345c, this.f30346d, nVar), this.f30347e, ((v3.c) sVar.j(z2.g1.f58547h)).e0(this.L)), this.f30348f, this.f30349t, l7.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7), this.H, null, this.K);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, true);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarA2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            hh.p0.x(0, this.M, sVar, true);
        }
        return qy.b0.f48488a;
    }
}
