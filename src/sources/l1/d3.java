package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39281a;

    public d3(Object obj) {
        this.f39281a = obj;
    }

    @Override // l1.e3
    public final Object a(q1 q1Var) {
        return this.f39281a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && kotlin.jvm.internal.m.a(this.f39281a, ((d3) obj).f39281a);
    }

    public final int hashCode() {
        Object obj = this.f39281a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f39281a + ')';
    }
}
