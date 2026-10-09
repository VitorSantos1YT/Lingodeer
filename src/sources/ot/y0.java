package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f46054a;

    public y0(ht.o oVar) {
        this.f46054a = oVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f46054a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && kotlin.jvm.internal.m.a(this.f46054a, ((y0) obj).f46054a);
    }

    public final int hashCode() {
        return this.f46054a.hashCode();
    }

    public final String toString() {
        return "TestOutIntro(courseTestParams=" + this.f46054a + ")";
    }
}
