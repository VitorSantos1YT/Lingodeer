package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataBufferRef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8871a;

    public final boolean equals(Object obj) {
        return (obj instanceof DataBufferRef) && Objects.a(Integer.valueOf(((DataBufferRef) obj).f8871a), Integer.valueOf(this.f8871a)) && Objects.a(0, 0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8871a), 0, null});
    }
}
