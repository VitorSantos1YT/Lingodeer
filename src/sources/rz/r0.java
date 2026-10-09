package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f50948f;

    public /* synthetic */ r0(Object obj, int i11) {
        this.f50947e = i11;
        this.f50948f = obj;
    }

    @Override // rz.i1
    public final boolean i() {
        switch (this.f50947e) {
        }
        return false;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        switch (this.f50947e) {
            case 0:
                ((q0) this.f50948f).dispose();
                break;
            case 1:
                ((fz.c) this.f50948f).invoke(th2);
                break;
            default:
                j1 j1Var = (j1) this.f50948f;
                Object obj = q1.f50945a.get(h());
                if (!(obj instanceof v)) {
                    j1Var.resumeWith(e0.K(obj));
                } else {
                    j1Var.resumeWith(com.bumptech.glide.e.l(((v) obj).f50961a));
                }
                break;
        }
    }
}
