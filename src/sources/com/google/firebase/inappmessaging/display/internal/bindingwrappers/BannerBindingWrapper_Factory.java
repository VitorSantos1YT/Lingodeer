package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BannerBindingWrapper_Factory implements Factory<BannerBindingWrapper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19818c;

    public BannerBindingWrapper_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f19816a = provider;
        this.f19817b = provider2;
        this.f19818c = provider3;
    }

    @Override // oy.a
    public final Object get() {
        return new BannerBindingWrapper((InAppMessageLayoutConfig) this.f19816a.get(), (LayoutInflater) this.f19817b.get(), (InAppMessage) this.f19818c.get());
    }
}
