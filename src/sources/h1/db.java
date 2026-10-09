package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class db extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f30165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ za f30166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(yb ybVar, za zaVar, int i11, int i12) {
        super(2);
        this.f30164a = i12;
        this.f30165b = ybVar;
        this.f30166c = zaVar;
        this.f30167d = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f30164a;
        l1.n nVar = (l1.n) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                wb.a(this.f30165b, this.f30166c, nVar, l1.t.M(this.f30167d | 1));
                break;
            case 1:
                wb.c(this.f30165b, this.f30166c, nVar, l1.t.M(this.f30167d | 1));
                break;
            default:
                wb.i(this.f30165b, this.f30166c, nVar, l1.t.M(this.f30167d | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
