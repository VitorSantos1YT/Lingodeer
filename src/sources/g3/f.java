package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.n f28647b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, fz.a aVar) {
        this.f28646a = str;
        this.f28647b = (kotlin.jvm.internal.n) aVar;
    }

    public final String a() {
        return this.f28646a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f28646a, fVar.f28646a) && this.f28647b == fVar.f28647b;
    }

    public final int hashCode() {
        return this.f28647b.hashCode() + (this.f28646a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f28646a + ", action=" + this.f28647b + ')';
    }
}
