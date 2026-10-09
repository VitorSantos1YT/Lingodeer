package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends u0 implements o4.e, o4.f, n4.u, n4.v, ViewModelStoreOwner, f.f0, i.j, da.g, p1, z4.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f1774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var) {
        super(p0Var);
        this.f1774e = p0Var;
    }

    @Override // androidx.fragment.app.p1
    public final void a(k0 k0Var) {
        this.f1774e.onAttachFragment(k0Var);
    }

    @Override // z4.m
    public final void addMenuProvider(z4.p pVar) {
        this.f1774e.addMenuProvider(pVar);
    }

    @Override // o4.e
    public final void addOnConfigurationChangedListener(y4.a aVar) {
        this.f1774e.addOnConfigurationChangedListener(aVar);
    }

    @Override // n4.u
    public final void addOnMultiWindowModeChangedListener(y4.a aVar) {
        this.f1774e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // n4.v
    public final void addOnPictureInPictureModeChangedListener(y4.a aVar) {
        this.f1774e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // o4.f
    public final void addOnTrimMemoryListener(y4.a aVar) {
        this.f1774e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.s0
    public final View b(int i11) {
        return this.f1774e.findViewById(i11);
    }

    @Override // androidx.fragment.app.s0
    public final boolean c() {
        Window window = this.f1774e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // i.j
    public final i.i getActivityResultRegistry() {
        return this.f1774e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f1774e.mFragmentLifecycleRegistry;
    }

    @Override // f.f0
    public final f.d0 getOnBackPressedDispatcher() {
        return this.f1774e.getOnBackPressedDispatcher();
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        return this.f1774e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.f1774e.getViewModelStore();
    }

    @Override // z4.m
    public final void removeMenuProvider(z4.p pVar) {
        this.f1774e.removeMenuProvider(pVar);
    }

    @Override // o4.e
    public final void removeOnConfigurationChangedListener(y4.a aVar) {
        this.f1774e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // n4.u
    public final void removeOnMultiWindowModeChangedListener(y4.a aVar) {
        this.f1774e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // n4.v
    public final void removeOnPictureInPictureModeChangedListener(y4.a aVar) {
        this.f1774e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // o4.f
    public final void removeOnTrimMemoryListener(y4.a aVar) {
        this.f1774e.removeOnTrimMemoryListener(aVar);
    }
}
