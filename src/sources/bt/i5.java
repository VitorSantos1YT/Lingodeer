package bt;

import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MainUiState;
import com.lingodeer.data.model.uistate.MasteryUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i5 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f5530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5533f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5534t;

    public /* synthetic */ i5(gp.j0 j0Var, fz.a aVar, fz.e eVar, fz.e eVar2, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.a aVar2, z1.r rVar, int i11) {
        this.f5528a = 1;
        this.f5533f = j0Var;
        this.f5529b = aVar;
        this.f5534t = eVar;
        this.H = eVar2;
        this.f5530c = cVar;
        this.K = cVar2;
        this.L = cVar3;
        this.f5531d = aVar2;
        this.M = rVar;
        this.f5532e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5528a) {
            case 0:
                ((Integer) obj2).getClass();
                s5.e((jt.x0) this.f5533f, (ht.o) this.f5534t, (ys.d0) this.H, (fz.a) this.f5529b, this.f5530c, (fz.a) this.f5531d, (fz.a) this.K, (fz.a) this.L, (fz.a) this.M, (l1.n) obj, l1.t.M(this.f5532e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fp.a.b((gp.j0) this.f5533f, (fz.a) this.f5529b, (fz.e) this.f5534t, (fz.e) this.H, this.f5530c, (fz.c) this.K, (fz.c) this.L, (fz.a) this.f5531d, (z1.r) this.M, (l1.n) obj, l1.t.M(this.f5532e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.bumptech.glide.e.c((j9.v) this.f5533f, (String) this.f5534t, (z1.r) this.H, (z1.e) this.f5529b, this.f5530c, (fz.c) this.f5531d, (fz.c) this.K, (fz.c) this.L, (fz.c) this.M, (l1.n) obj, l1.t.M(this.f5532e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                xu.a1.d((zu.l2) this.f5533f, (zu.t) this.f5534t, (zu.b0) this.H, (MainUiState) this.f5529b, (MasteryUiState) this.f5531d, (LeaderBoardUiState) this.K, (zu.y0) this.L, this.f5530c, (fz.c) this.M, (l1.n) obj, l1.t.M(this.f5532e | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ i5(Object obj, Object obj2, Object obj3, Object obj4, fz.c cVar, qy.e eVar, qy.e eVar2, qy.e eVar3, qy.e eVar4, int i11, int i12) {
        this.f5528a = i12;
        this.f5533f = obj;
        this.f5534t = obj2;
        this.H = obj3;
        this.f5529b = obj4;
        this.f5530c = cVar;
        this.f5531d = eVar;
        this.K = eVar2;
        this.L = eVar3;
        this.M = eVar4;
        this.f5532e = i11;
    }

    public /* synthetic */ i5(zu.l2 l2Var, zu.t tVar, zu.b0 b0Var, MainUiState mainUiState, MasteryUiState masteryUiState, LeaderBoardUiState leaderBoardUiState, zu.y0 y0Var, fz.c cVar, fz.c cVar2, int i11) {
        this.f5528a = 3;
        this.f5533f = l2Var;
        this.f5534t = tVar;
        this.H = b0Var;
        this.f5529b = mainUiState;
        this.f5531d = masteryUiState;
        this.K = leaderBoardUiState;
        this.L = y0Var;
        this.f5530c = cVar;
        this.M = cVar2;
        this.f5532e = i11;
    }
}
