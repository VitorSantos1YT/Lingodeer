package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ComplianceData extends ComplianceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalPrivacyContext f7903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComplianceData.ProductIdOrigin f7904b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends ComplianceData.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExternalPrivacyContext f7905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ComplianceData.ProductIdOrigin f7906b;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData a() {
            return new AutoValue_ComplianceData(this.f7905a, this.f7906b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder b(ExternalPrivacyContext externalPrivacyContext) {
            this.f7905a = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder c(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.f7906b = productIdOrigin;
            return this;
        }
    }

    public AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f7903a = externalPrivacyContext;
        this.f7904b = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ExternalPrivacyContext b() {
        return this.f7903a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ComplianceData.ProductIdOrigin c() {
        return this.f7904b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        ExternalPrivacyContext externalPrivacyContext = this.f7903a;
        if (externalPrivacyContext == null) {
            if (complianceData.b() != null) {
                return false;
            }
        } else if (!externalPrivacyContext.equals(complianceData.b())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.f7904b;
        if (productIdOrigin == null) {
            return complianceData.c() == null;
        }
        return productIdOrigin.equals(complianceData.c());
    }

    public final int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.f7903a;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.f7904b;
        return (productIdOrigin != null ? productIdOrigin.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f7903a + ", productIdOrigin=" + this.f7904b + "}";
    }
}
