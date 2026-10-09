package wg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55128a;

    public e(float f5) {
        this.f55128a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f55128a, ((e) obj).f55128a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f55128a);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("Loading(progress="), this.f55128a, ')');
    }
}
