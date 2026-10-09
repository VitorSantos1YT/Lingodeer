package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f28377a = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f28378b = d1.a(r0.f28455a, "kotlin.ULong");

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        return new qy.w(cVar.u(f28378b).o());
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28378b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        dVar.u(f28378b).C(((qy.w) obj).f48512a);
    }
}
