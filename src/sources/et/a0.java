package et;

import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.w f25827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt.v f25828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(l0.w wVar, jt.v vVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25825a = i11;
        this.f25827c = wVar;
        this.f25828d = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25825a) {
            case 0:
                return new a0(this.f25827c, this.f25828d, dVar, 0);
            default:
                return new a0(this.f25827c, this.f25828d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25825a) {
            case 0:
                break;
        }
        return ((a0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f25825a;
        qy.b0 b0Var = qy.b0.f48488a;
        jt.v vVar = this.f25828d;
        l0.w wVar = this.f25827c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f25826b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                int size = vVar.f37218i.size();
                this.f25826b = 1;
                o2 o2Var = l0.w.f39201x;
                return wVar.f(size, 0, this) == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f25826b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                int iIntValue = ((Number) vVar.f37222n.getValue()).intValue();
                this.f25826b = 1;
                o2 o2Var2 = l0.w.f39201x;
                return wVar.f(iIntValue, 0, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
