package mv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42204a;

    public f(String audioKey) {
        kotlin.jvm.internal.m.f(audioKey, "audioKey");
        this.f42204a = audioKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f42204a, ((f) obj).f42204a);
    }

    public final int hashCode() {
        return this.f42204a.hashCode();
    }

    public final String toString() {
        return ep.a.g("PlayingAudio(audioKey=", this.f42204a, ")");
    }
}
