package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42960b;

    public j(int i11, int i12) {
        this.f42959a = i11;
        this.f42960b = i12;
        if (!(i11 >= 0)) {
            i0.a.a("negative start index");
        }
        if (i12 >= i11) {
            return;
        }
        i0.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f42959a == jVar.f42959a && this.f42960b == jVar.f42960b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42960b) + (Integer.hashCode(this.f42959a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f42959a);
        sb2.append(", end=");
        return ep.a.j(sb2, this.f42960b, ')');
    }
}
