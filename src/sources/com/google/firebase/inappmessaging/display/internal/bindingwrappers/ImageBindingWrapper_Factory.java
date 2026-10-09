package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule_ProvidesBannerMessageFactory;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageBindingWrapper_Factory implements Factory<ImageBindingWrapper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InflaterModule_ProvidesBannerMessageFactory f19842c;

    public ImageBindingWrapper_Factory(Provider provider, Provider provider2, InflaterModule_ProvidesBannerMessageFactory inflaterModule_ProvidesBannerMessageFactory) {
        this.f19840a = provider;
        this.f19841b = provider2;
        this.f19842c = inflaterModule_ProvidesBannerMessageFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new ImageBindingWrapper((InAppMessageLayoutConfig) this.f19840a.get(), (LayoutInflater) this.f19841b.get(), (InAppMessage) this.f19842c.get());
    }
}
