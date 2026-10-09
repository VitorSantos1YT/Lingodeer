package x7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f55958c = new z(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55960b;

    public z(long j11, long j12) {
        this.f55959a = j11;
        this.f55960b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f55959a == zVar.f55959a && this.f55960b == zVar.f55960b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f55959a) * 31) + ((int) this.f55960b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f55959a);
        sb2.append(", position=");
        return defpackage.e.i(this.f55960b, "]", sb2);
    }
}
