package b7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3953c;

    public /* synthetic */ b(c cVar, Object obj, int i11) {
        this.f3951a = i11;
        this.f3952b = cVar;
        this.f3953c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3951a) {
            case 0:
                c cVar = this.f3952b;
                if (cVar.f3958a == 0) {
                    cVar.i(this.f3953c);
                }
                break;
            default:
                c cVar2 = this.f3952b;
                int i11 = cVar2.f3958a - 1;
                cVar2.f3958a = i11;
                if (i11 == 0) {
                    cVar2.i(this.f3953c);
                }
                break;
        }
    }
}
