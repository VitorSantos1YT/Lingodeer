package z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f58473a;

    public i(float f5) {
        this.f58473a = f5;
    }

    public final int a(int i11, int i12) {
        return Math.round((1 + this.f58473a) * ((i12 - i11) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f58473a, ((i) obj).f58473a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58473a);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("Vertical(bias="), this.f58473a, ')');
    }
}
