package l0;

import b0.h2;
import n0.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h2 {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;
    public final /* synthetic */ z1.d L;
    public final /* synthetic */ z1.i M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ long P;
    public final /* synthetic */ w Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f39127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f39128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f39130f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f39131t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j11, boolean z11, j jVar, d0 d0Var, int i11, int i12, z1.d dVar, z1.i iVar, int i13, int i14, long j12, w wVar) {
        super(6);
        this.f39130f = z11;
        this.f39131t = d0Var;
        this.H = i11;
        this.K = i12;
        this.L = dVar;
        this.M = iVar;
        this.N = i13;
        this.O = i14;
        this.P = j12;
        this.Q = wVar;
        this.f39127c = jVar;
        this.f39128d = d0Var;
        this.f39129e = v3.b.b(z11 ? v3.a.h(j11) : Integer.MAX_VALUE, z11 ? Integer.MAX_VALUE : v3.a.g(j11), 5);
    }

    public final p s0(int i11, long j11) {
        j jVar = this.f39127c;
        Object objA = jVar.a(i11);
        Object objJ = jVar.f39117b.j(i11);
        return new p(i11, Z(this.f39128d, i11, j11), this.f39130f, this.L, this.M, this.f39131t.f42933b.getLayoutDirection(), this.N, this.O, i11 == this.H + (-1) ? 0 : this.K, this.P, objA, objJ, this.Q.f39214n, j11);
    }
}
