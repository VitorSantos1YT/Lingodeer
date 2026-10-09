package ex;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends AtomicLong implements n20.c {
    private static final long serialVersionUID = -4453897557930727610L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f25987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e1 f25988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25989c;

    public d1(n20.b bVar) {
        this.f25987a = bVar;
    }

    @Override // n20.c
    public final void cancel() {
        e1 e1Var;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (e1Var = this.f25988b) == null) {
            return;
        }
        e1Var.f(this);
        e1Var.b();
    }

    @Override // n20.c
    public final void request(long j11) {
        long j12;
        if (mx.g.c(j11)) {
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE || j12 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j12, ue.f.j(j12, j11)));
            e1 e1Var = this.f25988b;
            if (e1Var != null) {
                e1Var.b();
            }
        }
    }
}
