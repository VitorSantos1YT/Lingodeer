package gv;

import com.alibaba.sdk.android.oss.common.auth.OSSFederationCredentialProvider;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationToken;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends OSSFederationCredentialProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f29869a;

    public f(h hVar) {
        this.f29869a = hVar;
    }

    @Override // com.alibaba.sdk.android.oss.common.auth.OSSFederationCredentialProvider, com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider
    public final OSSFederationToken getFederationToken() {
        OSSFederationToken oSSFederationToken = this.f29869a.f29879e;
        if (oSSFederationToken != null) {
            return oSSFederationToken;
        }
        m.n("ossFederationToken");
        throw null;
    }
}
