package m00;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40687a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40689c;

    public d(InputStream input, k0 k0Var) {
        kotlin.jvm.internal.m.f(input, "input");
        this.f40688b = input;
        this.f40689c = k0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f40687a) {
            case 0:
                n00.f fVar = (n00.f) this.f40688b;
                d dVar = (d) this.f40689c;
                fVar.h();
                try {
                    try {
                        dVar.close();
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
                ((InputStream) this.f40688b).close();
                return;
        }
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        switch (this.f40687a) {
            case 0:
                kotlin.jvm.internal.m.f(sink, "sink");
                n00.f fVar = (n00.f) this.f40688b;
                d dVar = (d) this.f40689c;
                fVar.h();
                try {
                    try {
                        long j12 = dVar.read(sink, j11);
                        if (fVar.i()) {
                            throw fVar.k(null);
                        }
                        return j12;
                    } catch (IOException e8) {
                        if (fVar.i()) {
                            throw fVar.k(e8);
                        }
                        throw e8;
                    }
                } catch (Throwable th2) {
                    fVar.i();
                    throw th2;
                }
            default:
                kotlin.jvm.internal.m.f(sink, "sink");
                if (j11 == 0) {
                    return 0L;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
                }
                try {
                    ((k0) this.f40689c).f();
                    e0 e0VarG = sink.G(1);
                    int i11 = ((InputStream) this.f40688b).read(e0VarG.f40701a, e0VarG.f40703c, (int) Math.min(j11, 8192 - e0VarG.f40703c));
                    if (i11 == -1) {
                        if (e0VarG.f40702b == e0VarG.f40703c) {
                            sink.f40717a = e0VarG.a();
                            f0.a(e0VarG);
                        }
                        return -1L;
                    }
                    e0VarG.f40703c += i11;
                    long j13 = i11;
                    sink.f40718b += j13;
                    return j13;
                } catch (AssertionError e10) {
                    if (n00.j.a(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    @Override // m00.i0
    public final k0 timeout() {
        switch (this.f40687a) {
            case 0:
                return (n00.f) this.f40688b;
            default:
                return (k0) this.f40689c;
        }
    }

    public final String toString() {
        switch (this.f40687a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f40689c) + ')';
            default:
                return "source(" + ((InputStream) this.f40688b) + ')';
        }
    }

    public d(n00.f fVar, d dVar) {
        this.f40688b = fVar;
        this.f40689c = dVar;
    }
}
