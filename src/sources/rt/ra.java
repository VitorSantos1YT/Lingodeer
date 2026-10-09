package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ra implements ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50346a;

    public ra(float f5) {
        this.f50346a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra) && Float.compare(this.f50346a, ((ra) obj).f50346a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50346a);
    }

    public final String toString() {
        return "Loading(progress=" + this.f50346a + ")";
    }
}
