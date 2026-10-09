package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50006e;

    public l0(String id2, String name, int i11, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(name, "name");
        this.f50002a = id2;
        this.f50003b = name;
        this.f50004c = i11;
        this.f50005d = z11;
        this.f50006e = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.m.a(this.f50002a, l0Var.f50002a) && kotlin.jvm.internal.m.a(this.f50003b, l0Var.f50003b) && this.f50004c == l0Var.f50004c && this.f50005d == l0Var.f50005d && this.f50006e == l0Var.f50006e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50006e) + defpackage.e.e(defpackage.e.b(this.f50004c, defpackage.e.d(this.f50002a.hashCode() * 31, 31, this.f50003b), 31), 31, this.f50005d);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("CourseBookmarkFolderSummary(id=", this.f50002a, ", name=", this.f50003b, ", count=");
        sbS.append(this.f50004c);
        sbS.append(", selected=");
        sbS.append(this.f50005d);
        sbS.append(", isDefault=");
        return hh.p0.p(sbS, this.f50006e, ")");
    }
}
