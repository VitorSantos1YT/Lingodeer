package dv;

import com.lingodeer.network.model.ApiResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 {
    public static final ApiResponse.Error a(ApiResponse apiResponse) {
        kotlin.jvm.internal.m.d(apiResponse, "null cannot be cast to non-null type com.lingodeer.network.model.ApiResponse.Error");
        ApiResponse.Error error = (ApiResponse.Error) apiResponse;
        return new ApiResponse.Error(error.getMessage(), error.getCode(), null, 4, null);
    }
}
