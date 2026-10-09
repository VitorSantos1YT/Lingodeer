package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49619g;

    public d5(long j11, int i11, String unitName, int i12, int i13, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f49613a = j11;
        this.f49614b = i11;
        this.f49615c = unitName;
        this.f49616d = i12;
        this.f49617e = i13;
        this.f49618f = z11;
        this.f49619g = z12;
    }

    public static d5 a(d5 d5Var, int i11, int i12, boolean z11, boolean z12, int i13) {
        long j11 = d5Var.f49613a;
        int i14 = d5Var.f49614b;
        String unitName = d5Var.f49615c;
        if ((i13 & 8) != 0) {
            i11 = d5Var.f49616d;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            i12 = d5Var.f49617e;
        }
        int i16 = i12;
        if ((i13 & 32) != 0) {
            z11 = d5Var.f49618f;
        }
        boolean z13 = z11;
        if ((i13 & 64) != 0) {
            z12 = d5Var.f49619g;
        }
        d5Var.getClass();
        kotlin.jvm.internal.m.f(unitName, "unitName");
        return new d5(j11, i14, unitName, i15, i16, z13, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return this.f49613a == d5Var.f49613a && this.f49614b == d5Var.f49614b && kotlin.jvm.internal.m.a(this.f49615c, d5Var.f49615c) && this.f49616d == d5Var.f49616d && this.f49617e == d5Var.f49617e && this.f49618f == d5Var.f49618f && this.f49619g == d5Var.f49619g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49619g) + defpackage.e.e(defpackage.e.b(this.f49617e, defpackage.e.b(this.f49616d, defpackage.e.d(defpackage.e.b(this.f49614b, Long.hashCode(this.f49613a) * 31, 31), 31, this.f49615c), 31), 31), 31, this.f49618f);
    }

    public final String toString() {
        return "CourseListenAlongUnit(id=" + this.f49613a + ", sortIndex=" + this.f49614b + ", unitName=" + this.f49615c + ", sentenceCount=" + this.f49616d + ", wordCount=" + this.f49617e + ", canAccess=" + this.f49618f + ", selected=" + this.f49619g + ")";
    }
}
