package s2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f51365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f51367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f51368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f51369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f51370k;

    public v(long j11, long j12, long j13, long j14, boolean z11, float f5, int i11, boolean z12, ArrayList arrayList, long j15, long j16) {
        this.f51360a = j11;
        this.f51361b = j12;
        this.f51362c = j13;
        this.f51363d = j14;
        this.f51364e = z11;
        this.f51365f = f5;
        this.f51366g = i11;
        this.f51367h = z12;
        this.f51368i = arrayList;
        this.f51369j = j15;
        this.f51370k = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return s.d(this.f51360a, vVar.f51360a) && this.f51361b == vVar.f51361b && f2.b.c(this.f51362c, vVar.f51362c) && f2.b.c(this.f51363d, vVar.f51363d) && this.f51364e == vVar.f51364e && Float.compare(this.f51365f, vVar.f51365f) == 0 && this.f51366g == vVar.f51366g && this.f51367h == vVar.f51367h && this.f51368i.equals(vVar.f51368i) && f2.b.c(this.f51369j, vVar.f51369j) && f2.b.c(this.f51370k, vVar.f51370k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f51370k) + defpackage.e.f(this.f51369j, nv.p.b(this.f51368i, defpackage.e.e(defpackage.e.b(this.f51366g, defpackage.e.a(defpackage.e.e(defpackage.e.f(this.f51363d, defpackage.e.f(this.f51362c, defpackage.e.f(this.f51361b, Long.hashCode(this.f51360a) * 31, 31), 31), 31), 31, this.f51364e), this.f51365f, 31), 31), 31, this.f51367h), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) s.i(this.f51360a));
        sb2.append(", uptime=");
        sb2.append(this.f51361b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) f2.b.j(this.f51362c));
        sb2.append(", position=");
        sb2.append((Object) f2.b.j(this.f51363d));
        sb2.append(", down=");
        sb2.append(this.f51364e);
        sb2.append(", pressure=");
        sb2.append(this.f51365f);
        sb2.append(", type=");
        int i11 = this.f51366g;
        if (i11 == 1) {
            str = "Touch";
        } else if (i11 == 2) {
            str = "Mouse";
        } else if (i11 != 3) {
            str = i11 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb2.append((Object) str);
        sb2.append(", activeHover=");
        sb2.append(this.f51367h);
        sb2.append(", historical=");
        sb2.append(this.f51368i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) f2.b.j(this.f51369j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) f2.b.j(this.f51370k));
        sb2.append(')');
        return sb2.toString();
    }
}
