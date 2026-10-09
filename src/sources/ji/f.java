package ji;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends e {
    public ii.a N;

    @Override // androidx.fragment.app.k0
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ii.a aVar = this.N;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // ji.e
    public void q() {
        ii.a aVar = this.N;
        if (aVar != null) {
            aVar.A();
        }
        this.N = null;
    }
}
