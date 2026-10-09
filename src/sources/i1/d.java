package i1;

import androidx.lifecycle.LifecycleOwner;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(LifecycleOwner lifecycleOwner, fz.c cVar, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1868327245);
        int i12 = (sVar.h(lifecycleOwner) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            boolean zH = ((i12 & 112) == 32) | sVar.h(lifecycleOwner) | ((i12 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new a(lifecycleOwner, cVar, aVar);
                sVar.o0(objQ);
            }
            l1.t.c(lifecycleOwner, (fz.c) objQ, sVar);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b(lifecycleOwner, cVar, aVar, i11);
        }
    }
}
