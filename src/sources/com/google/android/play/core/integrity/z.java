package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f16220a;

    public static synchronized s a(Context context) {
        try {
            if (f16220a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f16220a = qVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16220a;
    }
}
