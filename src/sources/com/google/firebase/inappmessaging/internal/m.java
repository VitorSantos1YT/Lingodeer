package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.Parser;
import ex.n0;
import fr.p3;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements yw.b, yw.c, yw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageStreamManager f20246b;

    public /* synthetic */ m(InAppMessageStreamManager inAppMessageStreamManager, int i11) {
        this.f20245a = i11;
        this.f20246b = inAppMessageStreamManager;
    }

    @Override // yw.b
    public void accept(Object obj) {
        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) obj;
        switch (this.f20245a) {
            case 0:
                ImpressionStorageClient impressionStorageClient = this.f20246b.f20018g;
                impressionStorageClient.getClass();
                HashSet hashSet = new HashSet();
                for (CampaignProto.ThickContent thickContent : fetchEligibleCampaignsResponse.I()) {
                    hashSet.add(thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD) ? thickContent.M().G() : thickContent.H().G());
                }
                hashSet.toString();
                uw.h hVarA = impressionStorageClient.a();
                CampaignImpressionList campaignImpressionList = ImpressionStorageClient.f20008c;
                ax.d.a(campaignImpressionList, "defaultItem is null");
                new dx.b(2, hVarA.d(uw.h.a(campaignImpressionList)), new f(5, impressionStorageClient, hashSet)).b();
                break;
            default:
                CampaignCacheClient campaignCacheClient = this.f20246b.f20014c;
                ProtoStorageClient protoStorageClient = campaignCacheClient.f19961a;
                protoStorageClient.getClass();
                new dx.b(1, new dx.f(new dx.d(new t(protoStorageClient, fetchEligibleCampaignsResponse, 0), 1).a(new f(3, campaignCacheClient, fetchEligibleCampaignsResponse)).a(new k(3)), new k(13), ax.d.f3262c), new k(14)).b();
                break;
        }
    }

    @Override // yw.c
    public Object apply(Object obj) {
        int i11 = 6;
        int i12 = 4;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        switch (this.f20245a) {
            case 1:
                String str = (String) obj;
                InAppMessageStreamManager inAppMessageStreamManager = this.f20246b;
                CampaignCacheClient campaignCacheClient = inAppMessageStreamManager.f20014c;
                campaignCacheClient.getClass();
                fx.l lVar = new fx.l(new b(campaignCacheClient, 0));
                ProtoStorageClient protoStorageClient = campaignCacheClient.f19961a;
                Parser parserK = FetchEligibleCampaignsResponse.K();
                protoStorageClient.getClass();
                fx.l lVar2 = new fx.l(new t(protoStorageClient, parserK, 1));
                c cVar = new c(campaignCacheClient, 0);
                p3 p3Var = ax.d.f3263d;
                fx.k kVar = new fx.k(new fx.s(new fx.s(new fx.s(new fx.g(lVar.d(new fx.s(lVar2, cVar, p3Var)), new c(campaignCacheClient, 1), 0), p3Var, new c(campaignCacheClient, 2)), new k(17), p3Var), p3Var, new k(18)), new ax.c(fx.e.f28235a, 0), i13);
                m mVar = new m(inAppMessageStreamManager, 3);
                r rVar = new r(inAppMessageStreamManager, str, new m(inAppMessageStreamManager, i12), new p(inAppMessageStreamManager, str, i14), new k(i14));
                fx.s sVar = new fx.s(inAppMessageStreamManager.f20018g.a(), p3Var, new k(19));
                CampaignImpressionList campaignImpressionListH = CampaignImpressionList.H();
                ax.d.a(campaignImpressionListH, "defaultItem is null");
                fx.k kVar2 = new fx.k(sVar.d(uw.h.a(campaignImpressionListH)), new ax.c(uw.h.a(CampaignImpressionList.H()), 0), i13);
                FirebaseInstallationsApi firebaseInstallationsApi = inAppMessageStreamManager.m;
                Task id2 = firebaseInstallationsApi.getId();
                Executor executor = inAppMessageStreamManager.f20025o;
                int i16 = 7;
                fx.h hVar = new fx.h(i14, new uw.h[]{new fx.d(new f(i16, id2, executor), i15), new fx.d(new f(i16, firebaseInstallationsApi.a(), executor), i15)}, new tw.c(new k(i15), i14));
                uw.n nVar = inAppMessageStreamManager.f20017f.f20067a;
                ax.d.a(nVar, "scheduler is null");
                f fVar = new f(6, inAppMessageStreamManager, new fx.g(hVar, nVar, 1));
                TestDeviceHelper testDeviceHelper = inAppMessageStreamManager.f20022k;
                return testDeviceHelper.f20075c ? str.equals("ON_FOREGROUND") : testDeviceHelper.f20074b ? new n0(new fx.k(new fx.k(kVar2, fVar, i15), rVar, i15), 3) : new n0(new fx.k(kVar.d(new fx.s(new fx.k(kVar2, fVar, i15), mVar, p3Var)), rVar, i15), 3);
            default:
                CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
                InAppMessageStreamManager inAppMessageStreamManager2 = this.f20246b;
                inAppMessageStreamManager2.getClass();
                if (thickContent.I()) {
                    return uw.h.a(thickContent);
                }
                ImpressionStorageClient impressionStorageClient = inAppMessageStreamManager2.f20018g;
                impressionStorageClient.getClass();
                String strG = thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD) ? thickContent.M().G() : thickContent.H().G();
                hx.d dVar = new hx.d(new gx.b(new fx.k(impressionStorageClient.a(), new k(i12), i14), new k(5)), new k(i11), 1);
                ax.d.a(strG, "element is null");
                return new fx.k(new fx.h(i15, new hx.b(i14, new hx.b(i13, new ix.a(new hx.b(i15, dVar, new ax.b(strG, 0)), new k(15)), new ax.c(new ix.b(), 0)), new l(thickContent)), new k(16)), new l(thickContent), i14);
        }
    }

    @Override // yw.d
    public boolean test(Object obj) {
        long jI;
        long jF;
        CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
        InAppMessageStreamManager inAppMessageStreamManager = this.f20246b;
        if (inAppMessageStreamManager.f20022k.f20074b) {
            return true;
        }
        Clock clock = inAppMessageStreamManager.f20015d;
        if (thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            jI = thickContent.M().I();
            jF = thickContent.M().F();
        } else {
            if (!thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                return false;
            }
            jI = thickContent.H().I();
            jF = thickContent.H().F();
        }
        long jA = clock.a();
        return jA > jI && jA < jF;
    }
}
