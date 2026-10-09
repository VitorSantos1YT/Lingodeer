package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements b7.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26907b;

    public /* synthetic */ s(boolean z11, int i11) {
        this.f26906a = i11;
        this.f26907b = z11;
    }

    @Override // b7.k
    public final void invoke(Object obj) {
        switch (this.f26906a) {
            case 0:
                ((y6.h0) obj).n(this.f26907b);
                break;
            default:
                ((y6.h0) obj).v(this.f26907b);
                break;
        }
    }
}
