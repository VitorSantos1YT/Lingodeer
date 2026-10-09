package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f28372a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28373b = new k1("kotlin.Float", e00.e.f24677g);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Float.valueOf(cVar.C());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28373b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.p(((Number) obj).floatValue());
    }
}
