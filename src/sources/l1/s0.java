package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39460b;

    public s0(Integer num, Object obj) {
        this.f39459a = num;
        this.f39460b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f39459a.equals(s0Var.f39459a) && kotlin.jvm.internal.m.a(this.f39460b, s0Var.f39460b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f39459a.hashCode() * 31;
        Object obj = this.f39460b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f39459a + ", right=" + this.f39460b + ')';
    }
}
