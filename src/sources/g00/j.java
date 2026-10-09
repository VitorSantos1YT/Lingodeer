package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f28421a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28422b = new k1("kotlin.Byte", e00.e.f24674d);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Byte.valueOf(cVar.A());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28422b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.m(((Number) obj).byteValue());
    }
}
