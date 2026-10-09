package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.i2 f5836b;

    public /* synthetic */ p4(jt.i2 i2Var, int i11) {
        this.f5835a = i11;
        this.f5836b = i2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5835a) {
            case 0:
                w2.x it = (w2.x) obj;
                kotlin.jvm.internal.m.f(it, "it");
                jt.i2 i2Var = this.f5836b;
                i2Var.f36977b.setValue(new f2.b(it.c(0L)));
                i2Var.f36980e.setValue(it);
                break;
            default:
                jt.i2 i2Var2 = this.f5836b;
                i2Var2.f36976a.setValue(null);
                i2Var2.f36978c.setValue((f2.b) obj);
                break;
        }
        return qy.b0.f48488a;
    }
}
