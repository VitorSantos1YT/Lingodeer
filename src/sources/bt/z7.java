package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6275a = i11;
        this.f6276b = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6275a) {
            case 0:
                return new z7(this.f6276b, dVar, 0);
            case 1:
                return new z7(this.f6276b, dVar, 1);
            case 2:
                return new z7(this.f6276b, dVar, 2);
            case 3:
                return new z7(this.f6276b, dVar, 3);
            default:
                return new z7(this.f6276b, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6275a) {
            case 0:
                z7 z7Var = (z7) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                z7Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                z7 z7Var2 = (z7) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                z7Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                z7 z7Var3 = (z7) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                z7Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                z7 z7Var4 = (z7) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                z7Var4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                z7 z7Var5 = (z7) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                z7Var5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6275a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f6276b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1Var.setValue(Boolean.TRUE);
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((String) b1Var.getValue()).length() > 200) {
                    b1Var.setValue(oz.q.g1(200, (String) b1Var.getValue()));
                }
                break;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                float f5 = ys.p2.f58208a;
                if (((Number) b1Var.getValue()).longValue() > 0) {
                    ((Number) b1Var.getValue()).longValue();
                }
                break;
        }
        return b0Var;
    }
}
