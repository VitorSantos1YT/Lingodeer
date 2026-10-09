package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f52599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, vy.d dVar) {
        super(2, dVar);
        this.f52599a = m0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new k0(this.f52599a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        k0Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        i1 i1Var = this.f52599a.f52608f;
        if (i1Var.getValue() instanceof LeaderBoardUiState.Success) {
            Object value = i1Var.getValue();
            kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type com.lingodeer.data.model.uistate.LeaderBoardUiState.Success");
            i1Var.k(LeaderBoardUiState.Success.copy$default((LeaderBoardUiState.Success) value, null, null, null, false, true, false, 0, 111, null));
        }
        return qy.b0.f48488a;
    }
}
