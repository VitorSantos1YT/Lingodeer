package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f50221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50223d;

    public oe(String id2, c1 c1Var, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        this.f50220a = id2;
        this.f50221b = c1Var;
        this.f50222c = i11;
        this.f50223d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return kotlin.jvm.internal.m.a(this.f50220a, oeVar.f50220a) && kotlin.jvm.internal.m.a(this.f50221b, oeVar.f50221b) && this.f50222c == oeVar.f50222c && this.f50223d == oeVar.f50223d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50223d) + defpackage.e.b(this.f50222c, (this.f50221b.hashCode() + (this.f50220a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "FutureReviewListItemUi(id=" + this.f50220a + ", item=" + this.f50221b + ", days=" + this.f50222c + ", isNew=" + this.f50223d + ")";
    }
}
