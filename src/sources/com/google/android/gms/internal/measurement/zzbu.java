package com.google.android.gms.internal.measurement;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzbu f11475b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f11476a = new CopyOnWriteArrayList();

    private zzbu() {
    }

    public static zzbu a() {
        if (f11475b == null) {
            synchronized (zzbu.class) {
                try {
                    if (f11475b == null) {
                        f11475b = new zzbu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11475b;
    }
}
