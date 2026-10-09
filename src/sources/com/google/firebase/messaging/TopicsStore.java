package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class TopicsStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f20537c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferencesQueue f20538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f20539b;

    public TopicsStore(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f20539b = scheduledThreadPoolExecutor;
    }

    public final synchronized TopicOperation a() {
        String str;
        TopicOperation topicOperation;
        SharedPreferencesQueue sharedPreferencesQueue = this.f20538a;
        synchronized (sharedPreferencesQueue.f20519d) {
            str = (String) sharedPreferencesQueue.f20519d.peek();
        }
        Pattern pattern = TopicOperation.f20533d;
        topicOperation = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                topicOperation = new TopicOperation(strArrSplit[0], strArrSplit[1]);
            }
        }
        return topicOperation;
    }
}
