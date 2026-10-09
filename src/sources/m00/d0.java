package m00;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f40690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40692c;

    public d0(i0 source) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f40690a = source;
        this.f40691b = new i();
    }

    @Override // m00.k
    public final InputStream C1() {
        return new g(this, 1);
    }

    @Override // m00.k
    public final l D0() {
        i0 i0Var = this.f40690a;
        i iVar = this.f40691b;
        iVar.m0(i0Var);
        return iVar.z(iVar.f40718b);
    }

    @Override // m00.k
    public final byte[] M() {
        i0 i0Var = this.f40690a;
        i iVar = this.f40691b;
        iVar.m0(i0Var);
        return iVar.x(iVar.f40718b);
    }

    @Override // m00.k
    public final long O(h0 h0Var) {
        i iVar;
        long j11 = 0;
        while (true) {
            i0 i0Var = this.f40690a;
            iVar = this.f40691b;
            if (i0Var.read(iVar, 8192L) == -1) {
                break;
            }
            long jD = iVar.d();
            if (jD > 0) {
                j11 += jD;
                h0Var.K0(iVar, jD);
            }
        }
        long j12 = iVar.f40718b;
        if (j12 <= 0) {
            return j11;
        }
        long j13 = j11 + j12;
        h0Var.K0(iVar, j12);
        return j13;
    }

    @Override // m00.k
    public final int Q(z options) throws EOFException {
        i iVar;
        kotlin.jvm.internal.m.f(options, "options");
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        do {
            iVar = this.f40691b;
            int iD = n00.a.d(iVar, options, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                iVar.skip(options.f40760a[iD].e());
                return iD;
            }
        } while (this.f40690a.read(iVar, 8192L) != -1);
        return -1;
    }

    @Override // m00.k
    public final boolean R() {
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.f40691b;
        return iVar.R() && this.f40690a.read(iVar, 8192L) == -1;
    }

    @Override // m00.k
    public final String R0() {
        return c0(Long.MAX_VALUE);
    }

    public final long a(byte b3, long j11, long j12) {
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j12) {
            throw new IllegalArgumentException(defpackage.e.h(j12, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j12) {
            i iVar = this.f40691b;
            byte b11 = b3;
            long j13 = j12;
            long jI = iVar.i(b11, jMax, j13);
            if (jI != -1) {
                return jI;
            }
            long j14 = iVar.f40718b;
            if (j14 >= j13 || this.f40690a.read(iVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j14);
            b3 = b11;
            j12 = j13;
        }
        return -1L;
    }

    public final long b(l targetBytes) {
        kotlin.jvm.internal.m.f(targetBytes, "targetBytes");
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            i iVar = this.f40691b;
            long jQ = iVar.q(targetBytes, jMax);
            if (jQ != -1) {
                return jQ;
            }
            long j11 = iVar.f40718b;
            if (this.f40690a.read(iVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j11);
        }
    }

    public final d0 c() {
        return b.c(new b0(this));
    }

    @Override // m00.k
    public final String c0(long j11) throws EOFException {
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "limit < 0: ").toString());
        }
        long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
        long jA = a((byte) 10, 0L, j12);
        i iVar = this.f40691b;
        if (jA != -1) {
            return n00.a.c(iVar, jA);
        }
        if (j12 < Long.MAX_VALUE && request(j12) && iVar.h(j12 - 1) == 13 && request(j12 + 1) && iVar.h(j12) == 10) {
            return n00.a.c(iVar, j12);
        }
        i iVar2 = new i();
        iVar.f(iVar2, 0L, Math.min(32, iVar.f40718b));
        throw new EOFException("\\n not found: limit=" + Math.min(iVar.f40718b, j11) + " content=" + iVar2.z(iVar2.f40718b).f() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f40692c) {
            return;
        }
        this.f40692c = true;
        this.f40690a.close();
        this.f40691b.a();
    }

    public final int d() throws EOFException {
        s1(4L);
        return b.g(this.f40691b.readInt());
    }

    public final long e() throws EOFException {
        long j11;
        s1(8L);
        i iVar = this.f40691b;
        if (iVar.f40718b < 8) {
            throw new EOFException();
        }
        e0 e0Var = iVar.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        int i11 = e0Var.f40702b;
        int i12 = e0Var.f40703c;
        if (i12 - i11 < 8) {
            j11 = ((((long) iVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) iVar.readInt()));
        } else {
            byte[] bArr = e0Var.f40701a;
            int i13 = i11 + 7;
            long j12 = ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
            int i14 = i11 + 8;
            long j13 = j12 | (((long) bArr[i13]) & 255);
            iVar.f40718b -= 8;
            if (i14 == i12) {
                iVar.f40717a = e0Var.a();
                f0.a(e0Var);
            } else {
                e0Var.f40702b = i14;
            }
            j11 = j13;
        }
        return ((j11 & 255) << 56) | (((-72057594037927936L) & j11) >>> 56) | ((71776119061217280L & j11) >>> 40) | ((280375465082880L & j11) >>> 24) | ((1095216660480L & j11) >>> 8) | ((4278190080L & j11) << 8) | ((16711680 & j11) << 24) | ((65280 & j11) << 40);
    }

    public final short f() throws EOFException {
        s1(2L);
        return this.f40691b.y();
    }

    public final String h(long j11) throws EOFException {
        s1(j11);
        i iVar = this.f40691b;
        iVar.getClass();
        return iVar.A(j11, oz.a.f46133a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f40692c;
    }

    @Override // m00.k
    public final i n() {
        return this.f40691b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.m.f(byteBuffer, FpIL.iEgY);
        i iVar = this.f40691b;
        if (iVar.f40718b == 0 && this.f40690a.read(iVar, 8192L) == -1) {
            return -1;
        }
        return iVar.read(byteBuffer);
    }

    @Override // m00.k
    public final byte readByte() {
        s1(1L);
        return this.f40691b.readByte();
    }

    @Override // m00.k
    public final int readInt() throws EOFException {
        s1(4L);
        return this.f40691b.readInt();
    }

    @Override // m00.k
    public final short readShort() throws EOFException {
        s1(2L);
        return this.f40691b.readShort();
    }

    @Override // m00.k
    public final boolean request(long j11) {
        i iVar;
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
        }
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        do {
            iVar = this.f40691b;
            if (iVar.f40718b >= j11) {
                return true;
            }
        } while (this.f40690a.read(iVar, 8192L) != -1);
        return false;
    }

    @Override // m00.k
    public final String s0(Charset charset) {
        kotlin.jvm.internal.m.f(charset, "charset");
        i0 i0Var = this.f40690a;
        i iVar = this.f40691b;
        iVar.m0(i0Var);
        return iVar.s0(charset);
    }

    @Override // m00.k
    public final void s1(long j11) throws EOFException {
        if (!request(j11)) {
            throw new EOFException();
        }
    }

    @Override // m00.k
    public final void skip(long j11) throws EOFException {
        if (this.f40692c) {
            throw new IllegalStateException("closed");
        }
        while (j11 > 0) {
            i iVar = this.f40691b;
            if (iVar.f40718b == 0 && this.f40690a.read(iVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j11, iVar.f40718b);
            iVar.skip(jMin);
            j11 -= jMin;
        }
    }

    @Override // m00.i0
    public final k0 timeout() {
        return this.f40690a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f40690a + ')';
    }

    @Override // m00.k
    public final l z(long j11) throws EOFException {
        s1(j11);
        return this.f40691b.z(j11);
    }

    @Override // m00.k
    public final long z1() throws EOFException {
        i iVar;
        s1(1L);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            boolean zRequest = request(i12);
            iVar = this.f40691b;
            if (!zRequest) {
                break;
            }
            byte bH = iVar.h(i11);
            if ((bH < 48 || bH > 57) && ((bH < 97 || bH > 102) && (bH < 65 || bH > 70))) {
                if (i11 != 0) {
                    break;
                }
                qx.p.k(16);
                String string = Integer.toString(bH, 16);
                kotlin.jvm.internal.m.e(string, "toString(...)");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i11 = i12;
        }
        return iVar.z1();
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        kotlin.jvm.internal.m.f(sink, "sink");
        if (j11 >= 0) {
            if (!this.f40692c) {
                i iVar = this.f40691b;
                if (iVar.f40718b == 0) {
                    if (j11 == 0) {
                        return 0L;
                    }
                    if (this.f40690a.read(iVar, 8192L) == -1) {
                        return -1L;
                    }
                }
                return iVar.read(sink, Math.min(j11, iVar.f40718b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
    }
}
