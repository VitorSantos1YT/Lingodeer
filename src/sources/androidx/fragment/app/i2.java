package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements HasDefaultViewModelProviderFactory, da.g, ViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f1698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelStore f1699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewModelProvider.Factory f1701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LifecycleRegistry f1702e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public da.f f1703f = null;

    public i2(k0 k0Var, ViewModelStore viewModelStore, z zVar) {
        this.f1698a = k0Var;
        this.f1699b = viewModelStore;
        this.f1700c = zVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f1702e.handleLifecycleEvent(event);
    }

    public final void b() {
        if (this.f1702e == null) {
            this.f1702e = new LifecycleRegistry(this);
            fa.a aVar = new fa.a(this, new cr.n(this, 3));
            this.f1703f = new da.f(aVar);
            aVar.a();
            this.f1700c.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        k0 k0Var = this.f1698a;
        Context applicationContext = k0Var.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, k0Var);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (k0Var.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, k0Var.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        k0 k0Var = this.f1698a;
        ViewModelProvider.Factory defaultViewModelProviderFactory = k0Var.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(k0Var.mDefaultFactory)) {
            this.f1701d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1701d == null) {
            Context applicationContext = k0Var.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f1701d = new SavedStateViewModelFactory(application, k0Var, k0Var.getArguments());
        }
        return this.f1701d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f1702e;
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        b();
        return this.f1703f.f23340b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f1699b;
    }
}
