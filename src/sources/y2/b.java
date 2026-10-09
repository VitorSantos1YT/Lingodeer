package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f56823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i11) {
        super(0);
        this.f56822a = i11;
        this.f56823b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56822a) {
            case 0:
                this.f56823b.V0();
                break;
            default:
                c cVar = this.f56823b;
                z1.p pVar = cVar.Q;
                kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((x2.c) pVar).e(cVar);
                break;
        }
        return qy.b0.f48488a;
    }
}
