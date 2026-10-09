package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f30774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(r1 r1Var, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30772a = i11;
        this.f30774c = r1Var;
        this.f30775d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30772a) {
            case 0:
                return new o1(this.f30774c, this.f30775d, dVar, 0);
            default:
                return new o1(this.f30774c, this.f30775d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30772a) {
            case 0:
                break;
        }
        return ((o1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f30772a;
        qy.b0 b0Var = qy.b0.f48488a;
        r1 r1Var = this.f30774c;
        long j11 = this.f30775d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f30773b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                r1Var.V = f2.b.e(j11) + r1Var.V;
                float f5 = f2.b.f(j11) + r1Var.W;
                r1Var.W = f5;
                n nVar = r1Var.S;
                long j12 = r1Var.X;
                float f11 = f5 - ((int) (4294967295L & j12));
                float f12 = r1Var.V - ((int) (j12 >> 32));
                float f13 = wb.f31261a;
                float fAtan2 = ((float) Math.atan2(f11, f12)) - 1.5707964f;
                if (fAtan2 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    fAtan2 += 6.2831855f;
                }
                this.f30773b = 1;
                d0.o1 o1Var = nVar.f30710e;
                d0.l1 l1Var = d0.l1.UserInput;
                m mVar = new m(nVar, fAtan2, false, null);
                o1Var.getClass();
                Object objL = rz.e0.l(new av.e(l1Var, o1Var, mVar, (vy.d) null), this);
                if (objL != aVar) {
                    objL = b0Var;
                }
                return objL == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f30773b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                n nVar2 = r1Var.S;
                float fE = f2.b.e(j11);
                float f14 = f2.b.f(j11);
                float fE0 = y2.f.x(r1Var).f56881b0.e0(wb.f31266f);
                boolean z11 = r1Var.T;
                long j13 = r1Var.X;
                this.f30773b = 1;
                return wb.p(nVar2, fE, f14, fE0, z11, j13, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
