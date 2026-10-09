package m00;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40683c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f40681a = i11;
        this.f40682b = obj;
        this.f40683c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[LOOP:1: B:12:0x0065->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // m00.h0
    public final void K0(i source, long j11) {
        n00.f fVar;
        switch (this.f40681a) {
            case 0:
                kotlin.jvm.internal.m.f(source, "source");
                b.e(source.f40718b, 0L, j11);
                long j12 = j11;
                while (true) {
                    long j13 = 0;
                    if (j12 <= 0) {
                        return;
                    }
                    e0 e0Var = source.f40717a;
                    kotlin.jvm.internal.m.c(e0Var);
                    try {
                        try {
                            while (j13 < 65536) {
                                j13 += (long) (e0Var.f40703c - e0Var.f40702b);
                                if (j13 >= j12) {
                                    j13 = j12;
                                    fVar = (n00.f) this.f40682b;
                                    c cVar = (c) this.f40683c;
                                    fVar.h();
                                    cVar.K0(source, j13);
                                    if (!fVar.i()) {
                                        throw fVar.k(null);
                                    }
                                    j12 -= j13;
                                } else {
                                    e0Var = e0Var.f40706f;
                                    kotlin.jvm.internal.m.c(e0Var);
                                }
                            }
                            cVar.K0(source, j13);
                            if (!fVar.i()) {
                                throw fVar.k(null);
                            }
                            j12 -= j13;
                        } catch (IOException e8) {
                            if (!fVar.i()) {
                                throw e8;
                            }
                            throw fVar.k(e8);
                        }
                    } catch (Throwable th2) {
                        fVar.i();
                        throw th2;
                    }
                    fVar = (n00.f) this.f40682b;
                    c cVar2 = (c) this.f40683c;
                    fVar.h();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(source, "source");
                b.e(source.f40718b, 0L, j11);
                while (j11 > 0) {
                    ((k0) this.f40683c).f();
                    e0 e0Var2 = source.f40717a;
                    kotlin.jvm.internal.m.c(e0Var2);
                    int iMin = (int) Math.min(j11, e0Var2.f40703c - e0Var2.f40702b);
                    ((OutputStream) this.f40682b).write(e0Var2.f40701a, e0Var2.f40702b, iMin);
                    int i11 = e0Var2.f40702b + iMin;
                    e0Var2.f40702b = i11;
                    long j14 = iMin;
                    j11 -= j14;
                    source.f40718b -= j14;
                    if (i11 == e0Var2.f40703c) {
                        source.f40717a = e0Var2.a();
                        f0.a(e0Var2);
                    }
                }
                return;
        }
    }

    @Override // m00.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f40681a) {
            case 0:
                n00.f fVar = (n00.f) this.f40682b;
                c cVar = (c) this.f40683c;
                fVar.h();
                try {
                    try {
                        cVar.close();
                        if (fVar.i()) {
                            throw fVar.k(null);
                        }
                        return;
                    } catch (IOException e8) {
                        if (!fVar.i()) {
                            throw e8;
                        }
                        throw fVar.k(e8);
                    }
                } catch (Throwable th2) {
                    fVar.i();
                    throw th2;
                }
            default:
                ((OutputStream) this.f40682b).close();
                return;
        }
    }

    @Override // m00.h0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f40681a) {
            case 0:
                n00.f fVar = (n00.f) this.f40682b;
                c cVar = (c) this.f40683c;
                fVar.h();
                try {
                    try {
                        cVar.flush();
                        if (fVar.i()) {
                            throw fVar.k(null);
                        }
                        return;
                    } catch (IOException e8) {
                        if (!fVar.i()) {
                            throw e8;
                        }
                        throw fVar.k(e8);
                    }
                } catch (Throwable th2) {
                    fVar.i();
                    throw th2;
                }
            default:
                ((OutputStream) this.f40682b).flush();
                return;
        }
    }

    @Override // m00.h0
    public final k0 timeout() {
        switch (this.f40681a) {
            case 0:
                return (n00.f) this.f40682b;
            default:
                return (k0) this.f40683c;
        }
    }

    public final String toString() {
        switch (this.f40681a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f40683c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f40682b) + ')';
        }
    }
}
