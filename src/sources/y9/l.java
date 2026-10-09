package y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements t, w9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57509b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f57508a = i11;
        this.f57509b = obj;
    }

    @Override // w9.m
    public final Object a(String str, fz.c cVar, xy.c cVar2) {
        switch (this.f57508a) {
            case 0:
                return ((s) this.f57509b).a(str, cVar, cVar2);
            default:
                return ((z9.e) this.f57509b).a(str, cVar, cVar2);
        }
    }

    @Override // y9.t
    public final ja.a c() {
        switch (this.f57508a) {
            case 0:
                return ((s) this.f57509b).f57537a;
            default:
                return ((z9.e) this.f57509b).f59041a;
        }
    }
}
