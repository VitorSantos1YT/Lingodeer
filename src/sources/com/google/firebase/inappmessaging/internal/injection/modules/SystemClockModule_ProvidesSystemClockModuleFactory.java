package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.internal.time.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SystemClockModule_ProvidesSystemClockModuleFactory implements Factory<Clock> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemClockModule f20232a;

    public SystemClockModule_ProvidesSystemClockModuleFactory(SystemClockModule systemClockModule) {
        this.f20232a = systemClockModule;
    }

    @Override // oy.a
    public final Object get() {
        this.f20232a.getClass();
        return new SystemClock();
    }
}
