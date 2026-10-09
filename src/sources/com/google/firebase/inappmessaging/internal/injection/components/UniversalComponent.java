package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.Component;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.time.SystemClock;
import com.google.firebase.inappmessaging.model.RateLimit;
import ex.f1;
import java.util.concurrent.Executor;
import lw.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Component
public interface UniversalComponent {
    Application a();

    ProgramaticContextualTriggers b();

    Executor c();

    RateLimit d();

    AnalyticsEventsManager e();

    Subscriber f();

    DeveloperListenerManager g();

    ImpressionStorageClient h();

    Schedulers i();

    CampaignCacheClient j();

    Executor k();

    ProviderInstaller l();

    RateLimiterClient m();

    f1 n();

    SystemClock o();

    f1 p();

    d q();

    AnalyticsConnector r();
}
