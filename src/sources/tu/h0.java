package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import fr.o0;
import fr.v1;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1 f52573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f52575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, vy.d dVar) {
        super(2, dVar);
        this.f52575c = m0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h0(this.f52575c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        m0 m0Var = this.f52575c;
        i1 i1Var = m0Var.f52608f;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f52574b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (((o0) m0Var.f52605c).f27733a.isUnloginUser()) {
                i1Var.k(LeaderBoardUiState.NeedLogin.INSTANCE);
            } else if (kotlin.jvm.internal.m.a(i1Var.getValue(), LeaderBoardUiState.NeedLogin.INSTANCE)) {
                i1Var.k(LeaderBoardUiState.Loading.INSTANCE);
            } else {
                LeaderBoardUiState leaderBoardUiState = (LeaderBoardUiState) i1Var.getValue();
                if (leaderBoardUiState instanceof LeaderBoardUiState.Success) {
                    i1Var.k(LeaderBoardUiState.Success.copy$default((LeaderBoardUiState.Success) leaderBoardUiState, null, null, null, false, false, false, 0, 119, null));
                }
                uz.i iVarD = ((v1) m0Var.f52606d).d();
                this.f52573a = i1Var;
                this.f52574b = 1;
                objU = x0.u(iVarD, this);
                if (objU == aVar) {
                    return aVar;
                }
            }
            return qy.b0.f48488a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i1Var = this.f52573a;
        com.bumptech.glide.e.F(obj);
        objU = obj;
        i1Var.k(objU);
        return qy.b0.f48488a;
    }
}
