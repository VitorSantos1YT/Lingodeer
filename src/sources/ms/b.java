package ms;

import com.google.android.material.datepicker.d;
import defpackage.e;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f41220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f41221h;

    public b(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f41214a = j11;
        this.f41215b = j12;
        this.f41216c = j13;
        this.f41217d = j14;
        this.f41218e = j15;
        this.f41219f = j16;
        this.f41220g = j17;
        this.f41221h = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.d(this.f41214a, bVar.f41214a) && x.d(this.f41215b, bVar.f41215b) && x.d(this.f41216c, bVar.f41216c) && x.d(this.f41217d, bVar.f41217d) && x.d(this.f41218e, bVar.f41218e) && x.d(this.f41219f, bVar.f41219f) && x.d(this.f41220g, bVar.f41220g) && x.d(this.f41221h, bVar.f41221h);
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Long.hashCode(this.f41221h) + e.f(this.f41220g, e.f(this.f41219f, e.f(this.f41218e, e.f(this.f41217d, e.f(this.f41216c, e.f(this.f41215b, Long.hashCode(this.f41214a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strJ = x.j(this.f41214a);
        String strJ2 = x.j(this.f41215b);
        String strJ3 = x.j(this.f41216c);
        String strJ4 = x.j(this.f41217d);
        String strJ5 = x.j(this.f41218e);
        String strJ6 = x.j(this.f41219f);
        String strJ7 = x.j(this.f41220g);
        String strJ8 = x.j(this.f41221h);
        StringBuilder sbS = e.s("TableColors(primaryColor=", strJ, ", accentColor=", strJ2, ", selectedBgColor=");
        d.w(sbS, strJ3, ", whiteColor=", strJ4, ", borderColor=");
        d.w(sbS, strJ5, ", emptyBgColor=", strJ6, ", headerBgColor=");
        return e.p(sbS, strJ7, ", headerTextColor=", strJ8, ")");
    }
}
