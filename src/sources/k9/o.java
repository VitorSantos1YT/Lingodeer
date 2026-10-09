package k9;

import j9.b0;
import j9.c0;
import j9.y;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@b0("dialog")
public final class o extends c0 {
    @Override // j9.c0
    public final j9.q a() {
        t1.d dVar = e.f37979a;
        return new n(this);
    }

    @Override // j9.c0
    public final void d(List list, y yVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((j9.e) it.next());
        }
    }

    @Override // j9.c0
    public final void e(j9.e eVar, boolean z11) {
        b().e(eVar, z11);
        int iU0 = ry.m.u0((Iterable) b().f36207f.f53391a.getValue(), eVar);
        int i11 = 0;
        for (Object obj : (Iterable) b().f36207f.f53391a.getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            j9.e eVar2 = (j9.e) obj;
            if (i11 > iU0) {
                b().c(eVar2);
            }
            i11 = i12;
        }
    }
}
