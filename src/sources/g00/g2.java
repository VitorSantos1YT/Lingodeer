package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f28409a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f28410b = d1.a(s1.f28462a, "kotlin.UShort");

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return new qy.z(cVar.u(f28410b).B());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28410b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.u(f28410b).k(((qy.z) obj).f48515a);
    }
}
