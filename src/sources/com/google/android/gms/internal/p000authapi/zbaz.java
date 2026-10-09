package com.google.android.gms.internal.p000authapi;

import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbaz {
    public static ApiMetadata a() {
        int i11 = zbax.f9403a;
        Parcelable.Creator<ComplianceOptions> creator = ComplianceOptions.CREATOR;
        new ComplianceOptions.Builder();
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        Parcelable.Creator<ApiMetadata> creator2 = ApiMetadata.CREATOR;
        ApiMetadata.Builder builder = new ApiMetadata.Builder();
        builder.f8669a = complianceOptions;
        ApiMetadata apiMetadata = new ApiMetadata(builder.f8669a, false);
        apiMetadata.f8668c = builder.f8670b;
        return apiMetadata;
    }
}
