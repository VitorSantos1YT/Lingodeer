package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.CardBindingWrapper.ScrollViewAdjustableListener;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CardBindingWrapper_Factory implements Factory<CardBindingWrapper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19835c;

    public CardBindingWrapper_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f19833a = provider;
        this.f19834b = provider2;
        this.f19835c = provider3;
    }

    @Override // oy.a
    public final Object get() {
        CardBindingWrapper cardBindingWrapper = new CardBindingWrapper((InAppMessageLayoutConfig) this.f19833a.get(), (LayoutInflater) this.f19834b.get(), (InAppMessage) this.f19835c.get());
        cardBindingWrapper.f19831n = cardBindingWrapper.new ScrollViewAdjustableListener();
        return cardBindingWrapper;
    }
}
