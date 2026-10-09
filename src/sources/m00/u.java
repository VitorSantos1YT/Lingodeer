package m00;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f40747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f40748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f40749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f40750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f40751e;

    public u(k source) {
        kotlin.jvm.internal.m.f(source, "source");
        d0 d0Var = new d0(source);
        this.f40748b = d0Var;
        Inflater inflater = new Inflater(true);
        this.f40749c = inflater;
        this.f40750d = new v(d0Var, inflater);
        this.f40751e = new CRC32();
    }

    public static void a(int i11, int i12, String str) throws IOException {
        if (i12 == i11) {
            return;
        }
        StringBuilder sbR = defpackage.e.r(str, ": actual 0x");
        sbR.append(oz.q.P0(8, b.l(i12)));
        sbR.append(" != expected 0x");
        sbR.append(oz.q.P0(8, b.l(i11)));
        throw new IOException(sbR.toString());
    }

    public final void b(i iVar, long j11, long j12) {
        e0 e0Var = iVar.f40717a;
        kotlin.jvm.internal.m.c(e0Var);
        while (true) {
            int i11 = e0Var.f40703c;
            int i12 = e0Var.f40702b;
            if (j11 < i11 - i12) {
                break;
            }
            j11 -= (long) (i11 - i12);
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
        }
        while (j12 > 0) {
            int i13 = (int) (((long) e0Var.f40702b) + j11);
            int iMin = (int) Math.min(e0Var.f40703c - i13, j12);
            this.f40751e.update(e0Var.f40701a, i13, iMin);
            j12 -= (long) iMin;
            e0Var = e0Var.f40706f;
            kotlin.jvm.internal.m.c(e0Var);
            j11 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40750d.close();
    }

    @Override // m00.i0
    public final k0 timeout() {
        return this.f40748b.f40690a.timeout();
    }

    @Override // m00.i0
    public final long read(i sink, long j11) throws IOException {
        u uVar = this;
        kotlin.jvm.internal.m.f(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
        }
        if (j11 == 0) {
            return 0L;
        }
        byte b3 = uVar.f40747a;
        CRC32 crc32 = uVar.f40751e;
        d0 d0Var = uVar.f40748b;
        if (b3 == 0) {
            d0Var.s1(10L);
            i iVar = d0Var.f40691b;
            byte bH = iVar.h(3L);
            boolean z11 = ((bH >> 1) & 1) == 1;
            if (z11) {
                uVar.b(iVar, 0L, 10L);
            }
            a(8075, d0Var.readShort(), "ID1ID2");
            d0Var.skip(8L);
            if (((bH >> 2) & 1) == 1) {
                d0Var.s1(2L);
                if (z11) {
                    b(iVar, 0L, 2L);
                }
                long jY = iVar.y() & 65535;
                d0Var.s1(jY);
                if (z11) {
                    b(iVar, 0L, jY);
                }
                d0Var.skip(jY);
            }
            if (((bH >> 3) & 1) == 1) {
                long jA = d0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z11) {
                    b(iVar, 0L, jA + 1);
                }
                d0Var.skip(jA + 1);
            }
            if (((bH >> 4) & 1) == 1) {
                long jA2 = d0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z11) {
                    uVar = this;
                    uVar.b(iVar, 0L, jA2 + 1);
                } else {
                    uVar = this;
                }
                d0Var.skip(jA2 + 1);
            } else {
                uVar = this;
            }
            if (z11) {
                a(d0Var.f(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            uVar.f40747a = (byte) 1;
        }
        if (uVar.f40747a == 1) {
            long j12 = sink.f40718b;
            long j13 = uVar.f40750d.read(sink, j11);
            if (j13 != -1) {
                uVar.b(sink, j12, j13);
                return j13;
            }
            uVar.f40747a = (byte) 2;
        }
        if (uVar.f40747a == 2) {
            a(d0Var.d(), (int) crc32.getValue(), OCBJEWZHh.rXoJGK);
            a(d0Var.d(), (int) uVar.f40749c.getBytesWritten(), "ISIZE");
            uVar.f40747a = (byte) 3;
            if (!d0Var.R()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
