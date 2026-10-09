package y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends xy.h implements fz.e {
    public final /* synthetic */ nz.k H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nz.k f56702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f56703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f56704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f56707f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h0 f56708t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, nz.k kVar, vy.d dVar) {
        super(2, dVar);
        this.f56708t = h0Var;
        this.H = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        g0 g0Var = new g0(this.f56708t, this.H, dVar);
        g0Var.f56707f = obj;
        return g0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        long[] jArr;
        int i11;
        nz.k kVar;
        nz.m mVar;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f56706e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            nz.m mVar2 = (nz.m) this.f56707f;
            h0Var = this.f56708t;
            f0 f0Var = h0Var.f56711b;
            jArr = f0Var.f56694c;
            i11 = f0Var.f56696e;
            kVar = this.H;
            mVar = mVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = this.f56705d;
            long[] jArr2 = this.f56704c;
            h0 h0Var2 = this.f56703b;
            kVar = this.f56702a;
            mVar = (nz.m) this.f56707f;
            com.bumptech.glide.e.F(obj);
            i11 = i13;
            h0Var = h0Var2;
            jArr = jArr2;
        }
        while (i11 != Integer.MAX_VALUE) {
            int i14 = (int) ((jArr[i11] >> 31) & 2147483647L);
            kVar.f44331b = i11;
            Object obj2 = h0Var.f56711b.f56693b[i11];
            this.f56707f = mVar;
            this.f56702a = kVar;
            this.f56703b = h0Var;
            this.f56704c = jArr;
            this.f56705d = i14;
            this.f56706e = 1;
            if (mVar.c(obj2, this) == aVar) {
                return aVar;
            }
            i11 = i14;
        }
        return qy.b0.f48488a;
    }
}
