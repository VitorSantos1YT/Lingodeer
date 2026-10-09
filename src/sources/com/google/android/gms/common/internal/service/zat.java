package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zat extends GoogleApi implements TelemetryLoggingClient {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Api f8964l = new Api("ClientTelemetry.API", new zar(), new Api.ClientKey());

    public final Task c(final TelemetryData telemetryData) {
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8763c = new Feature[]{com.google.android.gms.internal.base.zad.f9587a};
        builderA.f8762b = false;
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                Api api = zat.f8964l;
                zak zakVar = (zak) ((zau) anyClient).y();
                Parcel parcelG = zakVar.g();
                com.google.android.gms.internal.base.zac.b(parcelG, telemetryData);
                zakVar.h(parcelG);
                taskCompletionSource.setResult(null);
            }
        };
        return b(2, builderA.a());
    }
}
