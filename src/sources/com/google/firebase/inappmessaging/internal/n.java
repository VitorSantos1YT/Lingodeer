package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements yw.b, yw.d, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20248b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f20247a = i11;
        this.f20248b = obj;
    }

    @Override // yw.b
    public void accept(Object obj) {
        switch (this.f20247a) {
            case 0:
                AnalyticsEventsManager analyticsEventsManager = (AnalyticsEventsManager) this.f20248b;
                analyticsEventsManager.getClass();
                HashSet hashSet = new HashSet();
                Iterator<E> it = ((FetchEligibleCampaignsResponse) obj).I().iterator();
                while (it.hasNext()) {
                    for (CommonTypesProto.TriggeringCondition triggeringCondition : ((CampaignProto.ThickContent) it.next()).L()) {
                        if (!TextUtils.isEmpty(triggeringCondition.F().G())) {
                            hashSet.add(triggeringCondition.F().G());
                        }
                    }
                }
                hashSet.size();
                hashSet.toString();
                analyticsEventsManager.f19952c.a(hashSet);
                break;
            default:
                TestDeviceHelper testDeviceHelper = (TestDeviceHelper) this.f20248b;
                FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) obj;
                SharedPreferencesUtils sharedPreferencesUtils = testDeviceHelper.f20073a;
                if (!testDeviceHelper.f20074b) {
                    if (testDeviceHelper.f20075c) {
                        int i11 = testDeviceHelper.f20076d + 1;
                        testDeviceHelper.f20076d = i11;
                        if (i11 >= 5) {
                            testDeviceHelper.f20075c = false;
                            sharedPreferencesUtils.a("fresh_install", false);
                        }
                    }
                    Iterator<E> it2 = fetchEligibleCampaignsResponse.I().iterator();
                    while (it2.hasNext()) {
                        if (((CampaignProto.ThickContent) it2.next()).I()) {
                            testDeviceHelper.f20074b = true;
                            sharedPreferencesUtils.a("test_device", true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        ((ProxyAnalyticsConnector) this.f20248b).f20055a = provider.get();
    }

    @Override // yw.d
    public boolean test(Object obj) {
        String str = (String) this.f20248b;
        CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
        if (str.equals("ON_FOREGROUND") && thickContent.I()) {
            return true;
        }
        for (CommonTypesProto.TriggeringCondition triggeringCondition : thickContent.L()) {
            if (triggeringCondition.G().toString().equals(str) || triggeringCondition.F().G().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
