package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f50045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50047f;

    public m0(String id2, String value, String str, long j11, int i11, long j12) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(value, "value");
        this.f50042a = id2;
        this.f50043b = value;
        this.f50044c = str;
        this.f50045d = j11;
        this.f50046e = i11;
        this.f50047f = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(this.f50042a, m0Var.f50042a) && kotlin.jvm.internal.m.a(this.f50043b, m0Var.f50043b) && kotlin.jvm.internal.m.a(this.f50044c, m0Var.f50044c) && this.f50045d == m0Var.f50045d && this.f50046e == m0Var.f50046e && this.f50047f == m0Var.f50047f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50047f) + defpackage.e.b(this.f50046e, defpackage.e.f(this.f50045d, defpackage.e.d(defpackage.e.d(this.f50042a.hashCode() * 31, 31, this.f50043b), 31, this.f50044c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("CourseFlashCardBookmarkTarget(id=", this.f50042a, ", value=", this.f50043b, ", noteTypeCode=");
        sbS.append(this.f50044c);
        sbS.append(", elemId=");
        sbS.append(this.f50045d);
        sbS.append(", elemType=");
        sbS.append(this.f50046e);
        sbS.append(", unitId=");
        return defpackage.e.i(this.f50047f, ")", sbS);
    }
}
