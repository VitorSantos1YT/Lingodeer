package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SharedPreferencesUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20072a;

    public SharedPreferencesUtils(FirebaseApp firebaseApp) {
        this.f20072a = firebaseApp;
    }

    public final void a(String str, boolean z11) {
        FirebaseApp firebaseApp = this.f20072a;
        firebaseApp.b();
        SharedPreferences.Editor editorEdit = ((Application) firebaseApp.f17714a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z11);
        editorEdit.apply();
    }
}
