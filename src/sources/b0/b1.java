package b0;

import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f3446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2 f3447f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f3448t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Object obj, Object obj2, f1 f1Var, c2 c2Var, float f5, vy.d dVar) {
        super(2, dVar);
        this.f3444c = obj;
        this.f3445d = obj2;
        this.f3446e = f1Var;
        this.f3447f = c2Var;
        this.f3448t = f5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        b1 b1Var = new b1(this.f3444c, this.f3445d, this.f3446e, this.f3447f, this.f3448t, dVar);
        b1Var.f3443b = obj;
        return b1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3442a;
        qy.b0 b0Var = qy.b0.f48488a;
        f1 f1Var = this.f3446e;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            rz.b0 b0Var2 = (rz.b0) this.f3443b;
            Object obj2 = this.f3444c;
            Object obj3 = this.f3445d;
            if (kotlin.jvm.internal.m.a(obj2, obj3)) {
                f1Var.Q = null;
                if (kotlin.jvm.internal.m.a(f1Var.f3528d.getValue(), obj2)) {
                    return b0Var;
                }
            } else {
                f1.s0(f1Var);
            }
            boolean zA = kotlin.jvm.internal.m.a(obj2, obj3);
            float f5 = this.f3448t;
            if (!zA) {
                c2 c2Var = this.f3447f;
                c2Var.p(obj2);
                c2Var.n(0L);
                f1Var.f3527c.setValue(obj2);
                c2Var.j(f5);
            }
            f1Var.B0(f5);
            if (f1Var.P.i()) {
                rz.e0.B(b0Var2, null, null, new a1(f1Var, null, 0), 3);
            } else {
                f1Var.O = Long.MIN_VALUE;
            }
            this.f3442a = 1;
            if (f1.v0(f1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(HOBXIlHxIkMBEA.NwbHhX);
            }
            com.bumptech.glide.e.F(obj);
        }
        f1Var.A0();
        return b0Var;
    }
}
