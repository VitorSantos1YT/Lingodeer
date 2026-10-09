package com.google.firebase.crashlytics.internal;

import app.rive.runtime.kotlin.core.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NativeSessionFileProvider f18215c = new MissingNativeSessionFileProvider(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f18216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f18217b = new AtomicReference(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        public /* synthetic */ MissingNativeSessionFileProvider(int i11) {
            this();
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred) {
        this.f18216a = deferred;
        deferred.a(new a(this, 25));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final NativeSessionFileProvider a(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f18217b.get();
        return crashlyticsNativeComponent == null ? f18215c : crashlyticsNativeComponent.a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean b() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f18217b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.b();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final void c(String str, long j11, StaticSessionData staticSessionData) {
        this.f18216a.a(new f(str, j11, staticSessionData));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean d(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f18217b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.d(str);
    }
}
