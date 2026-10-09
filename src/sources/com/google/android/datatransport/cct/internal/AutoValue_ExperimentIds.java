package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7908b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends ExperimentIds.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f7909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f7910b;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds a() {
            return new AutoValue_ExperimentIds(this.f7909a, this.f7910b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder b(byte[] bArr) {
            this.f7909a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder c(byte[] bArr) {
            this.f7910b = bArr;
            return this;
        }
    }

    public AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.f7907a = bArr;
        this.f7908b = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] b() {
        return this.f7907a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] c() {
        return this.f7908b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z11 = experimentIds instanceof AutoValue_ExperimentIds;
        if (Arrays.equals(this.f7907a, z11 ? ((AutoValue_ExperimentIds) experimentIds).f7907a : experimentIds.b())) {
            return Arrays.equals(this.f7908b, z11 ? ((AutoValue_ExperimentIds) experimentIds).f7908b : experimentIds.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f7907a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7908b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f7907a) + ", encryptedBlob=" + Arrays.toString(this.f7908b) + "}";
    }
}
