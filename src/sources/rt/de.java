package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49650a;

    public de(int i11) {
        this.f49650a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de) && this.f49650a == ((de) obj).f49650a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49650a);
    }

    public final String toString() {
        return hh.p0.h(this.f49650a, "ReviewSuggestions(suggestionCount=", ")");
    }
}
