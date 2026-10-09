package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5690d;

    public /* synthetic */ m(boolean z11, ys.d0 d0Var, l1.b1 b1Var, int i11) {
        this.f5687a = i11;
        this.f5688b = z11;
        this.f5689c = d0Var;
        this.f5690d = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        ys.d0 d0Var;
        switch (this.f5687a) {
            case 0:
                boolean z11 = this.f5688b;
                ys.d0 d0Var2 = this.f5689c;
                if (z11) {
                    l1.b1 b1Var = this.f5690d;
                    ht.q qVar = (ht.q) b1Var.getValue();
                    ht.q qVar2 = ht.q.CORRECT;
                    if (qVar != qVar2) {
                        if (d0Var2 != null) {
                            d0Var2.b(true, true);
                        }
                        b1Var.setValue(qVar2);
                    }
                } else if (d0Var2 != null) {
                    d0Var2.f();
                }
                break;
            default:
                if (!this.f5688b && (d0Var = this.f5689c) != null) {
                    d0Var.b(true, true);
                }
                this.f5690d.setValue(ht.q.SELECTED);
                break;
        }
        return qy.b0.f48488a;
    }
}
