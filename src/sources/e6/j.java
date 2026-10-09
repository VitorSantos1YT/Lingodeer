package e6;

import android.content.Context;
import android.os.Bundle;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24943a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f24945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, l lVar) {
        super(2);
        this.f24944b = context;
        this.f24945c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0150  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:48:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        Object objQ;
        l1.g gVar;
        l1.b1 b1Var;
        Boolean bool;
        l lVar;
        Context context;
        boolean zF;
        Object objQ2;
        qy.b0 b0Var;
        boolean zF2;
        Object objQ3;
        Object objQ4;
        fz.e eVar;
        Bundle bundle;
        Object[] objArr;
        switch (this.f24943a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (iIntValue == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        sVar = (l1.s) nVar;
                        sVar.e0(1881995740);
                        objQ = sVar.Q();
                        gVar = l1.m.f39353a;
                        if (objQ == gVar) {
                            objQ = l1.t.B(new v3.h(0L));
                            sVar.o0(objQ);
                        }
                        b1Var = (l1.b1) objQ;
                        sVar.p(false);
                        bool = Boolean.FALSE;
                        sVar.e0(1881999935);
                        lVar = this.f24945c;
                        boolean zF3 = sVar.f(lVar);
                        context = this.f24944b;
                        zF = zF3 | sVar.f(context) | sVar.f(b1Var);
                        objQ2 = sVar.Q();
                        b0Var = null;
                        objArr = 0;
                        if (zF || objQ2 == gVar) {
                            b0.f fVar = new b0.f((Object) lVar, (Object) context, b1Var, (vy.d) (objArr == true ? 1 : 0), 12);
                            sVar.o0(fVar);
                            objQ2 = fVar;
                        }
                        sVar.p(false);
                        if (((Boolean) l1.t.C((fz.e) objQ2, bool, sVar).getValue()).booleanValue()) {
                            sVar.e0(-1786326291);
                            sVar.e0(1882039614);
                            objQ4 = sVar.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new uz.e(new o(lVar.f24960d, context, lVar.f24961e, (vy.d) null), vy.j.f54321a, -2, tz.a.SUSPEND);
                                sVar.o0(objQ4);
                            }
                            sVar.p(false);
                            eVar = (fz.e) l1.t.n((uz.i) objQ4, null, null, sVar, 48, 2).getValue();
                            sVar.e0(1882043230);
                            if (eVar != null) {
                                com.bumptech.glide.f.a(0, ((v3.h) b1Var.getValue()).f53491a, lVar.f24963g, eVar, sVar);
                                sVar = sVar;
                                b0Var = b0Var2;
                            }
                            sVar.p(false);
                            if (b0Var == null) {
                                cf.x.a(sVar, 0);
                            }
                            sVar.p(false);
                        } else {
                            sVar.e0(-1786102688);
                            cf.x.a(sVar, 0);
                            sVar.p(false);
                        }
                        sVar.e0(1882053955);
                        zF2 = sVar.f(lVar);
                        objQ3 = sVar.Q();
                        if (zF2 || objQ3 == gVar) {
                            objQ3 = new a0.c0(lVar, 3);
                            sVar.o0(objQ3);
                        }
                        sVar.p(false);
                        l1.t.j((fz.a) objQ3, sVar);
                    }
                } else {
                    sVar = (l1.s) nVar;
                    sVar.e0(1881995740);
                    objQ = sVar.Q();
                    gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = l1.t.B(new v3.h(0L));
                        sVar.o0(objQ);
                    }
                    b1Var = (l1.b1) objQ;
                    sVar.p(false);
                    bool = Boolean.FALSE;
                    sVar.e0(1881999935);
                    lVar = this.f24945c;
                    boolean zF4 = sVar.f(lVar);
                    context = this.f24944b;
                    zF = zF4 | sVar.f(context) | sVar.f(b1Var);
                    objQ2 = sVar.Q();
                    b0Var = null;
                    objArr = 0;
                    if (zF) {
                        b0.f fVar2 = new b0.f((Object) lVar, (Object) context, b1Var, (vy.d) (objArr == true ? 1 : 0), 12);
                        sVar.o0(fVar2);
                        objQ2 = fVar2;
                    } else {
                        b0.f fVar3 = new b0.f((Object) lVar, (Object) context, b1Var, (vy.d) (objArr == true ? 1 : 0), 12);
                        sVar.o0(fVar3);
                        objQ2 = fVar3;
                    }
                    sVar.p(false);
                    if (((Boolean) l1.t.C((fz.e) objQ2, bool, sVar).getValue()).booleanValue()) {
                        sVar.e0(-1786326291);
                        sVar.e0(1882039614);
                        objQ4 = sVar.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new uz.e(new o(lVar.f24960d, context, lVar.f24961e, (vy.d) null), vy.j.f54321a, -2, tz.a.SUSPEND);
                            sVar.o0(objQ4);
                        }
                        sVar.p(false);
                        eVar = (fz.e) l1.t.n((uz.i) objQ4, null, null, sVar, 48, 2).getValue();
                        sVar.e0(1882043230);
                        if (eVar != null) {
                            com.bumptech.glide.f.a(0, ((v3.h) b1Var.getValue()).f53491a, lVar.f24963g, eVar, sVar);
                            sVar = sVar;
                            b0Var = b0Var2;
                        }
                        sVar.p(false);
                        if (b0Var == null) {
                            cf.x.a(sVar, 0);
                        }
                        sVar.p(false);
                    } else {
                        sVar.e0(-1786102688);
                        cf.x.a(sVar, 0);
                        sVar.p(false);
                    }
                    sVar.e0(1882053955);
                    zF2 = sVar.f(lVar);
                    objQ3 = sVar.Q();
                    if (zF2) {
                        objQ3 = new a0.c0(lVar, 3);
                        sVar.o0(objQ3);
                    } else {
                        objQ3 = new a0.c0(lVar, 3);
                        sVar.o0(objQ3);
                    }
                    sVar.p(false);
                    l1.t.j((fz.a) objQ3, sVar);
                }
                return b0Var2;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        c3 c3Var = c6.f.f6623b;
                        Context context2 = this.f24944b;
                        l1.w1 w1VarA = c3Var.a(context2);
                        c3 c3Var2 = c6.f.f6625d;
                        l lVar2 = this.f24945c;
                        l1.w1 w1VarA2 = c3Var2.a(lVar2.f24961e);
                        l1.d0 d0Var = u.f25051a;
                        bundle = (Bundle) lVar2.f24966j.getValue();
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        l1.t.b(new l1.w1[]{w1VarA, w1VarA2, d0Var.a(bundle), c6.f.f6624c.a(lVar2.f24965i.getValue())}, t1.e.b(nVar2, 1688971311, new j(lVar2, context2)), nVar2, 48);
                    }
                } else {
                    c3 c3Var3 = c6.f.f6623b;
                    Context context3 = this.f24944b;
                    l1.w1 w1VarA3 = c3Var3.a(context3);
                    c3 c3Var4 = c6.f.f6625d;
                    l lVar3 = this.f24945c;
                    l1.w1 w1VarA4 = c3Var4.a(lVar3.f24961e);
                    l1.d0 d0Var2 = u.f25051a;
                    bundle = (Bundle) lVar3.f24966j.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    l1.t.b(new l1.w1[]{w1VarA3, w1VarA4, d0Var2.a(bundle), c6.f.f6624c.a(lVar3.f24965i.getValue())}, t1.e.b(nVar2, 1688971311, new j(lVar3, context3)), nVar2, 48);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context) {
        super(2);
        this.f24945c = lVar;
        this.f24944b = context;
    }
}
