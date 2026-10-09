package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8177c;

    public /* synthetic */ f(Uploader uploader, TransportContext transportContext, long j11) {
        this.f8176b = uploader;
        this.f8177c = transportContext;
        this.f8175a = j11;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object b() {
        Uploader uploader = (Uploader) this.f8176b;
        uploader.f8134c.J0(uploader.f8138g.a() + this.f8175a, (TransportContext) this.f8177c);
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        String str = (String) this.f8176b;
        StaticSessionData staticSessionData = (StaticSessionData) this.f8177c;
        NativeSessionFileProvider nativeSessionFileProvider = CrashlyticsNativeComponentDeferredProxy.f18215c;
        ((CrashlyticsNativeComponent) provider.get()).c(str, this.f8175a, staticSessionData);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f8176b;
        HashMap map = (HashMap) this.f8177c;
        int[] iArr = ConfigFetchHandler.f20710k;
        return configFetchHandler.b(task, this.f8175a, map);
    }

    public /* synthetic */ f(Object obj, long j11, Object obj2) {
        this.f8176b = obj;
        this.f8175a = j11;
        this.f8177c = obj2;
    }
}
