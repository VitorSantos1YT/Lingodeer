package vw;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import uw.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f54306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f54307b;

    public c(Handler handler) {
        this.f54306a = handler;
    }

    @Override // uw.m
    public final ww.b a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit2 == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.f54307b) {
            return zw.b.INSTANCE;
        }
        Handler handler = this.f54306a;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        this.f54306a.sendMessageDelayed(messageObtain, timeUnit2.toMillis(0L));
        if (!this.f54307b) {
            return dVar;
        }
        this.f54306a.removeCallbacks(dVar);
        return zw.b.INSTANCE;
    }

    @Override // ww.b
    public final void dispose() {
        this.f54307b = true;
        this.f54306a.removeCallbacksAndMessages(this);
    }
}
