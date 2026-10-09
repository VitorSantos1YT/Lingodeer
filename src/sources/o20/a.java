package o20;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44475b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f44474a = i11;
        this.f44475b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f44474a) {
            case 0:
                ((Handler) this.f44475b).post(runnable);
                return;
            case 1:
                ((Handler) this.f44475b).post(runnable);
                return;
            case 2:
                Handler handler = (Handler) this.f44475b;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 3:
                Handler handler2 = (Handler) this.f44475b;
                runnable.getClass();
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                ((qb.a) this.f44475b).f47696c.post(runnable);
                return;
        }
    }

    public a() {
        this.f44474a = 0;
        this.f44475b = new Handler(Looper.getMainLooper());
    }
}
