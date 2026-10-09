package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ry.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f56781b;

    public v0(u0 u0Var) {
        this.f56781b = u0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56780a < this.f56781b.h();
    }

    @Override // ry.w
    public final int nextInt() {
        int i11 = this.f56780a;
        this.f56780a = i11 + 1;
        return this.f56781b.f(i11);
    }
}
