package com.google.firebase.components;

import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18143a;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f18143a) {
            case 0:
                return Collections.EMPTY_SET;
            default:
                DefaultClock defaultClock = RemoteConfigComponent.f20662j;
            case 1:
                return null;
        }
    }
}
