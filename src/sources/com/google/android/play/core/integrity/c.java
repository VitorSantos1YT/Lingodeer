package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f16190b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i11) {
        this.f16190b = (byte) (this.f16190b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f16190b == 3) {
            return new e(this.f16189a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f16190b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f16190b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j11) {
        this.f16189a = j11;
        this.f16190b = (byte) (this.f16190b | 1);
        return this;
    }
}
