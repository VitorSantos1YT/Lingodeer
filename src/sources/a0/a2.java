package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.c0 f16b;

    public a2(b0.c0 c0Var, fz.c cVar) {
        this.f15a = cVar;
        this.f16b = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return kotlin.jvm.internal.m.a(this.f15a, a2Var.f15a) && kotlin.jvm.internal.m.a(this.f16b, a2Var.f16b);
    }

    public final int hashCode() {
        return this.f16b.hashCode() + (this.f15a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f15a + ", animationSpec=" + this.f16b + ')';
    }
}
