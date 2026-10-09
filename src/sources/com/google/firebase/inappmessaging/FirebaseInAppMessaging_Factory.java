package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory_Factory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInAppMessaging_Factory implements Factory<FirebaseInAppMessaging> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f19709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DisplayCallbacksFactory_Factory f19710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f19711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f19712g;

    public FirebaseInAppMessaging_Factory(Provider provider, Provider provider2, ApiClientModule_ProvidesDataCollectionHelperFactory apiClientModule_ProvidesDataCollectionHelperFactory, ApiClientModule_ProvidesFirebaseInstallationsFactory apiClientModule_ProvidesFirebaseInstallationsFactory, DisplayCallbacksFactory_Factory displayCallbacksFactory_Factory, Provider provider3, Provider provider4) {
        this.f19706a = provider;
        this.f19707b = provider2;
        this.f19708c = apiClientModule_ProvidesDataCollectionHelperFactory;
        this.f19709d = apiClientModule_ProvidesFirebaseInstallationsFactory;
        this.f19710e = displayCallbacksFactory_Factory;
        this.f19711f = provider3;
        this.f19712g = provider4;
    }

    @Override // oy.a
    public final Object get() {
        InAppMessageStreamManager inAppMessageStreamManager = (InAppMessageStreamManager) this.f19706a.get();
        return new FirebaseInAppMessaging(inAppMessageStreamManager, (FirebaseInstallationsApi) this.f19709d.get(), (DisplayCallbacksFactory) this.f19710e.get(), (DeveloperListenerManager) this.f19711f.get(), (Executor) this.f19712g.get());
    }
}
