package qh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f47744b = new b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f47745c = new b0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47746a;

    public /* synthetic */ b0(int i11) {
        this.f47746a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f47746a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                p4.printStackTrace();
                break;
            default:
                Throwable p11 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                p11.printStackTrace();
                break;
        }
    }
}
