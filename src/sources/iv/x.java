package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f34861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.t f34862c;

    public /* synthetic */ x(o0.t tVar, rz.b0 b0Var, int i11) {
        this.f34860a = i11;
        this.f34862c = tVar;
        this.f34861b = b0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f34860a) {
            case 0:
                rz.e0.B(this.f34861b, null, null, new d0(2, this.f34862c, null), 3);
                break;
            case 1:
                rz.e0.B(this.f34861b, null, null, new d0(0, this.f34862c, null), 3);
                break;
            case 2:
                rz.e0.B(this.f34861b, null, null, new d0(1, this.f34862c, null), 3);
                break;
            case 3:
                o0.t tVar = this.f34862c;
                if (tVar.c()) {
                    rz.e0.B(this.f34861b, null, null, new d0(3, tVar, null), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 4:
                o0.t tVar2 = this.f34862c;
                if (tVar2.d()) {
                    rz.e0.B(this.f34861b, null, null, new d0(4, tVar2, null), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 5:
                o0.t tVar3 = this.f34862c;
                if (tVar3.c()) {
                    rz.e0.B(this.f34861b, null, null, new d0(3, tVar3, null), 3);
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                o0.t tVar4 = this.f34862c;
                if (tVar4.d()) {
                    rz.e0.B(this.f34861b, null, null, new d0(4, tVar4, null), 3);
                    z14 = true;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ x(rz.b0 b0Var, o0.t tVar, int i11) {
        this.f34860a = i11;
        this.f34861b = b0Var;
        this.f34862c = tVar;
    }
}
