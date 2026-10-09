package m00;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f40684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40686c;

    public c0(h0 sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        this.f40684a = sink;
        this.f40685b = new i();
    }

    @Override // m00.j
    public final j A0(long j11) {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.S(j11);
        a();
        return this;
    }

    @Override // m00.h0
    public final void K0(i source, long j11) {
        kotlin.jvm.internal.m.f(source, "source");
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.K0(source, j11);
        a();
    }

    @Override // m00.j
    public final j Q0(l byteString) {
        kotlin.jvm.internal.m.f(byteString, "byteString");
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.I(byteString);
        a();
        return this;
    }

    public final j a() {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.f40685b;
        long jD = iVar.d();
        if (jD > 0) {
            this.f40684a.K0(iVar, jD);
        }
        return this;
    }

    public final j b(long j11) {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.N(j11);
        a();
        return this;
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        h0 h0Var = this.f40684a;
        if (this.f40686c) {
            return;
        }
        i iVar = this.f40685b;
        long j11 = iVar.f40718b;
        if (j11 > 0) {
            h0Var.K0(iVar, j11);
        }
        th = null;
        try {
            h0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f40686c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // m00.j, m00.h0, java.io.Flushable
    public final void flush() {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.f40685b;
        long j11 = iVar.f40718b;
        h0 h0Var = this.f40684a;
        if (j11 > 0) {
            h0Var.K0(iVar, j11);
        }
        h0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f40686c;
    }

    @Override // m00.j
    public final j l0(String string) {
        kotlin.jvm.internal.m.f(string, "string");
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.Y(string);
        a();
        return this;
    }

    @Override // m00.j
    public final long m0(i0 source) {
        kotlin.jvm.internal.m.f(source, "source");
        long j11 = 0;
        while (true) {
            long j12 = source.read(this.f40685b, 8192L);
            if (j12 == -1) {
                return j11;
            }
            j11 += j12;
            a();
        }
    }

    @Override // m00.j
    public final i n() {
        return this.f40685b;
    }

    @Override // m00.h0
    public final k0 timeout() {
        return this.f40684a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f40684a + ')';
    }

    @Override // m00.j
    public final i w() {
        return this.f40685b;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.f(source, "source");
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f40685b.write(source);
        a();
        return iWrite;
    }

    @Override // m00.j
    public final j writeByte(int i11) {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.J(i11);
        a();
        return this;
    }

    @Override // m00.j
    public final j writeInt(int i11) {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.T(i11);
        a();
        return this;
    }

    @Override // m00.j
    public final j writeShort(int i11) {
        if (this.f40686c) {
            throw new IllegalStateException("closed");
        }
        this.f40685b.U(i11);
        a();
        return this;
    }

    @Override // m00.j
    public final j write(byte[] source) {
        kotlin.jvm.internal.m.f(source, "source");
        if (!this.f40686c) {
            this.f40685b.m228write(source);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // m00.j
    public final j write(byte[] source, int i11, int i12) {
        kotlin.jvm.internal.m.f(source, "source");
        if (!this.f40686c) {
            this.f40685b.m229write(source, i11, i12);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
