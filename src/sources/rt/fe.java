package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49767b;

    public fe(int i11, boolean z11) {
        this.f49766a = i11;
        this.f49767b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return this.f49766a == feVar.f49766a && this.f49767b == feVar.f49767b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49767b) + (Integer.hashCode(this.f49766a) * 31);
    }

    public final String toString() {
        return "EffectiveDisplayMode(displayMode=" + this.f49766a + ", isVideoFallbackToAudio=" + this.f49767b + ")";
    }
}
