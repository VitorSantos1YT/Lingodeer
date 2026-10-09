package l;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39058a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39058a) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                pe.m.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
