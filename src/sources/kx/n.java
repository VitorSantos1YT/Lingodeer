package kx;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicReferenceArray implements Runnable, Callable, ww.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38916b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38917c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38918d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f38919e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f38920a;

    public n(Runnable runnable, ww.a aVar) {
        super(3);
        this.f38920a = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f38919e) {
                return;
            }
            if (obj == f38917c) {
                future.cancel(false);
                return;
            } else if (obj == f38918d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // ww.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f38919e;
            if (obj6 == obj || obj6 == (obj4 = f38917c) || obj6 == (obj5 = f38918d)) {
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
                ((Future) obj6).cancel(z11);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f38916b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((ww.a) obj2).b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f38918d;
        Object obj3 = f38917c;
        Object obj4 = f38916b;
        Object obj5 = f38919e;
        lazySet(2, Thread.currentThread());
        try {
            this.f38920a.run();
        } catch (Throwable th2) {
            try {
                qx.b.B(th2);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((ww.a) obj6).b(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((ww.a) obj7).b(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
