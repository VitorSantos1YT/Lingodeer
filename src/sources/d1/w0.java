package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f23009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j3.x0 f23012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f23013f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o3.p f23014t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m mVar, String str, long j11, j3.x0 x0Var, z0 z0Var, o3.p pVar, vy.d dVar) {
        super(2, dVar);
        this.f23009b = mVar;
        this.f23010c = str;
        this.f23011d = j11;
        this.f23012e = x0Var;
        this.f23013f = z0Var;
        this.f23014t = pVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new w0(this.f23009b, this.f23010c, this.f23011d, this.f23012e, this.f23013f, this.f23014t, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f23008a;
        String str = this.f23010c;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f23008a = 1;
            r rVar = (r) this.f23009b;
            rVar.getClass();
            if (str.length() == 0) {
                obj = null;
            } else {
                long j11 = this.f23011d;
                if (j3.x0.c(j11)) {
                    obj = null;
                } else {
                    obj = rz.e0.M(rVar.f22975a, new p(rVar, new q(j11, rVar, str, null), null), this);
                }
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        j3.x0 x0Var = (j3.x0) obj;
        qy.b0 b0Var = qy.b0.f48488a;
        if (x0Var != null) {
            long j12 = x0Var.f35823a;
            o3.p pVar = this.f23014t;
            long jB = j3.t.b(pVar.f((int) (j12 >> 32)), pVar.f((int) (j12 & 4294967295L)));
            if (!j3.x0.a(jB, this.f23012e)) {
                z0 z0Var = this.f23013f;
                if (kotlin.jvm.internal.m.a(z0Var.m().f44704a.f35700b, str) && pVar == z0Var.f23038b) {
                    z0Var.f23039c.invoke(z0.e(z0Var.m().f44704a, jB));
                    z0Var.f23058w = new j3.x0(jB);
                }
            }
        }
        return b0Var;
    }
}
