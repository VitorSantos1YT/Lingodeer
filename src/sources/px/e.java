package px;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import qx.n;
import qx.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f47206c;

    public e(Handler handler) {
        this.f47206c = handler;
    }

    @Override // qx.o
    public final n a() {
        return new c(this.f47206c);
    }

    @Override // qx.o
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f47206c;
        d dVar = new d(0, handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j11));
        return dVar;
    }
}
