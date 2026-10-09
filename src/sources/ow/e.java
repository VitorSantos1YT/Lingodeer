package ow;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m00.d0;
import m00.i0;
import m00.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f46110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f46112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f46115f;

    public e(d0 d0Var) {
        this.f46110a = d0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // m00.i0
    public final k0 timeout() {
        return this.f46110a.f40690a.timeout();
    }

    @Override // m00.i0
    public final long read(m00.i iVar, long j11) throws IOException {
        int i11;
        int i12;
        do {
            int i13 = this.f46114e;
            d0 d0Var = this.f46110a;
            if (i13 == 0) {
                d0Var.skip(this.f46115f);
                this.f46115f = (short) 0;
                if ((this.f46112c & 4) == 0) {
                    i11 = this.f46113d;
                    int iA = i.a(d0Var);
                    this.f46114e = iA;
                    this.f46111b = iA;
                    byte b3 = (byte) (d0Var.readByte() & 255);
                    this.f46112c = (byte) (d0Var.readByte() & 255);
                    Logger logger = i.f46127a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(f.a(true, this.f46113d, this.f46111b, b3, this.f46112c));
                    }
                    i12 = d0Var.readInt() & Integer.MAX_VALUE;
                    this.f46113d = i12;
                    if (b3 != 9) {
                        i.c("%s != TYPE_CONTINUATION", Byte.valueOf(b3));
                        throw null;
                    }
                }
            } else {
                long j12 = d0Var.read(iVar, Math.min(j11, i13));
                if (j12 != -1) {
                    this.f46114e -= (int) j12;
                    return j12;
                }
            }
            return -1L;
        } while (i12 == i11);
        i.c(kHfjNGauVgdF.YiZnDcAhgTgznoA, new Object[0]);
        throw null;
    }
}
