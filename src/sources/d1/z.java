package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0.a1 f23036b;

    public /* synthetic */ z(s0.a1 a1Var, int i11) {
        this.f23035a = i11;
        this.f23036b = a1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23035a) {
            case 0:
                s2.t tVar = (s2.t) obj;
                this.f23036b.e(s2.s.g(tVar, false));
                tVar.a();
                break;
            default:
                this.f23036b.b(((f2.b) obj).f26570a);
                break;
        }
        return qy.b0.f48488a;
    }
}
