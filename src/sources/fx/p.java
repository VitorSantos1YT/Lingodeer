package fx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends uw.h implements bx.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28257a;

    public p(Object obj) {
        this.f28257a = obj;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        iVar.b(zw.b.INSTANCE);
        iVar.onSuccess(this.f28257a);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f28257a;
    }
}
