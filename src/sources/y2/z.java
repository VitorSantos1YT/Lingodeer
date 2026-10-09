package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface z extends m {
    default int E(q0 q0Var, w2.p0 p0Var, int i11) {
        return b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, m1.Min, n1.Width, 2), v3.b.b(0, i11, 7)).h();
    }

    default int L(q0 q0Var, w2.p0 p0Var, int i11) {
        return b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, m1.Max, n1.Width, 2), v3.b.b(0, i11, 7)).h();
    }

    w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11);

    default int p(q0 q0Var, w2.p0 p0Var, int i11) {
        return b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, m1.Min, n1.Height, 2), v3.b.b(i11, 0, 13)).f();
    }

    default int t(q0 q0Var, w2.p0 p0Var, int i11) {
        return b(new w2.w(q0Var, q0Var.getLayoutDirection()), new w2.k(p0Var, m1.Max, n1.Height, 2), v3.b.b(i11, 0, 13)).f();
    }
}
