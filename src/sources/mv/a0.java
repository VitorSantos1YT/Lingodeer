package mv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv.h0 f42190a;

    public a0(kv.h0 h0Var) {
        this.f42190a = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(this.f42190a, ((a0) obj).f42190a);
    }

    public final int hashCode() {
        return this.f42190a.hashCode();
    }

    public final String toString() {
        return "OnLessonClick(lesson=" + this.f42190a + ")";
    }
}
