package tg;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements fz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f52391b = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f52392c = new x(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52393a;

    public /* synthetic */ x(int i11) {
        this.f52393a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qy.l lVar;
        long jE;
        switch (this.f52393a) {
            case 0:
                b0 infoPanelType = (b0) obj;
                ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(infoPanelType, "infoPanelType");
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(-1998730632);
                sVar.d0(-666834869);
                Object objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    int i11 = w.f52388a[infoPanelType.ordinal()];
                    if (i11 == 1) {
                        lVar = new qy.l(new g2.x(g2.f0.e(4290304767L)), new g2.x(g2.f0.e(4291618303L)));
                    } else if (i11 == 2) {
                        lVar = new qy.l(new g2.x(g2.f0.e(4292270299L)), new g2.x(g2.f0.e(4293059557L)));
                    } else if (i11 == 3) {
                        lVar = new qy.l(new g2.x(g2.f0.e(4291028683L)), new g2.x(g2.f0.e(4292144602L)));
                    } else if (i11 == 4) {
                        lVar = new qy.l(new g2.x(g2.f0.e(4294297291L)), new g2.x(g2.f0.e(4294498266L)));
                    } else {
                        if (i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lVar = new qy.l(new g2.x(g2.f0.e(4294962874L)), new g2.x(g2.f0.e(4294964173L)));
                    }
                    long j11 = ((g2.x) lVar.f48495a).f28624a;
                    float f5 = 4;
                    objQ = d0.n.h(d0.n.j(z1.o.f58481a, 1, j11, r0.f.d(f5)), ((g2.x) lVar.f48496b).f28624a, r0.f.d(f5));
                    sVar.o0(objQ);
                }
                z1.r rVar = (z1.r) objQ;
                sVar.p(false);
                sVar.p(false);
                return rVar;
            default:
                b0 infoPanelType2 = (b0) obj;
                ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(infoPanelType2, "infoPanelType");
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                sVar2.d0(818489191);
                sVar2.d0(757418463);
                Object objQ2 = sVar2.Q();
                if (objQ2 == l1.m.f39353a) {
                    int i12 = y.f52395a[infoPanelType2.ordinal()];
                    if (i12 == 1) {
                        jE = g2.f0.e(4278206597L);
                    } else if (i12 == 2) {
                        jE = g2.f0.e(4281875777L);
                    } else if (i12 == 3) {
                        jE = g2.f0.e(4279588644L);
                    } else if (i12 == 4) {
                        jE = g2.f0.e(4285668388L);
                    } else {
                        if (i12 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jE = g2.f0.e(4286931972L);
                    }
                    j3.y0 y0Var = new j3.y0(jE, 0L, null, null, 0L, 0, 0L, 16777214);
                    sVar2.o0(y0Var);
                    objQ2 = y0Var;
                }
                j3.y0 y0Var2 = (j3.y0) objQ2;
                sVar2.p(false);
                sVar2.p(false);
                return y0Var2;
        }
    }
}
