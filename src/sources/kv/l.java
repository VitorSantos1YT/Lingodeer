package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f38776a;

    public l(e0 example) {
        kotlin.jvm.internal.m.f(example, "example");
        this.f38776a = example;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.f38776a, ((l) obj).f38776a);
    }

    public final int hashCode() {
        return this.f38776a.hashCode();
    }

    public final String toString() {
        return "Example(example=" + this.f38776a + ")";
    }
}
