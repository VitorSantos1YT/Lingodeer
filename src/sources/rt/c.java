package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f49551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f49550a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.f49550a) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                c cVar = new c(3, 0, (vy.d) obj3);
                cVar.f49551b = zBooleanValue;
                return cVar.invokeSuspend(qy.b0.f48488a);
            case 1:
                bool.getClass();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                c cVar2 = new c(3, 1, (vy.d) obj3);
                cVar2.f49551b = zBooleanValue2;
                return cVar2.invokeSuspend(qy.b0.f48488a);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                c cVar3 = new c(3, 2, (vy.d) obj3);
                cVar3.f49551b = zBooleanValue3;
                return cVar3.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49550a) {
            case 0:
                boolean z11 = this.f49551b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(z11);
            case 1:
                boolean z12 = this.f49551b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(z12);
            default:
                boolean z13 = this.f49551b;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(z13);
        }
    }
}
