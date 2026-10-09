package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f31252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f31255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(long j11, long j12, boolean z11, t1.d dVar, int i11) {
        super(2);
        this.f31252a = j11;
        this.f31253b = j12;
        this.f31254c = z11;
        this.f31255d = dVar;
        this.f31256e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        x9.c(this.f31252a, this.f31253b, this.f31254c, this.f31255d, (l1.n) obj, l1.t.M(this.f31256e | 1));
        return qy.b0.f48488a;
    }
}
