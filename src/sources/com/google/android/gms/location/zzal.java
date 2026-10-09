package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzal extends com.google.android.gms.internal.location.zzah {
    @Override // com.google.android.gms.internal.location.zzai
    public final void b1(com.google.android.gms.internal.location.zzaa zzaaVar) {
        Status status = zzaaVar.f11067a;
        if (status == null) {
            new ApiException(new Status(8, "Got null status from location service", null, null));
            throw null;
        }
        if (status.f8706a == 0) {
            throw null;
        }
        ApiExceptionUtil.a(status);
        throw null;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
