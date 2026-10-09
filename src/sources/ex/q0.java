package ex;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends o0 {
    private static final long serialVersionUID = -6022804456014692607L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n20.b f26057d;

    public q0(n20.b bVar, Iterator it) {
        super(it);
        this.f26057d = bVar;
    }

    @Override // ex.o0
    public final void b() {
        Iterator it = this.f26053a;
        n20.b bVar = this.f26057d;
        while (!this.f26054b) {
            try {
                Object next = it.next();
                if (this.f26054b) {
                    return;
                }
                if (next == null) {
                    bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                bVar.onNext(next);
                if (this.f26054b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.f26054b) {
                            return;
                        }
                        bVar.onComplete();
                        return;
                    }
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    bVar.onError(th2);
                    return;
                }
            } catch (Throwable th3) {
                fb.g0.D(th3);
                bVar.onError(th3);
                return;
            }
        }
    }

    @Override // ex.o0
    public final void c(long j11) {
        Iterator it = this.f26053a;
        n20.b bVar = this.f26057d;
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
                            bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        bVar.onNext(next);
                        if (this.f26054b) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.f26054b) {
                                    return;
                                }
                                bVar.onComplete();
                                return;
                            }
                            j12++;
                        } catch (Throwable th2) {
                            fb.g0.D(th2);
                            bVar.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        fb.g0.D(th3);
                        bVar.onError(th3);
                        return;
                    }
                }
            }
            j11 = addAndGet(-j12);
        } while (j11 != 0);
    }
}
