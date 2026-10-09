package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f28434a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28435b = new k1("kotlin.Int", e00.e.f24678h);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Integer.valueOf(cVar.j());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28435b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.z(((Number) obj).intValue());
    }
}
