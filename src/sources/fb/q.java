package fb;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f27107b;

    public /* synthetic */ q(AtomicBoolean atomicBoolean, int i11) {
        this.f27106a = i11;
        this.f27107b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27106a) {
            case 0:
                this.f27107b.set(true);
                break;
            default:
                this.f27107b.set(true);
                break;
        }
    }
}
