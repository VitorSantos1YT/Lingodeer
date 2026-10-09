package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35774a;

    public /* synthetic */ r0(String str) {
        this.f35774a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return kotlin.jvm.internal.m.a(this.f35774a, ((r0) obj).f35774a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35774a.hashCode();
    }

    public final String toString() {
        return nv.p.q("StringAnnotation(value=", this.f35774a, ')');
    }
}
