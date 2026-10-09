package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import m00.i;
import m00.j;
import nv.p;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2Writer implements Closeable, Lockable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f45481f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f45482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f45483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Hpack.Writer f45486e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f45481f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(j sink) {
        m.f(sink, "sink");
        this.f45482a = sink;
        i iVar = new i();
        this.f45483b = iVar;
        this.f45484c = 16384;
        this.f45486e = new Hpack.Writer(iVar);
    }

    public final void a(Settings peerSettings) {
        m.f(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f45485d) {
                    throw new IOException("closed");
                }
                int i11 = this.f45484c;
                int i12 = peerSettings.f45496a;
                if ((i12 & 32) != 0) {
                    i11 = peerSettings.f45497b[5];
                }
                this.f45484c = i11;
                if (((i12 & 2) != 0 ? peerSettings.f45497b[1] : -1) != -1) {
                    Hpack.Writer writer = this.f45486e;
                    int i13 = (i12 & 2) != 0 ? peerSettings.f45497b[1] : -1;
                    writer.getClass();
                    int iMin = Math.min(i13, 16384);
                    int i14 = writer.f45411d;
                    if (i14 != iMin) {
                        if (iMin < i14) {
                            writer.f45409b = Math.min(writer.f45409b, iMin);
                        }
                        writer.f45410c = true;
                        writer.f45411d = iMin;
                        int i15 = writer.f45415h;
                        if (iMin < i15) {
                            if (iMin == 0) {
                                Header[] headerArr = writer.f45412e;
                                l.P(0, headerArr.length, null, headerArr);
                                writer.f45413f = writer.f45412e.length - 1;
                                writer.f45414g = 0;
                                writer.f45415h = 0;
                            } else {
                                writer.a(i15 - iMin);
                            }
                        }
                    }
                }
                c(0, 0, 4, 1);
                this.f45482a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z11, int i11, i iVar, int i12) {
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            c(i11, i12, 0, z11 ? 1 : 0);
            if (i12 > 0) {
                j jVar = this.f45482a;
                m.c(iVar);
                jVar.K0(iVar, i12);
            }
        }
    }

    public final void c(int i11, int i12, int i13, int i14) {
        if (i13 != 8) {
            Level level = Level.FINE;
            Logger logger = f45481f;
            if (logger.isLoggable(level)) {
                Http2.f45416a.getClass();
                logger.fine(Http2.b(i11, i12, i13, i14, false));
            }
        }
        if (i12 > this.f45484c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f45484c + ": " + i12).toString());
        }
        if ((Integer.MIN_VALUE & i11) != 0) {
            throw new IllegalArgumentException(p.j(i11, "reserved bit set: ").toString());
        }
        byte[] bArr = _UtilCommonKt.f45202a;
        j jVar = this.f45482a;
        m.f(jVar, "<this>");
        jVar.writeByte((i12 >>> 16) & 255);
        jVar.writeByte((i12 >>> 8) & 255);
        jVar.writeByte(i12 & 255);
        jVar.writeByte(i13 & 255);
        jVar.writeByte(i14 & 255);
        jVar.writeInt(i11 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f45485d = true;
            this.f45482a.close();
        }
    }

    public final void d(int i11, ErrorCode errorCode, byte[] bArr) {
        m.f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            if (errorCode.a() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            c(0, bArr.length + 8, 7, 0);
            this.f45482a.writeInt(i11);
            this.f45482a.writeInt(errorCode.a());
            if (bArr.length != 0) {
                this.f45482a.write(bArr);
            }
            this.f45482a.flush();
        }
    }

    public final void e(int i11, ArrayList arrayList, boolean z11) {
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            this.f45486e.d(arrayList);
            long j11 = this.f45483b.f40718b;
            long jMin = Math.min(this.f45484c, j11);
            int i12 = j11 == jMin ? 4 : 0;
            if (z11) {
                i12 |= 1;
            }
            c(i11, (int) jMin, 1, i12);
            this.f45482a.K0(this.f45483b, jMin);
            if (j11 > jMin) {
                long j12 = j11 - jMin;
                while (j12 > 0) {
                    long jMin2 = Math.min(this.f45484c, j12);
                    j12 -= jMin2;
                    c(i11, (int) jMin2, 9, j12 == 0 ? 4 : 0);
                    this.f45482a.K0(this.f45483b, jMin2);
                }
            }
        }
    }

    public final void f(int i11, int i12, boolean z11) {
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            c(0, 8, 6, z11 ? 1 : 0);
            this.f45482a.writeInt(i11);
            this.f45482a.writeInt(i12);
            this.f45482a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            this.f45482a.flush();
        }
    }

    public final void h(int i11, ErrorCode errorCode) {
        m.f(errorCode, "errorCode");
        synchronized (this) {
            if (this.f45485d) {
                throw new IOException("closed");
            }
            if (errorCode.a() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c(i11, 4, 3, 0);
            this.f45482a.writeInt(errorCode.a());
            this.f45482a.flush();
        }
    }

    public final void i(int i11, long j11) {
        synchronized (this) {
            try {
                if (this.f45485d) {
                    throw new IOException("closed");
                }
                if (j11 == 0 || j11 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j11).toString());
                }
                Logger logger = f45481f;
                if (logger.isLoggable(Level.FINE)) {
                    Http2.f45416a.getClass();
                    logger.fine(Http2.c(i11, 4, j11, false));
                }
                c(i11, 4, 8, 0);
                this.f45482a.writeInt((int) j11);
                this.f45482a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
