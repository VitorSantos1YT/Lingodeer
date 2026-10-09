package nz;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f44305a;

    public a(l lVar) {
        this.f44305a = new AtomicReference(lVar);
    }

    @Override // nz.l
    public final Iterator iterator() {
        l lVar = (l) this.f44305a.getAndSet(null);
        if (lVar != null) {
            return lVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
