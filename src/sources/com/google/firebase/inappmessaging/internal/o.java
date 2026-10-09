package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
        CampaignProto.ThickContent thickContent2 = (CampaignProto.ThickContent) obj2;
        if (thickContent.I() && !thickContent2.I()) {
            return -1;
        }
        if (!thickContent2.I() || thickContent.I()) {
            return Integer.compare(thickContent.K().G(), thickContent2.K().G());
        }
        return 1;
    }
}
