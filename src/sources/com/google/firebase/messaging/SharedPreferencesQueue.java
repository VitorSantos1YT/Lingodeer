package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class SharedPreferencesQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20516a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f20520e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f20519d = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20517b = "topic_operation_queue";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20518c = ",";

    public SharedPreferencesQueue(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f20516a = sharedPreferences;
        this.f20520e = scheduledThreadPoolExecutor;
    }

    public static SharedPreferencesQueue a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (sharedPreferencesQueue.f20519d) {
            try {
                sharedPreferencesQueue.f20519d.clear();
                String string = sharedPreferencesQueue.f20516a.getString(sharedPreferencesQueue.f20517b, com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME);
                if (!TextUtils.isEmpty(string) && string.contains(sharedPreferencesQueue.f20518c)) {
                    String[] strArrSplit = string.split(sharedPreferencesQueue.f20518c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            sharedPreferencesQueue.f20519d.add(str);
                        }
                    }
                    return sharedPreferencesQueue;
                }
                return sharedPreferencesQueue;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
