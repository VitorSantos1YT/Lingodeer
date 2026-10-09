package v10;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53481b;

    @Override // v10.b
    public final Object a(oi.c cVar) {
        Object obj = this.f53481b;
        if (obj == null) {
            return super.a(cVar);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // v10.b
    public final Object b(oi.c cVar) {
        synchronized (this) {
            if (this.f53481b == null) {
                this.f53481b = a(cVar);
            }
        }
        Object obj = this.f53481b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
