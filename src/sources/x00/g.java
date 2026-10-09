package x00;

import java.util.BitSet;
import w00.k;
import z00.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements b10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.f f55627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.f f55628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.f f55629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.f f55630d;

    static {
        hd.d dVarD = a5.f.d();
        dVarD.x('0', '9');
        dVarD.x('A', 'F');
        dVarD.x('a', 'f');
        f55627a = new a5.f(dVarD);
        hd.d dVarD2 = a5.f.d();
        dVarD2.x('0', '9');
        f55628b = new a5.f(dVarD2);
        hd.d dVarD3 = a5.f.d();
        dVarD3.x('A', 'Z');
        dVarD3.x('a', 'z');
        a5.f fVar = new a5.f(dVarD3);
        f55629c = fVar;
        hd.d dVarN = fVar.n();
        dVarN.x('0', '9');
        f55630d = new a5.f(dVarN);
    }

    public static qh.d b(a9.e eVar, b10.b bVar) {
        return new qh.d(10, new a0(y00.b.a(bVar.e(eVar, bVar.o()).e())), bVar.o());
    }

    @Override // b10.a
    public final qh.d a(k kVar) {
        b10.b bVar = kVar.f54423h;
        a9.e eVarO = bVar.o();
        bVar.k();
        char cN = bVar.n();
        if (cN != '#') {
            if (!((BitSet) f55629c.f378b).get(cN)) {
                return null;
            }
            bVar.h(f55630d);
            if (bVar.l(';')) {
                return b(eVarO, bVar);
            }
            return null;
        }
        bVar.k();
        if (bVar.l('x') || bVar.l('X')) {
            int iH = bVar.h(f55627a);
            if (1 > iH || iH > 6 || !bVar.l(';')) {
                return null;
            }
            return b(eVarO, bVar);
        }
        int iH2 = bVar.h(f55628b);
        if (1 > iH2 || iH2 > 7 || !bVar.l(';')) {
            return null;
        }
        return b(eVarO, bVar);
    }
}
