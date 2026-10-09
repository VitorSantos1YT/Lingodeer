package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends k {
    private static final long serialVersionUID = 4127754106204442833L;

    public abstract void g();

    @Override // uw.e
    public final void onNext(Object obj) {
        if (this.f26037b.a()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() == 0) {
            g();
        } else {
            this.f26036a.onNext(obj);
            ue.f.A(this, 1L);
        }
    }
}
