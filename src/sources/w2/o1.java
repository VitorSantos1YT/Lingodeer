package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f54556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(p1 p1Var, int i11) {
        super(2);
        this.f54555a = i11;
        this.f54556b = p1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54555a) {
            case 0:
                this.f54556b.a().f54543b = (l1.w) obj2;
                break;
            case 1:
                m0 m0VarA = this.f54556b.a();
                ((y2.i0) obj).f0(new j0(m0VarA, (fz.e) obj2, m0VarA.R));
                break;
            default:
                y2.i0 i0Var = (y2.i0) obj;
                p1 p1Var = this.f54556b;
                s1 s1Var = p1Var.f54559a;
                m0 m0Var = i0Var.f56894k0;
                if (m0Var == null) {
                    m0Var = new m0(i0Var, s1Var);
                    i0Var.f56894k0 = m0Var;
                }
                p1Var.f54560b = m0Var;
                p1Var.a().g();
                m0 m0VarA2 = p1Var.a();
                if (m0VarA2.f54544c != s1Var) {
                    m0VarA2.f54544c = s1Var;
                    m0VarA2.h(false);
                    y2.i0.Y(m0VarA2.f54542a, false, 7);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
