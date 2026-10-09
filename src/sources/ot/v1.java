package ot;

import com.lingodeer.data.model.CourseWordModel010;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f46023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n9.q f46025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f46026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(vy.d dVar, n9.q qVar, long j11) {
        super(3, dVar);
        this.f46025d = qVar;
        this.f46026e = j11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v1 v1Var = new v1((vy.d) obj3, this.f46025d, this.f46026e);
        v1Var.f46023b = (uz.j) obj;
        v1Var.f46024c = obj2;
        return v1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f46022a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        uz.j jVar = this.f46023b;
        CourseWordModel010 courseWordModel010 = (CourseWordModel010) this.f46024c;
        gp.r rVar = new gp.r(new bh.c((bh.t) ((vt.i0) this.f46025d.f43673b), this.f46026e, (vy.d) null, 13));
        this.f46023b = null;
        this.f46024c = null;
        this.f46022a = 1;
        uz.x0.s(jVar);
        Object objCollect = rVar.collect(new bh.q(25, jVar, courseWordModel010), this);
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? aVar : b0Var;
    }
}
