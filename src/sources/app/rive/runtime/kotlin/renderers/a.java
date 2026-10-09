package app.rive.runtime.kotlin.renderers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Renderer f2825b;

    public /* synthetic */ a(Renderer renderer, int i11) {
        this.f2824a = i11;
        this.f2825b = renderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2824a) {
            case 0:
                Renderer.stop$lambda$1(this.f2825b);
                break;
            default:
                Renderer.scheduleFrame$lambda$3(this.f2825b);
                break;
        }
    }
}
