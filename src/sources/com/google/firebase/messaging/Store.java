package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class Store {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20521a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Token {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f20522d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f20523e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20526c;

        public Token(String str, String str2, long j11) {
            this.f20524a = str;
            this.f20525b = str2;
            this.f20526c = j11;
        }

        public static Token a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e8) {
                e8.toString();
                return null;
            }
        }
    }

    public Store(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f20521a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e8.getMessage();
            }
        }
    }
}
