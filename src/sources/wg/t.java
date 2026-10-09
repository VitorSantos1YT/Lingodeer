package wg;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    static {
        w1.j.b(new mt.r(new s(2), 20), new s0.a(new m(1, 1), 18));
    }

    public static final r a(String data, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar = (l1.s) nVar;
        sVar.e0(1540801314);
        String str = (i11 & 2) != 0 ? null : "https://www.lingodeer.com/";
        String str2 = (i11 & 8) != 0 ? null : MzwEyWCkjXL.MJECyZpWocjuF;
        String str3 = (i11 & 16) != 0 ? null : "https://www.lingodeer.com/";
        sVar.e0(-492369756);
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = new r(new g(data, str, str2, str3));
            sVar.o0(objQ);
        }
        sVar.p(false);
        r rVar = (r) objQ;
        g gVar = new g(data, str, str2, str3);
        rVar.getClass();
        rVar.f55163b.setValue(gVar);
        sVar.p(false);
        return rVar;
    }
}
