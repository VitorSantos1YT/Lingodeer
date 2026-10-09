package h7;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31955b;

    public /* synthetic */ u(Object obj, int i11) {
        this.f31954a = i11;
        this.f31955b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f31954a) {
            case 0:
                ((Handler) this.f31955b).post(runnable);
                break;
            default:
                ((Choreographer) this.f31955b).postFrameCallback(new o3.b0(runnable, 0));
                break;
        }
    }
}
