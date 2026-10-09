package tp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f52447b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f52448c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f52449d = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52450a;

    public /* synthetic */ d(int i11) {
        this.f52450a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f52450a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 1:
                Throwable p11 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                p11.printStackTrace();
                break;
            default:
                Throwable p12 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                p12.printStackTrace();
                break;
        }
    }
}
