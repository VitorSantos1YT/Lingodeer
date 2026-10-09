package g00;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements Map.Entry, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28467b;

    public t0(Object obj, Object obj2) {
        this.f28466a = obj;
        this.f28467b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.f28466a, t0Var.f28466a) && kotlin.jvm.internal.m.a(this.f28467b, t0Var.f28467b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28466a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28467b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f28466a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f28467b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f28466a + ", value=" + this.f28467b + ')';
    }
}
