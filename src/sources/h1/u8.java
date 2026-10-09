package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v8 f31158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz.m f31159b;

    public u8(v8 v8Var, rz.m mVar) {
        this.f31158a = v8Var;
        this.f31159b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return kotlin.jvm.internal.m.a(this.f31158a, u8Var.f31158a) && this.f31159b.equals(u8Var.f31159b);
    }

    public final int hashCode() {
        return this.f31159b.hashCode() + (this.f31158a.hashCode() * 31);
    }
}
