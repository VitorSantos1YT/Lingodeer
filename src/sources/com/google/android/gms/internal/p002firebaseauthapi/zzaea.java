package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.inject.Provider;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface zzaea {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f9848i = new Logger("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void a(Status status);

    Uri.Builder b(Intent intent, String str, String str2);

    HttpURLConnection c(URL url);

    void d(Uri uri, String str, Provider provider);

    Context zza();

    String zza(String str);
}
