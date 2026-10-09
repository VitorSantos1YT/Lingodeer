package n0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f42910a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42912c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42915f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42916t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f42911b = new PriorityQueue(11, new bq.h(12));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f42913d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l.j0 f42914e = new l.j0();

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public a(View view) {
        float refreshRate;
        this.f42910a = view;
        if (H == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            H = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f42915f = true;
        }
    }

    @Override // n0.a1
    public void a(z0 z0Var) {
        this.f42911b.add(new d1(1, z0Var));
        if (this.f42912c) {
            return;
        }
        this.f42912c = true;
        this.f42910a.post(this);
    }

    public final boolean b() {
        l.j0 j0Var = this.f42914e;
        long jA = j0Var.a();
        c3.c.r(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z11 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f42911b;
            Object objPeek = priorityQueue.peek();
            kotlin.jvm.internal.m.c(objPeek);
            if (!((d1) objPeek).f42937b.c(j0Var)) {
                priorityQueue.poll();
                z11 = false;
            }
            j0Var.f39022a = false;
        }
        return z11;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        if (this.f42915f) {
            this.f42916t = j11;
            this.f42910a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f42915f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f42915f = false;
        this.f42910a.removeCallbacks(this);
        this.f42913d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f42911b;
        if (!priorityQueue.isEmpty() && this.f42912c && this.f42915f) {
            View view = this.f42910a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z11 = System.nanoTime() > (((long) 2) * H) + nanos;
                l.j0 j0Var = this.f42914e;
                j0Var.f39022a = z11;
                j0Var.f39023b = Math.max(this.f42916t, nanos) + H;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (j0Var.f39022a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f42913d.postFrameCallback(this);
                } else {
                    this.f42912c = false;
                }
                c3.c.r(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f42912c = false;
    }
}
