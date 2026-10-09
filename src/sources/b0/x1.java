package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3740b;

    public x1(Object obj, Object obj2) {
        this.f3739a = obj;
        this.f3740b = obj2;
    }

    @Override // b0.w1
    public final Object a() {
        return this.f3739a;
    }

    @Override // b0.w1
    public final Object c() {
        return this.f3740b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.m.a(this.f3739a, w1Var.a()) && kotlin.jvm.internal.m.a(this.f3740b, w1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f3739a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f3740b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
