package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f39284a;

    public e0(fz.c cVar) {
        this.f39284a = cVar;
    }

    @Override // l1.e3
    public final Object a(q1 q1Var) {
        return this.f39284a.invoke(q1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && kotlin.jvm.internal.m.a(this.f39284a, ((e0) obj).f39284a);
    }

    public final int hashCode() {
        return this.f39284a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f39284a + ')';
    }
}
