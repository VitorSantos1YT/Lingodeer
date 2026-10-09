package com.google.android.gms.common.wrappers;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Wrappers {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wrappers f9143b = new Wrappers();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PackageManagerWrapper f9144a = null;

    public static PackageManagerWrapper a(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = f9143b;
        synchronized (wrappers) {
            try {
                if (wrappers.f9144a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wrappers.f9144a = new PackageManagerWrapper(context);
                }
                packageManagerWrapper = wrappers.f9144a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return packageManagerWrapper;
    }
}
