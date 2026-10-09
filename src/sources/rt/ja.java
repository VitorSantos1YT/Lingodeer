package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49933g;

    public ja(String id2, String str, String str2, long j11, int i11, long j12, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        this.f49927a = id2;
        this.f49928b = str;
        this.f49929c = str2;
        this.f49930d = j11;
        this.f49931e = i11;
        this.f49932f = j12;
        this.f49933g = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return kotlin.jvm.internal.m.a(this.f49927a, jaVar.f49927a) && kotlin.jvm.internal.m.a(this.f49928b, jaVar.f49928b) && kotlin.jvm.internal.m.a(this.f49929c, jaVar.f49929c) && this.f49930d == jaVar.f49930d && this.f49931e == jaVar.f49931e && this.f49932f == jaVar.f49932f && this.f49933g == jaVar.f49933g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49933g) + defpackage.e.f(this.f49932f, defpackage.e.b(this.f49931e, defpackage.e.f(this.f49930d, defpackage.e.d(defpackage.e.d(this.f49927a.hashCode() * 31, 31, this.f49928b), 31, this.f49929c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("CourseTestBookmarkTarget(id=", this.f49927a, ", value=", this.f49928b, ", noteTypeCode=");
        sbS.append(this.f49929c);
        sbS.append(", elemId=");
        sbS.append(this.f49930d);
        sbS.append(", elemType=");
        sbS.append(this.f49931e);
        sbS.append(", unitId=");
        sbS.append(this.f49932f);
        sbS.append(", canUseLearningTools=");
        sbS.append(this.f49933g);
        sbS.append(")");
        return sbS.toString();
    }
}
