package wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.b f54908a;

    public e(k2.b bVar) {
        this.f54908a = bVar;
    }

    @Override // wb.g
    public final k2.b a() {
        return this.f54908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.f54908a, ((e) obj).f54908a);
    }

    public final int hashCode() {
        k2.b bVar = this.f54908a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f54908a + ')';
    }
}
