package w6;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import aw.t;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Handler f54651f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zbc f54656e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f54653b = d.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f54654c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f54655d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f54652a = new b(this, new ax.c(this, 4));

    public a(zbc zbcVar) {
        this.f54656e = zbcVar;
    }

    public final void a() {
        try {
            zbc zbcVar = this.f54656e;
            Iterator it = zbcVar.f8542j.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (((GoogleApiClient) it.next()).b()) {
                    i11++;
                }
            }
            try {
                zbcVar.f8541i.tryAcquire(i11, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e8) {
            if (!this.f54654c.get()) {
                throw e8;
            }
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f54651f == null) {
                    f54651f = new Handler(Looper.getMainLooper());
                }
                handler = f54651f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new t(24, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54656e.b();
    }
}
