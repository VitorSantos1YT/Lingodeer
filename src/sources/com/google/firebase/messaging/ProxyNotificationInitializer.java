package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ProxyNotificationInitializer {
    private ProxyNotificationInitializer() {
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
            }
            context.getPackageName();
        }
        return false;
    }

    public static void a(Context context) {
        boolean z11;
        boolean z12;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (!ProxyNotificationPreferences.a(context).getBoolean("proxy_notification_initialized", false)) {
            try {
                Context applicationContext = context.getApplicationContext();
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                } else {
                    z11 = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (Build.VERSION.SDK_INT >= 29) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        context.getPackageName();
                    } else {
                        SharedPreferences.Editor editorEdit = ProxyNotificationPreferences.a(context).edit();
                        editorEdit.putBoolean(iFLeRCXvYCGdPW.rmTboL, true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z11) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    }
                    taskCompletionSource.trySetResult(null);
                    taskCompletionSource.getTask();
                    return;
                } catch (Throwable th2) {
                    taskCompletionSource.trySetResult(null);
                    throw th2;
                }
            }
            Tasks.forResult(null);
        }
    }
}
