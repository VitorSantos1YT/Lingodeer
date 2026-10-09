package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends k {
    private static final long serialVersionUID = 3776720187248809713L;

    @Override // uw.e
    public final void onNext(Object obj) {
        long j11;
        if (this.f26037b.a()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.f26036a.onNext(obj);
        do {
            j11 = get();
            if (j11 == 0) {
                return;
            }
        } while (!compareAndSet(j11, j11 - 1));
    }
}
