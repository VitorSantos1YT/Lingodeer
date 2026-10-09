package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.r f4744e;

    public /* synthetic */ o1(int i11, String str, String str2, z1.r rVar, int i12, int i13) {
        this.f4740a = i13;
        this.f4741b = i11;
        this.f4742c = str;
        this.f4743d = str2;
        this.f4744e = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4740a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                g1.b(this.f4741b, this.f4742c, this.f4743d, this.f4744e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                xu.q1.c(this.f4741b, this.f4742c, this.f4743d, this.f4744e, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
