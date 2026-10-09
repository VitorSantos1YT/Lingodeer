package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbt implements BaseImplementation.ResultHolder<LocationSettingsResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f12578a;

    public zzbt(TaskCompletionSource taskCompletionSource) {
        this.f12578a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.f12536a;
        boolean zD1 = status.D1();
        TaskCompletionSource taskCompletionSource = this.f12578a;
        if (zD1) {
            LocationSettingsResponse locationSettingsResponse = new LocationSettingsResponse();
            locationSettingsResponse.f8700a = locationSettingsResult;
            taskCompletionSource.setResult(locationSettingsResponse);
        } else if (status.f8708c != null) {
            taskCompletionSource.setException(new ResolvableApiException(status));
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }
}
