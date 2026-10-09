package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59545a;

    public r1(boolean z11) {
        this.f59545a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.f59545a == ((r1) obj).f59545a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59545a);
    }

    public final String toString() {
        return ep.a.i("UpdateNativeSpeakerVideos(enableNativeSpeakerVideos=", ")", this.f59545a);
    }
}
