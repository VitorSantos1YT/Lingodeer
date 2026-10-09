package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f46432b;

    public /* synthetic */ n0(s0 s0Var, int i11) {
        this.f46431a = i11;
        this.f46432b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46431a) {
            case 0:
                this.f46432b.z();
                break;
            case 1:
                s0 s0Var = this.f46432b;
                if (!s0Var.f46486q0) {
                    y yVar = s0Var.T;
                    yVar.getClass();
                    yVar.b(s0Var);
                }
                break;
            default:
                this.f46432b.f46480k0 = true;
                break;
        }
    }
}
