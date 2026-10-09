package wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.b f54906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.e f54907b;

    public d(k2.b bVar, gc.e eVar) {
        this.f54906a = bVar;
        this.f54907b = eVar;
    }

    @Override // wb.g
    public final k2.b a() {
        return this.f54906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f54906a, dVar.f54906a) && kotlin.jvm.internal.m.a(this.f54907b, dVar.f54907b);
    }

    public final int hashCode() {
        k2.b bVar = this.f54906a;
        return this.f54907b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f54906a + ", result=" + this.f54907b + ')';
    }
}
