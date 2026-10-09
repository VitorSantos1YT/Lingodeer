package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements g2.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31145b;

    public /* synthetic */ u3(Object obj, int i11) {
        this.f31144a = i11;
        this.f31145b = obj;
    }

    @Override // g2.y
    public final long a() {
        switch (this.f31144a) {
            case 0:
                w3 w3Var = (w3) this.f31145b;
                long jA = w3Var.V.a();
                if (jA != 16) {
                    return jA;
                }
                j7 j7Var = (j7) y2.f.i(w3Var, l7.f30605b);
                if (j7Var != null) {
                    long j11 = j7Var.f30484a;
                    if (j11 != 16) {
                        return j11;
                    }
                }
                return ((g2.x) y2.f.i(w3Var, h2.f30320a)).f28624a;
            default:
                return ((m7) this.f31145b).f30688c;
        }
    }
}
