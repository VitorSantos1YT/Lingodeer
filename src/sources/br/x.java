package br;

import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;
import tu.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f5103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b3 b3Var, MainComposeActivity mainComposeActivity, vy.d dVar) {
        super(2, dVar);
        this.f5103a = b3Var;
        this.f5104b = mainComposeActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new x(this.f5103a, this.f5104b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        xVar.invokeSuspend(b0Var);
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        int i11 = MainComposeActivity.U;
        CompleteOneLessonUiState completeOneLessonUiState = (CompleteOneLessonUiState) this.f5103a.getValue();
        if (!kotlin.jvm.internal.m.a(completeOneLessonUiState, CompleteOneLessonUiState.Idle.INSTANCE)) {
            if (!(completeOneLessonUiState instanceof CompleteOneLessonUiState.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            LeaderBoardUiState leaderBoardUiState = ((CompleteOneLessonUiState.Success) completeOneLessonUiState).getLeaderBoardUiState();
            if (leaderBoardUiState != null) {
                ((m0) this.f5104b.H.getValue()).b(new tu.q(leaderBoardUiState));
            }
        }
        return qy.b0.f48488a;
    }
}
