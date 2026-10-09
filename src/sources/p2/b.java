package p2;

import hh.p0;
import s2.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f46281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46284h;

    public b(long j11, long j12, long j13, boolean z11, float f5, long j14, long j15, boolean z12) {
        this.f46277a = j11;
        this.f46278b = j12;
        this.f46279c = j13;
        this.f46280d = z11;
        this.f46281e = f5;
        this.f46282f = j14;
        this.f46283g = j15;
        this.f46284h = z12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndirectPointerInputChange(id=");
        sb2.append((Object) s.i(this.f46277a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f46278b);
        sb2.append(", position=");
        sb2.append((Object) f2.b.j(this.f46279c));
        sb2.append(", pressed=");
        sb2.append(this.f46280d);
        sb2.append(", pressure=");
        sb2.append(this.f46281e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f46282f);
        sb2.append(", previousPosition=");
        sb2.append((Object) f2.b.j(this.f46283g));
        sb2.append(", previousPressed=");
        return p0.p(sb2, this.f46284h, ", isConsumed=false)");
    }
}
