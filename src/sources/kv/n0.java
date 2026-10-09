package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38786b;

    public n0(String character, String romanization) {
        kotlin.jvm.internal.m.f(character, "character");
        kotlin.jvm.internal.m.f(romanization, "romanization");
        this.f38785a = character;
        this.f38786b = romanization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.m.a(this.f38785a, n0Var.f38785a) && kotlin.jvm.internal.m.a(this.f38786b, n0Var.f38786b);
    }

    public final int hashCode() {
        return this.f38786b.hashCode() + (this.f38785a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("JPSyllableOption(character=", this.f38785a, ", romanization=", this.f38786b, ")");
    }
}
