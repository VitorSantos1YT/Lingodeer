package qu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.List;
import pr.a0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements fz.g {
    public final /* synthetic */ b0.a H;
    public final /* synthetic */ a0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f48399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f48400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f48401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f48402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f48403f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f48404t;

    public /* synthetic */ n(List list, List list2, long j11, long j12, long j13, int i11, b0.a aVar, a0 a0Var, int i12) {
        this.f48398a = i12;
        this.f48399b = list;
        this.f48400c = list2;
        this.f48401d = j11;
        this.f48402e = j12;
        this.f48403f = j13;
        this.f48404t = i11;
        this.H = aVar;
        this.K = a0Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        switch (this.f48398a) {
            case 0:
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
                    LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f48399b.get(iIntValue);
                    sVar.d0(1325748999);
                    r0.e eVarD = r0.f.d(0);
                    int rank = leaderBoardUser.getRank();
                    long j11 = this.f48403f;
                    o.d(rank, leaderBoardUser, this.f48401d, this.f48402e, ns.o.L(new g2.x(j11), new g2.x(j11)), eVarD, this.f48404t, true, false, this.H, this.K, sVar, 100691328);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l0.c cVar2 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    LeaderBoardUser leaderBoardUser2 = (LeaderBoardUser) this.f48399b.get(iIntValue3);
                    sVar2.d0(880775412);
                    r0.e eVarD2 = r0.f.d(0);
                    int rank2 = leaderBoardUser2.getRank();
                    long j12 = this.f48403f;
                    o.d(rank2, leaderBoardUser2, this.f48401d, this.f48402e, ns.o.L(new g2.x(j12), new g2.x(j12)), eVarD2, this.f48404t, true, false, this.H, this.K, sVar2, 100691328);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(cVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    LeaderBoardUser leaderBoardUser3 = (LeaderBoardUser) this.f48399b.get(iIntValue5);
                    sVar3.d0(290302685);
                    r0.e eVarD3 = r0.f.d(0);
                    int rank3 = leaderBoardUser3.getRank();
                    long j13 = this.f48403f;
                    o.d(rank3, leaderBoardUser3, this.f48401d, this.f48402e, ns.o.L(new g2.x(j13), new g2.x(j13)), eVarD3, this.f48404t, true, false, this.H, this.K, sVar3, 100691328);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
