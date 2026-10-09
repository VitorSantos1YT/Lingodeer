package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9028c;

    public zzn(String str, boolean z11) {
        Preconditions.d(str);
        this.f9026a = str;
        Preconditions.d("com.google.android.gms");
        this.f9027b = "com.google.android.gms";
        this.f9028c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.a(this.f9026a, zznVar.f9026a) && Objects.a(this.f9027b, zznVar.f9027b) && Objects.a(null, null) && this.f9028c == zznVar.f9028c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9026a, this.f9027b, null, 4225, Boolean.valueOf(this.f9028c)});
    }

    public final String toString() {
        String str = this.f9026a;
        if (str != null) {
            return str;
        }
        Preconditions.g(null);
        throw null;
    }
}
