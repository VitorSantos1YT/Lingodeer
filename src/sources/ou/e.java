package ou;

import g2.f0;
import g2.x;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f46084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f46087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f46088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f46089k;

    public e(long j11, long j12, long j13, long j14, long j15, float f5, boolean z11, boolean z12, boolean z13, int i11, boolean z14) {
        this.f46079a = j11;
        this.f46080b = j12;
        this.f46081c = j13;
        this.f46082d = j14;
        this.f46083e = j15;
        this.f46084f = f5;
        this.f46085g = z11;
        this.f46086h = z12;
        this.f46087i = z13;
        this.f46088j = i11;
        this.f46089k = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.d(this.f46079a, eVar.f46079a) && x.d(this.f46080b, eVar.f46080b) && x.d(this.f46081c, eVar.f46081c) && x.d(this.f46082d, eVar.f46082d) && x.d(this.f46083e, eVar.f46083e) && Float.compare(this.f46084f, eVar.f46084f) == 0 && this.f46085g == eVar.f46085g && this.f46086h == eVar.f46086h && this.f46087i == eVar.f46087i && this.f46088j == eVar.f46088j && this.f46089k == eVar.f46089k;
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Boolean.hashCode(this.f46089k) + defpackage.e.b(this.f46088j, defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.a(defpackage.e.f(this.f46083e, defpackage.e.f(this.f46082d, defpackage.e.f(this.f46081c, defpackage.e.f(this.f46080b, Long.hashCode(this.f46079a) * 31, 31), 31), 31), 31), this.f46084f, 31), 31, this.f46085g), 31, this.f46086h), 31, this.f46087i), 31);
    }

    public final String toString() {
        String strJ = x.j(this.f46079a);
        String strJ2 = x.j(this.f46080b);
        String strJ3 = x.j(this.f46081c);
        String strJ4 = x.j(this.f46082d);
        String strJ5 = x.j(this.f46083e);
        StringBuilder sbS = defpackage.e.s("HanziWriterConfig(writerColor=", strJ, ", animColor=", strJ2, ", mistakeAnimColor=");
        com.google.android.material.datepicker.d.w(sbS, strJ3, ", backgroundColor=", strJ4, ", medianColor=");
        sbS.append(strJ5);
        sbS.append(", userPaintStrokeWidth=");
        sbS.append(this.f46084f);
        sbS.append(", showOutline=");
        ep.a.B(", showMedianLine=", ", autoHint=", sbS, this.f46085g, this.f46086h);
        sbS.append(this.f46087i);
        sbS.append(", maxMistakeCount=");
        sbS.append(this.f46088j);
        sbS.append(", allowCompletionAnimation=");
        return p0.p(sbS, this.f46089k, ")");
    }

    public e(long j11, long j12, long j13, long j14, long j15, boolean z11, boolean z12, boolean z13, int i11) {
        this((i11 & 1) != 0 ? x.f28615b : j11, (i11 & 2) != 0 ? f0.e(4291480267L) : j12, (i11 & 4) != 0 ? f0.e(4283124555L) : j13, (i11 & 8) != 0 ? f0.e(4294046193L) : j14, (i11 & 16) != 0 ? x.f28619f : j15, 60.0f, (i11 & 64) != 0 ? true : z11, (i11 & 128) != 0 ? true : z12, false, 6, (i11 & 1024) != 0 ? true : z13);
    }
}
