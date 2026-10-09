package ay;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements qx.k, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx.f f3291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f3292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rx.b f3294f;

    public f(qx.k kVar, int i11, tx.f fVar) {
        this.f3289a = kVar;
        this.f3290b = i11;
        this.f3291c = fVar;
    }

    public final boolean a() {
        try {
            Object obj = this.f3291c.get();
            Objects.requireNonNull(obj, "Empty buffer supplied");
            this.f3292d = (Collection) obj;
            return true;
        } catch (Throwable th2) {
            ef.e.E(th2);
            this.f3292d = null;
            rx.b bVar = this.f3294f;
            qx.k kVar = this.f3289a;
            if (bVar == null) {
                ux.c.e(th2, kVar);
                return false;
            }
            bVar.dispose();
            kVar.onError(th2);
            return false;
        }
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3294f.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3294f, bVar)) {
            this.f3294f = bVar;
            this.f3289a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.f3294f.dispose();
    }

    @Override // qx.k
    public final void onComplete() {
        Collection collection = this.f3292d;
        if (collection != null) {
            this.f3292d = null;
            boolean zIsEmpty = collection.isEmpty();
            qx.k kVar = this.f3289a;
            if (!zIsEmpty) {
                kVar.onNext(collection);
            }
            kVar.onComplete();
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        this.f3292d = null;
        this.f3289a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        Collection collection = this.f3292d;
        if (collection != null) {
            collection.add(obj);
            int i11 = this.f3293e + 1;
            this.f3293e = i11;
            if (i11 >= this.f3290b) {
                this.f3289a.onNext(collection);
                this.f3293e = 0;
                a();
            }
        }
    }
}
