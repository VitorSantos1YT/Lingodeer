package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 implements c00.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f28414b = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f28415a = new a1();

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        this.f28415a.deserialize(cVar);
        return qy.b0.f48488a;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f28415a.getDescriptor();
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        qy.b0 value = (qy.b0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        this.f28415a.serialize(dVar, value);
    }
}
