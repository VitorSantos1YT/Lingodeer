package pr;

import l1.b1;
import mt.n4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur.a f47067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f47068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ur.a aVar, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47066a = i11;
        this.f47067b = aVar;
        this.f47068c = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47066a) {
            case 0:
                return new l(this.f47067b, this.f47068c, dVar, 0);
            default:
                return new l(this.f47067b, this.f47068c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47066a) {
            case 0:
                l lVar = (l) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                lVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                l lVar2 = (l) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                lVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f47066a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f47068c;
        ur.a aVar = this.f47067b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.c("ep_badge_achievement_detail_click", new n4(26, b1Var));
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.c("ep_badge_achievement_detail_change_level", new n4(27, b1Var));
                break;
        }
        return b0Var;
    }
}
