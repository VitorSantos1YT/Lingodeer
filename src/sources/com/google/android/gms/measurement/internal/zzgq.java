package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static zzgq f12924d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f12925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zat f12926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f12927c = new AtomicLong(-1);

    public zzgq(Context context, zzic zzicVar) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.f8957b;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.f8959a = "measurement:api";
        this.f12926b = new zat(context, null, zat.f8964l, new TelemetryLoggingOptions(builder.f8959a), GoogleApi.Settings.f8687c);
        this.f12925a = zzicVar;
    }

    public final synchronized void a(int i11, int i12, long j11, long j12) {
        this.f12925a.f13104k.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.f12927c;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.f12926b.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j11, j12, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f12922a.f12927c.set(jElapsedRealtime);
            }
        });
    }
}
