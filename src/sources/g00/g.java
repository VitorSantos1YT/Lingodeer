package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f28401a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28402b = new k1("kotlin.Boolean", e00.e.f24673c);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Boolean.valueOf(cVar.f());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28402b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.o(((Boolean) obj).booleanValue());
    }
}
