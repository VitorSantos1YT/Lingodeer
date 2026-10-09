package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3741a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f3743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f3745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(f1 f1Var, Object obj, c2 c2Var, vy.d dVar) {
        super(1, dVar);
        this.f3743c = f1Var;
        this.f3744d = obj;
        this.f3745e = c2Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f3741a) {
            case 0:
                return new y0(this.f3745e, this.f3743c, this.f3744d, dVar);
            default:
                return new y0(this.f3743c, this.f3744d, this.f3745e, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f3741a) {
            case 0:
                break;
        }
        return ((y0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        float f5;
        switch (this.f3741a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f3742b;
                c2 c2Var = this.f3745e;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    x0 x0Var = new x0(this.f3743c, this.f3744d, c2Var, (vy.d) null, 0);
                    this.f3742b = 1;
                    if (rz.e0.l(x0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                c2Var.i();
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f3742b;
                c2 c2Var2 = this.f3745e;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f1 f1Var = this.f3743c;
                    f1Var.x0();
                    l1.k1 k1Var = f1Var.f3527c;
                    f1Var.O = Long.MIN_VALUE;
                    f1Var.B0(CropImageView.DEFAULT_ASPECT_RATIO);
                    Object value = f1Var.f3528d.getValue();
                    Object obj2 = this.f3744d;
                    if (obj2.equals(value)) {
                        f5 = -4.0f;
                    } else {
                        f5 = obj2.equals(k1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    c2Var2.p(obj2);
                    c2Var2.n(0L);
                    k1Var.setValue(obj2);
                    f1Var.B0(CropImageView.DEFAULT_ASPECT_RATIO);
                    f1Var.o0(obj2);
                    c2Var2.j(f5);
                    if (f5 == -3.0f) {
                        this.f3742b = 1;
                        if (f1.v0(f1Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                c2Var2.i();
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c2 c2Var, f1 f1Var, Object obj, vy.d dVar) {
        super(1, dVar);
        this.f3745e = c2Var;
        this.f3743c = f1Var;
        this.f3744d = obj;
    }
}
