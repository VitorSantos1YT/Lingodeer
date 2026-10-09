package xt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f56314b;

    public /* synthetic */ p(q qVar, int i11) {
        this.f56313a = i11;
        this.f56314b = qVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11;
        switch (this.f56313a) {
            case 0:
                i11 = this.f56314b.f56315a.krMFSwitch;
                break;
            case 1:
                i11 = this.f56314b.f56315a.jpupMFSwitch;
                break;
            case 2:
                i11 = this.f56314b.f56315a.cnupMFSwitch;
                break;
            default:
                i11 = this.f56314b.f56315a.enMFSwitch;
                break;
        }
        return Integer.valueOf(i11);
    }
}
