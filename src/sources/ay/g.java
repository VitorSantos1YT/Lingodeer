package ay;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicBoolean implements qx.k, rx.b {
    private static final long serialVersionUID = -8223395059921494546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tx.f f3304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rx.b f3305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3306f = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3307t;

    public g(qx.k kVar, int i11, int i12, tx.f fVar) {
        this.f3301a = kVar;
        this.f3302b = i11;
        this.f3303c = i12;
        this.f3304d = fVar;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f3305e.b();
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3305e, bVar)) {
            this.f3305e = bVar;
            this.f3301a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.f3305e.dispose();
    }

    @Override // qx.k
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f3306f;
            boolean zIsEmpty = arrayDeque.isEmpty();
            qx.k kVar = this.f3301a;
            if (zIsEmpty) {
                kVar.onComplete();
                return;
            }
            kVar.onNext(arrayDeque.poll());
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        this.f3306f.clear();
        this.f3301a.onError(th2);
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        long j11 = this.f3307t;
        this.f3307t = 1 + j11;
        long j12 = j11 % ((long) this.f3303c);
        qx.k kVar = this.f3301a;
        ArrayDeque arrayDeque = this.f3306f;
        if (j12 == 0) {
            try {
                Object obj2 = this.f3304d.get();
                if (obj2 == null) {
                    throw gy.f.a("The bufferSupplier returned a null Collection.");
                }
                gy.e eVar = gy.f.f29893a;
                arrayDeque.offer((Collection) obj2);
            } catch (Throwable th2) {
                ef.e.E(th2);
                arrayDeque.clear();
                this.f3305e.dispose();
                kVar.onError(th2);
                return;
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) it.next();
            collection.add(obj);
            if (this.f3302b <= collection.size()) {
                it.remove();
                kVar.onNext(collection);
            }
        }
    }
}
