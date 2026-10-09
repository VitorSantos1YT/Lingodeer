package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f38462a;

    public g(j showType) {
        kotlin.jvm.internal.m.f(showType, "showType");
        this.f38462a = showType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f38462a == ((g) obj).f38462a;
    }

    public final int hashCode() {
        return this.f38462a.hashCode();
    }

    public final String toString() {
        return "UpdateShowType(showType=" + this.f38462a + ")";
    }
}
