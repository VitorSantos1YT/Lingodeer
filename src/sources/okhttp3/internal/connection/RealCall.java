package okhttp3.internal.connection;

import cf.x;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    public ExchangeFinder H;
    public RealConnection K;
    public boolean L;
    public Exchange M;
    public boolean N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public volatile Exchange R;
    public final CopyOnWriteArrayList S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f45278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f45279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f45280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventListener f45281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RealCall$timeout$1 f45282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45283f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f45284t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f45285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f45286b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.f45285a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OkHttpClient okHttpClient;
            String str = "OkHttp " + RealCall.this.f45279b.f45134a.h();
            RealCall realCall = RealCall.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.f45282e.h();
                boolean z11 = false;
                try {
                    try {
                        try {
                            this.f45285a.d(realCall, realCall.f());
                            okHttpClient = realCall.f45278a;
                        } catch (IOException e8) {
                            e = e8;
                            z11 = true;
                            if (z11) {
                                Platform.f45527a.getClass();
                                Platform platform = Platform.f45528b;
                                StringBuilder sb2 = new StringBuilder("Callback failure for ");
                                StringBuilder sb3 = new StringBuilder();
                                e.C(sb3, realCall.Q ? "canceled " : BuildConfig.VERSION_NAME, "call", " to ");
                                sb3.append(realCall.f45279b.f45134a.h());
                                sb2.append(sb3.toString());
                                platform.j(sb2.toString(), 4, e);
                            } else {
                                this.f45285a.e(realCall, e);
                            }
                            okHttpClient = realCall.f45278a;
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            realCall.cancel();
                            if (!z11) {
                                IOException iOException = new IOException("canceled due to " + th);
                                x.b(iOException, th);
                                this.f45285a.e(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.f45278a.f45084a.e(this);
                        throw th3;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th4) {
                    th = th4;
                }
                okHttpClient.f45084a.e(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f45288a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.f45288a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [m00.k0, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request originalRequest) {
        m.f(originalRequest, "originalRequest");
        this.f45278a = okHttpClient;
        this.f45279b = originalRequest;
        this.f45280c = okHttpClient.D.f44991a;
        EventListener eventListener = (EventListener) okHttpClient.f45087d.f32212b;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        this.f45281d = eventListener;
        ?? r9 = new m00.e() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // m00.e
            public final void j() {
                this.m.cancel();
            }
        };
        r9.g(0, TimeUnit.MILLISECONDS);
        this.f45282e = r9;
        this.f45283f = new AtomicBoolean();
        this.P = true;
        this.S = new CopyOnWriteArrayList();
    }

    @Override // okhttp3.Call
    public final void H(Callback callback) {
        if (!this.f45283f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f45527a.getClass();
        this.f45284t = Platform.f45528b.h();
        this.f45281d.e(this);
        Dispatcher dispatcher = this.f45278a.f45084a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.f45024d.add(asyncCall);
            AsyncCall asyncCallC = dispatcher.c(this.f45279b.f45134a.f45048d);
            if (asyncCallC != null) {
                asyncCall.f45286b = asyncCallC.f45286b;
            }
        }
        dispatcher.f();
    }

    public final IOException a(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        RealConnection realConnection = this.K;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketI = i();
            }
            if (this.K == null) {
                if (socketI != null) {
                    _UtilJvmKt.c(socketI);
                }
                this.f45281d.k(this, realConnection);
                realConnection.N.getClass();
                if (socketI != null) {
                    realConnection.N.getClass();
                }
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.L && i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f45281d.c(this);
            return interruptedIOException;
        }
        EventListener eventListener = this.f45281d;
        m.c(interruptedIOException);
        eventListener.d(this, interruptedIOException);
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final boolean b() {
        return this.Q;
    }

    public final Response c() {
        if (!this.f45283f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        h();
        Platform.f45527a.getClass();
        this.f45284t = Platform.f45528b.h();
        this.f45281d.e(this);
        try {
            Dispatcher dispatcher = this.f45278a.f45084a;
            synchronized (dispatcher) {
                dispatcher.f45026f.add(this);
            }
            Response responseF = f();
            Dispatcher dispatcher2 = this.f45278a.f45084a;
            dispatcher2.d(dispatcher2.f45026f, this);
            return responseF;
        } catch (Throwable th2) {
            Dispatcher dispatcher3 = this.f45278a.f45084a;
            dispatcher3.d(dispatcher3.f45026f, this);
            throw th2;
        }
    }

    @Override // okhttp3.Call
    public final void cancel() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        Exchange exchange = this.R;
        if (exchange != null) {
            exchange.f45254d.cancel();
        }
        Iterator it = this.S.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.f45281d.f(this);
    }

    public final Object clone() {
        return new RealCall(this.f45278a, this.f45279b);
    }

    public final void d(boolean z11) {
        Exchange exchange;
        synchronized (this) {
            if (!this.P) {
                throw new IllegalStateException("released");
            }
        }
        if (z11 && (exchange = this.R) != null) {
            exchange.f45254d.cancel();
            exchange.f45251a.g(exchange, true, true, null);
        }
        this.M = null;
    }

    @Override // okhttp3.Call
    public final Request e() {
        return this.f45279b;
    }

    public final Response f() {
        ArrayList arrayList = new ArrayList();
        ry.m.d0(arrayList, this.f45278a.f45085b);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f45278a));
        arrayList.add(new BridgeInterceptor(this.f45278a.f45093j));
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.f45239a);
        ry.m.d0(arrayList, this.f45278a.f45086c);
        arrayList.add(new CallServerInterceptor());
        Request request = this.f45279b;
        OkHttpClient okHttpClient = this.f45278a;
        try {
            try {
                Response responseA = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.f45105w, okHttpClient.f45106x, okHttpClient.f45107y).a(this.f45279b);
                if (this.Q) {
                    _UtilCommonKt.b(responseA);
                    throw new IOException("Canceled");
                }
                h(null);
                return responseA;
            } catch (IOException e8) {
                IOException iOExceptionH = h(e8);
                m.d(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                h(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException g(Exchange exchange, boolean z11, boolean z12, IOException iOException) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        m.f(exchange, "exchange");
        if (exchange.equals(this.R)) {
            synchronized (this) {
                z13 = false;
                if (z11) {
                    try {
                        if (this.N) {
                            if (z11) {
                                this.N = false;
                            }
                            if (z12) {
                                this.O = false;
                            }
                            z15 = this.N;
                            if (z15) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (!z15) {
                                z13 = true;
                            }
                            z14 = z13;
                            z13 = z16;
                        } else if (z12 || !this.O) {
                            z14 = false;
                        } else {
                            if (z11) {
                                this.N = false;
                            }
                            if (z12) {
                                this.O = false;
                            }
                            z15 = this.N;
                            if (z15 || this.O) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (!z15 && !this.O && !this.P) {
                                z13 = true;
                            }
                            z14 = z13;
                            z13 = z16;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z12) {
                    }
                    z14 = false;
                }
            }
            if (z13) {
                this.R = null;
                RealConnection realConnection = this.K;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.S++;
                    }
                }
            }
            if (z14) {
                return a(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z11;
        synchronized (this) {
            z11 = false;
            if (this.P) {
                this.P = false;
                if (!this.N && !this.O) {
                    z11 = true;
                }
            }
        }
        return z11 ? a(iOException) : iOException;
    }

    public final Socket i() {
        RealConnection realConnection = this.K;
        m.c(realConnection);
        TimeZone timeZone = _UtilJvmKt.f45204a;
        ArrayList arrayList = realConnection.V;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i11 = -1;
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            if (m.a(((Reference) obj).get(), this)) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i11);
        this.K = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.W = System.nanoTime();
        RealConnectionPool realConnectionPool = this.f45280c;
        ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.f45302g;
        TimeZone timeZone2 = _UtilJvmKt.f45204a;
        if (!realConnection.P && realConnectionPool.f45296a != 0) {
            realConnectionPool.f45300e.c(realConnectionPool.f45301f, 0L);
            return null;
        }
        realConnection.P = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            TaskQueue taskQueue = realConnectionPool.f45300e;
            synchronized (taskQueue.f45218a) {
                if (taskQueue.a()) {
                    taskQueue.f45218a.c(taskQueue);
                }
            }
        }
        Address address = realConnection.f45291d.f45185a;
        m.f(address, "address");
        RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.f45299d.get(address);
        if (addressState == null) {
            return realConnection.f45293f;
        }
        realConnectionPool.b(addressState);
        throw null;
    }
}
