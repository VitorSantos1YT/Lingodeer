package mv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42194a;

    public d(String audioKey) {
        kotlin.jvm.internal.m.f(audioKey, "audioKey");
        this.f42194a = audioKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.f42194a, ((d) obj).f42194a);
    }

    public final int hashCode() {
        return this.f42194a.hashCode();
    }

    public final String toString() {
        return ep.a.g("PlayAlphabetAudio(audioKey=", this.f42194a, ")");
    }
}
