package okhttp3;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f45023c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45021a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45022b = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f45024d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f45025e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f45026f = new ArrayDeque();

    public final synchronized void a() {
        try {
            Iterator it = this.f45024d.iterator();
            m.e(it, "iterator(...)");
            while (it.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator it2 = this.f45025e.iterator();
            m.e(it2, "iterator(...)");
            while (it2.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator it3 = this.f45026f.iterator();
            m.e(it3, "iterator(...)");
            while (it3.hasNext()) {
                ((RealCall) it3.next()).cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f45023c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = _UtilJvmKt.f45205b + " Dispatcher";
                m.f(name, "name");
                this.f45023c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new k00.a(name, false));
            }
            threadPoolExecutor = this.f45023c;
            m.c(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public final RealCall.AsyncCall c(String str) {
        Iterator it = this.f45025e.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (m.a(RealCall.this.f45279b.f45134a.f45048d, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.f45024d.iterator();
        m.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (m.a(RealCall.this.f45279b.f45134a.f45048d, str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final void d(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        f();
    }

    public final void e(RealCall.AsyncCall asyncCall) {
        asyncCall.f45286b.decrementAndGet();
        d(this.f45025e, asyncCall);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void f() {
        int i11;
        int size;
        RealCall.AsyncCall asyncCall;
        int size2;
        RealCall.AsyncCall asyncCall2;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f45024d.iterator();
                m.e(it, "iterator(...)");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall3 = (RealCall.AsyncCall) it.next();
                    if (this.f45025e.size() >= this.f45021a) {
                        break;
                    }
                    if (asyncCall3.f45286b.get() < this.f45022b) {
                        it.remove();
                        asyncCall3.f45286b.incrementAndGet();
                        arrayList.add(asyncCall3);
                        this.f45025e.add(asyncCall3);
                    }
                }
                synchronized (this) {
                    this.f45025e.size();
                    this.f45026f.size();
                }
                i11 = 0;
                if (!((ThreadPoolExecutor) b()).isShutdown()) {
                    size2 = arrayList.size();
                    while (i11 < size2) {
                        asyncCall2 = (RealCall.AsyncCall) arrayList.get(i11);
                        asyncCall2.f45286b.decrementAndGet();
                        synchronized (this) {
                            this.f45025e.remove(asyncCall2);
                        }
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(null);
                        RealCall realCall = RealCall.this;
                        realCall.h(interruptedIOException);
                        asyncCall2.f45285a.e(realCall, interruptedIOException);
                        i11++;
                    }
                }
                size = arrayList.size();
                while (i11 < size) {
                    asyncCall = (RealCall.AsyncCall) arrayList.get(i11);
                    ExecutorService executorServiceB = b();
                    asyncCall.getClass();
                    RealCall realCall2 = RealCall.this;
                    m.f(realCall2.f45278a.f45084a, "<this>");
                    try {
                        try {
                            ((ThreadPoolExecutor) executorServiceB).execute(asyncCall);
                        } catch (RejectedExecutionException e8) {
                            InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                            interruptedIOException2.initCause(e8);
                            RealCall realCall3 = RealCall.this;
                            realCall3.h(interruptedIOException2);
                            asyncCall.f45285a.e(realCall3, interruptedIOException2);
                            realCall2.f45278a.f45084a.e(asyncCall);
                        }
                        i11++;
                    } catch (Throwable th2) {
                        realCall2.f45278a.f45084a.e(asyncCall);
                        throw th2;
                    }
                }
                return;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i11 = 0;
        if (!((ThreadPoolExecutor) b()).isShutdown()) {
            size = arrayList.size();
            while (i11 < size) {
                asyncCall = (RealCall.AsyncCall) arrayList.get(i11);
                ExecutorService executorServiceB2 = b();
                asyncCall.getClass();
                RealCall realCall4 = RealCall.this;
                m.f(realCall4.f45278a.f45084a, "<this>");
                ((ThreadPoolExecutor) executorServiceB2).execute(asyncCall);
                i11++;
            }
            return;
        }
        size2 = arrayList.size();
        while (i11 < size2) {
            asyncCall2 = (RealCall.AsyncCall) arrayList.get(i11);
            asyncCall2.f45286b.decrementAndGet();
            synchronized (this) {
                this.f45025e.remove(asyncCall2);
                InterruptedIOException interruptedIOException3 = new InterruptedIOException("executor rejected");
                interruptedIOException3.initCause(null);
                RealCall realCall5 = RealCall.this;
                realCall5.h(interruptedIOException3);
                asyncCall2.f45285a.e(realCall5, interruptedIOException3);
                i11++;
            }
        }
    }
}
