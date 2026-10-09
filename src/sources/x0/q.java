package x0;

import android.app.RemoteAction;
import g2.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteAction f55619a;

    public q(RemoteAction remoteAction) {
        this.f55619a = remoteAction;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j11 = ((x) obj).f28624a;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            r.f55620a.c(this.f55619a.getIcon(), sVar, 48);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }
}
