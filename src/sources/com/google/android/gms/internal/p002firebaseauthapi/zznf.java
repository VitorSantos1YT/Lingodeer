package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznf implements zzcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f10766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10767b;

    public zznf(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f10767b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f10766a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f10766a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public final void a(zzwt zzwtVar) throws IOException {
        if (!this.f10766a.putString(this.f10767b, zzzj.a(zzwtVar.g())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
