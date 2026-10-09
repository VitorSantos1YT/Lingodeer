package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f39328a;

    public k0(k1 k1Var) {
        this.f39328a = k1Var;
    }

    @Override // l1.e3
    public final Object a(q1 q1Var) {
        return this.f39328a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f39328a.equals(((k0) obj).f39328a);
    }

    public final int hashCode() {
        return this.f39328a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f39328a + ')';
    }
}
