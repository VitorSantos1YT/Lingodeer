package qu;

import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.Iterator;
import java.util.List;
import l1.a1;
import l1.h1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.i implements fz.e {
    public final /* synthetic */ String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardUiState.Success f48381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.c f48382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f48383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f48384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.w f48385f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f48386t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LeaderBoardUiState.Success success, v3.c cVar, List list, List list2, l0.w wVar, a1 a1Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f48381b = success;
        this.f48382c = cVar;
        this.f48383d = list;
        this.f48384e = list2;
        this.f48385f = wVar;
        this.f48386t = a1Var;
        this.H = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i(this.f48381b, this.f48382c, this.f48383d, this.f48384e, this.f48385f, this.f48386t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Object next;
        int rank;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f48380a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        LeaderBoardUiState.Success success = this.f48381b;
        if (success.getScrollToUserPos()) {
            int iL = ((h1) this.f48386t).l();
            v3.c cVar = this.f48382c;
            int iE0 = (int) cVar.e0((cVar.Q(iL) / 2) - ((float) 22.5d));
            LeaderBoardClass leaderBoardClass = success.getLeaderBoardClass();
            if (leaderBoardClass != null) {
                Iterator it = this.f48383d.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = this.H;
                    obj2 = null;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((LeaderBoardUser) next).getUid(), str));
                if (next != null) {
                    rank = leaderBoardClass.getRank() + 1;
                } else {
                    for (Object obj3 : this.f48384e) {
                        if (kotlin.jvm.internal.m.a(((LeaderBoardUser) obj3).getUid(), str)) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    rank = obj2 != null ? leaderBoardClass.getRank() + 2 : leaderBoardClass.getRank();
                }
                if (rank >= 0) {
                    this.f48380a = 1;
                    if (this.f48385f.j(rank, -iE0, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return b0Var;
    }
}
