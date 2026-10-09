package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Api f8712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Api.ApiOptions f8713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8714d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f8712b = api;
        this.f8713c = apiOptions;
        this.f8714d = str;
        this.f8711a = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.a(this.f8712b, apiKey.f8712b) && Objects.a(this.f8713c, apiKey.f8713c) && Objects.a(this.f8714d, apiKey.f8714d);
    }

    public final int hashCode() {
        return this.f8711a;
    }
}
