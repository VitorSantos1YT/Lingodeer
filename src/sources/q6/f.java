package q6;

import b1.p;
import java.util.List;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    @Override // q6.g
    public final g a(p pVar) {
        sy.c cVarO = o.o();
        List list = this.f47484a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVarO.add(((c) list.get(i11)).e(pVar));
        }
        sy.c cubics = o.e(cVarO);
        kotlin.jvm.internal.m.f(cubics, "cubics");
        return new f(cubics);
    }

    public final String toString() {
        return "Edge";
    }
}
