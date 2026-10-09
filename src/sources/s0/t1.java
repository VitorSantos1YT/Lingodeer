package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qp.r f51196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qp.r f51197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f51199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51200e;

    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    public final void a(o3.w wVar) {
        qp.r rVar;
        o3.w wVar2;
        this.f51200e = false;
        qp.r rVar2 = this.f51196a;
        if (kotlin.jvm.internal.m.a(wVar, rVar2 != null ? (o3.w) rVar2.f48146c : null)) {
            return;
        }
        String str = wVar.f44704a.f35700b;
        qp.r rVar3 = this.f51196a;
        if (kotlin.jvm.internal.m.a(str, (rVar3 == null || (wVar2 = (o3.w) rVar3.f48146c) == null) ? null : wVar2.f44704a.f35700b)) {
            qp.r rVar4 = this.f51196a;
            if (rVar4 != null) {
                rVar4.f48146c = wVar;
                return;
            }
            return;
        }
        this.f51196a = new qp.r(2, this.f51196a, wVar);
        this.f51197b = null;
        int length = wVar.f44704a.f35700b.length() + this.f51198c;
        this.f51198c = length;
        if (length > 100000) {
            qp.r rVar5 = this.f51196a;
            if ((rVar5 != null ? (qp.r) rVar5.f48145b : null) == null) {
                return;
            }
            while (true) {
                if (rVar5 == null) {
                    rVar = null;
                } else {
                    qp.r rVar6 = (qp.r) rVar5.f48145b;
                    if (rVar6 != null) {
                        rVar = (qp.r) rVar6.f48145b;
                    } else {
                        rVar = null;
                    }
                }
                if (rVar == null) {
                    break;
                } else {
                    rVar5 = (qp.r) rVar5.f48145b;
                }
            }
            if (rVar5 != null) {
                rVar5.f48145b = null;
            }
        }
    }
}
