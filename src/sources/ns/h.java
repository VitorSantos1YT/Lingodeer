package ns;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f43975c = new h(q.WRONG, s.NONE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f43976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f43977b;

    public h(q judgment, s retryReason) {
        kotlin.jvm.internal.m.f(judgment, "judgment");
        kotlin.jvm.internal.m.f(retryReason, "retryReason");
        this.f43976a = judgment;
        this.f43977b = retryReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f43976a == hVar.f43976a && this.f43977b == hVar.f43977b;
    }

    public final int hashCode() {
        return this.f43977b.hashCode() + (this.f43976a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseAnswerJudgeResult(judgment=" + this.f43976a + ", retryReason=" + this.f43977b + ")";
    }
}
