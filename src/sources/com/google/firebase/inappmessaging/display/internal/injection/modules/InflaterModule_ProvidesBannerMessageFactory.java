package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterModule_ProvidesBannerMessageFactory implements Factory<InAppMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterModule f19922a;

    public InflaterModule_ProvidesBannerMessageFactory(InflaterModule inflaterModule) {
        this.f19922a = inflaterModule;
    }

    @Override // oy.a
    public final Object get() {
        InAppMessage inAppMessage = this.f19922a.f19918a;
        Preconditions.b(inAppMessage);
        return inAppMessage;
    }
}
