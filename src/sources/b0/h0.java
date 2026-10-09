package b0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements b3 {
    public long H;
    public final /* synthetic */ j0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Number f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Number f3551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f3552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r1 f3554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3555f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3556t;

    public h0(j0 j0Var, Number number, Number number2, j2 j2Var, g0 g0Var) {
        this.K = j0Var;
        this.f3550a = number;
        this.f3551b = number2;
        this.f3552c = j2Var;
        this.f3553d = l1.t.B(number);
        this.f3554e = new r1(g0Var, j2Var, this.f3550a, this.f3551b, null);
    }

    @Override // l1.b3
    public final Object getValue() {
        return this.f3553d.getValue();
    }
}
