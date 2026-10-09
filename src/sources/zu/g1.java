package zu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f59421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f59422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(i1 i1Var, d1 d1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f59419a = i11;
        this.f59421c = i1Var;
        this.f59422d = d1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59419a) {
            case 0:
                return new g1(this.f59421c, this.f59422d, dVar, 0);
            case 1:
                return new g1(this.f59421c, this.f59422d, dVar, 1);
            default:
                return new g1(this.f59421c, this.f59422d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59419a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((g1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objU;
        switch (this.f59419a) {
            case 0:
                i1 i1Var = this.f59421c;
                uz.i1 i1Var2 = i1Var.f59443c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f59420b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    do {
                        value = i1Var2.getValue();
                    } while (!i1Var2.j(value, k1.f59465a));
                    ru.a aVar2 = i1Var.f59441a;
                    String keyWord = ((b1) this.f59422d).f59383a;
                    fr.v1 v1Var = (fr.v1) aVar2;
                    v1Var.getClass();
                    kotlin.jvm.internal.m.f(keyWord, "keyWord");
                    gp.r rVar = new gp.r(new b0.f(19, v1Var, keyWord, (vy.d) null));
                    this.f59420b = 1;
                    objU = uz.x0.u(rVar, this);
                    if (objU == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                }
                l1 l1Var = new l1((List) objU);
                i1Var2.getClass();
                i1Var2.l(null, l1Var);
                return qy.b0.f48488a;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f59420b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i1 i1Var3 = this.f59421c;
                    vt.c cVar = i1Var3.f59442b;
                    z0 z0Var = (z0) this.f59422d;
                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(z0Var.f59580a, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarB = ((fr.v1) i1Var3.f59441a).b(z0Var.f59580a.getUid());
                    this.f59420b = 1;
                    if (uz.x0.u(rVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f59420b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i1 i1Var4 = this.f59421c;
                    vt.c cVar2 = i1Var4.f59442b;
                    c1 c1Var = (c1) this.f59422d;
                    ((vt.d) cVar2).m(LeaderBoardUser.copy$default(c1Var.f59386a, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarE = ((fr.v1) i1Var4.f59441a).e(c1Var.f59386a.getUid());
                    this.f59420b = 1;
                    if (uz.x0.u(rVarE, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
