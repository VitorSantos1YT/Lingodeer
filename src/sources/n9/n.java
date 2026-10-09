package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f43647b;

    public n(int i11, i2 hint) {
        kotlin.jvm.internal.m.f(hint, "hint");
        this.f43646a = i11;
        this.f43647b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f43646a == nVar.f43646a && kotlin.jvm.internal.m.a(this.f43647b, nVar.f43647b);
    }

    public final int hashCode() {
        return this.f43647b.hashCode() + (Integer.hashCode(this.f43646a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f43646a + ", hint=" + this.f43647b + ')';
    }
}
