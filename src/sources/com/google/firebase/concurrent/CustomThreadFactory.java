package com.google.firebase.concurrent;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CustomThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f18151e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f18152a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f18155d;

    public CustomThreadFactory(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        this.f18153b = str;
        this.f18154c = i11;
        this.f18155d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f18151e.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f18153b + " Thread #" + this.f18152a.getAndIncrement());
        return threadNewThread;
    }
}
