package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.MessagesProto;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import ex.f1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class InAppMessageStreamManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f20012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f20013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CampaignCacheClient f20014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f20015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ApiClient f20016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Schedulers f20017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImpressionStorageClient f20018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RateLimiterClient f20019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RateLimit f20020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsEventsManager f20021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TestDeviceHelper f20022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbtIntegrationHelper f20023l;
    public final FirebaseInstallationsApi m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DataCollectionHelper f20024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f20025o;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20026a;

        static {
            int[] iArr = new int[MessagesProto.Content.MessageDetailsCase.values().length];
            f20026a = iArr;
            try {
                iArr[MessagesProto.Content.MessageDetailsCase.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20026a[MessagesProto.Content.MessageDetailsCase.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20026a[MessagesProto.Content.MessageDetailsCase.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20026a[MessagesProto.Content.MessageDetailsCase.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public InAppMessageStreamManager(f1 f1Var, f1 f1Var2, CampaignCacheClient campaignCacheClient, Clock clock, ApiClient apiClient, AnalyticsEventsManager analyticsEventsManager, Schedulers schedulers, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, RateLimit rateLimit, TestDeviceHelper testDeviceHelper, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionHelper dataCollectionHelper, AbtIntegrationHelper abtIntegrationHelper, Executor executor) {
        this.f20012a = f1Var;
        this.f20013b = f1Var2;
        this.f20014c = campaignCacheClient;
        this.f20015d = clock;
        this.f20016e = apiClient;
        this.f20021j = analyticsEventsManager;
        this.f20017f = schedulers;
        this.f20018g = impressionStorageClient;
        this.f20019h = rateLimiterClient;
        this.f20020i = rateLimit;
        this.f20022k = testDeviceHelper;
        this.f20024n = dataCollectionHelper;
        this.m = firebaseInstallationsApi;
        this.f20023l = abtIntegrationHelper;
        this.f20025o = executor;
    }
}
