package m00;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f40752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f40753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40755d;

    public v(d0 d0Var, Inflater inflater) {
        this.f40752a = d0Var;
        this.f40753b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f40755d) {
            return;
        }
        this.f40753b.end();
        this.f40755d = true;
        this.f40752a.close();
    }

    @Override // m00.i0
    public final long read(i sink, long j11) throws IOException {
        long j12;
        kotlin.jvm.internal.m.f(sink, "sink");
        while (j11 >= 0) {
            if (this.f40755d) {
                throw new IllegalStateException("closed");
            }
            d0 d0Var = this.f40752a;
            Inflater inflater = this.f40753b;
            if (j11 == 0) {
                j12 = 0;
            } else {
                try {
                    e0 e0VarG = sink.G(1);
                    int iMin = (int) Math.min(j11, 8192 - e0VarG.f40703c);
                    if (inflater.needsInput() && !d0Var.R()) {
                        e0 e0Var = d0Var.f40691b.f40717a;
                        kotlin.jvm.internal.m.c(e0Var);
                        int i11 = e0Var.f40703c;
                        int i12 = e0Var.f40702b;
                        int i13 = i11 - i12;
                        this.f40754c = i13;
                        inflater.setInput(e0Var.f40701a, i12, i13);
                    }
                    int iInflate = inflater.inflate(e0VarG.f40701a, e0VarG.f40703c, iMin);
                    int i14 = this.f40754c;
                    if (i14 != 0) {
                        int remaining = i14 - inflater.getRemaining();
                        this.f40754c -= remaining;
                        d0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        e0VarG.f40703c += iInflate;
                        j12 = iInflate;
                        sink.f40718b += j12;
                    } else {
                        if (e0VarG.f40702b == e0VarG.f40703c) {
                            sink.f40717a = e0VarG.a();
                            f0.a(e0VarG);
                        }
                        j12 = 0;
                    }
                } catch (DataFormatException e8) {
                    throw new IOException(e8);
                }
            }
            if (j12 > 0) {
                return j12;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (d0Var.R()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
    }

    @Override // m00.i0
    public final k0 timeout() {
        return this.f40752a.f40690a.timeout();
    }
}
