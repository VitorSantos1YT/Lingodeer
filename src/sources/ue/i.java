package ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f52927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f52928b;

    public i(t tVar, r field) {
        kotlin.jvm.internal.m.f(field, "field");
        this.f52927a = tVar;
        this.f52928b = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f52927a == iVar.f52927a && this.f52928b == iVar.f52928b;
    }

    public final int hashCode() {
        t tVar = this.f52927a;
        return this.f52928b.hashCode() + ((tVar == null ? 0 : tVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f52927a + ", field=" + this.f52928b + ')';
    }
}
