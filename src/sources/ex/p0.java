package ex;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends o0 {
    private static final long serialVersionUID = -6022804456014692607L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx.a f26056d;

    public p0(bx.a aVar, Iterator it) {
        super(it);
        this.f26056d = aVar;
    }

    @Override // ex.o0
    public final void b() {
        Iterator it = this.f26053a;
        bx.a aVar = this.f26056d;
        while (!this.f26054b) {
            try {
                Object next = it.next();
                if (this.f26054b) {
                    return;
                }
                if (next == null) {
                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                aVar.d(next);
                if (this.f26054b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.f26054b) {
                            return;
                        }
                        aVar.onComplete();
                        return;
                    }
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    aVar.onError(th2);
                    return;
                }
            } catch (Throwable th3) {
                fb.g0.D(th3);
                aVar.onError(th3);
                return;
            }
        }
    }

    @Override // ex.o0
    public final void c(long j11) {
        Iterator it = this.f26053a;
        bx.a aVar = this.f26056d;
        do {
            long j12 = 0;
            while (true) {
                if (j12 == j11) {
                    j11 = get();
                    if (j12 == j11) {
                        break;
                    }
                } else {
                    if (this.f26054b) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        if (this.f26054b) {
                            return;
                        }
                        if (next == null) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        boolean zD = aVar.d(next);
                        if (this.f26054b) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.f26054b) {
                                    return;
                                }
                                aVar.onComplete();
                                return;
                            } else if (zD) {
                                j12++;
                            }
                        } catch (Throwable th2) {
                            fb.g0.D(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        fb.g0.D(th3);
                        aVar.onError(th3);
                        return;
                    }
                }
            }
            j11 = addAndGet(-j12);
        } while (j11 != 0);
    }
}
