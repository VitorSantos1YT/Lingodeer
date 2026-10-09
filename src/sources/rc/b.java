package rc;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends i implements fz.e {
    @Override // kotlin.jvm.internal.c, mz.b
    public final String getName() {
        return "invalidateDividers";
    }

    @Override // kotlin.jvm.internal.c
    public final mz.d getOwner() {
        z.f38362a.getClass();
        return new q(vc.a.class, "core");
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "invalidateDividers(Lcom/afollestad/materialdialogs/MaterialDialog;ZZ)V";
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((lc.d) this.receiver).f39884t.b(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        return b0.f48488a;
    }
}
