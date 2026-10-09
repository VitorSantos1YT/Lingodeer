package qy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f48492b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48493a = 131584;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g other = (g) obj;
        kotlin.jvm.internal.m.f(other, "other");
        return this.f48493a - other.f48493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f48493a == gVar.f48493a;
    }

    public final int hashCode() {
        return this.f48493a;
    }

    public final String toString() {
        return "2.2.0";
    }
}
