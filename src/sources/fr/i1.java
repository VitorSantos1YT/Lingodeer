package fr;

import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.LeaderBoardResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends xy.i implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f27590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f27591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f27592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ LeaderBoardClass f27593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v1 f27594f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ApiResponse f27595t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(v1 v1Var, ApiResponse apiResponse, vy.d dVar) {
        super(5, dVar);
        this.f27594f = v1Var;
        this.f27595t = apiResponse;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj3).intValue();
        i1 i1Var = new i1(this.f27594f, this.f27595t, (vy.d) obj5);
        i1Var.f27590b = (String) obj;
        i1Var.f27591c = (String) obj2;
        i1Var.f27592d = iIntValue;
        i1Var.f27593e = (LeaderBoardClass) obj4;
        return i1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f27590b;
        String str2 = this.f27591c;
        int i11 = this.f27592d;
        LeaderBoardClass leaderBoardClass = this.f27593e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f27589a;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        String preUserLevel = ((LeaderBoardResponse) ((ApiResponse.Success) this.f27595t).getData()).getPreUserLevel();
        this.f27590b = null;
        this.f27591c = null;
        this.f27593e = null;
        this.f27592d = i11;
        this.f27589a = 1;
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new u1(leaderBoardClass, str, str2, i11, this.f27594f, preUserLevel, null), this);
        return objM == aVar ? aVar : objM;
    }
}
