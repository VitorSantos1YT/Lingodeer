package com.google.firebase.inappmessaging.display.internal.injection.modules;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterModule_InAppMessageLayoutConfigFactory implements Factory<InAppMessageLayoutConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterModule f19921a;

    public InflaterModule_InAppMessageLayoutConfigFactory(InflaterModule inflaterModule) {
        this.f19921a = inflaterModule;
    }

    @Override // oy.a
    public final Object get() {
        InAppMessageLayoutConfig inAppMessageLayoutConfig = this.f19921a.f19919b;
        Preconditions.b(inAppMessageLayoutConfig);
        return inAppMessageLayoutConfig;
    }
}
