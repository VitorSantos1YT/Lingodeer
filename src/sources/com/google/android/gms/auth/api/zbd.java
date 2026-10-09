package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zbd implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zbd f8555c = new zbd(new zbc());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8557b;

    public zbd(zbc zbcVar) {
        this.f8556a = zbcVar.f8553a.booleanValue();
        this.f8557b = zbcVar.f8554b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return Objects.a(null, null) && this.f8556a == zbdVar.f8556a && Objects.a(this.f8557b, zbdVar.f8557b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f8556a), this.f8557b});
    }
}
