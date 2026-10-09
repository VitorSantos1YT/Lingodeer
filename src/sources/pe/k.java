package pe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f46826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f46827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f46828c;

    public k(Class cls, Class cls2, Class cls3) {
        this.f46826a = cls;
        this.f46827b = cls2;
        this.f46828c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f46826a.equals(kVar.f46826a) && this.f46827b.equals(kVar.f46827b) && m.b(this.f46828c, kVar.f46828c);
    }

    public final int hashCode() {
        int iHashCode = (this.f46827b.hashCode() + (this.f46826a.hashCode() * 31)) * 31;
        Class cls = this.f46828c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f46826a + ", second=" + this.f46827b + '}';
    }
}
