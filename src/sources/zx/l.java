package zx;

import re.e0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f59619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f59620f;

    public l(d dVar, int i11) {
        super(dVar);
        this.f59617c = i11;
        this.f59618d = true;
        this.f59619e = vx.b.f54314c;
        this.f59620f = vx.b.f54315d;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        this.f59592b.d(new k(bVar, this.f59617c, this.f59618d, this.f59619e, this.f59620f));
    }
}
