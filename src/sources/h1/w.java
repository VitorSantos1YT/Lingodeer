package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ fz.e H;
    public final /* synthetic */ t1.d K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.n2 f31210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f31211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a9.i f31212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac f31213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f31214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f31215f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f31216t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j0.n2 n2Var, float f5, a9.i iVar, ac acVar, fz.e eVar, j3.y0 y0Var, boolean z11, fz.e eVar2, t1.d dVar) {
        super(2);
        this.f31210a = n2Var;
        this.f31211b = f5;
        this.f31212c = iVar;
        this.f31213d = acVar;
        this.f31214e = eVar;
        this.f31215f = y0Var;
        this.f31216t = z11;
        this.H = eVar2;
        this.K = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        a9.i iVar;
        boolean zF;
        Object objQ;
        j0.e eVar;
        j0.f fVar;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                z1.r rVarI = j0.e2.i(d2.h.c(z1.a.a(z1.o.f58481a, new j0.p2(this.f31210a, 1))), CropImageView.DEFAULT_ASPECT_RATIO, this.f31211b, 1);
                sVar = (l1.s) nVar;
                iVar = this.f31212c;
                zF = sVar.f(iVar);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new v(iVar);
                    sVar.o0(objQ);
                }
                v vVar = (v) objQ;
                ac acVar = this.f31213d;
                long j11 = acVar.f30009c;
                long j12 = acVar.f30010d;
                long j13 = acVar.f30011e;
                eVar = j0.i.f35307e;
                if (this.f31216t) {
                    fVar = eVar;
                } else {
                    fVar = j0.i.f35303a;
                }
                e0.d(rVarI, vVar, j11, j12, j13, this.f31214e, this.f31215f, eVar, fVar, this.H, this.K, sVar, 113246208, 3126);
            }
        } else {
            z1.r rVarI2 = j0.e2.i(d2.h.c(z1.a.a(z1.o.f58481a, new j0.p2(this.f31210a, 1))), CropImageView.DEFAULT_ASPECT_RATIO, this.f31211b, 1);
            sVar = (l1.s) nVar;
            iVar = this.f31212c;
            zF = sVar.f(iVar);
            objQ = sVar.Q();
            if (zF) {
                objQ = new v(iVar);
                sVar.o0(objQ);
            } else {
                objQ = new v(iVar);
                sVar.o0(objQ);
            }
            v vVar2 = (v) objQ;
            ac acVar2 = this.f31213d;
            long j14 = acVar2.f30009c;
            long j15 = acVar2.f30010d;
            long j16 = acVar2.f30011e;
            eVar = j0.i.f35307e;
            if (this.f31216t) {
                fVar = eVar;
            } else {
                fVar = j0.i.f35303a;
            }
            e0.d(rVarI2, vVar2, j14, j15, j16, this.f31214e, this.f31215f, eVar, fVar, this.H, this.K, sVar, 113246208, 3126);
        }
        return qy.b0.f48488a;
    }
}
