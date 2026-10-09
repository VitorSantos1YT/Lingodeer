package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38770b;

    public k(String text, String str) {
        kotlin.jvm.internal.m.f(text, "text");
        this.f38769a = text;
        this.f38770b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f38769a, kVar.f38769a) && kotlin.jvm.internal.m.a(this.f38770b, kVar.f38770b);
    }

    public final int hashCode() {
        int iHashCode = this.f38769a.hashCode() * 31;
        String str = this.f38770b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ep.a.h("IntroTextStyleSegment(text=", this.f38769a, ", style=", this.f38770b, ")");
    }
}
