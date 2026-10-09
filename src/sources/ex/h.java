package ex;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AtomicBoolean implements n20.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f26013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26014b;

    public h(Object obj, n20.b bVar) {
        this.f26014b = obj;
        this.f26013a = bVar;
    }

    @Override // n20.c
    public final void request(long j11) {
        if (j11 <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.f26014b;
        n20.b bVar = this.f26013a;
        bVar.onNext(obj);
        bVar.onComplete();
    }

    @Override // n20.c
    public final void cancel() {
    }
}
