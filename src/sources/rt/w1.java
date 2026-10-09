package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f50565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f50566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(a2 a2Var, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50563a = i11;
        this.f50565c = a2Var;
        this.f50566d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50563a) {
            case 0:
                return new w1(this.f50565c, this.f50566d, dVar, 0);
            default:
                return new w1(this.f50565c, this.f50566d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50563a) {
            case 0:
                break;
        }
        return ((w1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f50563a;
        List list = this.f50566d;
        a2 a2Var = this.f50565c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50564b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                wt.b0 b0Var2 = a2Var.f49418a;
                this.f50564b = 1;
                return b0Var2.l(list, this) == aVar ? aVar : b0Var;
            default:
                vt.c cVar = a2Var.f49419b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f50564b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    w1 w1Var = new w1(a2Var, list, null, 0);
                    this.f50564b = 1;
                    if (rz.e0.M(eVar, w1Var, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i13 == 1) {
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return b0Var;
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f50564b = 3;
                ((vt.d) cVar).j(this);
                if (b0Var != aVar2) {
                    return b0Var;
                }
                return aVar2;
                this.f50564b = 2;
                ((vt.d) cVar).d(this);
                if (b0Var != aVar2) {
                    this.f50564b = 3;
                    ((vt.d) cVar).j(this);
                    if (b0Var != aVar2) {
                        return b0Var;
                    }
                }
                return aVar2;
        }
    }
}
