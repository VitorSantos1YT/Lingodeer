package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zabl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiKey f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Feature f8786b;

    public /* synthetic */ zabl(ApiKey apiKey, Feature feature) {
        this.f8785a = apiKey;
        this.f8786b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zabl) {
            zabl zablVar = (zabl) obj;
            if (Objects.a(this.f8785a, zablVar.f8785a) && Objects.a(this.f8786b, zablVar.f8786b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8785a, this.f8786b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f8785a, "key");
        toStringHelper.a(this.f8786b, "feature");
        return toStringHelper.toString();
    }
}
