package b6;

import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import kotlin.jvm.internal.u;
import l1.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f3931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f3932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3934d;

    public c(k1 k1Var, k0 k0Var, f fVar, u uVar) {
        this.f3931a = k1Var;
        this.f3932b = k0Var;
        this.f3933c = fVar;
        this.f3934d = uVar;
    }

    @Override // l1.i0
    public final void dispose() {
        k1 k1Var = this.f3931a;
        k0 k0Var = this.f3932b;
        this.f3933c.f3944a.setValue(k1Var.b0(k0Var));
        if (!this.f3934d.f38357a) {
            if (k1Var.P()) {
                return;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k1Var);
            aVar.l(k0Var);
            aVar.j();
            return;
        }
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(k1Var);
        aVar2.l(k0Var);
        if (aVar2.f1897g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar2.f1898h = false;
        aVar2.f1609r.A(aVar2, true);
    }
}
