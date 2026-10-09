package b7;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3965b;

    public /* synthetic */ c0(String str, int i11) {
        this.f3964a = i11;
        this.f3965b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3964a) {
            case 0:
                return new Thread(runnable, this.f3965b);
            default:
                Thread thread = new Thread(runnable, this.f3965b);
                thread.setPriority(10);
                return thread;
        }
    }
}
