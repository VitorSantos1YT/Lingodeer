package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f28360a = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f28361b = d1.a(m0.f28434a, "kotlin.UInt");

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return new qy.u(cVar.u(f28361b).j());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28361b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.u(f28361b).z(((qy.u) obj).f48510a);
    }
}
