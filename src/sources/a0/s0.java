package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.c2 f181b;

    public /* synthetic */ s0(b0.c2 c2Var, int i11) {
        this.f180a = i11;
        this.f181b = c2Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f180a) {
            case 0:
                return this.f181b.f3461d.getValue();
            default:
                return this.f181b.f();
        }
    }
}
