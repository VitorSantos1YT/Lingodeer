package lw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f40465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40467c;

    public s1(Runnable runnable) {
        this.f40465a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40466b) {
            return;
        }
        this.f40467c = true;
        this.f40465a.run();
    }
}
