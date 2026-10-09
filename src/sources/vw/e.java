package vw;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import uw.m;
import uw.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f54310a;

    public e(Handler handler) {
        this.f54310a = handler;
    }

    @Override // uw.n
    public final m a() {
        return new c(this.f54310a);
    }

    @Override // uw.n
    public final ww.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f54310a;
        d dVar = new d(handler, runnable);
        handler.postDelayed(dVar, timeUnit.toMillis(0L));
        return dVar;
    }
}
