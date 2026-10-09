package kr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f38554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(b0 b0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38553a = i11;
        this.f38554b = b0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38553a) {
            case 0:
                return new p(this.f38554b, dVar, 0);
            default:
                return new p(this.f38554b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38553a) {
            case 0:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                p pVar = (p) create((List) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                pVar.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i11 = this.f38553a;
        b0 b0Var = this.f38554b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new Long(b0Var.f38426c.c());
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var = b0Var.H;
                do {
                    value = i1Var.getValue();
                    ((Boolean) value).getClass();
                } while (!i1Var.j(value, Boolean.FALSE));
                return qy.b0.f48488a;
        }
    }
}
