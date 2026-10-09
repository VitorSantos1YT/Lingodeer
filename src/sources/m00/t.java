package m00;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f40742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f40743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f40744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f40746e;

    public t(j jVar) {
        c0 c0Var = new c0(jVar);
        this.f40742a = c0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f40743b = deflater;
        this.f40744c = new m(c0Var, deflater);
        this.f40746e = new CRC32();
        i iVar = c0Var.f40685b;
        iVar.U(8075);
        iVar.J(8);
        iVar.J(0);
        iVar.T(0);
        iVar.J(0);
        iVar.J(0);
    }

    @Override // m00.h0
    public final void K0(i source, long j11) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
        }
        if (j11 == 0) {
            return;
        }
        e0 e0Var = source.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        long j12 = j11;
        while (j12 > 0) {
            int iMin = (int) Math.min(j12, e0Var.f40703c - e0Var.f40702b);
            this.f40746e.update(e0Var.f40701a, e0Var.f40702b, iMin);
            j12 -= (long) iMin;
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
        }
        this.f40744c.K0(source, j11);
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f40743b;
        c0 c0Var = this.f40742a;
        if (this.f40745d) {
            return;
        }
        try {
            m mVar = this.f40744c;
            mVar.f40732b.finish();
            mVar.a(false);
            int value = (int) this.f40746e.getValue();
            boolean z11 = c0Var.f40686c;
            i iVar = c0Var.f40685b;
            if (z11) {
                throw new IllegalStateException("closed");
            }
            iVar.T(b.g(value));
            c0Var.a();
            int bytesRead = (int) deflater.getBytesRead();
            if (c0Var.f40686c) {
                throw new IllegalStateException("closed");
            }
            iVar.T(b.g(bytesRead));
            c0Var.a();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                c0Var.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f40745d = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // m00.h0, java.io.Flushable
    public final void flush() throws IOException {
        this.f40744c.flush();
    }

    @Override // m00.h0
    public final k0 timeout() {
        return this.f40742a.f40684a.timeout();
    }
}
