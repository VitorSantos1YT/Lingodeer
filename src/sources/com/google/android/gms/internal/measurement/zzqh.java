package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzqh implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzqh f11855a = new zzqh();

    private /* synthetic */ zzqh() {
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z11 = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            new StringBuilder(String.valueOf(runningAppProcessInfo.importance).length() + 17);
            if (runningAppProcessInfo.importance >= 400) {
                z11 = true;
            }
        } catch (RuntimeException unused) {
        }
        return new Boolean(z11);
    }
}
