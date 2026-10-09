package b0;

import androidx.glance.session.SessionWorker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, Object obj, Object obj2, vy.d dVar) {
        super(1, dVar);
        this.f3449a = i11;
        this.f3450b = obj;
        this.f3451c = obj2;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f3449a) {
            case 0:
                return new c(0, (d) this.f3450b, this.f3451c, dVar);
            default:
                return new c(1, (m6.w) this.f3450b, (SessionWorker) this.f3451c, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f3449a) {
            case 0:
                c cVar = (c) create(dVar);
                qy.b0 b0Var = qy.b0.f48488a;
                cVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                c cVar2 = (c) create(dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                cVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f3449a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f3451c;
        Object obj3 = this.f3450b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                d dVar = (d) obj3;
                d.b(dVar);
                Object objA = d.a(dVar, obj2);
                dVar.f3472c.f3614b.setValue(objA);
                dVar.f3474e.setValue(objA);
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((m6.w) obj3).b(((SessionWorker) obj2).f2019i.f40929c);
                break;
        }
        return b0Var;
    }
}
