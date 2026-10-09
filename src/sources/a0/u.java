package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, w2.g1 g1Var, long j11) {
        super(1);
        this.f194a = wVar;
        this.f195b = g1Var;
        this.f196c = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        z1.e eVar = this.f194a.T.f235b;
        w2.g1 g1Var = this.f195b;
        w2.f1.i((w2.f1) obj, g1Var, eVar.a((((long) g1Var.f54502b) & 4294967295L) | (((long) g1Var.f54501a) << 32), this.f196c, v3.m.Ltr));
        return qy.b0.f48488a;
    }
}
