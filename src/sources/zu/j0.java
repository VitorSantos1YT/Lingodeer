package zu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f59455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f59456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, f0 f0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f59453a = i11;
        this.f59455c = k0Var;
        this.f59456d = f0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59453a) {
            case 0:
                return new j0(this.f59455c, this.f59456d, dVar, 0);
            case 1:
                return new j0(this.f59455c, this.f59456d, dVar, 1);
            default:
                return new j0(this.f59455c, this.f59456d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59453a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.f59453a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f59454b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k0 k0Var = this.f59455c;
                    vt.c cVar = k0Var.f59461b;
                    c0 c0Var = (c0) this.f59456d;
                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(c0Var.f59385a, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarB = ((fr.v1) k0Var.f59460a).b(c0Var.f59385a.getUid());
                    this.f59454b = 1;
                    if (uz.x0.u(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f59454b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k0 k0Var2 = this.f59455c;
                    vt.c cVar2 = k0Var2.f59461b;
                    e0 e0Var = (e0) this.f59456d;
                    ((vt.d) cVar2).m(LeaderBoardUser.copy$default(e0Var.f59408a, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarE = ((fr.v1) k0Var2.f59460a).e(e0Var.f59408a.getUid());
                    this.f59454b = 1;
                    if (uz.x0.u(rVarE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                k0 k0Var3 = this.f59455c;
                uz.i1 i1Var = k0Var3.f59462c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f59454b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value = i1Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!i1Var.j(value, Boolean.TRUE));
                    ru.a aVar4 = k0Var3.f59460a;
                    String userId = ((d0) this.f59456d).f59389a.getUid();
                    fr.v1 v1Var = (fr.v1) aVar4;
                    v1Var.getClass();
                    kotlin.jvm.internal.m.f(userId, "userId");
                    gp.r rVar = new gp.r(new fr.c(2, v1Var, userId, (vy.d) null));
                    this.f59454b = 1;
                    if (uz.x0.u(rVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                do {
                    value2 = i1Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!i1Var.j(value2, Boolean.FALSE));
                return qy.b0.f48488a;
        }
    }
}
