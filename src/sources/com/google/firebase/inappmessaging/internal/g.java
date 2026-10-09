package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.model.BannerMessage;
import com.google.firebase.inappmessaging.model.CardMessage;
import com.google.firebase.inappmessaging.model.ImageOnlyMessage;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.ModalMessage;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements yw.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DisplayCallbacksImpl f20089b;

    public /* synthetic */ g(DisplayCallbacksImpl displayCallbacksImpl, int i11) {
        this.f20088a = i11;
        this.f20089b = displayCallbacksImpl;
    }

    @Override // yw.a
    public final void run() {
        boolean zB;
        switch (this.f20088a) {
            case 0:
                DisplayCallbacksImpl displayCallbacksImpl = this.f20089b;
                MetricsLoggerClient metricsLoggerClient = displayCallbacksImpl.f19995f;
                InAppMessage inAppMessage = displayCallbacksImpl.f19997h;
                metricsLoggerClient.getClass();
                if (!inAppMessage.f20322b.f20300c) {
                    metricsLoggerClient.f20045c.getId().addOnSuccessListener(metricsLoggerClient.f20049g, new s(metricsLoggerClient, inAppMessage, 0));
                    int i11 = MetricsLoggerClient.AnonymousClass1.f20050a[inAppMessage.f20321a.ordinal()];
                    boolean z11 = false;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            zB = MetricsLoggerClient.b(((ModalMessage) inAppMessage).f20327g);
                        } else if (i11 == 3) {
                            zB = MetricsLoggerClient.b(((BannerMessage) inAppMessage).f20287g);
                        } else if (i11 == 4) {
                            zB = MetricsLoggerClient.b(((ImageOnlyMessage) inAppMessage).f20318e);
                        }
                        z11 = !zB;
                    } else {
                        CardMessage cardMessage = (CardMessage) inAppMessage;
                        boolean zB2 = MetricsLoggerClient.b(cardMessage.f20304g);
                        boolean zB3 = MetricsLoggerClient.b(cardMessage.f20305h);
                        if (!zB2 && !zB3) {
                            z11 = true;
                        }
                    }
                    metricsLoggerClient.c(inAppMessage, "fiam_impression", z11);
                }
                DeveloperListenerManager developerListenerManager = metricsLoggerClient.f20048f;
                for (DeveloperListenerManager.ImpressionExecutorAndListener impressionExecutorAndListener : developerListenerManager.f19974e.values()) {
                    Executor executor = developerListenerManager.f19970a;
                    impressionExecutorAndListener.getClass();
                    executor.execute(new e(impressionExecutorAndListener, inAppMessage, 3));
                }
                break;
            default:
                this.f20089b.f19999j = true;
                break;
        }
    }
}
