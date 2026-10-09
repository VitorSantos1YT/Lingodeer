package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f38812a;

    public r(f0 f0Var) {
        this.f38812a = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.m.a(this.f38812a, ((r) obj).f38812a);
    }

    public final int hashCode() {
        return this.f38812a.hashCode();
    }

    public final String toString() {
        return "Example(example=" + this.f38812a + ")";
    }
}
