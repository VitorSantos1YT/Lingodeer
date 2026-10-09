package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49701g;

    public ed(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f49695a = j11;
        this.f49696b = j12;
        this.f49697c = j13;
        this.f49698d = j14;
        this.f49699e = j15;
        this.f49700f = j16;
        this.f49701g = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        return g2.x.d(this.f49695a, edVar.f49695a) && g2.x.d(this.f49696b, edVar.f49696b) && g2.x.d(this.f49697c, edVar.f49697c) && g2.x.d(this.f49698d, edVar.f49698d) && g2.x.d(this.f49699e, edVar.f49699e) && g2.x.d(this.f49700f, edVar.f49700f) && g2.x.d(this.f49701g, edVar.f49701g);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f49701g) + defpackage.e.f(this.f49700f, defpackage.e.f(this.f49699e, defpackage.e.f(this.f49698d, defpackage.e.f(this.f49697c, defpackage.e.f(this.f49696b, Long.hashCode(this.f49695a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strJ = g2.x.j(this.f49695a);
        String strJ2 = g2.x.j(this.f49696b);
        String strJ3 = g2.x.j(this.f49697c);
        String strJ4 = g2.x.j(this.f49698d);
        String strJ5 = g2.x.j(this.f49699e);
        String strJ6 = g2.x.j(this.f49700f);
        String strJ7 = g2.x.j(this.f49701g);
        StringBuilder sbS = defpackage.e.s("CourseUnitColors(topBannerGradientStart=", strJ, ", topBannerGradientEnd=", strJ2, ", tagBackgroundColor=");
        com.google.android.material.datepicker.d.w(sbS, strJ3, ", iconTintColor=", strJ4, ", tipsIconBackgroundGradientStart=");
        com.google.android.material.datepicker.d.w(sbS, strJ5, ", tipsIconBackgroundGradientEnd=", strJ6, ", tipsTitleColor=");
        return ep.a.k(sbS, strJ7, ")");
    }
}
