package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31400a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(w4 w4Var, boolean z11, t1.d dVar) {
        super(2);
        this.f31402c = w4Var;
        this.f31401b = z11;
        this.f31403d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[SYNTHETIC] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        long j11;
        l1.s sVar;
        y.w wVar;
        int i11;
        int i12;
        z1.o oVar;
        int iC;
        boolean zD;
        Object objQ;
        switch (this.f31400a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                w4 w4Var = (w4) this.f31402c;
                if ((iIntValue & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        l1.s sVar3 = (l1.s) nVar;
                        sVar3.d0(1264683960);
                        sVar3.p(false);
                        l1.d0 d0Var = h2.f30320a;
                        if (this.f31401b) {
                            j11 = w4Var.f31226a;
                        } else {
                            j11 = w4Var.f31229d;
                        }
                        l1.t.a(d0Var.a(new g2.x(j11)), t1.e.d(-1728894036, new f((t1.d) this.f31403d, 5, (byte) 0), sVar3), sVar3, 56);
                    }
                } else {
                    l1.s sVar4 = (l1.s) nVar;
                    sVar4.d0(1264683960);
                    sVar4.p(false);
                    l1.d0 d0Var2 = h2.f30320a;
                    if (this.f31401b) {
                        j11 = w4Var.f31226a;
                    } else {
                        j11 = w4Var.f31229d;
                    }
                    l1.t.a(d0Var2.a(new g2.x(j11)), t1.e.d(-1728894036, new f((t1.d) this.f31403d, 5, (byte) 0), sVar4), sVar4, 56);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                n nVar3 = (n) this.f31403d;
                if ((iIntValue2 & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar2;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        sVar = (l1.s) nVar2;
                        sVar.d0(1547046870);
                        wVar = (y.w) this.f31402c;
                        i11 = wVar.f56783b;
                        i12 = 0;
                        while (true) {
                            oVar = z1.o.f58481a;
                            if (i12 < i11) {
                                if (nVar3.f30706a.g() || nVar3.f30706a.f() == 1) {
                                    iC = wVar.c(i12);
                                } else {
                                    iC = wVar.c(i12) % 12;
                                }
                                zD = sVar.d(i12);
                                objQ = sVar.Q();
                                if (zD || objQ == l1.m.f39353a) {
                                    objQ = new e2.o(i12, 3);
                                    sVar.o0(objQ);
                                }
                                wb.m(g3.r.b(oVar, false, (fz.c) objQ), nVar3, iC, this.f31401b, sVar, 0);
                                i12++;
                            } else {
                                sVar.p(false);
                                if (nVar3.f30706a.f() == 0 && nVar3.f30706a.g()) {
                                    wb.l(d0.n.h(j0.e2.n(w2.a0.l(oVar, t4.InnerCircle), k1.k0.f37578b), g2.x.f28621h, r0.f.f48733a), wb.f31262b, t1.e.d(-205464413, new eb(nVar3, this.f31401b), sVar), sVar, 432);
                                }
                            }
                        }
                    }
                } else {
                    sVar = (l1.s) nVar2;
                    sVar.d0(1547046870);
                    wVar = (y.w) this.f31402c;
                    i11 = wVar.f56783b;
                    i12 = 0;
                    while (true) {
                        oVar = z1.o.f58481a;
                        if (i12 < i11) {
                            if (nVar3.f30706a.g()) {
                                iC = wVar.c(i12);
                            } else {
                                iC = wVar.c(i12);
                            }
                            zD = sVar.d(i12);
                            objQ = sVar.Q();
                            if (zD) {
                                objQ = new e2.o(i12, 3);
                                sVar.o0(objQ);
                            } else {
                                objQ = new e2.o(i12, 3);
                                sVar.o0(objQ);
                            }
                            wb.m(g3.r.b(oVar, false, (fz.c) objQ), nVar3, iC, this.f31401b, sVar, 0);
                            i12++;
                        } else {
                            sVar.p(false);
                            if (nVar3.f30706a.f() == 0) {
                                wb.l(d0.n.h(j0.e2.n(w2.a0.l(oVar, t4.InnerCircle), k1.k0.f37578b), g2.x.f28621h, r0.f.f48733a), wb.f31262b, t1.e.d(-205464413, new eb(nVar3, this.f31401b), sVar), sVar, 432);
                            }
                        }
                    }
                }
                break;
            case 2:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    l1.s sVar6 = (l1.s) nVar4;
                    if (sVar6.F()) {
                        sVar6.W();
                    } else {
                        a0.j0.g(Boolean.valueOf(this.f31401b), null, b0.e.r(100, 0, null, 6), "PullRefreshIndicator", t1.e.b(nVar4, -2037141569, new a0.i0(1, (kw.b) this.f31402c, (kw.h) this.f31403d)), nVar4, 28032, 2);
                    }
                } else {
                    a0.j0.g(Boolean.valueOf(this.f31401b), null, b0.e.r(100, 0, null, 6), "PullRefreshIndicator", t1.e.b(nVar4, -2037141569, new a0.i0(1, (kw.b) this.f31402c, (kw.h) this.f31403d)), nVar4, 28032, 2);
                }
                break;
            default:
                ((Number) obj2).intValue();
                se.p.I(this.f31401b, (kw.h) this.f31402c, (z1.r) this.f31403d, (l1.n) obj, l1.t.M(65));
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(y.w wVar, n nVar, boolean z11) {
        super(2);
        this.f31402c = wVar;
        this.f31403d = nVar;
        this.f31401b = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(boolean z11, kw.b bVar, kw.h hVar) {
        super(2);
        this.f31401b = z11;
        this.f31402c = bVar;
        this.f31403d = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(boolean z11, kw.h hVar, z1.r rVar, kw.b bVar, float f5, float f11, int i11) {
        super(2);
        this.f31401b = z11;
        this.f31402c = hVar;
        this.f31403d = rVar;
    }
}
