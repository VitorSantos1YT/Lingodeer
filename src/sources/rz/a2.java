package rz;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends wz.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(vy.i iVar, vy.d dVar, int i11) {
        super(dVar, iVar);
        this.f50867e = i11;
    }

    @Override // rz.q1
    public final boolean u(Throwable th2) {
        switch (this.f50867e) {
            case 0:
                return false;
            default:
                if (th2 instanceof ChildCancelledException) {
                    return true;
                }
                return q(th2);
        }
    }
}
