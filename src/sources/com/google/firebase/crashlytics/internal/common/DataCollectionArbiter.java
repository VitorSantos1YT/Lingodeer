package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DataCollectionArbiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f18317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f18318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f18320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f18322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TaskCompletionSource f18323g;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.f18319c = obj;
        this.f18320d = new TaskCompletionSource();
        this.f18321e = false;
        this.f18323g = new TaskCompletionSource();
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        this.f18318b = firebaseApp;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f18317a = sharedPreferences;
        Boolean boolValueOf2 = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf2 == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolValueOf2 = boolValueOf == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
        }
        this.f18322f = boolValueOf2;
        synchronized (obj) {
            try {
                if (a()) {
                    this.f18320d.trySetResult(null);
                    this.f18321e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zK;
        Boolean bool = this.f18322f;
        if (bool != null) {
            zK = bool.booleanValue();
        } else {
            try {
                zK = this.f18318b.k();
            } catch (IllegalStateException unused) {
                zK = false;
            }
        }
        return zK;
    }
}
