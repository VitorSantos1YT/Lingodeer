package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1836b;

    public /* synthetic */ t(Object obj, int i11) {
        this.f1835a = i11;
        this.f1836b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1835a) {
            case 0:
                y yVar = (y) this.f1836b;
                yVar.f1872d.onDismiss(yVar.N);
                break;
            case 1:
                s sVar = (s) this.f1836b;
                if (!sVar.f1827b.isEmpty()) {
                    sVar.e();
                }
                break;
            default:
                ((k1) this.f1836b).z(true);
                break;
        }
    }
}
