package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xy.i f53262f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(fz.e eVar, vy.i iVar, int i11, tz.a aVar) {
        super(eVar, iVar, i11, aVar);
        this.f53262f = (xy.i) eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uz.e, vz.d
    public final Object f(tz.t tVar, vy.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f53259d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f53259d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (xy.c) dVar);
            }
        } else {
            bVar = new b(this, (xy.c) dVar);
        }
        Object obj = bVar.f53257b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f53259d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            bVar.f53256a = tVar;
            bVar.f53259d = 1;
            if (super.f(tVar, bVar) == obj2) {
                return obj2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = bVar.f53256a;
            com.bumptech.glide.e.F(obj);
        }
        if (((tz.s) tVar).f52713d.x()) {
            return qy.b0.f48488a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.e, xy.i] */
    @Override // uz.e, vz.d
    public final vz.d g(vy.i iVar, int i11, tz.a aVar) {
        return new c(this.f53262f, iVar, i11, aVar);
    }
}
