package bp;

import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends ji.f {
    public long O;

    @Override // androidx.fragment.app.k0
    public void onPause() {
        super.onPause();
        if (this.O > 0) {
            vy.d dVar = null;
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b0.a1(this, dVar, 3), 3);
            if (r().hasFindPerfectTime.booleanValue()) {
                return;
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new av.p(this, dVar, 4), 3);
        }
    }

    @Override // ji.e, androidx.fragment.app.k0
    public void onResume() {
        super.onResume();
        this.O = System.currentTimeMillis();
    }
}
