package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f28503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f28504b;

    public z0(c00.a serializer) {
        kotlin.jvm.internal.m.f(serializer, "serializer");
        this.f28503a = serializer;
        this.f28504b = new n1(serializer.getDescriptor());
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        if (cVar.r()) {
            return cVar.x(this.f28503a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && kotlin.jvm.internal.m.a(this.f28503a, ((z0) obj).f28503a);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f28504b;
    }

    public final int hashCode() {
        return this.f28503a.hashCode();
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        if (obj != null) {
            dVar.y(this.f28503a, obj);
        } else {
            dVar.e();
        }
    }
}
