package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import my.f;
import uw.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SchedulerModule_ProvidesIOSchedulerFactory implements Factory<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchedulerModule f20230a;

    public SchedulerModule_ProvidesIOSchedulerFactory(SchedulerModule schedulerModule) {
        this.f20230a = schedulerModule;
    }

    @Override // oy.a
    public final Object get() {
        this.f20230a.getClass();
        n nVar = f.f42896b;
        Preconditions.c(nVar);
        return nVar;
    }
}
