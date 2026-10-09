package nw;

import fr.p3;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import l1.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f44196d = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f44197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.e f44199c;

    public d(p pVar, b bVar) {
        Level level = Level.FINE;
        this.f44199c = new ob.e(23);
        this.f44197a = pVar;
        this.f44198b = bVar;
    }

    public final void a(p0 p0Var) {
        q qVar = q.OUTBOUND;
        ob.e eVar = this.f44199c;
        if (eVar.l()) {
            ((Logger) eVar.f44804b).log((Level) eVar.f44805c, qVar + " SETTINGS: ack=true");
        }
        try {
            this.f44198b.a(p0Var);
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    public final void b(boolean z11, int i11, m00.i iVar, int i12) {
        ob.e eVar = this.f44199c;
        q qVar = q.OUTBOUND;
        iVar.getClass();
        eVar.n(qVar, i11, iVar, i12, z11);
        try {
            ow.h hVar = this.f44198b.f44187a;
            synchronized (hVar) {
                if (hVar.f46126e) {
                    throw new IOException("closed");
                }
                hVar.a(i11, i12, (byte) 0, z11 ? (byte) 1 : (byte) 0);
                if (i12 > 0) {
                    hVar.f46122a.K0(iVar, i12);
                }
            }
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    public final void c(ow.a aVar, byte[] bArr) {
        b bVar = this.f44198b;
        q qVar = q.OUTBOUND;
        m00.l lVar = m00.l.f40723d;
        this.f44199c.o(qVar, 0, aVar, p3.u(bArr));
        try {
            bVar.c(aVar, bArr);
            bVar.flush();
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f44198b.close();
        } catch (IOException e8) {
            f44196d.log(e8.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e8);
        }
    }

    public final void d(int i11, int i12, boolean z11) {
        ob.e eVar = this.f44199c;
        if (z11) {
            q qVar = q.OUTBOUND;
            long j11 = (4294967295L & ((long) i12)) | (((long) i11) << 32);
            if (eVar.l()) {
                ((Logger) eVar.f44804b).log((Level) eVar.f44805c, qVar + " PING: ack=true bytes=" + j11);
            }
        } else {
            eVar.p(q.OUTBOUND, (4294967295L & ((long) i12)) | (((long) i11) << 32));
        }
        try {
            this.f44198b.d(i11, i12, z11);
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    public final void e(int i11, ow.a aVar) {
        this.f44199c.q(q.OUTBOUND, i11, aVar);
        try {
            this.f44198b.e(i11, aVar);
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    public final void f(int i11, long j11) {
        this.f44199c.t(q.OUTBOUND, i11, j11);
        try {
            this.f44198b.h(i11, j11);
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }

    public final void flush() {
        try {
            this.f44198b.flush();
        } catch (IOException e8) {
            this.f44197a.n(e8);
        }
    }
}
