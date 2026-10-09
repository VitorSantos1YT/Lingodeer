package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandlesProvider implements da.d {
    private boolean restored;
    private Bundle restoredState;
    private final da.e savedStateRegistry;
    private final qy.h viewModel$delegate;

    public SavedStateHandlesProvider(da.e savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        m.f(savedStateRegistry, "savedStateRegistry");
        m.f(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = com.bumptech.glide.d.v(new b(viewModelStoreOwner, 1));
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        m.f(key, "key");
        performRestore();
        Bundle bundle = this.restoredState;
        if (bundle == null || !bundle.containsKey(key)) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 == null) {
            l[] lVarArr = new l[0];
            bundle2 = jh.h.b((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
        }
        bundle.remove(key);
        if (bundle.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle bundleA = this.savedStateRegistry.a(SavedStateHandleSupport.SAVED_STATE_KEY);
        l[] lVarArr = new l[0];
        Bundle bundleB = jh.h.b((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        if (bundleA != null) {
            bundleB.putAll(bundleA);
        }
        this.restoredState = bundleB;
        this.restored = true;
        getViewModel();
    }

    @Override // da.d
    public Bundle saveState() {
        Bundle bundleB = jh.h.b((l[]) Arrays.copyOf(new l[0], 0));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle source = entry.getValue().savedStateProvider().saveState();
            m.f(source, "source");
            if (!source.isEmpty()) {
                ef.e.w(bundleB, key, source);
            }
        }
        this.restored = false;
        return bundleB;
    }
}
