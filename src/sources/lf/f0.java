package lf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40023a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se.o f40024b;

    public /* synthetic */ f0(se.o oVar) {
        this.f40024b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40023a) {
            case 0:
                this.f40024b.getClass();
                break;
            default:
                this.f40024b.getClass();
                a0.a(new nf.f(28), x.AAM);
                a0.a(new se.n(11), x.RestrictiveDataFiltering);
                a0.a(new se.n(12), x.PrivacyProtection);
                a0.a(new se.n(13), x.EventDeactivation);
                a0.a(new nf.f(29), x.BannedParamFiltering);
                a0.a(new se.n(0), x.IapLogging);
                a0.a(new se.n(1), x.StdParamEnforcement);
                a0.a(new se.n(2), x.ProtectedMode);
                a0.a(new se.n(3), x.MACARuleMatching);
                a0.a(new se.n(4), x.BlocklistEvents);
                a0.a(new se.n(5), x.FilterRedactedEvents);
                a0.a(new se.n(6), x.FilterSensitiveParams);
                a0.a(new se.n(7), x.CloudBridge);
                a0.a(new se.n(8), x.GPSARATriggers);
                a0.a(new se.n(9), x.GPSPACAProcessing);
                a0.a(new se.n(10), x.GPSTopicsObservation);
                break;
        }
    }

    public /* synthetic */ f0(se.o oVar, e0 e0Var) {
        this.f40024b = oVar;
    }
}
