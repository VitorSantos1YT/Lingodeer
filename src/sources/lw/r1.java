package lw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f40449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b0 f40450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f40451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f40452d;

    public r1(t1 t1Var, s1 s1Var, com.android.billingclient.api.b0 b0Var, long j11) {
        this.f40452d = t1Var;
        this.f40449a = s1Var;
        this.f40450b = b0Var;
        this.f40451c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40452d.execute(this.f40449a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40450b.toString());
        sb2.append("(scheduled in SynchronizationContext with delay of ");
        return defpackage.e.i(this.f40451c, ")", sb2);
    }
}
