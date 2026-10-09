package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements da.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1739b;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f1738a = i11;
        this.f1739b = obj;
    }

    @Override // da.d
    public final Bundle saveState() {
        switch (this.f1738a) {
            case 0:
                p0 p0Var = (p0) this.f1739b;
                p0Var.markFragmentsCreated();
                p0Var.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                return new Bundle();
            default:
                return ((k1) this.f1739b).a0();
        }
    }
}
