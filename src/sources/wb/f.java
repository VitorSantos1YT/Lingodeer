package wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.b f54909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.o f54910b;

    public f(k2.b bVar, gc.o oVar) {
        this.f54909a = bVar;
        this.f54910b = oVar;
    }

    @Override // wb.g
    public final k2.b a() {
        return this.f54909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f54909a, fVar.f54909a) && kotlin.jvm.internal.m.a(this.f54910b, fVar.f54910b);
    }

    public final int hashCode() {
        return this.f54910b.hashCode() + (this.f54909a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f54909a + ", result=" + this.f54910b + ')';
    }
}
