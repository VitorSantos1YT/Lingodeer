package m00;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f40734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40736c;

    public n(w wVar, long j11) {
        this.f40734a = wVar;
        this.f40735b = j11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f40734a;
        if (this.f40736c) {
            return;
        }
        this.f40736c = true;
        ReentrantLock reentrantLock = wVar.f40758c;
        reentrantLock.lock();
        try {
            int i11 = wVar.f40757b - 1;
            wVar.f40757b = i11;
            if (i11 == 0 && wVar.f40756a) {
                reentrantLock.unlock();
                synchronized (wVar) {
                    wVar.f40759d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // m00.i0
    public final long read(i sink, long j11) {
        long j12;
        long j13;
        int i11;
        kotlin.jvm.internal.m.f(sink, "sink");
        if (this.f40736c) {
            throw new IllegalStateException("closed");
        }
        w wVar = this.f40734a;
        long j14 = this.f40735b;
        if (j11 < 0) {
            throw new IllegalArgumentException(defpackage.e.h(j11, "byteCount < 0: ").toString());
        }
        long j15 = j11 + j14;
        long j16 = j14;
        while (true) {
            if (j16 < j15) {
                e0 e0VarG = sink.G(1);
                byte[] array = e0VarG.f40701a;
                int i12 = e0VarG.f40703c;
                j12 = -1;
                int iMin = (int) Math.min(j15 - j16, 8192 - i12);
                synchronized (wVar) {
                    kotlin.jvm.internal.m.f(array, "array");
                    wVar.f40759d.seek(j16);
                    i11 = 0;
                    while (true) {
                        if (i11 < iMin) {
                            int i13 = wVar.f40759d.read(array, i12, iMin - i11);
                            if (i13 != -1) {
                                i11 += i13;
                            } else if (i11 == 0) {
                                i11 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i11 == -1) {
                    if (e0VarG.f40702b == e0VarG.f40703c) {
                        sink.f40717a = e0VarG.a();
                        f0.a(e0VarG);
                    }
                    if (j14 == j16) {
                        j13 = -1;
                        break;
                    }
                } else {
                    e0VarG.f40703c += i11;
                    long j17 = i11;
                    j16 += j17;
                    sink.f40718b += j17;
                }
            } else {
                j12 = -1;
            }
            j13 = j16 - j14;
            break;
        }
        if (j13 != j12) {
            this.f40735b += j13;
        }
        return j13;
    }

    @Override // m00.i0
    public final k0 timeout() {
        return k0.f40719d;
    }
}
