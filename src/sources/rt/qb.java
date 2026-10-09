package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class qb implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf f50300a;

    public qb(uf tipsLesson) {
        kotlin.jvm.internal.m.f(tipsLesson, "tipsLesson");
        this.f50300a = tipsLesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb) && kotlin.jvm.internal.m.a(this.f50300a, ((qb) obj).f50300a);
    }

    public final int hashCode() {
        return this.f50300a.hashCode();
    }

    public final String toString() {
        return "ClickedTipsLesson(tipsLesson=" + this.f50300a + ")";
    }
}
