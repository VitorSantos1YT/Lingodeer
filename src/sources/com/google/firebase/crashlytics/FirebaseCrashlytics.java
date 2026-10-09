package com.google.firebase.crashlytics;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsCore f18213a;

    public FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.f18213a = crashlyticsCore;
    }

    public static FirebaseCrashlytics a() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.e().c(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(boolean z11) {
        CrashlyticsCore crashlyticsCore = this.f18213a;
        Boolean boolValueOf = Boolean.valueOf(z11);
        DataCollectionArbiter dataCollectionArbiter = crashlyticsCore.f18289b;
        synchronized (dataCollectionArbiter) {
            dataCollectionArbiter.f18322f = boolValueOf;
            SharedPreferences.Editor editorEdit = dataCollectionArbiter.f18317a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", z11);
            editorEdit.apply();
            synchronized (dataCollectionArbiter.f18319c) {
                try {
                    if (dataCollectionArbiter.a()) {
                        if (!dataCollectionArbiter.f18321e) {
                            dataCollectionArbiter.f18320d.trySetResult(null);
                            dataCollectionArbiter.f18321e = true;
                        }
                    } else if (dataCollectionArbiter.f18321e) {
                        dataCollectionArbiter.f18320d = new TaskCompletionSource();
                        dataCollectionArbiter.f18321e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
