package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f3650b;

    public q2(s sVar, z zVar) {
        this.f3649a = sVar;
        this.f3650b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return kotlin.jvm.internal.m.a(this.f3649a, q2Var.f3649a) && kotlin.jvm.internal.m.a(this.f3650b, q2Var.f3650b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f3650b.hashCode() + (this.f3649a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f3649a + ", easing=" + this.f3650b + ", arcMode=ArcMode(value=0))";
    }
}
