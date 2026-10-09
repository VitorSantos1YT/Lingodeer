package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f4775b;

    public /* synthetic */ q2(r2 r2Var, int i11) {
        this.f4774a = i11;
        this.f4775b = r2Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4774a) {
            case 0:
                return ef.e.q(this.f4775b).a(null, null, kotlin.jvm.internal.z.a(dv.u0.class));
            default:
                return this.f4775b;
        }
    }
}
