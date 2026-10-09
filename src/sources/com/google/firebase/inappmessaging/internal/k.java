package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements yw.c, yw.b, yw.a, yw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20243a;

    public /* synthetic */ k(int i11) {
        this.f20243a = i11;
    }

    public static Object a(Object obj, Object obj2) {
        return new AutoValue_InstallationIdResult((String) obj, (InstallationTokenResult) obj2);
    }

    @Override // yw.b
    public void accept(Object obj) {
        switch (this.f20243a) {
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 14:
            case 16:
            default:
                ((Throwable) obj).getMessage();
                break;
            case 7:
                break;
            case 8:
                break;
            case 11:
                Locale locale = Locale.US;
                ((FetchEligibleCampaignsResponse) obj).I().size();
                break;
            case 12:
                ((Throwable) obj).getMessage();
                break;
            case 13:
                ((Throwable) obj).getMessage();
                break;
            case 15:
                ((Throwable) obj).getMessage();
                break;
            case 17:
                break;
            case 18:
                ((Throwable) obj).getMessage();
                break;
        }
    }

    @Override // yw.c
    public Object apply(Object obj) {
        switch (this.f20243a) {
            case 1:
                CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
                int i11 = InAppMessageStreamManager.AnonymousClass1.f20026a[thickContent.F().J().ordinal()];
                return (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? uw.h.a(thickContent) : fx.e.f28235a;
            case 2:
            case 3:
            default:
                return dx.c.f24539a;
            case 4:
                return ((CampaignImpressionList) obj).G();
            case 5:
                List list = (List) obj;
                ax.d.a(list, "source is null");
                return new hx.h(list);
            case 6:
                return ((CampaignImpression) obj).H();
        }
    }

    @Override // yw.d
    public boolean test(Object obj) {
        boolean zBooleanValue;
        switch (this.f20243a) {
            case 9:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 10:
                InstallationIdResult installationIdResult = (InstallationIdResult) obj;
                return (TextUtils.isEmpty(installationIdResult.a()) || TextUtils.isEmpty(installationIdResult.b().a())) ? false : true;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    @Override // yw.a
    public void run() {
    }
}
