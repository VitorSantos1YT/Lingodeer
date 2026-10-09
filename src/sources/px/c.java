package px;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import qx.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f47200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f47201b;

    public c(Handler handler) {
        this.f47200a = handler;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f47201b;
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f47201b) {
            return ux.c.INSTANCE;
        }
        Handler handler = this.f47200a;
        d dVar = new d(0, handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        messageObtain.setAsynchronous(true);
        this.f47200a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j11));
        if (!this.f47201b) {
            return dVar;
        }
        this.f47200a.removeCallbacks(dVar);
        return ux.c.INSTANCE;
    }

    @Override // rx.b
    public final void dispose() {
        this.f47201b = true;
        this.f47200a.removeCallbacksAndMessages(this);
    }
}
