package tg;

import java.util.Iterator;
import java.util.List;
import w2.f1;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f52369b;

    public t(int i11, float f5) {
        this.f52368a = i11;
        this.f52369b = f5;
    }

    @Override // w2.q0
    public final w2.r0 e(final w2.s0 Layout, List measurables, long j11) {
        Object next;
        kotlin.jvm.internal.m.f(Layout, "$this$Layout");
        kotlin.jvm.internal.m.f(measurables, "measurables");
        int size = measurables.size();
        int i11 = this.f52368a;
        if (size != i11 * 2) {
            throw new IllegalStateException("Check failed.");
        }
        nz.l lVarY = nz.n.Y(ry.m.g0(measurables), i11);
        nz.l lVarQ = nz.n.Q(ry.m.g0(measurables), i11);
        final List listZ = nz.n.Z(nz.n.W(lVarY, new st.a(10)));
        Iterator it = listZ.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i12 = ((g1) next).f54501a;
                do {
                    Object next3 = it.next();
                    int i13 = ((g1) next3).f54501a;
                    if (i12 < i13) {
                        next = next3;
                        i12 = i13;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.m.c(next);
        final g1 g1Var = (g1) next;
        int iH = v3.a.h(j11) - g1Var.f54501a;
        int i14 = 0;
        final List listZ2 = nz.n.Z(nz.n.W(lVarQ, new au.o(v3.a.a(0, iH < 0 ? 0 : iH, 0, 0, 13, j11), 22)));
        Iterator it2 = listZ2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i15 = ((g1) next2).f54501a;
                do {
                    Object next4 = it2.next();
                    int i16 = ((g1) next4).f54501a;
                    if (i15 < i16) {
                        next2 = next4;
                        i15 = i16;
                    }
                } while (it2.hasNext());
            }
        }
        kotlin.jvm.internal.m.c(next2);
        int i17 = g1Var.f54501a + ((g1) next2).f54501a;
        Iterator it3 = listZ2.iterator();
        int i18 = 0;
        while (it3.hasNext()) {
            i18 += ((g1) it3.next()).f54502b;
        }
        int size2 = listZ2.size() - 1;
        float f5 = this.f52369b;
        int iN0 = (Layout.n0(f5) * size2) + i18;
        Iterator it4 = listZ.iterator();
        while (it4.hasNext()) {
            i14 += ((g1) it4.next()).f54502b;
        }
        int iMax = Math.max(iN0, (Layout.n0(f5) * (listZ.size() - 1)) + i14);
        final int i19 = this.f52368a;
        final float f11 = this.f52369b;
        return Layout.q0(i17, iMax, ry.s.f50855a, new fz.c() { // from class: tg.s
            @Override // fz.c
            public final Object invoke(Object obj) {
                f1 layout = (f1) obj;
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                int i21 = 0;
                for (int i22 = 0; i22 < i19; i22++) {
                    g1 g1Var2 = (g1) listZ.get(i22);
                    g1 g1Var3 = (g1) listZ2.get(i22);
                    int iMax2 = Math.max(g1Var2.f54502b, g1Var3.f54502b);
                    w2.s0 s0Var = Layout;
                    int iN1 = s0Var.n0(f11) + iMax2;
                    v3.m layoutDirection = s0Var.getLayoutDirection();
                    float f12 = 0 / 2.0f;
                    float f13 = 1.0f;
                    if (layoutDirection != v3.m.Ltr) {
                        f13 = 1.0f * (-1);
                    }
                    float f14 = 1;
                    long jRound = (((long) Math.round((f13 + f14) * f12)) << 32) | (((long) Math.round((f14 - 1.0f) * f12)) & 4294967295L);
                    f1.k(layout, g1Var2, (int) (jRound >> 32), ((int) (jRound & 4294967295L)) + i21);
                    f1.k(layout, g1Var3, g1Var.f54501a, i21);
                    i21 += iN1;
                }
                return qy.b0.f48488a;
            }
        });
    }
}
