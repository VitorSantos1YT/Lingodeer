package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45869b;

    public k0(ht.o oVar, a aVar) {
        this.f45868a = oVar;
        this.f45869b = aVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45868a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.m.a(this.f45868a, k0Var.f45868a) && kotlin.jvm.internal.m.a(this.f45869b, k0Var.f45869b);
    }

    public final int hashCode() {
        return this.f45869b.hashCode() + (this.f45868a.hashCode() * 31);
    }

    public final String toString() {
        return "ChineseToneModelM4(courseTestParams=" + this.f45868a + ", data=" + this.f45869b + ")";
    }
}
