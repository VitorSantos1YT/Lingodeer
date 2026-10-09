package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37083a;

    public n2(String text) {
        kotlin.jvm.internal.m.f(text, "text");
        this.f37083a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && kotlin.jvm.internal.m.a(this.f37083a, ((n2) obj).f37083a);
    }

    public final int hashCode() {
        return this.f37083a.hashCode();
    }

    public final String toString() {
        return ep.a.g("SentenceSpellToken(text=", this.f37083a, ")");
    }
}
