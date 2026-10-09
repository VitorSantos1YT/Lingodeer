package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f28462a = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28463b = new k1("kotlin.Short", e00.e.f24680j);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Short.valueOf(cVar.B());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28463b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.k(((Number) obj).shortValue());
    }
}
