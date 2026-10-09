package t;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f51963e = new HashMap();

    @Override // t.f
    public final c b(Object obj) {
        return (c) this.f51963e.get(obj);
    }

    @Override // t.f
    public final Object d(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f51968b;
        }
        c cVar = new c(obj, obj2);
        this.f51977d++;
        c cVar2 = this.f51975b;
        if (cVar2 == null) {
            this.f51974a = cVar;
            this.f51975b = cVar;
        } else {
            cVar2.f51969c = cVar;
            cVar.f51970d = cVar2;
            this.f51975b = cVar;
        }
        this.f51963e.put(obj, cVar);
        return null;
    }

    @Override // t.f
    public final Object e(Object obj) {
        Object objE = super.e(obj);
        this.f51963e.remove(obj);
        return objE;
    }
}
