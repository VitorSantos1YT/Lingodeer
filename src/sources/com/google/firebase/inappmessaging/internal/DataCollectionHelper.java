package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DataCollectionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferencesUtils f19968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f19969b;

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        SharedPreferencesUtils sharedPreferencesUtils = this.f19968a;
        FirebaseApp firebaseApp = sharedPreferencesUtils.f20072a;
        firebaseApp.b();
        if (((Application) firebaseApp.f17714a).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init")) {
            FirebaseApp firebaseApp2 = sharedPreferencesUtils.f20072a;
            firebaseApp2.b();
            SharedPreferences sharedPreferences = ((Application) firebaseApp2.f17714a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return sharedPreferences.getBoolean("auto_init", true);
            }
            return true;
        }
        FirebaseApp firebaseApp3 = sharedPreferencesUtils.f20072a;
        firebaseApp3.b();
        Application application = (Application) firebaseApp3.f17714a;
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                FirebaseApp firebaseApp4 = sharedPreferencesUtils.f20072a;
                firebaseApp4.b();
                Application application2 = (Application) firebaseApp4.f17714a;
                try {
                    PackageManager packageManager2 = application2.getPackageManager();
                    if (packageManager2 != null && (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), 128)) != null && (bundle2 = applicationInfo2.metaData) != null && bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                        return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return this.f19969b.get();
    }
}
