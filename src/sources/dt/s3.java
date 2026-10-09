package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f24192c;

    public /* synthetic */ s3(boolean z11, c1 c1Var, int i11) {
        this.f24190a = i11;
        this.f24191b = z11;
        this.f24192c = c1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        fz.c cVar;
        fz.c cVar2;
        l1.j0 DisposableEffect = (l1.j0) obj;
        switch (this.f24190a) {
            case 0:
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                boolean z11 = this.f24191b;
                c1 c1Var = this.f24192c;
                if (z11 && c1Var != null && (cVar = c1Var.f23697c) != null) {
                    cVar.invoke(Boolean.TRUE);
                }
                return new c4(z11, c1Var, 0);
            default:
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                boolean z12 = this.f24191b;
                c1 c1Var2 = this.f24192c;
                if (z12 && c1Var2 != null && (cVar2 = c1Var2.f23697c) != null) {
                    cVar2.invoke(Boolean.TRUE);
                }
                return new c4(z12, c1Var2, 1);
        }
    }
}
