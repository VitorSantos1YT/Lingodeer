package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28645b;

    public d(int i11, int i12) {
        this.f28644a = i11;
        this.f28645b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f28644a == dVar.f28644a && this.f28645b == dVar.f28645b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28645b) + (Integer.hashCode(this.f28644a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f28644a);
        sb2.append(", columnCount=");
        return ep.a.j(sb2, this.f28645b, ')');
    }
}
