package xu;

import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.i7;
import h1.k7;
import h1.ua;
import j0.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56493a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f56494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f56495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f56496d;

    public /* synthetic */ o1(fz.c cVar, String[] strArr, String str) {
        this.f56496d = cVar;
        this.f56494b = strArr;
        this.f56495c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56493a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fz.c cVar = this.f56496d;
                    boolean zF = sVar.f(cVar);
                    String[] strArr = this.f56494b;
                    boolean zH = zF | sVar.h(strArr);
                    String str = this.f56495c;
                    boolean zF2 = zH | sVar.f(str);
                    Object objQ = sVar.Q();
                    if (zF2 || objQ == l1.m.f39353a) {
                        objQ = new mt.l0(cVar, strArr, str, 29);
                        sVar.o0(objQ);
                    }
                    k7.m((fz.a) objQ, null, false, null, null, null, c.f56351h0, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = q0.c.c(oVar);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    sVar2.d0(1087097058);
                    String[] strArr2 = this.f56494b;
                    int length = strArr2.length;
                    int i11 = 0;
                    while (i11 < length) {
                        String str2 = strArr2[i11];
                        z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 56);
                        String str3 = this.f56495c;
                        boolean zA = kotlin.jvm.internal.m.a(str2, str3);
                        g3.k kVar = new g3.k(3);
                        fz.c cVar2 = this.f56496d;
                        boolean zF3 = sVar2.f(cVar2) | sVar2.f(str2);
                        Object objQ2 = sVar2.Q();
                        if (zF3 || objQ2 == l1.m.f39353a) {
                            objQ2 = new in.h(cVar2, str2, 28);
                            sVar2.o0(objQ2);
                        }
                        z1.r rVarB = q0.c.b(rVarG, zA, false, kVar, (fz.a) objQ2, 10);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL2 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, rVarB);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar2);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                        i7.a(kotlin.jvm.internal.m.a(str2, str3), null, null, false, null, sVar2, 48, 60);
                        z1.o oVar2 = oVar;
                        l1.s sVar3 = sVar2;
                        ua.b(str2, j0.c.E(oVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(fc.f30256a)).f30177j, sVar3, 48, 0, 65532);
                        sVar2 = sVar3;
                        sVar2.p(true);
                        i11++;
                        oVar = oVar2;
                    }
                    sVar2.p(false);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ o1(String[] strArr, String str, fz.c cVar) {
        this.f56494b = strArr;
        this.f56495c = str;
        this.f56496d = cVar;
    }
}
