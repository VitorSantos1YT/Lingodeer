package qa;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f47593b;

    public /* synthetic */ a0() {
        this.f47592a = 1;
    }

    @Override // qa.w, qa.t
    public void a(v vVar) {
        switch (this.f47592a) {
            case 1:
                b0 b0Var = (b0) this.f47593b;
                if (!b0Var.f47598l0) {
                    b0Var.Q();
                    b0Var.f47598l0 = true;
                }
                break;
        }
    }

    @Override // qa.w, qa.t
    public void c(v vVar) {
        switch (this.f47592a) {
            case 1:
                b0 b0Var = (b0) this.f47593b;
                int i11 = b0Var.f47597k0 - 1;
                b0Var.f47597k0 = i11;
                if (i11 == 0) {
                    b0Var.f47598l0 = false;
                    b0Var.o();
                }
                vVar.E(this);
                break;
            case 2:
                this.f47593b.I();
                vVar.E(this);
                break;
        }
    }

    @Override // qa.w, qa.t
    public void f(v vVar) {
        switch (this.f47592a) {
            case 0:
                b0 b0Var = (b0) this.f47593b;
                b0Var.f47595i0.remove(vVar);
                if (!b0Var.w()) {
                    b0Var.B(b0Var, u.f47671z, false);
                    b0Var.V = true;
                    b0Var.B(b0Var, u.f47670y, false);
                }
                break;
        }
    }

    public /* synthetic */ a0(v vVar, int i11) {
        this.f47592a = i11;
        this.f47593b = vVar;
    }
}
