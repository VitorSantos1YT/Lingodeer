package dy;

import hh.p0;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends AtomicReferenceArray implements Runnable, Callable, rx.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24603c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f24604d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f24605e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f24606f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f24607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24608b;

    public q(Runnable runnable, rx.a aVar) {
        super(3);
        this.f24607a = runnable;
        this.f24608b = true;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f24606f) {
                return;
            }
            if (obj == f24604d) {
                future.cancel(false);
                return;
            } else if (obj == f24605e) {
                future.cancel(this.f24608b);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // rx.b
    public final boolean b() {
        Object obj = get(0);
        return obj == f24603c || obj == f24606f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // rx.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f24606f;
            if (obj6 == obj || obj6 == (obj4 = f24604d) || obj6 == (obj5 = f24605e)) {
                break;
            }
            boolean z11 = get(2) != Thread.currentThread();
            if (z11) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z11 && this.f24608b);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f24603c) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((rx.a) obj2).c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f24605e;
        Object obj4 = f24604d;
        Object obj5 = f24603c;
        Object obj6 = f24606f;
        lazySet(2, Thread.currentThread());
        try {
            this.f24607a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((rx.a) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                qx.p.u(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((rx.a) obj8).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strK;
        Object obj = get(1);
        if (obj == f24606f) {
            strK = "Finished";
        } else if (obj == f24604d) {
            strK = "Disposed(Sync)";
        } else if (obj == f24605e) {
            strK = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            strK = obj2 == null ? "Waiting" : p0.k(obj2, "Running on ");
        }
        return q.class.getSimpleName() + "[" + strK + "]";
    }
}
