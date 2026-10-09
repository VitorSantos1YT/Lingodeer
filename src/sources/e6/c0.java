package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.l f24882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6.l f24883b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c0(c6.l lVar, int i11) {
        int i12 = i11 & 2;
        c6.j jVar = c6.j.f6631a;
        this(jVar, i12 != 0 ? jVar : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f24882a, c0Var.f24882a) && kotlin.jvm.internal.m.a(this.f24883b, c0Var.f24883b);
    }

    public final int hashCode() {
        return this.f24883b.hashCode() + (this.f24882a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f24882a + ", nonSizeModifiers=" + this.f24883b + ')';
    }

    public c0(c6.l lVar, c6.l lVar2) {
        this.f24882a = lVar;
        this.f24883b = lVar2;
    }
}
