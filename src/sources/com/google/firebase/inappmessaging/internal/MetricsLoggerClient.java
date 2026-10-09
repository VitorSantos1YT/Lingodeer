package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.CampaignMetadata;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MetricsLoggerClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f20041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f20042i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh.c f20043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f20044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseInstallationsApi f20045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f20046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnalyticsConnector f20047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DeveloperListenerManager f20048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f20049g;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.MetricsLoggerClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20050a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f20050a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20050a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20050a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20050a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface EngagementMetricsLoggerInterface {
    }

    static {
        HashMap map = new HashMap();
        f20041h = map;
        HashMap map2 = new HashMap();
        f20042i = map2;
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.UNSPECIFIED_RENDER_ERROR, RenderErrorReason.UNSPECIFIED_RENDER_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_FETCH_ERROR, RenderErrorReason.IMAGE_FETCH_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_DISPLAY_ERROR, RenderErrorReason.IMAGE_DISPLAY_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_UNSUPPORTED_FORMAT, RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.AUTO, DismissType.AUTO);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK, DismissType.CLICK);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.SWIPE, DismissType.SWIPE);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.UNKNOWN_DISMISS_TYPE, DismissType.UNKNOWN_DISMISS_TYPE);
    }

    public MetricsLoggerClient(hh.c cVar, AnalyticsConnector analyticsConnector, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager, Executor executor) {
        this.f20043a = cVar;
        this.f20047e = analyticsConnector;
        this.f20044b = firebaseApp;
        this.f20045c = firebaseInstallationsApi;
        this.f20046d = clock;
        this.f20048f = developerListenerManager;
        this.f20049g = executor;
    }

    public static boolean b(Action action) {
        String str;
        return (action == null || (str = action.f20273a) == null || str.isEmpty()) ? false : true;
    }

    public final CampaignAnalytics.Builder a(InAppMessage inAppMessage, String str) {
        CampaignAnalytics.Builder builderN = CampaignAnalytics.N();
        builderN.n();
        CampaignAnalytics.K((CampaignAnalytics) builderN.f21266b);
        FirebaseApp firebaseApp = this.f20044b;
        firebaseApp.b();
        FirebaseOptions firebaseOptions = firebaseApp.f17716c;
        String str2 = firebaseOptions.f17735e;
        builderN.n();
        CampaignAnalytics.J((CampaignAnalytics) builderN.f21266b, str2);
        String str3 = inAppMessage.f20322b.f20298a;
        builderN.n();
        CampaignAnalytics.L((CampaignAnalytics) builderN.f21266b, str3);
        ClientAppInfo.Builder builderH = ClientAppInfo.H();
        firebaseApp.b();
        String str4 = firebaseOptions.f17732b;
        builderH.n();
        ClientAppInfo.F((ClientAppInfo) builderH.f21266b, str4);
        builderH.n();
        ClientAppInfo.G((ClientAppInfo) builderH.f21266b, str);
        builderN.n();
        CampaignAnalytics.M((CampaignAnalytics) builderN.f21266b, (ClientAppInfo) builderH.l());
        long jA = this.f20046d.a();
        builderN.n();
        CampaignAnalytics.F((CampaignAnalytics) builderN.f21266b, jA);
        return builderN;
    }

    public final void c(InAppMessage inAppMessage, String str, boolean z11) {
        CampaignMetadata campaignMetadata = inAppMessage.f20322b;
        String str2 = campaignMetadata.f20298a;
        String str3 = campaignMetadata.f20299b;
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str3);
        try {
            bundle.putInt("_ndt", (int) (this.f20046d.a() / 1000));
        } catch (NumberFormatException e8) {
            e8.getMessage();
        }
        bundle.toString();
        AnalyticsConnector analyticsConnector = this.f20047e;
        if (analyticsConnector != null) {
            analyticsConnector.d("fiam", str, bundle);
            if (z11) {
                analyticsConnector.c("fiam:" + str2, "fiam");
            }
        }
    }
}
