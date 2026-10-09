package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalPRequestContext f7913a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends ExternalPrivacyContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExternalPRequestContext f7914a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext a() {
            return new AutoValue_ExternalPrivacyContext(this.f7914a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext.Builder b(ExternalPRequestContext externalPRequestContext) {
            this.f7914a = externalPRequestContext;
            return this;
        }
    }

    public AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.f7913a = externalPRequestContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public final ExternalPRequestContext b() {
        return this.f7913a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f7913a;
        ExternalPRequestContext externalPRequestContextB = ((ExternalPrivacyContext) obj).b();
        if (externalPRequestContext == null) {
            return externalPRequestContextB == null;
        }
        return externalPRequestContext.equals(externalPRequestContextB);
    }

    public final int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.f7913a;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f7913a + "}";
    }
}
