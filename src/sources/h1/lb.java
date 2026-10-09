package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class lb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f30622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f30623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za f30624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(yb ybVar, z1.r rVar, za zaVar, int i11, int i12) {
        super(2);
        this.f30621a = 1;
        this.f30622b = ybVar;
        this.f30623c = rVar;
        this.f30624d = zaVar;
        this.f30625e = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30621a) {
            case 0:
                ((Number) obj2).intValue();
                int iM = l1.t.M(this.f30625e | 1);
                wb.d(this.f30623c, this.f30622b, this.f30624d, (l1.n) obj, iM);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM2 = l1.t.M(1);
                wb.g(this.f30622b, this.f30623c, this.f30624d, this.f30625e, (l1.n) obj, iM2);
                break;
            default:
                ((Number) obj2).intValue();
                int iM3 = l1.t.M(this.f30625e | 1);
                wb.j(this.f30623c, this.f30622b, this.f30624d, (l1.n) obj, iM3);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(z1.r rVar, yb ybVar, za zaVar, int i11, int i12) {
        super(2);
        this.f30621a = i12;
        this.f30623c = rVar;
        this.f30622b = ybVar;
        this.f30624d = zaVar;
        this.f30625e = i11;
    }
}
