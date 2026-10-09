package gs;

import j0.e2;
import j0.u0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs.f f29794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f29796d;

    public /* synthetic */ h(bs.f fVar, String str, fz.c cVar, int i11) {
        this.f29793a = i11;
        this.f29794b = fVar;
        this.f29795c = str;
        this.f29796d = cVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29793a) {
            case 0:
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f5 = 16;
                    j0.c.c(null, j0.i.g(f5), j0.i.g(f5), null, 3, 0, t1.e.d(471426286, new h(this.f29794b, this.f29795c, this.f29796d, 1), sVar), sVar, 1597872, 41);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                u0 FlowRow = (u0) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    for (final bs.e eVar : this.f29794b.f5130e) {
                        boolean zEquals = this.f29795c.equals(eVar.f5125e);
                        final fz.c cVar = this.f29796d;
                        boolean zF = sVar2.f(cVar) | sVar2.f(eVar);
                        Object objQ = sVar2.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            final int i11 = 0;
                            objQ = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                        case 1:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                        case 2:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                        case 3:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                        case 4:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                        default:
                                            cVar.invoke(eVar.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar2.o0(objQ);
                        }
                        a.t(eVar, zEquals, (fz.a) objQ, e2.g(FlowRow.a(z1.o.f58481a, 1.0f), 72), sVar2, 0);
                    }
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l0.c item2 = (l0.c) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    float f11 = 16;
                    j0.c.c(null, j0.i.g(f11), j0.i.g(f11), null, 3, 0, t1.e.d(1802204274, new h(this.f29794b, this.f29795c, this.f29796d, 3), sVar3), sVar3, 1597872, 41);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                u0 FlowRow2 = (u0) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow2, "$this$FlowRow");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(FlowRow2) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    for (final bs.e eVar2 : this.f29794b.f5130e) {
                        boolean zEquals2 = this.f29795c.equals(eVar2.f5125e);
                        final fz.c cVar2 = this.f29796d;
                        boolean zF2 = sVar4.f(cVar2) | sVar4.f(eVar2);
                        Object objQ2 = sVar4.Q();
                        if (zF2 || objQ2 == l1.m.f39353a) {
                            final int i12 = 1;
                            objQ2 = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                        case 1:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                        case 2:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                        case 3:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                        case 4:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                        default:
                                            cVar2.invoke(eVar2.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar4.o0(objQ2);
                        }
                        a.t(eVar2, zEquals2, (fz.a) objQ2, e2.g(FlowRow2.a(z1.o.f58481a, 1.0f), 72), sVar4, 0);
                    }
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l0.c item3 = (l0.c) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    float f12 = 16;
                    j0.c.c(null, j0.i.g(f12), j0.i.g(f12), null, 3, 0, t1.e.d(-1042648576, new h(this.f29794b, this.f29795c, this.f29796d, 5), sVar5), sVar5, 1597872, 41);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                u0 FlowRow3 = (u0) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow3, "$this$FlowRow");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((l1.s) nVar6).f(FlowRow3) ? 4 : 2;
                }
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    for (final bs.e eVar3 : this.f29794b.f5130e) {
                        boolean zEquals3 = this.f29795c.equals(eVar3.f5125e);
                        final fz.c cVar3 = this.f29796d;
                        boolean zF3 = sVar6.f(cVar3) | sVar6.f(eVar3);
                        Object objQ3 = sVar6.Q();
                        if (zF3 || objQ3 == l1.m.f39353a) {
                            final int i13 = 2;
                            objQ3 = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                        case 1:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                        case 2:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                        case 3:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                        case 4:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                        default:
                                            cVar3.invoke(eVar3.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar6.o0(objQ3);
                        }
                        a.t(eVar3, zEquals3, (fz.a) objQ3, e2.g(FlowRow3.a(z1.o.f58481a, 1.0f), 72), sVar6, 0);
                    }
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                l0.c item4 = (l0.c) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    float f13 = 16;
                    j0.c.c(null, j0.i.g(f13), j0.i.g(f13), null, 3, 0, t1.e.d(-818216270, new h(this.f29794b, this.f29795c, this.f29796d, 7), sVar7), sVar7, 1597872, 41);
                } else {
                    sVar7.W();
                }
                break;
            case 7:
                u0 FlowRow4 = (u0) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow4, "$this$FlowRow");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((l1.s) nVar8).f(FlowRow4) ? 4 : 2;
                }
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    for (final bs.e eVar4 : this.f29794b.f5130e) {
                        boolean zEquals4 = this.f29795c.equals(eVar4.f5125e);
                        final fz.c cVar4 = this.f29796d;
                        boolean zF4 = sVar8.f(cVar4) | sVar8.f(eVar4);
                        Object objQ4 = sVar8.Q();
                        if (zF4 || objQ4 == l1.m.f39353a) {
                            final int i14 = 3;
                            objQ4 = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                        case 1:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                        case 2:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                        case 3:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                        case 4:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                        default:
                                            cVar4.invoke(eVar4.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar8.o0(objQ4);
                        }
                        a.t(eVar4, zEquals4, (fz.a) objQ4, e2.g(FlowRow4.a(z1.o.f58481a, 1.0f), 72), sVar8, 0);
                    }
                } else {
                    sVar8.W();
                }
                break;
            case 8:
                l0.c item5 = (l0.c) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item5, "$this$item");
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    float f14 = 16;
                    j0.c.c(null, j0.i.g(f14), j0.i.g(f14), null, 3, 0, t1.e.d(111684608, new h(this.f29794b, this.f29795c, this.f29796d, 9), sVar9), sVar9, 1597872, 41);
                } else {
                    sVar9.W();
                }
                break;
            case 9:
                u0 FlowRow5 = (u0) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow5, "$this$FlowRow");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((l1.s) nVar10).f(FlowRow5) ? 4 : 2;
                }
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    for (final bs.e eVar5 : this.f29794b.f5130e) {
                        boolean zEquals5 = this.f29795c.equals(eVar5.f5125e);
                        final fz.c cVar5 = this.f29796d;
                        boolean zF5 = sVar10.f(cVar5) | sVar10.f(eVar5);
                        Object objQ5 = sVar10.Q();
                        if (zF5 || objQ5 == l1.m.f39353a) {
                            final int i15 = 4;
                            objQ5 = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                        case 1:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                        case 2:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                        case 3:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                        case 4:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                        default:
                                            cVar5.invoke(eVar5.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar10.o0(objQ5);
                        }
                        a.t(eVar5, zEquals5, (fz.a) objQ5, e2.g(FlowRow5.a(z1.o.f58481a, 1.0f), 72), sVar10, 0);
                    }
                } else {
                    sVar10.W();
                }
                break;
            case 10:
                l0.c item6 = (l0.c) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item6, "$this$item");
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    float f15 = 16;
                    j0.c.c(null, j0.i.g(f15), j0.i.g(f15), null, 2, 0, t1.e.d(-1007161418, new h(this.f29794b, this.f29795c, this.f29796d, 11), sVar11), sVar11, 1597872, 41);
                } else {
                    sVar11.W();
                }
                break;
            default:
                u0 FlowRow6 = (u0) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(FlowRow6, "$this$FlowRow");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((l1.s) nVar12).f(FlowRow6) ? 4 : 2;
                }
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    for (final bs.e eVar6 : this.f29794b.f5130e) {
                        boolean zEquals6 = this.f29795c.equals(eVar6.f5125e);
                        final fz.c cVar6 = this.f29796d;
                        boolean zF6 = sVar12.f(cVar6) | sVar12.f(eVar6);
                        Object objQ6 = sVar12.Q();
                        if (zF6 || objQ6 == l1.m.f39353a) {
                            final int i16 = 5;
                            objQ6 = new fz.a() { // from class: gs.i
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                        case 1:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                        case 2:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                        case 3:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                        case 4:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                        default:
                                            cVar6.invoke(eVar6.f5125e);
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar12.o0(objQ6);
                        }
                        a.t(eVar6, zEquals6, (fz.a) objQ6, FlowRow6.a(z1.o.f58481a, 1.0f), sVar12, 0);
                    }
                } else {
                    sVar12.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
