package vd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements b0, qe.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ob.m f53840e = qe.d.a(20, new re.v(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe.e f53841a = new qe.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f53842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53844d;

    @Override // qe.b
    public final qe.e a() {
        return this.f53841a;
    }

    @Override // vd.b0
    public final synchronized void b() {
        this.f53841a.a();
        this.f53844d = true;
        if (!this.f53843c) {
            this.f53842b.b();
            this.f53842b = null;
            f53840e.c(this);
        }
    }

    @Override // vd.b0
    public final int c() {
        return this.f53842b.c();
    }

    @Override // vd.b0
    public final Class d() {
        return this.f53842b.d();
    }

    public final synchronized void e() {
        this.f53841a.a();
        if (!this.f53843c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f53843c = false;
        if (this.f53844d) {
            b();
        }
    }

    @Override // vd.b0
    public final Object get() {
        return this.f53842b.get();
    }
}
