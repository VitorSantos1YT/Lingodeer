package x0;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements fz.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f55594b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f55595c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55596a;

    public /* synthetic */ h(int i11) {
        this.f55596a = i11;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i11;
        int i12;
        switch (this.f55596a) {
            case 0:
                v0.g gVar = (v0.g) obj;
                z0.d dVar = (z0.d) obj2;
                fz.a aVar = (fz.a) obj3;
                l1.n nVar = (l1.n) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i11 = ((iIntValue & 8) == 0 ? ((l1.s) nVar).f(gVar) : ((l1.s) nVar).h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i11 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i11 |= (iIntValue & 64) == 0 ? ((l1.s) nVar).f(dVar) : ((l1.s) nVar).h(dVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i11 |= ((l1.s) nVar).h(aVar) ? 256 : 128;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 1171) != 1170)) {
                    l.c(gVar, dVar, aVar, sVar, i11 & 1022);
                } else {
                    sVar.W();
                }
                break;
            default:
                v0.g gVar2 = (v0.g) obj;
                z0.d dVar2 = (z0.d) obj2;
                fz.a aVar2 = (fz.a) obj3;
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i12 = ((iIntValue2 & 8) == 0 ? ((l1.s) nVar2).f(gVar2) : ((l1.s) nVar2).h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i12 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i12 |= (iIntValue2 & 64) == 0 ? ((l1.s) nVar2).f(dVar2) : ((l1.s) nVar2).h(dVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i12 |= ((l1.s) nVar2).h(aVar2) ? 256 : 128;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
                    l.c(gVar2, dVar2, aVar2, sVar2, i12 & 1022);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
