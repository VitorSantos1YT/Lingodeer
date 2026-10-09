package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiClientModule_ProvidesDataCollectionHelperFactory implements Factory<DataCollectionHelper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiClientModule f20188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApiClientModule_ProvidesSharedPreferencesUtilsFactory f20189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20190c;

    public ApiClientModule_ProvidesDataCollectionHelperFactory(ApiClientModule apiClientModule, ApiClientModule_ProvidesSharedPreferencesUtilsFactory apiClientModule_ProvidesSharedPreferencesUtilsFactory, Provider provider) {
        this.f20188a = apiClientModule;
        this.f20189b = apiClientModule_ProvidesSharedPreferencesUtilsFactory;
        this.f20190c = provider;
    }

    @Override // oy.a
    public final Object get() {
        SharedPreferencesUtils sharedPreferencesUtils = (SharedPreferencesUtils) this.f20189b.get();
        Subscriber subscriber = (Subscriber) this.f20190c.get();
        FirebaseApp firebaseApp = this.f20188a.f20181a;
        DataCollectionHelper dataCollectionHelper = new DataCollectionHelper();
        dataCollectionHelper.f19968a = sharedPreferencesUtils;
        dataCollectionHelper.f19969b = new AtomicBoolean(firebaseApp.k());
        subscriber.a(new d());
        return dataCollectionHelper;
    }
}
