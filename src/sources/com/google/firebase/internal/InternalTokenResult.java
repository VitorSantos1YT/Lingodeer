package com.google.firebase.internal;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class InternalTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20428a;

    public InternalTokenResult(String str) {
        this.f20428a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTokenResult) {
            return Objects.a(this.f20428a, ((InternalTokenResult) obj).f20428a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20428a});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f20428a, "token");
        return toStringHelper.toString();
    }
}
