package ko;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f38337b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f38338c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f38339d = new c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f38340e = new c(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38341a;

    public /* synthetic */ c(int i11) {
        this.f38341a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f38341a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 1:
                Throwable p11 = (Throwable) obj;
                m.f(p11, "p0");
                p11.printStackTrace();
                break;
            case 2:
                Throwable p12 = (Throwable) obj;
                m.f(p12, "p0");
                p12.printStackTrace();
                break;
            default:
                Throwable p13 = (Throwable) obj;
                m.f(p13, "p0");
                p13.printStackTrace();
                break;
        }
    }
}
