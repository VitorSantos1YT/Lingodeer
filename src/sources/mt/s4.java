package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s4 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f41875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.e f41877d;

    public /* synthetic */ s4(float f5, qy.e eVar, int i11, int i12) {
        this.f41874a = i12;
        this.f41875b = f5;
        this.f41877d = eVar;
        this.f41876c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41874a) {
            case 0:
                ((Integer) obj2).intValue();
                int iM = l1.t.M(this.f41876c | 1);
                l5.o(this.f41875b, (fz.c) this.f41877d, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM2 = l1.t.M(this.f41876c | 1);
                l5.q(this.f41875b, (fz.a) this.f41877d, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
