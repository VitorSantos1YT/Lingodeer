package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.e0 f39332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.e0 f39333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.w f39334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39335d;

    public l(y.e0 e0Var, y.e0 e0Var2, y.w wVar, int i11, Exception exc) {
        super(exc);
        this.f39332a = e0Var;
        this.f39333b = e0Var2;
        this.f39334c = wVar;
        this.f39335d = i11;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return oz.r.h0("\n            |Failed to execute op number " + this.f39335d + ":\n            |" + ry.m.y0(ry.m.V0(50, nz.n.Z(new nz.o(new k(this, null)))), "\n", null, null, null, 62) + "\n            ");
    }
}
