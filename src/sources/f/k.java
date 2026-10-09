package f;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26156a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f26157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f26159d;

    public k(n nVar) {
        this.f26159d = nVar;
    }

    public final void a(View view) {
        if (this.f26158c) {
            return;
        }
        this.f26158c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.m.f(runnable, "runnable");
        this.f26157b = runnable;
        View decorView = this.f26159d.getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        if (!this.f26158c) {
            decorView.postOnAnimation(new b2.a(this, 10));
        } else if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z11;
        Runnable runnable = this.f26157b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f26156a) {
                this.f26158c = false;
                this.f26159d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f26157b = null;
        w fullyDrawnReporter = this.f26159d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f26169a) {
            z11 = fullyDrawnReporter.f26170b;
        }
        if (z11) {
            this.f26158c = false;
            this.f26159d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26159d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
