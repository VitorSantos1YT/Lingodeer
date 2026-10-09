package s;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50979a;

    public /* synthetic */ a(int i11) {
        this.f50979a = i11;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f50979a) {
            case 0:
                b.M().f50982b.f50985c.execute(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
