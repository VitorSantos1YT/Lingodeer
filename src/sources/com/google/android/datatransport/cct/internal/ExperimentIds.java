package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ExperimentIds {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public abstract ExperimentIds a();

        public abstract Builder b(byte[] bArr);

        public abstract Builder c(byte[] bArr);
    }

    public static Builder a() {
        return new AutoValue_ExperimentIds.Builder();
    }

    public abstract byte[] b();

    public abstract byte[] c();
}
