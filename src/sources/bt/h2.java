package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2.l f5474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt.m1 f5475e;

    public /* synthetic */ h2(rz.b0 b0Var, l1.b1 b1Var, e2.l lVar, jt.m1 m1Var, int i11) {
        this.f5471a = i11;
        this.f5472b = b0Var;
        this.f5473c = b1Var;
        this.f5474d = lVar;
        this.f5475e = m1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5471a) {
            case 0:
                rz.e0.B(this.f5472b, null, null, new z2(this.f5475e, null, 0), 3);
                if (((Boolean) this.f5473c.getValue()).booleanValue()) {
                    e2.l.a(this.f5474d);
                }
                break;
            case 1:
                rz.e0.B(this.f5472b, null, null, new z2(this.f5475e, null, 6), 3);
                if (!((Boolean) this.f5473c.getValue()).booleanValue()) {
                    e2.l.a(this.f5474d);
                }
                break;
            default:
                rz.e0.B(this.f5472b, null, null, new z2(this.f5475e, null, 10), 3);
                if (((Boolean) this.f5473c.getValue()).booleanValue()) {
                    e2.l.a(this.f5474d);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
