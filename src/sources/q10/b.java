package q10;

import l1.d0;
import l1.n;
import l1.s;
import l1.v0;
import ns.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f47394a;

    static {
        new v0(new d(14));
        f47394a = new d0(new d(15));
    }

    public static final e20.a a(n nVar) {
        e20.a aVar;
        d0 d0Var = f47394a;
        s sVar = (s) nVar;
        sVar.d0(1668867238);
        try {
            a aVar2 = (a) sVar.j(d0Var);
            if (aVar2.f47393b == null) {
                aVar2.f47393b = aVar2.f47392a.invoke();
            }
            Object obj = aVar2.f47393b;
            if (obj == null) {
                throw new IllegalStateException("Can't retrieve value for ");
            }
            aVar = (e20.a) obj;
            sVar.p(false);
            return aVar;
        } catch (Exception e8) {
            a aVar3 = (a) sVar.j(d0Var);
            Object objInvoke = aVar3.f47392a.invoke();
            aVar3.f47393b = objInvoke;
            e20.a aVar4 = (e20.a) objInvoke;
            if (aVar4 == null) {
                throw new IllegalStateException(("Can't get Koin scope due to error: " + e8).toString());
            }
            aVar = aVar4;
        }
    }
}
