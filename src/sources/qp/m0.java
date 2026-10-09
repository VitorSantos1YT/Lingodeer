package qp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f48049b;

    public /* synthetic */ m0(p0 p0Var, int i11) {
        this.f48048a = i11;
        this.f48049b = p0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48048a) {
            case 0:
                p0 p0Var = this.f48049b;
                ta.a aVar = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.n1) aVar).f32956e.setJustifyContent(2);
                ta.a aVar2 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.n1) aVar2).m.setGravity(17);
                break;
            case 1:
                this.f48049b.u();
                break;
            default:
                ta.a aVar3 = this.f48049b.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.n1) aVar3).f32966p.b();
                break;
        }
        return qy.b0.f48488a;
    }
}
