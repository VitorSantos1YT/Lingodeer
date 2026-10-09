package okhttp3.internal.http2;

import dt.k2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jr.s;
import kotlin.jvm.internal.m;
import l1.z1;
import m00.i;
import m00.j;
import m00.k;
import mt.i0;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2Connection implements Closeable, Lockable {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Companion f45421c0 = new Companion(0);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Settings f45422d0;
    public final TaskQueue H;
    public final TaskQueue K;
    public final TaskQueue L;
    public final PushObserver M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public final FlowControlListener S;
    public final Settings T;
    public Settings U;
    public final WindowCounter V;
    public long W;
    public long X;
    public final Socket Y;
    public final Http2Writer Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Listener f45423a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ReaderRunnable f45424a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f45425b = new LinkedHashMap();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LinkedHashSet f45426b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45430f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TaskRunner f45431t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaskRunner f45432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Socket f45433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f45434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k f45435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public j f45436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Listener f45437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PushObserver f45438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45439h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public FlowControlListener f45440i;

        public Builder(TaskRunner taskRunner) {
            m.f(taskRunner, "taskRunner");
            this.f45432a = taskRunner;
            this.f45437f = Listener.f45441a;
            this.f45438g = PushObserver.f45494a;
            this.f45440i = FlowControlListener.None.f45388a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f45441a;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(int i11) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f45441a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void c(Http2Stream http2Stream) {
                    http2Stream.c(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void b(Http2Connection http2Connection, Settings settings) {
            m.f(settings, "settings");
        }

        public abstract void c(Http2Stream http2Stream);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ReaderRunnable implements Http2Reader.Handler, fz.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Http2Reader f45442a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f45442a = http2Reader;
        }

        public final void a(final boolean z11, final int i11, k source, final int i12) throws EOFException {
            boolean z12;
            boolean z13;
            m.f(source, "source");
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.f45421c0;
            if (i11 != 0 && (i11 & 1) == 0) {
                final i iVar = new i();
                long j11 = i12;
                source.s1(j11);
                source.read(iVar, j11);
                TaskQueue.b(http2Connection.K, http2Connection.f45427c + '[' + i11 + "] onData", new fz.a(i11, iVar, i12, z11) { // from class: okhttp3.internal.http2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f45500b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i f45501c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f45502d;

                    @Override // fz.a
                    public final Object invoke() {
                        Http2Connection http2Connection2 = this.f45499a;
                        int i13 = this.f45500b;
                        i iVar2 = this.f45501c;
                        int i14 = this.f45502d;
                        Http2Connection.Companion companion2 = Http2Connection.f45421c0;
                        try {
                            ((PushObserver.Companion.PushObserverCancel) http2Connection2.M).getClass();
                            iVar2.skip(i14);
                            http2Connection2.Z.h(i13, ErrorCode.CANCEL);
                            synchronized (http2Connection2) {
                                http2Connection2.f45426b0.remove(Integer.valueOf(i13));
                            }
                        } catch (IOException unused) {
                        }
                        return b0.f48488a;
                    }
                }, 6);
                return;
            }
            Http2Stream http2StreamB = http2Connection.b(i11);
            if (http2StreamB == null) {
                Http2Connection.this.h(i11, ErrorCode.PROTOCOL_ERROR);
                long j12 = i12;
                Http2Connection.this.e(j12);
                source.skip(j12);
                return;
            }
            TimeZone timeZone = _UtilJvmKt.f45204a;
            Http2Stream.FramingSource framingSource = http2StreamB.H;
            long j13 = i12;
            framingSource.getClass();
            long j14 = j13;
            while (true) {
                boolean z14 = true;
                if (j14 <= 0) {
                    Http2Stream http2Stream = Http2Stream.this;
                    TimeZone timeZone2 = _UtilJvmKt.f45204a;
                    http2Stream.f45465b.e(j13);
                    Http2Stream http2Stream2 = Http2Stream.this;
                    http2Stream2.f45465b.S.a(http2Stream2.f45466c);
                    break;
                }
                synchronized (Http2Stream.this) {
                    z12 = framingSource.f45476b;
                    z13 = framingSource.f45478d.f40718b + j14 > framingSource.f45475a;
                }
                if (z13) {
                    source.skip(j14);
                    Http2Stream.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z12) {
                    source.skip(j14);
                    break;
                }
                long j15 = source.read(framingSource.f45477c, j14);
                if (j15 == -1) {
                    throw new EOFException();
                }
                j14 -= j15;
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    try {
                        if (framingSource.f45479e) {
                            framingSource.f45477c.a();
                        } else {
                            i iVar2 = framingSource.f45478d;
                            if (iVar2.f40718b != 0) {
                                z14 = false;
                            }
                            iVar2.m0(framingSource.f45477c);
                            if (z14) {
                                http2Stream3.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z11) {
                http2StreamB.i(Headers.f45041c, true);
            }
        }

        public final void c(int i11, List list, boolean z11) {
            Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.f45421c0;
            if (i11 != 0 && (i11 & 1) == 0) {
                TaskQueue.b(http2Connection.K, http2Connection.f45427c + '[' + i11 + "] onHeaders", new b(http2Connection, i11, list, z11), 6);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamB = http2Connection.b(i11);
                if (http2StreamB != null) {
                    http2StreamB.i(_UtilJvmKt.h(list), z11);
                    return;
                }
                if (http2Connection.f45430f) {
                    return;
                }
                if (i11 <= http2Connection.f45428d) {
                    return;
                }
                if (i11 % 2 == http2Connection.f45429e % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i11, http2Connection, false, z11, _UtilJvmKt.h(list));
                http2Connection.f45428d = i11;
                http2Connection.f45425b.put(Integer.valueOf(i11), http2Stream);
                TaskQueue.b(http2Connection.f45431t.d(), http2Connection.f45427c + '[' + i11 + "] onStream", new z1(22, http2Connection, http2Stream), 6);
            }
        }

        public final void d(int i11, int i12, boolean z11) {
            if (!z11) {
                TaskQueue.b(Http2Connection.this.H, ep.a.k(new StringBuilder(), Http2Connection.this.f45427c, " ping"), new i0(Http2Connection.this, i11, i12, 2), 6);
                return;
            }
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                try {
                    if (i11 == 1) {
                        http2Connection.O++;
                    } else if (i11 == 2) {
                        http2Connection.Q++;
                    } else if (i11 == 3) {
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void e(int i11, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.f45426b0.contains(Integer.valueOf(i11))) {
                    http2Connection.h(i11, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f45426b0.add(Integer.valueOf(i11));
                TaskQueue.b(http2Connection.K, http2Connection.f45427c + '[' + i11 + "] onRequest", new b(http2Connection, i11, list, 0), 6);
            }
        }

        public final void h(final int i11, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.f45421c0;
            if (i11 == 0 || (i11 & 1) != 0) {
                Http2Stream http2StreamC = http2Connection.c(i11);
                if (http2StreamC != null) {
                    synchronized (http2StreamC) {
                        if (http2StreamC.f() == null) {
                            http2StreamC.N = errorCode;
                            http2StreamC.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue.b(http2Connection.K, http2Connection.f45427c + '[' + i11 + "] onReset", new fz.a(i11, errorCode) { // from class: okhttp3.internal.http2.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f45508b;

                @Override // fz.a
                public final Object invoke() {
                    Http2Connection http2Connection2 = this.f45507a;
                    int i12 = this.f45508b;
                    ((PushObserver.Companion.PushObserverCancel) http2Connection2.M).getClass();
                    synchronized (http2Connection2) {
                        http2Connection2.f45426b0.remove(Integer.valueOf(i12));
                    }
                    return b0.f48488a;
                }
            }, 6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // fz.a
        public final Object invoke() throws Throwable {
            Throwable th2;
            ErrorCode errorCode;
            ?? r9 = Http2Connection.this;
            Http2Reader http2Reader = this.f45442a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r11 = 1;
            IOException e8 = null;
            try {
                try {
                    try {
                        if (!http2Reader.a(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } while (http2Reader.a(false, this));
                        errorCode = ErrorCode.NO_ERROR;
                        try {
                            errorCode2 = ErrorCode.CANCEL;
                            r9.a(errorCode, errorCode2, null);
                            r11 = errorCode;
                        } catch (IOException e10) {
                            e8 = e10;
                            errorCode2 = ErrorCode.PROTOCOL_ERROR;
                            r9.a(errorCode2, errorCode2, e8);
                            r11 = errorCode;
                        }
                        _UtilCommonKt.b(http2Reader);
                        return b0.f48488a;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (IOException e11) {
                    e8 = e11;
                    errorCode = errorCode2;
                }
            } catch (Throwable th5) {
                th2 = th5;
            }
            r11 = errorCode2;
            r9.a(r11, errorCode2, e8);
            _UtilCommonKt.b(http2Reader);
            throw th2;
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(4, 65535);
        settings.c(5, 16384);
        f45422d0 = settings;
    }

    public Http2Connection(Builder builder) {
        this.f45423a = builder.f45437f;
        String str = builder.f45434c;
        if (str == null) {
            m.n("connectionName");
            throw null;
        }
        this.f45427c = str;
        this.f45429e = 3;
        TaskRunner taskRunner = builder.f45432a;
        this.f45431t = taskRunner;
        TaskQueue taskQueueD = taskRunner.d();
        this.H = taskQueueD;
        this.K = taskRunner.d();
        this.L = taskRunner.d();
        this.M = builder.f45438g;
        this.S = builder.f45440i;
        Settings settings = new Settings();
        settings.c(4, 16777216);
        this.T = settings;
        Settings settings2 = f45422d0;
        this.U = settings2;
        this.V = new WindowCounter(0);
        this.X = settings2.a();
        Socket socket = builder.f45433b;
        if (socket == null) {
            m.n("socket");
            throw null;
        }
        this.Y = socket;
        j jVar = builder.f45436e;
        if (jVar == null) {
            m.n("sink");
            throw null;
        }
        this.Z = new Http2Writer(jVar);
        k kVar = builder.f45435d;
        if (kVar == null) {
            m.n("source");
            throw null;
        }
        this.f45424a0 = new ReaderRunnable(new Http2Reader(kVar));
        this.f45426b0 = new LinkedHashSet();
        int i11 = builder.f45439h;
        if (i11 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
            final String name = str.concat(" ping");
            final k2 k2Var = new k2(this, nanos, 1);
            m.f(name, "name");
            taskQueueD.c(new Task(name) { // from class: okhttp3.internal.concurrent.TaskQueue$schedule$2
                @Override // okhttp3.internal.concurrent.Task
                public final long a() {
                    return ((Number) k2Var.invoke()).longValue();
                }
            }, nanos);
        }
    }

    public final void a(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i11;
        Object[] array;
        m.f(connectionCode, "connectionCode");
        m.f(streamCode, "streamCode");
        TimeZone timeZone = _UtilJvmKt.f45204a;
        try {
            d(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f45425b.isEmpty()) {
                array = null;
            } else {
                array = this.f45425b.values().toArray(new Http2Stream[0]);
                this.f45425b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.Z.close();
        } catch (IOException unused3) {
        }
        try {
            this.Y.close();
        } catch (IOException unused4) {
        }
        this.H.f();
        this.K.f();
        this.L.f();
    }

    public final Http2Stream b(int i11) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.f45425b.get(Integer.valueOf(i11));
        }
        return http2Stream;
    }

    public final Http2Stream c(int i11) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.f45425b.remove(Integer.valueOf(i11));
            notifyAll();
        }
        return http2Stream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void d(ErrorCode statusCode) {
        m.f(statusCode, "statusCode");
        synchronized (this.Z) {
            synchronized (this) {
                if (this.f45430f) {
                    return;
                }
                this.f45430f = true;
                this.Z.d(this.f45428d, statusCode, _UtilCommonKt.f45202a);
            }
        }
    }

    public final void e(long j11) {
        synchronized (this) {
            try {
                WindowCounter.b(this.V, j11, 0L, 2);
                long jA = this.V.a();
                if (jA >= this.T.a() / 2) {
                    i(0, jA);
                    WindowCounter.b(this.V, 0L, jA, 1);
                }
                this.S.b(this.V);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(int i11, boolean z11, i iVar, long j11) {
        long j12;
        long j13;
        int iMin;
        long j14;
        if (j11 == 0) {
            this.Z.b(z11, i11, iVar, 0);
            return;
        }
        while (j11 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j12 = this.W;
                            j13 = this.X;
                            if (j12 >= j13) {
                                if (!this.f45425b.containsKey(Integer.valueOf(i11))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                iMin = Math.min((int) Math.min(j11, j13 - j12), this.Z.f45484c);
                j14 = iMin;
                this.W += j14;
            }
            j11 -= j14;
            this.Z.b(z11 && j11 == 0, i11, iVar, iMin);
        }
    }

    public final void h(int i11, ErrorCode errorCode) {
        m.f(errorCode, "errorCode");
        TaskQueue.b(this.H, this.f45427c + '[' + i11 + "] writeSynReset", new b(this, i11, errorCode, 2), 6);
    }

    public final void i(int i11, long j11) {
        TaskQueue.b(this.H, this.f45427c + '[' + i11 + "] windowUpdate", new s(i11, j11, 1, this), 6);
    }
}
