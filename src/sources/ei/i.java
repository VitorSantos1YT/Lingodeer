package ei;

import h1.x9;
import java.util.List;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.b f25605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f25606d;

    public /* synthetic */ i(List list, o0.b bVar, b0 b0Var, int i11) {
        this.f25603a = i11;
        this.f25604b = list;
        this.f25605c = bVar;
        this.f25606d = b0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25603a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i11 = 0;
                    for (Object obj3 : this.f25604b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str = (String) obj3;
                        final o0.b bVar = this.f25605c;
                        boolean z11 = bVar.k() == i11;
                        final b0 b0Var = this.f25606d;
                        boolean zH = sVar.h(b0Var) | sVar.f(bVar) | sVar.d(i11);
                        Object objQ = sVar.Q();
                        if (zH || objQ == l1.m.f39353a) {
                            final int i13 = 0;
                            objQ = new fz.a() { // from class: ei.k
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            e0.B(b0Var, null, null, new p(bVar, i11, null, 0), 3);
                                            break;
                                        case 1:
                                            e0.B(b0Var, null, null, new p(bVar, i11, null, 1), 3);
                                            break;
                                        default:
                                            e0.B(b0Var, null, null, new p(bVar, i11, null, 2), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar.o0(objQ);
                        }
                        x9.b(z11, (fz.a) objQ, null, false, t1.e.d(984997456, new bp.e0(str, 7), sVar), 0L, 0L, sVar, 24576, 492);
                        i11 = i12;
                    }
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final int i14 = 0;
                    for (Object obj4 : this.f25604b) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str2 = (String) obj4;
                        final o0.b bVar2 = this.f25605c;
                        boolean z12 = bVar2.k() == i14;
                        final b0 b0Var2 = this.f25606d;
                        boolean zH2 = sVar2.h(b0Var2) | sVar2.f(bVar2) | sVar2.d(i14);
                        Object objQ2 = sVar2.Q();
                        if (zH2 || objQ2 == l1.m.f39353a) {
                            final int i16 = 1;
                            objQ2 = new fz.a() { // from class: ei.k
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            e0.B(b0Var2, null, null, new p(bVar2, i14, null, 0), 3);
                                            break;
                                        case 1:
                                            e0.B(b0Var2, null, null, new p(bVar2, i14, null, 1), 3);
                                            break;
                                        default:
                                            e0.B(b0Var2, null, null, new p(bVar2, i14, null, 2), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar2.o0(objQ2);
                        }
                        x9.b(z12, (fz.a) objQ2, null, false, t1.e.d(-1115658158, new bp.e0(str2, 8), sVar2), 0L, 0L, sVar2, 24576, 492);
                        i14 = i15;
                    }
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            default:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    final int i17 = 0;
                    for (Object obj5 : this.f25604b) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        String str3 = (String) obj5;
                        final o0.b bVar3 = this.f25605c;
                        boolean z13 = bVar3.k() == i17;
                        final b0 b0Var3 = this.f25606d;
                        boolean zH3 = sVar3.h(b0Var3) | sVar3.f(bVar3) | sVar3.d(i17);
                        Object objQ3 = sVar3.Q();
                        if (zH3 || objQ3 == l1.m.f39353a) {
                            final int i19 = 2;
                            objQ3 = new fz.a() { // from class: ei.k
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            e0.B(b0Var3, null, null, new p(bVar3, i17, null, 0), 3);
                                            break;
                                        case 1:
                                            e0.B(b0Var3, null, null, new p(bVar3, i17, null, 1), 3);
                                            break;
                                        default:
                                            e0.B(b0Var3, null, null, new p(bVar3, i17, null, 2), 3);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ3);
                        }
                        x9.b(z13, (fz.a) objQ3, null, false, t1.e.d(-1390675709, new bp.e0(str3, 25), sVar3), 0L, 0L, sVar3, 24576, 492);
                        i17 = i18;
                    }
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
        }
    }
}
