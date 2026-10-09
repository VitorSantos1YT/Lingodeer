package com.google.android.gms.common.util.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f9136b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f9137c = Executors.defaultThreadFactory();

    public NumberedThreadFactory(String str) {
        this.f9135a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f9137c.newThread(new zza(runnable));
        int andIncrement = this.f9136b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f9135a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        threadNewThread.setName(sb2.toString());
        return threadNewThread;
    }
}
