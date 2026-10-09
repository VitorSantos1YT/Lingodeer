package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53268a;

    @Override // uz.b1
    public final i a(vz.t tVar) {
        switch (this.f53268a) {
            case 0:
                return new gp.r(z0.START, 9);
            default:
                return new gp.r(new sr.d(tVar, null, 9));
        }
    }

    public final String toString() {
        switch (this.f53268a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
