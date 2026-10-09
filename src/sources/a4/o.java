package a4;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz.m f355c;

    public /* synthetic */ o(ListenableFuture listenableFuture, rz.m mVar, int i11) {
        this.f353a = i11;
        this.f354b = listenableFuture;
        this.f355c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f353a) {
            case 0:
                ListenableFuture listenableFuture = this.f354b;
                boolean zIsCancelled = listenableFuture.isCancelled();
                rz.m mVar = this.f355c;
                if (zIsCancelled) {
                    mVar.k(null);
                    return;
                }
                try {
                    mVar.resumeWith(h.g(listenableFuture));
                    return;
                } catch (ExecutionException e8) {
                    Throwable cause = e8.getCause();
                    if (cause != null) {
                        mVar.resumeWith(com.bumptech.glide.e.l(cause));
                        return;
                    } else {
                        kotlin.jvm.internal.m.l();
                        throw null;
                    }
                }
            default:
                ListenableFuture listenableFuture2 = this.f354b;
                boolean zIsCancelled2 = listenableFuture2.isCancelled();
                rz.m mVar2 = this.f355c;
                if (zIsCancelled2) {
                    mVar2.k(null);
                    return;
                }
                boolean z11 = false;
                while (true) {
                    try {
                        try {
                            Object obj = listenableFuture2.get();
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            mVar2.resumeWith(obj);
                            return;
                        } catch (ExecutionException e10) {
                            Throwable cause2 = e10.getCause();
                            kotlin.jvm.internal.m.c(cause2);
                            mVar2.resumeWith(com.bumptech.glide.e.l(cause2));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z11 = true;
                    } catch (Throwable th2) {
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                break;
        }
    }
}
