package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av.j0 f36952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av.i f36953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av.n f36954d;

    public /* synthetic */ h(av.j0 j0Var, av.i iVar, av.n nVar, int i11) {
        this.f36951a = i11;
        this.f36952b = j0Var;
        this.f36953c = iVar;
        this.f36954d = nVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l1.j0 DisposableEffect = (l1.j0) obj;
        switch (this.f36951a) {
            case 0:
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new n(this.f36952b, this.f36953c, this.f36954d, 0);
            case 1:
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new n(this.f36952b, this.f36953c, this.f36954d, 1);
            default:
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new n(this.f36952b, this.f36953c, this.f36954d, 2);
        }
    }
}
