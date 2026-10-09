package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7911a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends ExternalPRequestContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f7912a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext a() {
            return new AutoValue_ExternalPRequestContext(this.f7912a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext.Builder b(Integer num) {
            this.f7912a = num;
            return this;
        }
    }

    public AutoValue_ExternalPRequestContext(Integer num) {
        this.f7911a = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public final Integer b() {
        return this.f7911a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f7911a;
        Integer numB = ((ExternalPRequestContext) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public final int hashCode() {
        Integer num = this.f7911a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f7911a + "}";
    }
}
