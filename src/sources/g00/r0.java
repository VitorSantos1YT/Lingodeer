package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f28455a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28456b = new k1("kotlin.Long", e00.e.f24679i);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return Long.valueOf(cVar.o());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28456b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.C(((Number) obj).longValue());
    }
}
