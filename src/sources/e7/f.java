package e7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25120a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25121b;

    public f(av.d dVar) {
        this.f25121b = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f25120a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e8) {
                        throw new IllegalStateException(e8);
                    }
                    break;
                } while (((g) this.f25121b).j());
                return;
            default:
                ((av.d) this.f25121b).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f25121b = gVar;
    }
}
