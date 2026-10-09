package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f3486b;

    public /* synthetic */ d2(c2 c2Var, int i11) {
        this.f3485a = i11;
        this.f3486b = c2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f3485a) {
            case 0:
                return new f2(this.f3486b, 1);
            default:
                return new f2(this.f3486b, 0);
        }
    }
}
