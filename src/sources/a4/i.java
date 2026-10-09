package a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f350d;

    public final void a(Object obj) {
        this.f350d = true;
        l lVar = this.f348b;
        if (lVar == null || !lVar.f352b.k(obj)) {
            return;
        }
        this.f347a = null;
        this.f348b = null;
        this.f349c = null;
    }

    public final void b(Throwable th2) {
        this.f350d = true;
        l lVar = this.f348b;
        if (lVar == null || !lVar.f352b.l(th2)) {
            return;
        }
        this.f347a = null;
        this.f348b = null;
        this.f349c = null;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.f348b;
        if (lVar != null) {
            k kVar = lVar.f352b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f347a, 1));
            }
        }
        if (this.f350d || (nVar = this.f349c) == null) {
            return;
        }
        nVar.k(null);
    }
}
