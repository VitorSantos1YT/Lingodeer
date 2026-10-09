package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f50952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f50953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, long j11, m mVar) {
        super(j11);
        this.f50953d = x0Var;
        this.f50952c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f50952c.D(this.f50953d);
    }

    @Override // rz.v0
    public final String toString() {
        return super.toString() + this.f50952c;
    }
}
