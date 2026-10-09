package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50117b;

    public n2(String name, int i11) {
        kotlin.jvm.internal.m.f(name, "name");
        this.f50116a = name;
        this.f50117b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return kotlin.jvm.internal.m.a(this.f50116a, n2Var.f50116a) && this.f50117b == n2Var.f50117b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50117b) + (this.f50116a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseFlashCardReviewUnitInfo(name=" + this.f50116a + ", sortIndex=" + this.f50117b + ")";
    }
}
