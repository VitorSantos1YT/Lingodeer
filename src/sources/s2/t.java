package s2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f51347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f51348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f51350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f51351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f51352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f51353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f51354l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f51356o;

    public t(long j11, long j12, long j13, boolean z11, float f5, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.f51343a = j11;
        this.f51344b = j12;
        this.f51345c = j13;
        this.f51346d = z11;
        this.f51347e = f5;
        this.f51348f = j14;
        this.f51349g = j15;
        this.f51350h = z12;
        this.f51351i = i11;
        this.f51352j = j16;
        this.f51354l = 0L;
        this.m = z13;
        this.f51355n = z13;
    }

    public final void a() {
        t tVar = this.f51356o;
        if (tVar == null) {
            this.m = true;
            this.f51355n = true;
        } else if (tVar != null) {
            tVar.a();
        }
    }

    public final boolean b() {
        t tVar = this.f51356o;
        if (tVar != null) {
            return tVar.b();
        }
        return this.m || this.f51355n;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) s.i(this.f51343a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f51344b);
        sb2.append(", position=");
        sb2.append((Object) f2.b.j(this.f51345c));
        sb2.append(", pressed=");
        sb2.append(this.f51346d);
        sb2.append(", pressure=");
        sb2.append(this.f51347e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f51348f);
        sb2.append(", previousPosition=");
        sb2.append((Object) f2.b.j(this.f51349g));
        sb2.append(", previousPressed=");
        sb2.append(this.f51350h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i11 = this.f51351i;
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
        sb2.append(", historical=");
        Object obj = this.f51353k;
        if (obj == null) {
            obj = ry.r.f50854a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) f2.b.j(this.f51352j));
        sb2.append(')');
        return sb2.toString();
    }

    public t(long j11, long j12, long j13, boolean z11, float f5, long j14, long j15, boolean z12, int i11, ArrayList arrayList, long j16, long j17) {
        this(j11, j12, j13, z11, f5, j14, j15, z12, false, i11, j16);
        this.f51353k = arrayList;
        this.f51354l = j17;
    }
}
