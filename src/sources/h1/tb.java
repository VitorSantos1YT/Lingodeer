package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class tb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0.e f31126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f31127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za f31128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.d f31129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31130f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(boolean z11, r0.e eVar, fz.a aVar, za zaVar, t1.d dVar, int i11) {
        super(2);
        this.f31125a = z11;
        this.f31126b = eVar;
        this.f31127c = aVar;
        this.f31128d = zaVar;
        this.f31129e = dVar;
        this.f31130f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wb.h(this.f31125a, this.f31126b, this.f31127c, this.f31128d, this.f31129e, (l1.n) obj, l1.t.M(this.f31130f | 1));
        return qy.b0.f48488a;
    }
}
