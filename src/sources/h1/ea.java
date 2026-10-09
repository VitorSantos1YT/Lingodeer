package h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ea extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f30213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f30214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.f f30215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(t1.d dVar, fz.e eVar, fz.f fVar, int i11) {
        super(2);
        this.f30212a = i11;
        this.f30213b = dVar;
        this.f30214c = eVar;
        this.f30215d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        t1.d dVar;
        fz.e eVar;
        fz.f fVar;
        boolean zF;
        Object objQ;
        switch (this.f30212a) {
            case 0:
                w2.q1 q1Var = (w2.q1) obj;
                long j11 = ((v3.a) obj2).f53483a;
                int iH = v3.a.h(j11);
                List listC = q1Var.C(ga.Tabs, this.f30213b);
                int size = listC.size();
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                if (size > 0) {
                    wVar.f38359a = iH / size;
                }
                Integer numValueOf = 0;
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    numValueOf = Integer.valueOf(Math.max(((w2.p0) listC.get(i11)).b(wVar.f38359a), numValueOf.intValue()));
                }
                int iIntValue = numValueOf.intValue();
                ArrayList arrayList = new ArrayList(listC.size());
                int size3 = listC.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    w2.p0 p0Var = (w2.p0) listC.get(i12);
                    int i13 = wVar.f38359a;
                    if (i13 < 0 || iIntValue < 0) {
                        v3.i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
                    arrayList.add(p0Var.B(v3.b.h(i13, i13, iIntValue, iIntValue)));
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (int i14 = 0; i14 < size; i14++) {
                    v3.f fVar2 = new v3.f(q1Var.Q(Math.min(((w2.p0) listC.get(i14)).t(iIntValue), wVar.f38359a)) - (x9.f31318b * 2));
                    v3.f fVar3 = new v3.f(24);
                    if (fVar2.compareTo(fVar3) < 0) {
                        fVar2 = fVar3;
                    }
                    arrayList2.add(new y9(q1Var.Q(wVar.f38359a) * i14, q1Var.Q(wVar.f38359a), fVar2.f53489a));
                }
                return q1Var.q0(iH, iIntValue, ry.s.f50855a, new da(arrayList, q1Var, this.f30214c, wVar, j11, iIntValue, this.f30215d, arrayList2, iH));
            default:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
                        sVar = (l1.s) nVar;
                        dVar = this.f30213b;
                        boolean zF2 = sVar.f(dVar);
                        eVar = this.f30214c;
                        boolean zF3 = zF2 | sVar.f(eVar);
                        fVar = this.f30215d;
                        zF = zF3 | sVar.f(fVar);
                        objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new ea(dVar, eVar, fVar, 0);
                            sVar.o0(objQ);
                        }
                        w2.a0.b(rVarE, (fz.e) objQ, sVar, 6, 0);
                    }
                } else {
                    z1.r rVarE2 = j0.e2.e(z1.o.f58481a, 1.0f);
                    sVar = (l1.s) nVar;
                    dVar = this.f30213b;
                    boolean zF4 = sVar.f(dVar);
                    eVar = this.f30214c;
                    boolean zF5 = zF4 | sVar.f(eVar);
                    fVar = this.f30215d;
                    zF = zF5 | sVar.f(fVar);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new ea(dVar, eVar, fVar, 0);
                        sVar.o0(objQ);
                    } else {
                        objQ = new ea(dVar, eVar, fVar, 0);
                        sVar.o0(objQ);
                    }
                    w2.a0.b(rVarE2, (fz.e) objQ, sVar, 6, 0);
                }
                return qy.b0.f48488a;
        }
    }
}
