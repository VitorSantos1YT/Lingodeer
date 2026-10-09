package h10;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f31447b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f31448a = new LinkedBlockingQueue();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f31448a.poll(1L, TimeUnit.SECONDS) != null) {
                throw new ClassCastException();
            }
            synchronized (this) {
                try {
                    if (this.f31448a.poll() != null) {
                        throw new ClassCastException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().getName();
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
