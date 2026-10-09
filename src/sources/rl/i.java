package rl;

import com.lingodeer.network.model.ApiResponse;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final ApiResponse.Error a(ApiResponse apiResponse) {
        m.f(apiResponse, "<this>");
        ApiResponse.Error error = (ApiResponse.Error) apiResponse;
        return new ApiResponse.Error(error.getMessage(), error.getCode(), null, 4, null);
    }
}
