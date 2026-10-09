package ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f52929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f52930b;

    public j(t section, u uVar) {
        kotlin.jvm.internal.m.f(section, "section");
        this.f52929a = section;
        this.f52930b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f52929a == jVar.f52929a && this.f52930b == jVar.f52930b;
    }

    public final int hashCode() {
        int iHashCode = this.f52929a.hashCode() * 31;
        u uVar = this.f52930b;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f52929a + ", field=" + this.f52930b + ')';
    }
}
