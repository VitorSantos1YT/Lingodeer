package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TelemetryLoggingOptions f8957b = new TelemetryLoggingOptions(new Builder().f8959a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8958a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8959a;

        private Builder() {
            throw null;
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str) {
        this.f8958a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.a(this.f8958a, ((TelemetryLoggingOptions) obj).f8958a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8958a});
    }
}
