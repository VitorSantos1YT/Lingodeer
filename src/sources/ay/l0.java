package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends qx.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3341c;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f3340b = i11;
        this.f3341c = obj;
    }

    @Override // qx.p
    public final void I(qx.q qVar) {
        switch (this.f3340b) {
            case 0:
                ((qx.h) this.f3341c).i(new b(qVar));
                break;
            default:
                cy.a aVar = new cy.a(qVar);
                qVar.c(aVar);
                try {
                    ((com.google.android.datatransport.runtime.scheduling.jobscheduling.e) this.f3341c).h(aVar);
                } catch (Throwable th2) {
                    ef.e.E(th2);
                    aVar.a(th2);
                }
                break;
        }
    }
}
