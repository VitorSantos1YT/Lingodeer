package lz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f40539d = new g(1, 0, 1);

    public final boolean b(int i11) {
        return this.f40532a <= i11 && i11 <= this.f40533b;
    }

    @Override // lz.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f40532a == gVar.f40532a && this.f40533b == gVar.f40533b;
    }

    @Override // lz.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f40532a * 31) + this.f40533b;
    }

    @Override // lz.e
    public final boolean isEmpty() {
        return this.f40532a > this.f40533b;
    }

    @Override // lz.e
    public final String toString() {
        return this.f40532a + ".." + this.f40533b;
    }
}
