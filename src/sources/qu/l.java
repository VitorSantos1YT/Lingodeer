package qu;

import bp.x1;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import java.util.ArrayList;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur.a f48390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardUiState.Success f48392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f48393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f48394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f48395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ur.a aVar, String str, LeaderBoardUiState.Success success, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, vy.d dVar) {
        super(2, dVar);
        this.f48390a = aVar;
        this.f48391b = str;
        this.f48392c = success;
        this.f48393d = arrayList;
        this.f48394e = arrayList2;
        this.f48395f = arrayList3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f48390a, this.f48391b, this.f48392c, this.f48393d, this.f48394e, this.f48395f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        lVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        LeaderBoardClass leaderBoardClass = this.f48392c.getLeaderBoardClass();
        ur.a aVar2 = this.f48390a;
        kotlin.jvm.internal.m.f(aVar2, "<this>");
        ArrayList topUserList = this.f48393d;
        kotlin.jvm.internal.m.f(topUserList, "topUserList");
        ArrayList keepUserList = this.f48394e;
        kotlin.jvm.internal.m.f(keepUserList, "keepUserList");
        ArrayList dropUserList = this.f48395f;
        kotlin.jvm.internal.m.f(dropUserList, "dropUserList");
        aVar2.c("ep_leaderboard_detail", new x1(leaderBoardClass, topUserList, keepUserList, dropUserList, this.f48391b, 14));
        return qy.b0.f48488a;
    }
}
