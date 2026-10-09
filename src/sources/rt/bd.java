package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bd implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd f49547b;

    public /* synthetic */ bd(dd ddVar, int i11) {
        this.f49546a = i11;
        this.f49547b = ddVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f49546a) {
            case 0:
                this.f49547b.f50706c0.k((fb) obj);
                return qy.b0.f48488a;
            case 1:
                this.f49547b.f50706c0.k((fb) obj);
                return qy.b0.f48488a;
            case 2:
                ht.o params = (ht.o) obj;
                kotlin.jvm.internal.m.f(params, "params");
                return this.f49547b.i(params);
            case 3:
                ht.o params2 = (ht.o) obj;
                kotlin.jvm.internal.m.f(params2, "params");
                return this.f49547b.w(params2);
            default:
                this.f49547b.d(((Long) obj).longValue());
                return qy.b0.f48488a;
        }
    }
}
