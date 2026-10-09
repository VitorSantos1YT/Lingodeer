package qu;

import android.os.Bundle;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur.a f48408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardClass f48409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ur.a aVar, LeaderBoardClass leaderBoardClass, vy.d dVar, int i11) {
        super(2, dVar);
        this.f48407a = i11;
        this.f48408b = aVar;
        this.f48409c = leaderBoardClass;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f48407a) {
            case 0:
                return new q(this.f48408b, this.f48409c, dVar, 0);
            case 1:
                return new q(this.f48408b, this.f48409c, dVar, 1);
            case 2:
                return new q(this.f48408b, this.f48409c, dVar, 2);
            case 3:
                return new q(this.f48408b, this.f48409c, dVar, 3);
            default:
                return new q(this.f48408b, this.f48409c, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f48407a) {
            case 0:
                q qVar = (q) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                qVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                q qVar2 = (q) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                qVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                q qVar3 = (q) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                qVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                q qVar4 = (q) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                qVar4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                q qVar5 = (q) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                qVar5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f48407a;
        qy.b0 b0Var = qy.b0.f48488a;
        final LeaderBoardClass leaderBoardClass = this.f48409c;
        ur.a aVar = this.f48408b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i12 = 0;
                aVar.c("ep_leaderboard_league_level_up", new fz.a() { // from class: qu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putString("league", leaderBoardClass.getClassName());
                                return bundle;
                            case 1:
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("league", leaderBoardClass.getClassName());
                                return bundle2;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("league", leaderBoardClass.getClassName());
                                return bundle3;
                            case 3:
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("league", leaderBoardClass.getClassName());
                                return bundle4;
                            default:
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("league", leaderBoardClass.getClassName());
                                return bundle5;
                        }
                    }
                });
                break;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i13 = 1;
                aVar.c("ep_leaderboard_league_level_up", new fz.a() { // from class: qu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putString("league", leaderBoardClass.getClassName());
                                return bundle;
                            case 1:
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("league", leaderBoardClass.getClassName());
                                return bundle2;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("league", leaderBoardClass.getClassName());
                                return bundle3;
                            case 3:
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("league", leaderBoardClass.getClassName());
                                return bundle4;
                            default:
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("league", leaderBoardClass.getClassName());
                                return bundle5;
                        }
                    }
                });
                break;
            case 2:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i14 = 2;
                aVar.c("ep_leaderboard_league_keep", new fz.a() { // from class: qu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putString("league", leaderBoardClass.getClassName());
                                return bundle;
                            case 1:
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("league", leaderBoardClass.getClassName());
                                return bundle2;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("league", leaderBoardClass.getClassName());
                                return bundle3;
                            case 3:
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("league", leaderBoardClass.getClassName());
                                return bundle4;
                            default:
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("league", leaderBoardClass.getClassName());
                                return bundle5;
                        }
                    }
                });
                break;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i15 = 3;
                aVar.c("ep_leaderboard_league_level_down", new fz.a() { // from class: qu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putString("league", leaderBoardClass.getClassName());
                                return bundle;
                            case 1:
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("league", leaderBoardClass.getClassName());
                                return bundle2;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("league", leaderBoardClass.getClassName());
                                return bundle3;
                            case 3:
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("league", leaderBoardClass.getClassName());
                                return bundle4;
                            default:
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("league", leaderBoardClass.getClassName());
                                return bundle5;
                        }
                    }
                });
                break;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i16 = 4;
                aVar.c("ep_leaderboard_league_level_up", new fz.a() { // from class: qu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                Bundle bundle = new Bundle();
                                bundle.putString("league", leaderBoardClass.getClassName());
                                return bundle;
                            case 1:
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("league", leaderBoardClass.getClassName());
                                return bundle2;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("league", leaderBoardClass.getClassName());
                                return bundle3;
                            case 3:
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("league", leaderBoardClass.getClassName());
                                return bundle4;
                            default:
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("league", leaderBoardClass.getClassName());
                                return bundle5;
                        }
                    }
                });
                break;
        }
        return b0Var;
    }
}
