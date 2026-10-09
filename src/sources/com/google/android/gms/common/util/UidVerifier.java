package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean a(Context context, int i11) {
        if (b(i11, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier googleSignatureVerifierA = GoogleSignatureVerifier.a(context);
                googleSignatureVerifierA.getClass();
                if (packageInfo != null && (GoogleSignatureVerifier.c(packageInfo, false) || (GoogleSignatureVerifier.c(packageInfo, true) && GooglePlayServicesUtilLight.a(googleSignatureVerifierA.f8655a)))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean b(int i11, Context context, String str) {
        PackageManagerWrapper packageManagerWrapperA = Wrappers.a(context);
        packageManagerWrapperA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) packageManagerWrapperA.f9142a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i11, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
