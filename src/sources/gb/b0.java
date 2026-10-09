package gb;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28906a = 0;

    static {
        kotlin.jvm.internal.m.e(fb.l.c("WorkerWrapper"), "tagWithPrefix(\"WorkerWrapper\")");
    }

    public static final Object a(ListenableFuture listenableFuture, fb.v vVar, xy.i iVar) {
        V v11;
        try {
            int i11 = 1;
            if (!listenableFuture.isDone()) {
                rz.m mVar = new rz.m(1, ue.f.x(iVar));
                mVar.s();
                listenableFuture.N(new a4.o(listenableFuture, mVar, i11), fb.m.INSTANCE);
                mVar.u(new a0.e(3, vVar, listenableFuture));
                Object objR = mVar.r();
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                return objR;
            }
            boolean z11 = false;
            while (true) {
                try {
                    v11 = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            return v11;
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            kotlin.jvm.internal.m.c(cause);
            throw cause;
        }
    }
}
