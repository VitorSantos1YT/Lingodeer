package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f54238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, String str, long j11, vy.d dVar) {
        super(1, dVar);
        this.f54236b = rVar;
        this.f54237c = str;
        this.f54238d = j11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new j(this.f54236b, this.f54237c, this.f54238d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((j) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f54235a;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f54238d;
        String str = this.f54237c;
        r rVar = this.f54236b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            au.m mVar = rVar.f54283c;
            this.f54235a = 1;
            Object objC = cf.x.C(this, mVar.f3044a, false, true, new au.h(j11, str, 1));
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        au.i iVar = rVar.f54282b;
        this.f54235a = 2;
        Object objC2 = cf.x.C(this, iVar.f3011a, false, true, new au.h(j11, str, 0));
        if (objC2 != aVar) {
            objC2 = b0Var;
        }
        return objC2 == aVar ? aVar : b0Var;
    }
}
