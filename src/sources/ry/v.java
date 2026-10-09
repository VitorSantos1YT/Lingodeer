package ry;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50858b;

    public v(int i11, Object obj) {
        this.f50857a = i11;
        this.f50858b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f50857a == vVar.f50857a && kotlin.jvm.internal.m.a(this.f50858b, vVar.f50858b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f50857a) * 31;
        Object obj = this.f50858b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f50857a + ", value=" + this.f50858b + ')';
    }
}
