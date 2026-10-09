package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39431b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f39430a = i11;
        this.f39431b = obj;
    }

    public final void a() {
        switch (this.f39430a) {
            case 0:
                ((s) this.f39431b).A--;
                break;
            default:
                ((x1.t) this.f39431b).f55722k--;
                break;
        }
    }

    public final void b() {
        switch (this.f39430a) {
            case 0:
                ((s) this.f39431b).A++;
                break;
            default:
                ((x1.t) this.f39431b).f55722k++;
                break;
        }
    }
}
