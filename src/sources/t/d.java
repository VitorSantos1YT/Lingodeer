package t;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f51971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f51972b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f51973c;

    public d(f fVar) {
        this.f51973c = fVar;
    }

    @Override // t.e
    public final void a(c cVar) {
        c cVar2 = this.f51971a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f51970d;
            this.f51971a = cVar3;
            this.f51972b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f51972b) {
            return this.f51973c.f51974a != null;
        }
        c cVar = this.f51971a;
        return (cVar == null || cVar.f51969c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f51972b) {
            this.f51972b = false;
            this.f51971a = this.f51973c.f51974a;
        } else {
            c cVar = this.f51971a;
            this.f51971a = cVar != null ? cVar.f51969c : null;
        }
        return this.f51971a;
    }
}
