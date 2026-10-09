package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38717c;

    public c(int i11, int i12, String str) {
        this.f38715a = i11;
        this.f38716b = i12;
        this.f38717c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f38715a == cVar.f38715a && this.f38716b == cVar.f38716b && this.f38717c.equals(cVar.f38717c);
    }

    public final int hashCode() {
        return this.f38717c.hashCode() + defpackage.e.b(this.f38716b, Integer.hashCode(this.f38715a) * 31, 31);
    }

    public final String toString() {
        return ep.a.k(w4.c.k("FontVariationData(standardImageRes=", this.f38715a, ", alternateImageRes=", this.f38716b, ", romaji="), this.f38717c, ")");
    }
}
