package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityLight {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f8646b;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
        f8645a = 12451000;
        f8646b = new GoogleApiAvailabilityLight();
    }

    public Intent a(int i11, Context context, String str) {
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && DeviceProperties.b(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f8645a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(Wrappers.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context) {
        return c(context, f8645a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:0x0195  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0160, please report this as an issue */
    public int c(Context context, int i11) {
        boolean z11;
        PackageInfo packageInfo;
        int i12;
        int i13;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
        try {
            context.getResources().getString(com.lingodeer.R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        boolean zB = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !GooglePlayServicesUtilLight.f8653d.get()) {
            synchronized (com.google.android.gms.common.internal.zzae.f9004a) {
                try {
                    if (!com.google.android.gms.common.internal.zzae.f9005b) {
                        com.google.android.gms.common.internal.zzae.f9005b = true;
                        try {
                            Bundle bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                com.google.android.gms.common.internal.zzae.f9006c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e8) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e8);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i14 = com.google.android.gms.common.internal.zzae.f9006c;
            if (i14 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i14 != 12451000) {
                int i15 = f8645a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 104 + String.valueOf(i14).length() + 194);
                c.t(i15, i14, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb2);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        if (DeviceProperties.b(context)) {
            z11 = false;
        } else {
            if (DeviceProperties.f9120c == null) {
                DeviceProperties.f9120c = Boolean.valueOf(PlatformVersion.a() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (DeviceProperties.f9120c.booleanValue()) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        Preconditions.b(i11 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i16 = 9;
        if (z11) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            GoogleSignatureVerifier.a(context);
            if (!GoogleSignatureVerifier.c(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else if (z11) {
                Preconditions.g(packageInfo);
                if (!GoogleSignatureVerifier.c(packageInfo, true)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else if (z11 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i12 = packageInfo2.versionCode;
                    if (i12 == -1) {
                        i13 = -1;
                    } else {
                        i13 = i12 / 1000;
                    }
                    if (i13 < (i11 != -1 ? i11 / 1000 : -1)) {
                        new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i11).length() + 11 + String.valueOf(i12).length());
                        i16 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                i16 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i16 = 0;
                        } else {
                            i16 = 3;
                        }
                    }
                } else {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            } else if (z11) {
                i12 = packageInfo2.versionCode;
                if (i12 == -1) {
                    i13 = -1;
                } else {
                    i13 = i12 / 1000;
                }
                if (i13 < (i11 != -1 ? i11 / 1000 : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i11).length() + 11 + String.valueOf(i12).length());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            } else {
                i12 = packageInfo2.versionCode;
                if (i12 == -1) {
                    i13 = -1;
                } else {
                    i13 = i12 / 1000;
                }
                if (i13 < (i11 != -1 ? i11 / 1000 : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i11).length() + 11 + String.valueOf(i12).length());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        if (i16 != 18) {
            zB = i16 == 1 ? GooglePlayServicesUtilLight.b(context) : false;
        }
        if (zB) {
            return 18;
        }
        return i16;
    }
}
