package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends m {
    public final q1 K;

    public j1(vy.d dVar, q1 q1Var) {
        super(1, dVar);
        this.K = q1Var;
    }

    @Override // rz.m
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // rz.m
    public final Throwable q(q1 q1Var) {
        Throwable thC;
        q1 q1Var2 = this.K;
        q1Var2.getClass();
        Object obj = q1.f50945a.get(q1Var2);
        if (!(obj instanceof l1) || (thC = ((l1) obj).c()) == null) {
            return obj instanceof v ? ((v) obj).f50961a : q1Var.getCancellationException();
        }
        return thC;
    }
}
