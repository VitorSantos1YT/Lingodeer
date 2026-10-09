package okhttp3.internal.http2;

import defpackage.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import m00.h0;
import m00.i;
import m00.i0;
import m00.k0;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2Stream implements Lockable {
    public static final /* synthetic */ int P = 0;
    public final FramingSource H;
    public final FramingSink K;
    public final StreamTimeout L;
    public final StreamTimeout M;
    public ErrorCode N;
    public IOException O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Http2Connection f45465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowCounter f45466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f45469f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f45470t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class FramingSink implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f45472b = new i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45473c;

        public FramingSink(boolean z11) {
            this.f45471a = z11;
        }

        @Override // m00.h0
        public final void K0(i source, long j11) throws SocketTimeoutException {
            m.f(source, "source");
            TimeZone timeZone = _UtilJvmKt.f45204a;
            i iVar = this.f45472b;
            iVar.K0(source, j11);
            while (iVar.f40718b >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z11) throws SocketTimeoutException {
            long jMin;
            boolean z12;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.M.h();
                while (http2Stream.f45467d >= http2Stream.f45468e && !this.f45471a && !this.f45473c && http2Stream.f() == null) {
                    try {
                        try {
                            http2Stream.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        http2Stream.M.k();
                        throw th2;
                    }
                }
                http2Stream.M.k();
                http2Stream.b();
                jMin = Math.min(http2Stream.f45468e - http2Stream.f45467d, this.f45472b.f40718b);
                http2Stream.f45467d += jMin;
                z12 = z11 && jMin == this.f45472b.f40718b;
            }
            Http2Stream.this.M.h();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f45465b.f(http2Stream2.f45464a, z12, this.f45472b, jMin);
            } finally {
                Http2Stream.this.M.k();
            }
        }

        @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f45204a;
            synchronized (http2Stream) {
                if (this.f45473c) {
                    return;
                }
                boolean z11 = http2Stream.f() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.K.f45471a) {
                    if (this.f45472b.f40718b > 0) {
                        while (this.f45472b.f40718b > 0) {
                            a(true);
                        }
                    } else if (z11) {
                        http2Stream2.f45465b.f(http2Stream2.f45464a, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.f45473c = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.f45465b.Z.flush();
                Http2Stream.this.a();
            }
        }

        @Override // m00.h0, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f45204a;
            synchronized (http2Stream) {
                http2Stream.b();
            }
            while (this.f45472b.f40718b > 0) {
                a(false);
                Http2Stream.this.f45465b.Z.flush();
            }
        }

        @Override // m00.h0
        public final k0 timeout() {
            return Http2Stream.this.M;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class FramingSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f45475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f45477c = new i();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i f45478d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45479e;

        public FramingSource(long j11, boolean z11) {
            this.f45475a = j11;
            this.f45476b = z11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j11;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f45479e = true;
                i iVar = this.f45478d;
                j11 = iVar.f40718b;
                iVar.a();
                http2Stream.notifyAll();
            }
            if (j11 > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                TimeZone timeZone = _UtilJvmKt.f45204a;
                http2Stream2.f45465b.e(j11);
            }
            Http2Stream.this.a();
        }

        @Override // m00.i0
        public final long read(i sink, long j11) throws Throwable {
            boolean z11;
            Throwable streamResetException;
            long j12;
            m.f(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(e.h(j11, "byteCount < 0: ").toString());
            }
            do {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    int i11 = Http2Stream.P;
                    http2Stream.f45465b.getClass();
                    FramingSink framingSink = http2Stream.K;
                    z11 = true;
                    boolean z12 = framingSink.f45473c || framingSink.f45471a;
                    if (z12) {
                        http2Stream.L.h();
                    }
                    try {
                        if (http2Stream.f() == null || this.f45476b) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.O;
                            if (streamResetException == null) {
                                ErrorCode errorCodeF = http2Stream.f();
                                m.c(errorCodeF);
                                streamResetException = new StreamResetException(errorCodeF);
                            }
                        }
                        if (this.f45479e) {
                            throw new IOException("stream closed");
                        }
                        i iVar = this.f45478d;
                        long j13 = iVar.f40718b;
                        if (j13 > 0) {
                            j12 = iVar.read(sink, Math.min(j11, j13));
                            WindowCounter.b(http2Stream.f45466c, j12, 0L, 2);
                            long jA = http2Stream.f45466c.a();
                            if (streamResetException == null && jA >= http2Stream.f45465b.T.a() / 2) {
                                http2Stream.f45465b.i(http2Stream.f45464a, jA);
                                WindowCounter.b(http2Stream.f45466c, 0L, jA, 1);
                            }
                            z11 = false;
                        } else {
                            if (this.f45476b || streamResetException != null) {
                                z11 = false;
                            } else {
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            j12 = -1;
                        }
                        if (z12) {
                            http2Stream.L.k();
                        }
                    } catch (Throwable th2) {
                        if (z12) {
                            http2Stream.L.k();
                        }
                        throw th2;
                    }
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f45465b.S.a(http2Stream2.f45466c);
            } while (z11);
            if (j12 != -1) {
                return j12;
            }
            if (streamResetException == null) {
                return -1L;
            }
            throw streamResetException;
        }

        @Override // m00.i0
        public final k0 timeout() {
            return Http2Stream.this.L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class StreamTimeout extends m00.e {
        public StreamTimeout() {
        }

        @Override // m00.e
        public final void j() {
            Http2Stream.this.e(ErrorCode.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.f45465b;
            synchronized (http2Connection) {
                long j11 = http2Connection.Q;
                long j12 = http2Connection.P;
                if (j11 < j12) {
                    return;
                }
                http2Connection.P = j12 + 1;
                http2Connection.R = System.nanoTime() + ((long) 1000000000);
                TaskQueue.b(http2Connection.H, ep.a.k(new StringBuilder(), http2Connection.f45427c, " ping"), new lt.e(http2Connection, 10), 6);
            }
        }

        public final void k() throws SocketTimeoutException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i11, Http2Connection connection, boolean z11, boolean z12, Headers headers) {
        m.f(connection, "connection");
        this.f45464a = i11;
        this.f45465b = connection;
        this.f45466c = new WindowCounter(i11);
        this.f45468e = connection.U.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f45469f = arrayDeque;
        this.H = new FramingSource(connection.T.a(), z12);
        this.K = new FramingSink(z11);
        this.L = new StreamTimeout();
        this.M = new StreamTimeout();
        if (headers == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z11;
        boolean zH;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        synchronized (this) {
            try {
                FramingSource framingSource = this.H;
                if (framingSource.f45476b || !framingSource.f45479e) {
                    z11 = false;
                } else {
                    FramingSink framingSink = this.K;
                    if (framingSink.f45471a || framingSink.f45473c) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                zH = h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f45465b.c(this.f45464a);
        }
    }

    public final void b() throws IOException {
        FramingSink framingSink = this.K;
        if (framingSink.f45473c) {
            throw new IOException("stream closed");
        }
        if (framingSink.f45471a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.O;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeF = f();
            m.c(errorCodeF);
            throw new StreamResetException(errorCodeF);
        }
    }

    public final void c(ErrorCode rstStatusCode, IOException iOException) {
        m.f(rstStatusCode, "rstStatusCode");
        if (d(rstStatusCode, iOException)) {
            Http2Connection http2Connection = this.f45465b;
            http2Connection.getClass();
            http2Connection.Z.h(this.f45464a, rstStatusCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.f45204a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.N = errorCode;
            this.O = iOException;
            notifyAll();
            if (this.H.f45476b && this.K.f45471a) {
                return false;
            }
            this.f45465b.c(this.f45464a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        m.f(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f45465b.h(this.f45464a, errorCode);
        }
    }

    public final ErrorCode f() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.N;
        }
        return errorCode;
    }

    public final boolean g() {
        boolean z11 = (this.f45464a & 1) == 1;
        this.f45465b.getClass();
        return true == z11;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                FramingSource framingSource = this.H;
                if (framingSource.f45476b || framingSource.f45479e) {
                    FramingSink framingSink = this.K;
                    if ((framingSink.f45471a || framingSink.f45473c) && this.f45470t) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(Headers headers, boolean z11) {
        boolean zH;
        m.f(headers, "headers");
        TimeZone timeZone = _UtilJvmKt.f45204a;
        synchronized (this) {
            try {
                if (this.f45470t && headers.b(":status") == null && headers.b(":method") == null) {
                    this.H.getClass();
                } else {
                    this.f45470t = true;
                    this.f45469f.add(headers);
                }
                if (z11) {
                    this.H.f45476b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f45465b.c(this.f45464a);
    }
}
