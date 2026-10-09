package ms;

import com.google.android.material.datepicker.d;
import defpackage.e;
import hh.p0;
import v3.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f41209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f41211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41213g;

    public a(float f5, float f11, float f12, float f13, int i11) {
        f5 = (i11 & 1) != 0 ? 100 : f5;
        f11 = (i11 & 2) != 0 ? 60 : f11;
        f12 = (i11 & 4) != 0 ? 40 : f12;
        f13 = (i11 & 8) != 0 ? 30 : f13;
        float f14 = (float) 0.5d;
        int i12 = (i11 & 32) != 0 ? 16 : 20;
        int i13 = (i11 & 64) != 0 ? 18 : 22;
        this.f41207a = f5;
        this.f41208b = f11;
        this.f41209c = f12;
        this.f41210d = f13;
        this.f41211e = f14;
        this.f41212f = i12;
        this.f41213g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f41207a, aVar.f41207a) && f.b(this.f41208b, aVar.f41208b) && f.b(this.f41209c, aVar.f41209c) && f.b(this.f41210d, aVar.f41210d) && f.b(this.f41211e, aVar.f41211e) && this.f41212f == aVar.f41212f && this.f41213g == aVar.f41213g;
    }

    public final int hashCode() {
        return Integer.hashCode(11) + e.b(this.f41213g, e.b(this.f41212f, e.a(e.a(e.a(e.a(Float.hashCode(this.f41207a) * 31, this.f41208b, 31), this.f41209c, 31), this.f41210d, 31), this.f41211e, 31), 31), 31);
    }

    public final String toString() {
        String strC = f.c(this.f41207a);
        String strC2 = f.c(this.f41208b);
        String strC3 = f.c(this.f41209c);
        String strC4 = f.c(this.f41210d);
        String strC5 = f.c(this.f41211e);
        StringBuilder sbS = e.s("AdaptiveTableConfig(cellWidth=", strC, ", cellHeight=", strC2, ", headerWidth=");
        d.w(sbS, strC3, ", headerHeight=", strC4, ", cellMargin=");
        sbS.append(strC5);
        sbS.append(", fontSize=");
        sbS.append(this.f41212f);
        sbS.append(", selectedFontSize=");
        return p0.i(this.f41213g, ", subTextFontSize=11)", sbS);
    }
}
