package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import fr.v1;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f52547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f52548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(e0 e0Var, y yVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f52545a = i11;
        this.f52547c = e0Var;
        this.f52548d = yVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52545a) {
            case 0:
                return new c0(this.f52547c, this.f52548d, dVar, 0);
            default:
                return new c0(this.f52547c, this.f52548d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52545a) {
            case 0:
                break;
        }
        return ((c0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.f52545a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f52546b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    e0 e0Var = this.f52547c;
                    i1 i1Var = e0Var.f52560e;
                    do {
                        value = i1Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!i1Var.j(value, Boolean.TRUE));
                    vt.c cVar = e0Var.f52557b;
                    u uVar = (u) this.f52548d;
                    ((vt.d) cVar).m(LeaderBoardUser.copy$default(uVar.f52627a, null, 0, 0, null, null, null, null, null, null, false, true, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarB = ((v1) e0Var.f52556a).b(uVar.f52627a.getUid());
                    this.f52546b = 1;
                    if (x0.u(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f52546b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    e0 e0Var2 = this.f52547c;
                    i1 i1Var2 = e0Var2.f52560e;
                    do {
                        value2 = i1Var2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!i1Var2.j(value2, Boolean.FALSE));
                    vt.c cVar2 = e0Var2.f52557b;
                    x xVar = (x) this.f52548d;
                    ((vt.d) cVar2).m(LeaderBoardUser.copy$default(xVar.f52630a, null, 0, 0, null, null, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, null, null, 2096127, null));
                    gp.r rVarE = ((v1) e0Var2.f52556a).e(xVar.f52630a.getUid());
                    this.f52546b = 1;
                    if (x0.u(rVarE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
