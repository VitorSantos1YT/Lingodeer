package nw;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import l1.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow.h f44187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f44188b;

    public b(c cVar, ow.h hVar) {
        this.f44188b = cVar;
        this.f44187a = hVar;
    }

    public final void a(p0 p0Var) {
        this.f44188b.N++;
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            if (hVar.f46126e) {
                throw new IOException("closed");
            }
            int i11 = hVar.f46125d;
            if ((p0Var.f39388a & 32) != 0) {
                i11 = p0Var.f39389b[5];
            }
            hVar.f46125d = i11;
            hVar.a(0, 0, (byte) 4, (byte) 1);
            hVar.f46122a.flush();
        }
    }

    public final void b() {
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            try {
                if (hVar.f46126e) {
                    throw new IOException("closed");
                }
                Logger logger = ow.i.f46127a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + ow.i.f46128b.f());
                }
                hVar.f46122a.write(ow.i.f46128b.u());
                hVar.f46122a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(ow.a aVar, byte[] bArr) {
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            try {
                if (hVar.f46126e) {
                    throw new IOException("closed");
                }
                if (aVar.httpCode == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                hVar.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                hVar.f46122a.writeInt(0);
                hVar.f46122a.writeInt(aVar.httpCode);
                if (bArr.length > 0) {
                    hVar.f46122a.write(bArr);
                }
                hVar.f46122a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44187a.close();
    }

    public final void d(int i11, int i12, boolean z11) {
        if (z11) {
            this.f44188b.N++;
        }
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            if (hVar.f46126e) {
                throw new IOException("closed");
            }
            hVar.a(0, 8, (byte) 6, z11 ? (byte) 1 : (byte) 0);
            hVar.f46122a.writeInt(i11);
            hVar.f46122a.writeInt(i12);
            hVar.f46122a.flush();
        }
    }

    public final void e(int i11, ow.a aVar) {
        this.f44188b.N++;
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            if (hVar.f46126e) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            hVar.a(i11, 4, (byte) 3, (byte) 0);
            hVar.f46122a.writeInt(aVar.httpCode);
            hVar.f46122a.flush();
        }
    }

    public final void f(p0 p0Var) {
        int i11;
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            try {
                if (hVar.f46126e) {
                    throw new IOException("closed");
                }
                int i12 = 0;
                hVar.a(0, Integer.bitCount(p0Var.f39388a) * 6, (byte) 4, (byte) 0);
                while (i12 < 10) {
                    if (p0Var.a(i12)) {
                        if (i12 == 4) {
                            i11 = 3;
                        } else {
                            i11 = i12 == 7 ? 4 : i12;
                        }
                        hVar.f46122a.writeShort(i11);
                        hVar.f46122a.writeInt(p0Var.f39389b[i12]);
                    }
                    i12++;
                }
                hVar.f46122a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void flush() {
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            if (hVar.f46126e) {
                throw new IOException("closed");
            }
            hVar.f46122a.flush();
        }
    }

    public final void h(int i11, long j11) {
        ow.h hVar = this.f44187a;
        synchronized (hVar) {
            if (hVar.f46126e) {
                throw new IOException("closed");
            }
            if (j11 == 0 || j11 > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j11);
            }
            hVar.a(i11, 4, (byte) 8, (byte) 0);
            hVar.f46122a.writeInt((int) j11);
            hVar.f46122a.flush();
        }
    }
}
