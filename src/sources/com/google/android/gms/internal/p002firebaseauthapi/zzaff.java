package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9900b;

    public zzaff(Context context) {
        String packageName = context.getPackageName();
        Preconditions.d(packageName);
        this.f9899a = packageName;
        try {
            byte[] bArrA = AndroidUtilsLight.a(context, packageName);
            if (bArrA == null) {
                this.f9900b = null;
            } else {
                this.f9900b = Hex.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            this.f9900b = null;
        }
    }
}
