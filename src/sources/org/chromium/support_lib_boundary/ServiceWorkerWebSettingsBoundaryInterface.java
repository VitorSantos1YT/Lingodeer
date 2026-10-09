package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z11);

    void setAllowFileAccess(boolean z11);

    void setBlockNetworkLoads(boolean z11);

    void setCacheMode(int i11);

    void setIncludeCookiesOnIntercept(boolean z11);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
