package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorsModule_ProvidesBackgroundExecutorFactory implements Factory<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorsModule f20207a;

    public ExecutorsModule_ProvidesBackgroundExecutorFactory(ExecutorsModule executorsModule) {
        this.f20207a = executorsModule;
    }

    @Override // oy.a
    public final Object get() {
        Executor executor = this.f20207a.f20204a;
        Preconditions.c(executor);
        return executor;
    }
}
