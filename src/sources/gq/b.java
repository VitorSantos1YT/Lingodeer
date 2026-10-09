package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f29570a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29570a) {
            case 0:
                b bVar = new b(3, 0, (vy.d) obj3);
                bVar.f29572c = (uz.j) obj;
                return bVar.invokeSuspend(qy.b0.f48488a);
            case 1:
                return new b((n5.v) this.f29572c, (vy.d) obj3).invokeSuspend(qy.b0.f48488a);
            default:
                ((Boolean) obj2).getClass();
                b bVar2 = new b(3, 2, (vy.d) obj3);
                bVar2.f29572c = (n5.x) obj;
                return bVar2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29570a) {
            case 0:
                uz.j jVar = (uz.j) this.f29572c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29571b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Boolean bool = Boolean.FALSE;
                    this.f29572c = null;
                    this.f29571b = 1;
                    if (jVar.emit(bool, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29571b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n5.v vVar = (n5.v) this.f29572c;
                    this.f29571b = 1;
                    if (n5.v.b(vVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29571b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                n5.x xVar = (n5.x) this.f29572c;
                this.f29571b = 1;
                xVar.getClass();
                Object objA = n5.x.a(xVar, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n5.v vVar, vy.d dVar) {
        super(3, dVar);
        this.f29570a = 1;
        this.f29572c = vVar;
    }
}
