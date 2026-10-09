package iv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f34788a = new n();

    @Override // w2.q0
    public final w2.r0 e(w2.s0 Layout, List measurables, long j11) {
        kotlin.jvm.internal.m.f(Layout, "$this$Layout");
        kotlin.jvm.internal.m.f(measurables, "measurables");
        ArrayList arrayList = new ArrayList(ry.n.W(measurables, 10));
        Iterator it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((w2.p0) it.next()).B(v3.a.a(0, 0, 0, 0, 10, j11)));
        }
        w2.g1 g1Var = (w2.g1) arrayList.get(0);
        int i11 = 1;
        w2.g1 g1Var2 = (w2.g1) arrayList.get(1);
        w2.g1 g1Var3 = (w2.g1) arrayList.get(2);
        w2.g1 g1Var4 = (w2.g1) arrayList.get(3);
        w2.g1 g1Var5 = (w2.g1) arrayList.get(4);
        w2.g1 g1Var6 = (w2.g1) arrayList.get(5);
        List listK0 = ry.m.k0(arrayList, 6);
        float f5 = 4;
        int iN0 = Layout.n0(f5);
        int iN1 = Layout.n0(12);
        int iN2 = Layout.n0(f5);
        ArrayList arrayList2 = new ArrayList(ry.n.W(listK0, 10));
        Iterator it2 = listK0.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            int i13 = i11;
            int i14 = ((w2.g1) it2.next()).f54501a;
            arrayList2.add(hz.b.U(i12, i14 + i12));
            i12 = i14 + iN0 + i12;
            i11 = i13;
        }
        int i15 = i11;
        Iterator it3 = listK0.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i16 = ((w2.g1) it3.next()).f54502b;
        while (it3.hasNext()) {
            int i17 = ((w2.g1) it3.next()).f54502b;
            if (i16 < i17) {
                i16 = i17;
            }
        }
        int iMax = Math.max(g1Var.f54502b, g1Var3.f54502b);
        int iMax2 = Math.max(g1Var2.f54502b, g1Var4.f54502b) + iMax + iN1;
        int i18 = iMax2 + i16 + iN2;
        int i19 = g1Var5.f54502b + i18;
        int i21 = g1Var6.f54502b + i19;
        lz.g gVar = (lz.g) arrayList2.get(0);
        int i22 = o.f34795d;
        int i23 = ((gVar.f40532a + gVar.f40533b) + 1) / 2;
        lz.g gVar2 = (lz.g) arrayList2.get(i15);
        int i24 = ((gVar2.f40532a + gVar2.f40533b) + 1) / 2;
        lz.g gVar3 = (lz.g) arrayList2.get(2);
        int i25 = ((gVar3.f40532a + gVar3.f40533b) + 1) / 2;
        sy.c cVarO = ns.o.o();
        int i26 = i16;
        cVarO.add(new h1(i23 - (g1Var.f54501a / 2), 0, g1Var));
        cVarO.add(new h1(i23 - (g1Var2.f54501a / 2), iMax, g1Var2));
        cVarO.add(new h1(i25 - (g1Var3.f54501a / 2), 0, g1Var3));
        cVarO.add(new h1(i25 - (g1Var4.f54501a / 2), iMax, g1Var4));
        cVarO.add(new h1(i24 - (g1Var5.f54501a / 2), i18, g1Var5));
        cVarO.add(new h1(i24 - (g1Var6.f54501a / 2), i19, g1Var6));
        int i27 = 0;
        for (Object obj : listK0) {
            int i28 = i27 + 1;
            if (i27 < 0) {
                ns.o.V();
                throw null;
            }
            w2.g1 g1Var7 = (w2.g1) obj;
            cVarO.add(new h1(((lz.g) arrayList2.get(i27)).f40532a, ((i26 - g1Var7.f54502b) / 2) + iMax2, g1Var7));
            i27 = i28;
        }
        final sy.c cVarE = ns.o.e(cVarO);
        sy.a aVar = (sy.a) cVarE.listIterator(0);
        if (!aVar.hasNext()) {
            throw new NoSuchElementException();
        }
        final int i29 = ((h1) aVar.next()).f34745b;
        while (aVar.hasNext()) {
            int i30 = ((h1) aVar.next()).f34745b;
            if (i29 > i30) {
                i29 = i30;
            }
        }
        sy.a aVar2 = (sy.a) cVarE.listIterator(0);
        if (!aVar2.hasNext()) {
            throw new NoSuchElementException();
        }
        h1 h1Var = (h1) aVar2.next();
        int i31 = h1Var.f34745b + h1Var.f34744a.f54501a;
        while (aVar2.hasNext()) {
            h1 h1Var2 = (h1) aVar2.next();
            int i32 = h1Var2.f34744a.f54501a + h1Var2.f34745b;
            if (i31 < i32) {
                i31 = i32;
            }
        }
        int i33 = i31 - i29;
        final float fH = (!v3.a.d(j11) || i33 <= v3.a.h(j11)) ? 1.0f : v3.a.h(j11) / i33;
        int iH = v3.a.d(j11) ? v3.a.h(j11) : hz.b.Q(i33 * fH);
        int iQ = hz.b.Q(i21 * fH);
        final int iQ2 = hz.b.Q((iH - (i33 * fH)) / 2.0f);
        return Layout.q0(iH, iQ, ry.s.f50855a, new fz.c() { // from class: iv.l
            @Override // fz.c
            public final Object invoke(Object obj2) {
                w2.f1 layout = (w2.f1) obj2;
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                for (h1 h1Var3 : cVarE) {
                    w2.g1 g1Var8 = h1Var3.f34744a;
                    float f11 = h1Var3.f34745b - i29;
                    float f12 = fH;
                    w2.f1.l(layout, g1Var8, hz.b.Q(f11 * f12) + iQ2, hz.b.Q(h1Var3.f34746c * f12), new m(0, f12), 4);
                }
                return qy.b0.f48488a;
            }
        });
    }
}
