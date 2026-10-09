package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class ExecutorsModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20206c;

    public ExecutorsModule(Executor executor, Executor executor2, Executor executor3) {
        this.f20206c = executor;
        this.f20204a = executor2;
        this.f20205b = executor3;
    }
}
