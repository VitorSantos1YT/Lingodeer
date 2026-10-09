package jf;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f36325d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f36326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f36327b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f36328c = new AtomicBoolean(false);

    public e(Activity activity) {
        this.f36326a = new WeakReference(activity);
    }

    public final void a() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            b2.a aVar = new b2.a(this, 24);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                aVar.run();
            } else {
                this.f36327b.post(aVar);
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
