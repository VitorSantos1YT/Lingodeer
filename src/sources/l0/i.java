package l0;

import java.util.Iterator;
import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39115c;

    public /* synthetic */ i(Object obj, int i11, int i12) {
        this.f39113a = i12;
        this.f39115c = obj;
        this.f39114b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[LOOP:1: B:16:0x0049->B:18:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0062 A[SYNTHETIC] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.s sVar;
        Iterator it;
        switch (this.f39113a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j jVar = (j) this.f39115c;
                    ij.d dVar = jVar.f39117b.f39112b;
                    int i11 = this.f39114b;
                    n0.h hVarH = dVar.h(i11);
                    ((f) hVarH.f42948c).f39109c.f(jVar.f39118c, Integer.valueOf(i11 - hVarH.f42946a), sVar2, 0);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ij.d dVar2 = ((m0.k) this.f39115c).f40567b.f40564c;
                    int i12 = this.f39114b;
                    n0.h hVarH2 = dVar2.h(i12);
                    ((m0.h) hVarH2.f42948c).f40559d.f(m0.l.f40569a, Integer.valueOf(i12 - hVarH2.f42946a), sVar3, 6);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ij.d dVarK = ((o0.l) this.f39115c).f44388b.k();
                    int i13 = this.f39114b;
                    n0.h hVarH3 = dVarK.h(i13);
                    ((o0.i) hVarH3.f42948c).f44378b.f(o0.o.f44418a, Integer.valueOf(i13 - hVarH3.f42946a), sVar4, 0);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            default:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar4;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        for (List list : (List) this.f39115c) {
                            if (list.size() == this.f39114b) {
                                throw new IllegalStateException("Check failed.");
                            }
                            sVar = (l1.s) nVar4;
                            sVar.d0(571476473);
                            it = list.iterator();
                            while (it.hasNext()) {
                                ((fz.e) it.next()).invoke(sVar, 0);
                            }
                            sVar.p(false);
                        }
                    }
                } else {
                    while (r6.hasNext()) {
                        if (list.size() == this.f39114b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        sVar = (l1.s) nVar4;
                        sVar.d0(571476473);
                        it = list.iterator();
                        while (it.hasNext()) {
                            ((fz.e) it.next()).invoke(sVar, 0);
                        }
                        sVar.p(false);
                    }
                }
                return b0.f48488a;
        }
    }
}
