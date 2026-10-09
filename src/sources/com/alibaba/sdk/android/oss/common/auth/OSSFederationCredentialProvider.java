package com.alibaba.sdk.android.oss.common.auth;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class OSSFederationCredentialProvider implements OSSCredentialProvider {
    private volatile OSSFederationToken cachedToken;

    public OSSFederationToken getCachedToken() {
        return this.cachedToken;
    }

    @Override // com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider
    public abstract OSSFederationToken getFederationToken();

    public synchronized OSSFederationToken getValidFederationToken() {
        try {
            if (this.cachedToken == null || DateUtil.getFixedSkewedTimeMillis() / 1000 > this.cachedToken.getExpiration() - 300) {
                if (this.cachedToken != null) {
                    OSSLog.logDebug("token expired! current time: " + (DateUtil.getFixedSkewedTimeMillis() / 1000) + " token expired: " + this.cachedToken.getExpiration());
                }
                this.cachedToken = getFederationToken();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.cachedToken;
    }
}
