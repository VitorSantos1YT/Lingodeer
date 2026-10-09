package j9;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, da.g {
    public final m9.c H = new m9.c(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9.e f36187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f36188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f36189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f36190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f36191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36192f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f36193t;

    public e(m9.e eVar, q qVar, Bundle bundle, Lifecycle.State state, j jVar, String str, Bundle bundle2) {
        this.f36187a = eVar;
        this.f36188b = qVar;
        this.f36189c = bundle;
        this.f36190d = state;
        this.f36191e = jVar;
        this.f36192f = str;
        this.f36193t = bundle2;
        com.bumptech.glide.d.v(new hh.o(this, 11));
    }

    public final void a(Lifecycle.State value) {
        kotlin.jvm.internal.m.f(value, "value");
        m9.c cVar = this.H;
        cVar.getClass();
        cVar.f41061k = value;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            Bundle bundle = eVar.f36189c;
            if (kotlin.jvm.internal.m.a(this.f36192f, eVar.f36192f) && kotlin.jvm.internal.m.a(this.f36188b, eVar.f36188b) && kotlin.jvm.internal.m.a(this.H.f41060j, eVar.H.f41060j) && kotlin.jvm.internal.m.a(getSavedStateRegistry(), eVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f36189c;
                if (kotlin.jvm.internal.m.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.m.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        m9.c cVar = this.H;
        cVar.getClass();
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        CreationExtras.Key<da.g> key = SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY;
        e eVar = cVar.f41051a;
        mutableCreationExtras.set(key, eVar);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, eVar);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundleA);
        }
        m9.e eVar2 = this.f36187a;
        if (eVar2 == null) {
            application = null;
        } else {
            Context context = eVar2.f41067a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application2);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.H.f41062l;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.H.f41060j;
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        return this.H.f41058h.f23340b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        m9.c cVar = this.H;
        if (!cVar.f41059i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.f41060j.getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        j jVar = cVar.f41055e;
        if (jVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = cVar.f41056f;
        kotlin.jvm.internal.m.f(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = jVar.f36210a;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f36188b.hashCode() + (this.f36192f.hashCode() * 31);
        Bundle bundle = this.f36189c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i11 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.H.f41060j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.H.toString();
    }
}
