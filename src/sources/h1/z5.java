package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f31404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f31405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(int i11, long j11, fz.a aVar, boolean z11) {
        super(2);
        this.f31404a = j11;
        this.f31405b = aVar;
        this.f31406c = z11;
        this.f31407d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a6.c(l1.t.M(this.f31407d | 1), this.f31404a, this.f31405b, (l1.n) obj, this.f31406c);
        return qy.b0.f48488a;
    }
}
