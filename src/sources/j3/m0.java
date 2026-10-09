package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements w1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f35721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f35722b;

    public m0(fz.e eVar, fz.c cVar) {
        this.f35721a = eVar;
        this.f35722b = cVar;
    }

    @Override // w1.i
    public final Object a(Object obj) {
        return this.f35722b.invoke(obj);
    }

    @Override // w1.i
    public final Object m(w1.k kVar, Object obj) {
        return this.f35721a.invoke(kVar, obj);
    }
}
