package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f51664b;

    public s(char c11, int i11) {
        this.f51663a = i11;
        this.f51664b = c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f51663a == sVar.f51663a && this.f51664b == sVar.f51664b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f51664b) + (Integer.hashCode(this.f51663a) * 31);
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.f51663a + ", delimiter=" + this.f51664b + ")";
    }
}
