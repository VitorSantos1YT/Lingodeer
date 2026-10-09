package fr;

import com.lingodeer.data.model.uistate.LeaderBoardUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f27645c;

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k1 k1Var = new k1(3, (vy.d) obj3);
        k1Var.f27644b = (uz.j) obj;
        k1Var.f27645c = (Throwable) obj2;
        return k1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        uz.j jVar = this.f27644b;
        Throwable th2 = this.f27645c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f27643a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            th2.printStackTrace();
            LeaderBoardUiState.Loading loading = LeaderBoardUiState.Loading.INSTANCE;
            this.f27644b = null;
            this.f27645c = null;
            this.f27643a = 1;
            if (jVar.emit(loading, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
