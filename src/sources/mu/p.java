package mu;

import iv.h0;
import java.util.List;
import rz.b0;
import rz.e0;
import rz.o0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f42159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f42157a = i11;
        this.f42159c = xVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f42157a) {
            case 0:
                return new p(this.f42159c, dVar, 0);
            default:
                return new p(this.f42159c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f42157a) {
            case 0:
                break;
        }
        return ((p) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i11 = this.f42157a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        x xVar = this.f42159c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f42158b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    lu.b bVar = xVar.f42182a;
                    List list = xVar.S;
                    this.f42158b = 1;
                    bVar.getClass();
                    yz.f fVar = o0.f50940a;
                    obj = e0.M(yz.e.f58387a, new kb.e(8, list, bVar, dVar), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    return b0Var;
                }
                i1 i1Var = xVar.H;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, list2));
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f42158b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                i1 i1Var2 = ((vt.d) xVar.f42184c).f54210u;
                h0 h0Var = new h0(xVar, dVar, 25);
                this.f42158b = 1;
                return x0.i(i1Var2, h0Var, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
