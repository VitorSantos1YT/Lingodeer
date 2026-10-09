package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.protobuf.Parser;
import fr.p3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ImpressionStorageClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CampaignImpressionList f20008c = CampaignImpressionList.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClient f20009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uw.h f20010b = fx.e.f28235a;

    public ImpressionStorageClient(ProtoStorageClient protoStorageClient) {
        this.f20009a = protoStorageClient;
    }

    public final uw.h a() {
        uw.h hVar = this.f20010b;
        Parser parserK = CampaignImpressionList.K();
        ProtoStorageClient protoStorageClient = this.f20009a;
        protoStorageClient.getClass();
        fx.l lVar = new fx.l(new t(protoStorageClient, parserK, 1));
        final int i11 = 0;
        yw.b bVar = new yw.b(this) { // from class: com.google.firebase.inappmessaging.internal.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImpressionStorageClient f20092b;

            {
                this.f20092b = this;
            }

            @Override // yw.b
            public final void accept(Object obj) {
                int i12 = i11;
                ImpressionStorageClient impressionStorageClient = this.f20092b;
                switch (i12) {
                    case 0:
                        CampaignImpressionList campaignImpressionList = ImpressionStorageClient.f20008c;
                        impressionStorageClient.f20010b = uw.h.a((CampaignImpressionList) obj);
                        break;
                    default:
                        impressionStorageClient.f20010b = fx.e.f28235a;
                        break;
                }
            }
        };
        p3 p3Var = ax.d.f3263d;
        uw.h hVarD = hVar.d(new fx.s(lVar, bVar, p3Var));
        final int i12 = 1;
        return new fx.s(hVarD, p3Var, new yw.b(this) { // from class: com.google.firebase.inappmessaging.internal.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImpressionStorageClient f20092b;

            {
                this.f20092b = this;
            }

            @Override // yw.b
            public final void accept(Object obj) {
                int i13 = i12;
                ImpressionStorageClient impressionStorageClient = this.f20092b;
                switch (i13) {
                    case 0:
                        CampaignImpressionList campaignImpressionList = ImpressionStorageClient.f20008c;
                        impressionStorageClient.f20010b = uw.h.a((CampaignImpressionList) obj);
                        break;
                    default:
                        impressionStorageClient.f20010b = fx.e.f28235a;
                        break;
                }
            }
        });
    }
}
