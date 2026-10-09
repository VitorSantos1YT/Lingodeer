package z00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f58449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f58450b;

    public u(t tVar, t tVar2) {
        this.f58449a = tVar;
        this.f58450b = tVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        t tVar = this.f58449a;
        return (tVar == null || tVar == this.f58450b) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        t tVar = this.f58449a;
        this.f58449a = tVar.f58447e;
        return tVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
