package com.google.firebase.inappmessaging.internal;

import ay.k0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import fb.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DisplayCallbacksImpl implements FirebaseInAppMessagingDisplayCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImpressionStorageClient f19990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f19991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Schedulers f19992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RateLimiterClient f19993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RateLimit f19994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MetricsLoggerClient f19995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DataCollectionHelper f19996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InAppMessage f19997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19999j = false;

    public DisplayCallbacksImpl(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper, InAppMessage inAppMessage, String str) {
        this.f19990a = impressionStorageClient;
        this.f19991b = clock;
        this.f19992c = schedulers;
        this.f19993d = rateLimiterClient;
        this.f19994e = rateLimit;
        this.f19995f = metricsLoggerClient;
        this.f19996g = dataCollectionHelper;
        this.f19997h = inAppMessage;
        this.f19998i = str;
    }

    public static Task g(uw.h hVar, uw.n nVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fx.k kVar = new fx.k(new fx.s(hVar, new h(taskCompletionSource), ax.d.f3263d).d(new fx.l(new b(taskCompletionSource, 1))), new h(taskCompletionSource), 2);
        ax.d.a(nVar, "scheduler is null");
        fx.b bVar = new fx.b();
        try {
            fx.t tVar = new fx.t(bVar);
            zw.a.f(bVar, tVar);
            zw.c cVar = tVar.f28267a;
            ww.b bVarB = nVar.b(new aw.t(tVar, kVar, false, 9));
            cVar.getClass();
            zw.a.c(cVar, bVarB);
            return taskCompletionSource.getTask();
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            g0.D(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public final Task a(Action action) {
        if (!this.f19996g.a()) {
            e();
            return new TaskCompletionSource().getTask();
        }
        if (action.f20273a == null) {
            return c(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK);
        }
        dx.d dVar = new dx.d(new f(2, this, action), 0);
        if (!this.f19999j) {
            d();
        }
        return g(dVar.e(), this.f19992c.f20067a);
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public final Task b(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        if (!this.f19996g.a()) {
            e();
            return new TaskCompletionSource().getTask();
        }
        int i11 = 0;
        int i12 = 0;
        return g(new dx.b(i12, new dx.b(i12, f(), new dx.d(new f(i11, this, inAppMessagingErrorReason), i11)), new dx.d(new g(this, 1), i12)).e(), this.f19992c.f20067a);
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public final Task c(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        if (!this.f19996g.a()) {
            e();
            return new TaskCompletionSource().getTask();
        }
        dx.d dVar = new dx.d(new f(1, this, inAppMessagingDismissType), 0);
        if (!this.f19999j) {
            d();
        }
        return g(dVar.e(), this.f19992c.f20067a);
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public final Task d() {
        if (!this.f19996g.a() || this.f19999j) {
            e();
            return new TaskCompletionSource().getTask();
        }
        int i11 = 0;
        return g(new dx.b(i11, new dx.b(i11, f(), new dx.d(new g(this, 0), 0)), new dx.d(new g(this, 1), i11)).e(), this.f19992c.f20067a);
    }

    public final void e() {
        if (this.f19997h.f20322b.f20300c) {
            return;
        }
        this.f19996g.a();
    }

    public final uw.b f() {
        String str = this.f19997h.f20322b.f20298a;
        CampaignImpression.Builder builderI = CampaignImpression.I();
        long jA = this.f19991b.a();
        builderI.n();
        CampaignImpression.G((CampaignImpression) builderI.f21266b, jA);
        builderI.n();
        CampaignImpression.F((CampaignImpression) builderI.f21266b, str);
        CampaignImpression campaignImpression = (CampaignImpression) builderI.l();
        ImpressionStorageClient impressionStorageClient = this.f19990a;
        uw.h hVarA = impressionStorageClient.a();
        CampaignImpressionList campaignImpressionList = ImpressionStorageClient.f20008c;
        ax.d.a(campaignImpressionList, "defaultItem is null");
        dx.b bVar = new dx.b(2, hVarA.d(uw.h.a(campaignImpressionList)), new f(4, impressionStorageClient, campaignImpression));
        k kVar = new k(2);
        k0 k0Var = ax.d.f3262c;
        dx.f fVarA = new dx.f(bVar, kVar, k0Var).a(new k(3));
        if (!this.f19998i.equals("ON_FOREGROUND")) {
            return fVarA;
        }
        RateLimiterClient rateLimiterClient = this.f19993d;
        uw.h hVarA2 = rateLimiterClient.a();
        RateLimitProto.RateLimit rateLimit = RateLimiterClient.f20061d;
        ax.d.a(rateLimit, "defaultItem is null");
        return new dx.b(0, new dx.d(new dx.f(new dx.b(2, hVarA2.d(uw.h.a(rateLimit)), new v(rateLimiterClient, this.f19994e, 0)), new k(2), k0Var).a(new k(3)), 2), fVarA);
    }
}
