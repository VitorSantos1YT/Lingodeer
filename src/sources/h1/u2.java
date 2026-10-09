package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(u8 u8Var, z1.r rVar, int i11) {
        super(2);
        this.f31140a = 2;
        t1.d dVar = e2.f30192a;
        this.f31143d = u8Var;
        this.f31142c = rVar;
        this.f31141b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f31140a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f31141b;
        Object obj3 = this.f31143d;
        Object obj4 = this.f31142c;
        l1.n nVar = (l1.n) obj;
        ((Number) obj2).intValue();
        switch (i11) {
            case 0:
                int iM = l1.t.M(7);
                y2.d(i12, iM, (fz.c) obj3, nVar, (z1.r) obj4);
                break;
            case 1:
                y2.f((m2) obj4, (i1.x) obj3, nVar, l1.t.M(i12 | 1));
                break;
            case 2:
                t1.d dVar = e2.f30192a;
                k7.f((u8) obj3, (z1.r) obj4, nVar, l1.t.M(i12 | 1));
                break;
            case 3:
                ua.a((j3.y0) obj4, (fz.e) obj3, nVar, l1.t.M(i12 | 1));
                break;
            case 4:
                ub.a.I((c6.l) obj4, i12, (t1.d) obj3, nVar, 3073);
                break;
            default:
                androidx.compose.ui.window.a.b((z1.r) obj4, (fz.e) obj3, nVar, l1.t.M(i12 | 1));
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, int i11, int i12, Object obj2) {
        super(2);
        this.f31140a = i12;
        this.f31142c = obj;
        this.f31143d = obj2;
        this.f31141b = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, int i11, qy.e eVar, int i12, int i13) {
        super(2);
        this.f31140a = i13;
        this.f31142c = obj;
        this.f31141b = i11;
        this.f31143d = eVar;
    }
}
