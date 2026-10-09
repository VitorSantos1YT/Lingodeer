package hx;

import ob.l;
import uw.o;
import uw.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33832c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f33830a = i11;
        this.f33831b = obj;
        this.f33832c = obj2;
    }

    @Override // uw.o
    public final void b(p pVar) {
        switch (this.f33830a) {
            case 0:
                ((d) this.f33831b).J(new a(pVar, (ax.b) this.f33832c));
                break;
            case 1:
                ((o) this.f33831b).a(new l(this, pVar));
                break;
            default:
                ((o) this.f33831b).a(new ix.c(pVar, (ax.c) this.f33832c));
                break;
        }
    }
}
