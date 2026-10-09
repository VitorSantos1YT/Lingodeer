package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TestDeviceHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferencesUtils f20073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20076d = 0;

    public TestDeviceHelper(SharedPreferencesUtils sharedPreferencesUtils) {
        boolean z11 = false;
        this.f20073a = sharedPreferencesUtils;
        FirebaseApp firebaseApp = sharedPreferencesUtils.f20072a;
        firebaseApp.b();
        SharedPreferences sharedPreferences = ((Application) firebaseApp.f17714a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z12 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z12 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            sharedPreferencesUtils.a("fresh_install", true);
        }
        this.f20075c = z12;
        FirebaseApp firebaseApp2 = sharedPreferencesUtils.f20072a;
        firebaseApp2.b();
        SharedPreferences sharedPreferences2 = ((Application) firebaseApp2.f17714a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z11 = sharedPreferences2.getBoolean("test_device", false);
        } else {
            sharedPreferencesUtils.a("test_device", false);
        }
        this.f20074b = z11;
    }
}
