package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f50261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ke f50262c;

    public /* synthetic */ q1(a2 a2Var, ke keVar, int i11) {
        this.f50260a = i11;
        this.f50261b = a2Var;
        this.f50262c = keVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zF;
        switch (this.f50260a) {
            case 0:
                c1 it = (c1) obj;
                kotlin.jvm.internal.m.f(it, "it");
                zF = this.f50261b.f(it, this.f50262c);
                break;
            case 1:
                c1 it2 = (c1) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                zF = this.f50261b.f(it2, this.f50262c);
                break;
            case 2:
                oe it3 = (oe) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                zF = this.f50261b.f(it3.f50221b, this.f50262c);
                break;
            default:
                zF = this.f50261b.f(((oe) obj).f50221b, this.f50262c);
                break;
        }
        return Boolean.valueOf(zF);
    }
}
