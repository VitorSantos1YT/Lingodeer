package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f28468a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28469b = new k1("kotlin.String", e00.e.f24681k);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return cVar.l();
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28469b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.m.f(value, "value");
        dVar.F(value);
    }
}
