package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends t1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rz.m f39282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fz.c f39283b;

    @Override // t1.b
    public final void a() {
        this.f39283b = null;
        this.f39282a = null;
    }

    @Override // t1.b
    public final void b(Throwable th2) {
        rz.m mVar = this.f39282a;
        if (mVar != null) {
            mVar.resumeWith(com.bumptech.glide.e.l(th2));
        }
    }
}
