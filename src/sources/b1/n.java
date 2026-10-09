package b1;

import android.os.CancellationSignal;
import d1.z0;
import j3.x0;
import rz.z1;
import s0.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3797b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f3796a = i11;
        this.f3797b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f3796a) {
            case 0:
                z0 z0Var = (z0) this.f3797b;
                if (z0Var != null) {
                    s0 s0Var = z0Var.f23040d;
                    if (s0Var != null) {
                        s0Var.e(x0.f35821b);
                    }
                    s0 s0Var2 = z0Var.f23040d;
                    if (s0Var2 != null) {
                        s0Var2.f(x0.f35821b);
                    }
                }
                break;
            default:
                ((z1) this.f3797b).cancel(null);
                break;
        }
    }
}
