package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f6237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6239e;

    public /* synthetic */ z(int i11, String str, int i12, z1.r rVar, int i13) {
        this.f6235a = 4;
        this.f6238d = i11;
        this.f6236b = str;
        this.f6239e = i12;
        this.f6237c = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6235a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(385);
                i0.g(this.f6238d, this.f6239e, iM, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dt.a0.o(l1.t.M(this.f6238d | 1), this.f6239e, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv.o.f(l1.t.M(this.f6238d | 1), this.f6239e, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                km.b1.o(l1.t.M(this.f6238d | 1), this.f6239e, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                mt.y3.m(this.f6238d, this.f6239e, iM2, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(this.f6239e | 1);
                xu.a1.b(this.f6238d, iM3, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            case 6:
                ((Integer) obj2).getClass();
                xu.q1.k(l1.t.M(this.f6238d | 1), this.f6239e, this.f6236b, (l1.n) obj, this.f6237c);
                break;
            default:
                ((Integer) obj2).getClass();
                xu.q1.i(l1.t.M(this.f6238d | 1), this.f6239e, this.f6236b, (l1.n) obj, this.f6237c);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ z(int i11, String str, z1.r rVar, int i12) {
        this.f6235a = 5;
        this.f6238d = i11;
        this.f6236b = str;
        this.f6237c = rVar;
        this.f6239e = i12;
    }

    public /* synthetic */ z(String str, int i11, int i12, z1.r rVar, int i13) {
        this.f6235a = 0;
        this.f6236b = str;
        this.f6238d = i11;
        this.f6239e = i12;
        this.f6237c = rVar;
    }

    public /* synthetic */ z(String str, z1.r rVar, int i11, int i12, int i13) {
        this.f6235a = i13;
        this.f6236b = str;
        this.f6237c = rVar;
        this.f6238d = i11;
        this.f6239e = i12;
    }
}
