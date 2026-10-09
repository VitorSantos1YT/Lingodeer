package ei;

import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f25597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25600d;

    public g(List list, long j11, long j12, long j13) {
        this.f25597a = list;
        this.f25598b = j11;
        this.f25599c = j12;
        this.f25600d = j13;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        l0.c cVar = (l0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.n nVar = (l1.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
        }
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
            b bVar = (b) this.f25597a.get(iIntValue);
            sVar.d0(-2096753380);
            z.e(bVar, this.f25598b, this.f25599c, this.f25600d, sVar, 0);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }
}
