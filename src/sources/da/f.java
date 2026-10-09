package da;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import java.util.Map;
import jh.h;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.a f23339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23340b;

    public f(fa.a aVar) {
        this.f23339a = aVar;
        this.f23340b = new e(aVar);
    }

    public final void a(Bundle bundle) {
        fa.a aVar = this.f23339a;
        g gVar = aVar.f27029a;
        if (!aVar.f27033e) {
            aVar.a();
        }
        if (gVar.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + gVar.getLifecycle().getCurrentState()).toString());
        }
        if (aVar.f27035g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleV = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleV = com.bumptech.glide.f.v("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f27034f = bundleV;
        aVar.f27035g = true;
    }

    public final void b(Bundle bundle) {
        fa.a aVar = this.f23339a;
        Bundle bundleB = h.b((l[]) Arrays.copyOf(new l[0], 0));
        Bundle bundle2 = aVar.f27034f;
        if (bundle2 != null) {
            bundleB.putAll(bundle2);
        }
        synchronized (aVar.f27031c) {
            for (Map.Entry entry : aVar.f27032d.entrySet()) {
                ef.e.w(bundleB, (String) entry.getKey(), ((d) entry.getValue()).saveState());
            }
        }
        if (bundleB.isEmpty()) {
            return;
        }
        ef.e.w(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleB);
    }
}
