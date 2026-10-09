package com.google.android.gms.common.util.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f9134b = Executors.defaultThreadFactory();

    public NamedThreadFactory(String str) {
        this.f9133a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f9134b.newThread(new zza(runnable));
        threadNewThread.setName(this.f9133a);
        return threadNewThread;
    }
}
