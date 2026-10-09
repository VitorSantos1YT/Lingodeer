package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(Object obj, int i11, int i12) {
        super(2);
        this.f31203a = i12;
        this.f31205c = obj;
        this.f31204b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f31203a;
        l1.n nVar = (l1.n) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                x9.d((fz.e) this.f31205c, nVar, l1.t.M(this.f31204b | 1));
                break;
            default:
                wb.n((z1.r) this.f31205c, nVar, l1.t.M(this.f31204b | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
