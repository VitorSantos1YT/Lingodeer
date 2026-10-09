package t;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f51964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f51965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f51966c;

    public b(c cVar, c cVar2, int i11) {
        this.f51966c = i11;
        this.f51964a = cVar2;
        this.f51965b = cVar;
    }

    @Override // t.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f51964a == cVar && cVar == this.f51965b) {
            this.f51965b = null;
            this.f51964a = null;
        }
        c cVar3 = this.f51964a;
        if (cVar3 == cVar) {
            switch (this.f51966c) {
                case 0:
                    cVar2 = cVar3.f51970d;
                    break;
                default:
                    cVar2 = cVar3.f51969c;
                    break;
            }
            this.f51964a = cVar2;
        }
        c cVar4 = this.f51965b;
        if (cVar4 == cVar) {
            c cVar5 = this.f51964a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f51965b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f51966c) {
            case 0:
                return cVar.f51969c;
            default:
                return cVar.f51970d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51965b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f51965b;
        c cVar2 = this.f51964a;
        this.f51965b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
