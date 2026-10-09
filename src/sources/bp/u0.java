package bp;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4829a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(float f5, b0.m mVar, kotlin.jvm.internal.v vVar, vy.d dVar) {
        super(2, dVar);
        this.f4831c = f5;
        this.f4833e = mVar;
        this.f4834f = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4829a) {
            case 0:
                return new u0((v3.c) this.f4832d, (b0.d) this.f4833e, (l1.a1) this.f4834f, dVar);
            default:
                u0 u0Var = new u0(this.f4831c, (b0.m) this.f4833e, (kotlin.jvm.internal.v) this.f4834f, dVar);
                u0Var.f4832d = obj;
                return u0Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4829a) {
            case 0:
                return ((u0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((u0) create((f0.n1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        float fE0;
        b0.d dVar;
        Float f5;
        b0.o0 o0Var;
        switch (this.f4829a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4830b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (((l1.h1) ((l1.a1) this.f4834f)).l() != 0) {
                        fE0 = ((v3.c) this.f4832d).e0(12);
                        b0.d dVar2 = (b0.d) this.f4833e;
                        Float f11 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        this.f4831c = fE0;
                        this.f4830b = 1;
                        if (dVar2.e(f11, this) == aVar) {
                            return aVar;
                        }
                        dVar = (b0.d) this.f4833e;
                        f5 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        t0 t0Var = new t0(fE0);
                        b0.n0 n0Var = new b0.n0();
                        t0Var.invoke(n0Var);
                        o0Var = new b0.o0(n0Var);
                        this.f4831c = fE0;
                        this.f4830b = 2;
                        if (b0.d.c(dVar, f5, o0Var, null, this, 12) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i11 == 1) {
                    fE0 = this.f4831c;
                    com.bumptech.glide.e.F(obj);
                    dVar = (b0.d) this.f4833e;
                    f5 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    t0 t0Var2 = new t0(fE0);
                    b0.n0 n0Var2 = new b0.n0();
                    t0Var2.invoke(n0Var2);
                    o0Var = new b0.o0(n0Var2);
                    this.f4831c = fE0;
                    this.f4830b = 2;
                    if (b0.d.c(dVar, f5, o0Var, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4830b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f0.n1 n1Var = (f0.n1) this.f4832d;
                    float f12 = this.f4831c;
                    b0.m mVar = (b0.m) this.f4833e;
                    ch.z zVar = new ch.z(24, (kotlin.jvm.internal.v) this.f4834f, n1Var);
                    this.f4830b = 1;
                    if (b0.e.e(CropImageView.DEFAULT_ASPECT_RATIO, f12, mVar, zVar, this, 4) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v3.c cVar, b0.d dVar, l1.a1 a1Var, vy.d dVar2) {
        super(2, dVar2);
        this.f4832d = cVar;
        this.f4833e = dVar;
        this.f4834f = a1Var;
    }
}
