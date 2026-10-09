package ib;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f34306b;

    public /* synthetic */ e(f fVar, int i11) {
        this.f34305a = i11;
        this.f34306b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34305a) {
            case 0:
                f.b(this.f34306b);
                break;
            default:
                f.c(this.f34306b);
                break;
        }
    }
}
