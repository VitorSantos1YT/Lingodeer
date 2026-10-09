package bp;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends ji.e {
    public final Object N;

    public v2() {
        super(u2.f4839a, BuildConfig.VERSION_NAME);
        this.N = com.bumptech.glide.d.u(qy.j.NONE, new b1(2, this, new bj.a(this, 2)));
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b0.a1(this, null, 6), 3);
    }
}
