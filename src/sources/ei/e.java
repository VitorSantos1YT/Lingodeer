package ei;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25584a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25589f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25590t;

    public /* synthetic */ e(int i11, String str, String str2, long j11, long j12, long j13, int i12) {
        this.f25585b = i11;
        this.f25586c = str;
        this.f25590t = str2;
        this.f25587d = j11;
        this.f25588e = j12;
        this.f25589f = j13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25584a) {
            case 0:
                ((Integer) obj2).intValue();
                z.d(this.f25586c, (z1.r) this.f25590t, this.f25587d, this.f25588e, this.f25589f, (l1.n) obj, l1.t.M(this.f25585b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1769479);
                gr.n.c(this.f25585b, this.f25586c, (String) this.f25590t, this.f25587d, this.f25588e, this.f25589f, (l1.n) obj, iM);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ e(String str, z1.r rVar, long j11, long j12, long j13, int i11) {
        this.f25586c = str;
        this.f25590t = rVar;
        this.f25587d = j11;
        this.f25588e = j12;
        this.f25589f = j13;
        this.f25585b = i11;
    }
}
