package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uz.i f43613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xy.i f43614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(uz.i iVar, fz.f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43610a = i11;
        switch (i11) {
            case 1:
                this.f43613d = iVar;
                this.f43614e = (xy.i) fVar;
                super(2, dVar);
                break;
            default:
                this.f43613d = iVar;
                this.f43614e = (xy.i) fVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fz.f, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43610a) {
            case 0:
                k kVar = new k(this.f43613d, this.f43614e, dVar, 0);
                kVar.f43612c = obj;
                return kVar;
            default:
                k kVar2 = new k(this.f43613d, this.f43614e, dVar, 1);
                kVar2.f43612c = obj;
                return kVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43610a) {
            case 0:
                return ((k) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((k) create((y1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r4v0, types: [fz.f, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43610a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43611b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar = (uz.j) this.f43612c;
                    kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                    yVar.f38361a = m.f43639a;
                    a0.d0 d0Var = new a0.d0(yVar, (fz.f) this.f43614e, jVar);
                    this.f43611b = 1;
                    if (this.f43613d.collect(d0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43611b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    kr.w wVar = new kr.w((fz.f) this.f43614e, new b1.b((y1) this.f43612c), (vy.d) null);
                    this.f43611b = 1;
                    if (uz.x0.i(this.f43613d, wVar, this) == aVar2) {
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
}
