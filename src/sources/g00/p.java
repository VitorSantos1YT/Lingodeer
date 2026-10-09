package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f28446a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28447b = new k1("kotlin.Char", e00.e.f24675e);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Character.valueOf(cVar.g());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28447b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.r(((Character) obj).charValue());
    }
}
