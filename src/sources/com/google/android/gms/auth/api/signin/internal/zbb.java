package com.google.android.gms.auth.api.signin.internal;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbb implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f8530c = new Logger("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatusPendingResult f8532b;

    public zbb(String str) {
        Preconditions.d(str);
        this.f8531a = str;
        this.f8532b = new StatusPendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger = f8530c;
        Status status = Status.f8705t;
        try {
            String str = this.f8531a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb2.toString()).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f8703e;
            } else {
                logger.b("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            logger.a(sb3.toString(), new Object[0]);
        } catch (IOException e8) {
            logger.b("IOException when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        } catch (Exception e10) {
            logger.b("Exception when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        }
        this.f8532b.a(status);
    }
}
