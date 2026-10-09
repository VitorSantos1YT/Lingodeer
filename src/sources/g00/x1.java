package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f28492a = new x1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f28493b = d1.a(j.f28421a, "kotlin.UByte");

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return new qy.s(cVar.u(f28493b).A());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28493b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.u(f28493b).m(((qy.s) obj).f48508a);
    }
}
