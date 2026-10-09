package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe f50158a;

    public ne(oe oeVar) {
        this.f50158a = oeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne) && kotlin.jvm.internal.m.a(this.f50158a, ((ne) obj).f50158a);
    }

    public final int hashCode() {
        return this.f50158a.hashCode();
    }

    public final String toString() {
        return "FutureReviewEditingState(listItem=" + this.f50158a + ")";
    }
}
