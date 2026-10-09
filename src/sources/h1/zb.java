package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zb implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f31443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f31444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.h1 f31445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.h1 f31446e;

    public zb(int i11, int i12, boolean z11) {
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f31442a = z11;
        this.f31443b = l1.t.B(new xb(0));
        this.f31444c = l1.t.B(Boolean.valueOf(i11 >= 12));
        this.f31445d = new l1.h1(i11 % 12);
        this.f31446e = new l1.h1(i12);
    }

    @Override // h1.yb
    public final void a(boolean z11) {
        this.f31444c.setValue(Boolean.valueOf(z11));
    }

    @Override // h1.yb
    public final void b(int i11) {
        a(i11 >= 12);
        this.f31445d.m(i11 % 12);
    }

    @Override // h1.yb
    public final void c(int i11) {
        this.f31446e.m(i11);
    }

    @Override // h1.yb
    public final int d() {
        return this.f31446e.l();
    }

    @Override // h1.yb
    public final void e(int i11) {
        this.f31443b.setValue(new xb(i11));
    }

    @Override // h1.yb
    public final int f() {
        return ((xb) this.f31443b.getValue()).f31325a;
    }

    @Override // h1.yb
    public final boolean g() {
        return this.f31442a;
    }

    @Override // h1.yb
    public final int h() {
        return this.f31445d.l() + (i() ? 12 : 0);
    }

    @Override // h1.yb
    public final boolean i() {
        return ((Boolean) this.f31444c.getValue()).booleanValue();
    }
}
