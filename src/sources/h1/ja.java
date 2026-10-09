package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ja extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0.i f30496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha f30499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(h0.i iVar, boolean z11, boolean z12, ha haVar) {
        super(3);
        la laVar = la.f30616a;
        la laVar2 = la.f30616a;
        this.f30496a = iVar;
        this.f30497b = z11;
        this.f30498c = z12;
        this.f30499d = haVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(-891038934);
        l1.b1 b1VarD = i1.d1.d(this.f30497b, this.f30498c, ((Boolean) com.bumptech.glide.f.m(this.f30496a, sVar, 0).getValue()).booleanValue(), this.f30499d, la.f30620e, la.f30619d, sVar, 0);
        int i11 = qa.f30936a;
        z1.r rVarF = d2.h.f(z1.o.f58481a, new i2(1, b1VarD));
        sVar.p(false);
        return rVarF;
    }
}
