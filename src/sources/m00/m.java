package m00;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f40731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f40732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40733c;

    public m(c0 c0Var, Deflater deflater) {
        this.f40731a = c0Var;
        this.f40732b = deflater;
    }

    @Override // m00.h0
    public final void K0(i source, long j11) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        b.e(source.f40718b, 0L, j11);
        while (true) {
            Deflater deflater = this.f40732b;
            if (j11 <= 0) {
                deflater.setInput(n00.b.f43060b, 0, 0);
                return;
            }
            e0 e0Var = source.f40717a;
            kotlin.jvm.internal.m.c(e0Var);
            int iMin = (int) Math.min(j11, e0Var.f40703c - e0Var.f40702b);
            deflater.setInput(e0Var.f40701a, e0Var.f40702b, iMin);
            a(false);
            long j12 = iMin;
            source.f40718b -= j12;
            int i11 = e0Var.f40702b + iMin;
            e0Var.f40702b = i11;
            if (i11 == e0Var.f40703c) {
                source.f40717a = e0Var.a();
                f0.a(e0Var);
            }
            j11 -= j12;
        }
    }

    public final void a(boolean z11) throws IOException {
        e0 e0VarG;
        int iDeflate;
        c0 c0Var = this.f40731a;
        i iVar = c0Var.f40685b;
        while (true) {
            e0VarG = iVar.G(1);
            byte[] bArr = e0VarG.f40701a;
            Deflater deflater = this.f40732b;
            if (z11) {
                try {
                    int i11 = e0VarG.f40703c;
                    iDeflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
                } catch (NullPointerException e8) {
                    throw new IOException("Deflater already closed", e8);
                }
            } else {
                int i12 = e0VarG.f40703c;
                iDeflate = deflater.deflate(bArr, i12, 8192 - i12);
            }
            if (iDeflate > 0) {
                e0VarG.f40703c += iDeflate;
                iVar.f40718b += (long) iDeflate;
                c0Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (e0VarG.f40702b == e0VarG.f40703c) {
            iVar.f40717a = e0VarG.a();
            f0.a(e0VarG);
        }
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f40732b;
        if (this.f40733c) {
            return;
        }
        deflater.finish();
        a(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f40731a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f40733c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // m00.h0, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.f40731a.flush();
    }

    @Override // m00.h0
    public final k0 timeout() {
        return this.f40731a.f40684a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f40731a + ')';
    }
}
