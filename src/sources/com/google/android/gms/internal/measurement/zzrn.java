package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11908a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f11909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Handler f11910c;

    public static boolean a(Thread thread) {
        if (f11909b == null) {
            f11909b = Looper.getMainLooper().getThread();
        }
        return thread == f11909b;
    }

    public static Handler b() {
        if (f11910c == null) {
            synchronized (f11908a) {
                try {
                    if (f11910c == null) {
                        f11910c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11910c;
    }
}
