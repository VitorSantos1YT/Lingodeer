package x00;

import z00.a0;
import z00.n;
import z00.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static bq.f a(a9.i iVar, b10.b bVar, String str, String str2) {
        a0 a0Var = (a0) iVar.f517a;
        if (a0Var == null || !a0Var.f58420g.equals("!")) {
            return new bq.f(i.WRAP, new p(str, str2), bVar.o());
        }
        n nVar = new n();
        nVar.f58435g = str;
        nVar.f58436h = str2;
        bq.f fVar = new bq.f(i.WRAP, nVar, bVar.o());
        fVar.f4943a = true;
        return fVar;
    }
}
