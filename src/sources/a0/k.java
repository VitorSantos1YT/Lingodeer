package a0;

import b0.i2;
import com.yalantis.ucrop.view.CropImageView;
import h1.e4;
import h1.r8;
import h1.u8;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        super(3);
        this.f116a = i11;
        this.f117b = obj;
        this.f118c = obj2;
        this.f119d = obj3;
        this.f120e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0045, please report this as an issue */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zA;
        int i11;
        int i12;
        i2 i2Var;
        l1.s sVar;
        boolean zF;
        Object objQ;
        l1.g gVar;
        fz.a aVar;
        Object objQ2;
        b0.d dVar;
        Boolean boolValueOf;
        boolean zH;
        Object c0Var;
        Boolean bool;
        b0.d dVar2;
        i2 i2Var2;
        Object objQ3;
        b0.d dVar3;
        boolean zH2;
        Object objQ4;
        boolean zF2;
        Object objQ5;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        float f5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i13;
        Object obj4;
        switch (this.f116a) {
            case 0:
                k0 k0Var = (k0) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x1.p pVar = (x1.p) this.f117b;
                y yVar = (y) this.f119d;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((l1.s) nVar).f(k0Var) : ((l1.s) nVar).h(k0Var) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zF3 = sVar2.f(pVar);
                    Object obj5 = this.f118c;
                    boolean zH3 = zF3 | sVar2.h(obj5) | sVar2.h(yVar);
                    Object objQ6 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zH3 || objQ6 == gVar2) {
                        objQ6 = new j(pVar, obj5, yVar, 0);
                        sVar2.o0(objQ6);
                    }
                    l1.t.c(k0Var, (fz.c) objQ6, sVar2);
                    y.i0 i0Var = yVar.f237d;
                    kotlin.jvm.internal.m.d(k0Var, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    i0Var.m(obj5, ((l0) k0Var).f130a);
                    Object objQ7 = sVar2.Q();
                    if (objQ7 == gVar2) {
                        objQ7 = new r();
                        sVar2.o0(objQ7);
                    }
                    ((t1.d) this.f120e).f((r) objQ7, obj5, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
            default:
                fz.e eVar = (fz.e) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                e4 e4Var = (e4) this.f120e;
                u8 u8Var = (u8) this.f117b;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).h(eVar) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        zA = kotlin.jvm.internal.m.a(u8Var, (u8) this.f118c);
                        if (zA) {
                            i11 = 150;
                        } else {
                            i11 = 75;
                        }
                        if (zA) {
                            arrayList = (ArrayList) this.f119d;
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            for (i13 = 0; i13 < size; i13++) {
                                obj4 = arrayList.get(i13);
                                if (obj4 != null) {
                                    arrayList2.add(obj4);
                                }
                            }
                            i12 = arrayList2.size() == 1 ? 0 : 75;
                        }
                        i2Var = new i2(i11, i12, b0.b0.f3441d);
                        sVar = (l1.s) nVar2;
                        zF = sVar.f(u8Var) | sVar.h(e4Var);
                        objQ = sVar.Q();
                        gVar = l1.m.f39353a;
                        if (zF || objQ == gVar) {
                            objQ = new d2.c(4, u8Var, e4Var);
                            sVar.o0(objQ);
                        }
                        aVar = (fz.a) objQ;
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            if (zA) {
                                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            } else {
                                f5 = 1.0f;
                            }
                            objQ2 = b0.e.a(f5);
                            sVar.o0(objQ2);
                        }
                        dVar = (b0.d) objQ2;
                        boolValueOf = Boolean.valueOf(zA);
                        zH = sVar.h(dVar) | sVar.g(zA) | sVar.h(i2Var) | sVar.f(aVar);
                        Object objQ8 = sVar.Q();
                        if (!zH || objQ8 == gVar) {
                            bool = boolValueOf;
                            dVar2 = dVar;
                            c0Var = new et.c0(dVar2, zA, i2Var, aVar, (vy.d) null);
                            sVar.o0(c0Var);
                        } else {
                            bool = boolValueOf;
                            c0Var = objQ8;
                            dVar2 = dVar;
                        }
                        l1.t.f((fz.e) c0Var, bool, sVar);
                        b0.n nVar3 = dVar2.f3472c;
                        i2Var2 = new i2(i11, i12, b0.b0.f3438a);
                        objQ3 = sVar.Q();
                        if (objQ3 == gVar) {
                            objQ3 = b0.e.a(zA ? 0.8f : 1.0f);
                            sVar.o0(objQ3);
                        }
                        dVar3 = (b0.d) objQ3;
                        Boolean boolValueOf2 = Boolean.valueOf(zA);
                        zH2 = sVar.h(dVar3) | sVar.g(zA) | sVar.h(i2Var2);
                        objQ4 = sVar.Q();
                        if (zH2 || objQ4 == gVar) {
                            bh.j0 j0Var = new bh.j0(dVar3, zA, i2Var2, (vy.d) null, 5);
                            sVar.o0(j0Var);
                            objQ4 = j0Var;
                        }
                        l1.t.f((fz.e) objQ4, boolValueOf2, sVar);
                        b0.n nVar4 = dVar3.f3472c;
                        z1.r rVarR = g2.f0.r(z1.o.f58481a, ((Number) nVar4.f3614b.getValue()).floatValue(), ((Number) nVar4.f3614b.getValue()).floatValue(), ((Number) nVar3.f3614b.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, null, 131064);
                        zF2 = sVar.f(u8Var);
                        objQ5 = sVar.Q();
                        if (zF2 || objQ5 == gVar) {
                            objQ5 = new r8(u8Var, 0);
                            sVar.o0(objQ5);
                        }
                        z1.r rVarB = g3.r.b(rVarR, false, (fz.c) objQ5);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(sVar, rVarB);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        ep.a.w(iIntValue2 & 14, eVar, sVar, true);
                    }
                } else {
                    zA = kotlin.jvm.internal.m.a(u8Var, (u8) this.f118c);
                    if (zA) {
                        i11 = 150;
                    } else {
                        i11 = 75;
                    }
                    if (zA) {
                        arrayList = (ArrayList) this.f119d;
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i13 < size) {
                            obj4 = arrayList.get(i13);
                            if (obj4 != null) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (arrayList2.size() == 1) {
                        }
                    }
                    i2Var = new i2(i11, i12, b0.b0.f3441d);
                    sVar = (l1.s) nVar2;
                    zF = sVar.f(u8Var) | sVar.h(e4Var);
                    objQ = sVar.Q();
                    gVar = l1.m.f39353a;
                    if (zF) {
                        objQ = new d2.c(4, u8Var, e4Var);
                        sVar.o0(objQ);
                    } else {
                        objQ = new d2.c(4, u8Var, e4Var);
                        sVar.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        if (zA) {
                            f5 = 1.0f;
                        } else {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        objQ2 = b0.e.a(f5);
                        sVar.o0(objQ2);
                    }
                    dVar = (b0.d) objQ2;
                    boolValueOf = Boolean.valueOf(zA);
                    zH = sVar.h(dVar) | sVar.g(zA) | sVar.h(i2Var) | sVar.f(aVar);
                    Object objQ9 = sVar.Q();
                    if (zH) {
                        bool = boolValueOf;
                        dVar2 = dVar;
                        c0Var = new et.c0(dVar2, zA, i2Var, aVar, (vy.d) null);
                        sVar.o0(c0Var);
                    } else {
                        bool = boolValueOf;
                        dVar2 = dVar;
                        c0Var = new et.c0(dVar2, zA, i2Var, aVar, (vy.d) null);
                        sVar.o0(c0Var);
                    }
                    l1.t.f((fz.e) c0Var, bool, sVar);
                    b0.n nVar5 = dVar2.f3472c;
                    i2Var2 = new i2(i11, i12, b0.b0.f3438a);
                    objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = b0.e.a(zA ? 0.8f : 1.0f);
                        sVar.o0(objQ3);
                    }
                    dVar3 = (b0.d) objQ3;
                    Boolean boolValueOf3 = Boolean.valueOf(zA);
                    zH2 = sVar.h(dVar3) | sVar.g(zA) | sVar.h(i2Var2);
                    objQ4 = sVar.Q();
                    if (zH2) {
                        bh.j0 j0Var2 = new bh.j0(dVar3, zA, i2Var2, (vy.d) null, 5);
                        sVar.o0(j0Var2);
                        objQ4 = j0Var2;
                    } else {
                        bh.j0 j0Var3 = new bh.j0(dVar3, zA, i2Var2, (vy.d) null, 5);
                        sVar.o0(j0Var3);
                        objQ4 = j0Var3;
                    }
                    l1.t.f((fz.e) objQ4, boolValueOf3, sVar);
                    b0.n nVar6 = dVar3.f3472c;
                    z1.r rVarR2 = g2.f0.r(z1.o.f58481a, ((Number) nVar6.f3614b.getValue()).floatValue(), ((Number) nVar6.f3614b.getValue()).floatValue(), ((Number) nVar5.f3614b.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, null, 131064);
                    zF2 = sVar.f(u8Var);
                    objQ5 = sVar.Q();
                    if (zF2) {
                        objQ5 = new r8(u8Var, 0);
                        sVar.o0(objQ5);
                    } else {
                        objQ5 = new r8(u8Var, 0);
                        sVar.o0(objQ5);
                    }
                    z1.r rVarB2 = g3.r.b(rVarR2, false, (fz.c) objQ5);
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarB2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar);
                    ep.a.w(iIntValue2 & 14, eVar, sVar, true);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
