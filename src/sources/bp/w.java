package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4860a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f4862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f4863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4864e;

    public /* synthetic */ w(String str, int i11, fz.c cVar, fz.a aVar, int i12) {
        this.f4861b = str;
        this.f4864e = i11;
        this.f4863d = cVar;
        this.f4862c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4860a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(3079);
                g1.d(this.f4861b, this.f4864e, this.f4863d, this.f4862c, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(this.f4864e | 1);
                xu.c.h(this.f4861b, this.f4862c, this.f4863d, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ w(String str, fz.a aVar, fz.c cVar, int i11) {
        this.f4861b = str;
        this.f4862c = aVar;
        this.f4863d = cVar;
        this.f4864e = i11;
    }
}
