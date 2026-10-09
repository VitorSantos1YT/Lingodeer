package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f35300d;

    public h0(w2.p0 p0Var, w2.g1 g1Var, long j11) {
        this.f35299c = p0Var;
        this.f35300d = g1Var;
        this.f35298b = j11;
        this.f35297a = true;
    }

    public boolean a() {
        Boolean bool = (Boolean) this.f35300d;
        return bool != null ? bool.booleanValue() : this.f35297a;
    }

    public h0(boolean z11, String str) {
        this.f35297a = z11;
        this.f35299c = str;
    }
}
