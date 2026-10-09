package k9;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a5.j f37975b;

    public a(SavedStateHandle savedStateHandle) {
        String string = (String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.f37974a = string;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        a5.j jVar = this.f37975b;
        if (jVar == null) {
            kotlin.jvm.internal.m.n("saveableStateHolderRef");
            throw null;
        }
        w1.b bVar = (w1.b) ((WeakReference) jVar.f385b).get();
        if (bVar != null) {
            bVar.d(this.f37974a);
        }
        a5.j jVar2 = this.f37975b;
        if (jVar2 != null) {
            ((WeakReference) jVar2.f385b).clear();
        } else {
            kotlin.jvm.internal.m.n("saveableStateHolderRef");
            throw null;
        }
    }
}
