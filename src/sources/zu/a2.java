package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59380a;

    public a2(int i11) {
        this.f59380a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && this.f59380a == ((a2) obj).f59380a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59380a);
    }

    public final String toString() {
        return hh.p0.h(this.f59380a, "UpdateVoicePack(voicePack=", ")");
    }
}
