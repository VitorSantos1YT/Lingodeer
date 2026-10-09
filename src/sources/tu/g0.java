package tu;

import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import fr.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardUiState.Success f52570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f52571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(LeaderBoardUiState.Success success, m0 m0Var, int i11, vy.d dVar) {
        super(2, dVar);
        this.f52570a = success;
        this.f52571b = m0Var;
        this.f52572c = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new g0(this.f52570a, this.f52571b, this.f52572c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        LeaderBoardClass leaderBoardClassCopy$default;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        LeaderBoardUiState.Success success = this.f52570a;
        LeaderBoardClass leaderBoardClass = success.getLeaderBoardClass();
        if (leaderBoardClass != null) {
            LeaderBoardClass leaderBoardClass2 = success.getLeaderBoardClass();
            kotlin.jvm.internal.m.c(leaderBoardClass2);
            List<LeaderBoardUser> leaderBoardUserList = leaderBoardClass2.getLeaderBoardUserList();
            ArrayList arrayList = new ArrayList(ry.n.W(leaderBoardUserList, 10));
            for (LeaderBoardUser leaderBoardUserCopy$default : leaderBoardUserList) {
                if (kotlin.jvm.internal.m.a(leaderBoardUserCopy$default.getUid(), ((o0) this.f52571b.f52605c).w())) {
                    leaderBoardUserCopy$default = LeaderBoardUser.copy$default(leaderBoardUserCopy$default, null, 0, 0, null, null, null, null, null, null, false, false, false, this.f52572c, 0, 0, 0, null, null, null, null, null, 2093055, null);
                }
                arrayList.add(leaderBoardUserCopy$default);
            }
            leaderBoardClassCopy$default = LeaderBoardClass.copy$default(leaderBoardClass, null, 0, 0, 0, false, false, 0, 0, arrayList, null, 767, null);
        } else {
            leaderBoardClassCopy$default = null;
        }
        return LeaderBoardUiState.Success.copy$default(success, leaderBoardClassCopy$default, null, null, false, false, false, 0, 126, null);
    }
}
