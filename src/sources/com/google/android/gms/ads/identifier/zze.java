package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzj;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                try {
                    zzj zzjVar = zzk.f9374a;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        if (httpURLConnection.getResponseCode() >= 200) {
                        }
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException | RuntimeException e8) {
                    e8.getMessage();
                    zzj zzjVar2 = zzk.f9374a;
                }
            } catch (IndexOutOfBoundsException e10) {
                e10.getMessage();
                zzj zzjVar3 = zzk.f9374a;
            }
        } catch (Throwable th2) {
            zzj zzjVar4 = zzk.f9374a;
            throw th2;
        }
    }
}
