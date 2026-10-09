package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f1624b;

    public /* synthetic */ b0(k0 k0Var, int i11) {
        this.f1623a = i11;
        this.f1624b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1623a) {
            case 0:
                this.f1624b.startPostponedEnterTransition();
                break;
            default:
                this.f1624b.callStartTransitionListener(false);
                break;
        }
    }
}
