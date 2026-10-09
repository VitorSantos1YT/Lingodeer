package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.tasks.OnFailureListener;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile zzd f8326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f8327d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Duration f8328e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zat f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f8330b = new AtomicLong(-1);

    public zzd(Context context) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.f8957b;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.f8959a = "ads_identifier:api";
        this.f8329a = new zat(context, null, zat.f8964l, new TelemetryLoggingOptions(builder.f8959a), GoogleApi.Settings.f8687c);
    }

    public static zzd zza(Context context) {
        if (f8326c == null) {
            synchronized (f8327d) {
                try {
                    if (f8326c == null) {
                        f8326c = new zzd(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8326c;
    }

    public static void zzb(zzd zzdVar, long j11, Exception exc) {
        ConnectionResult connectionResult;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).getStatus().f8709d) != null && connectionResult.f8631b == 24) {
            zzdVar.f8330b.set(j11);
        }
    }

    public final synchronized void zzc(int i11, int i12, long j11, long j12, int i13) {
        AtomicLong atomicLong = this.f8330b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.f8330b.get() == -1 || jElapsedRealtime - this.f8330b.get() > f8328e.toMillis()) {
            zat zatVar = this.f8329a;
            if (zatVar != null) {
                zatVar.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i12, 0, j11, j12, null, null, 0, i13)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
