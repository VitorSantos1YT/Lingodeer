package j0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements w2.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f35341b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f35342c = new n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35343a;

    public /* synthetic */ n(int i11) {
        this.f35343a = i11;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        switch (this.f35343a) {
            case 0:
                return s0Var.q0(v3.a.j(j11), v3.a.i(j11), ry.s.f50855a, new com.lingo.lingoskill.object.a(27));
            default:
                return s0Var.q0(v3.a.f(j11) ? v3.a.h(j11) : 0, v3.a.e(j11) ? v3.a.g(j11) : 0, ry.s.f50855a, new com.lingo.lingoskill.object.a(27));
        }
    }
}
