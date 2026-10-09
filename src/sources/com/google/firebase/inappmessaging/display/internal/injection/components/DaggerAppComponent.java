package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay_Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.GlideModule_ProvidesGlideRequestManagerFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory;
import java.util.Map;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerAppComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AppComponentImpl implements AppComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Provider f19856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Provider f19857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Provider f19858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Provider f19859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Provider f19860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Provider f19861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Provider f19862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Provider f19863h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Provider f19864i;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class FiamWindowManagerProvider implements Provider<FiamWindowManager> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f19865a;

            public FiamWindowManagerProvider(UniversalComponent universalComponent) {
                this.f19865a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                FiamWindowManager fiamWindowManagerA = this.f19865a.a();
                if (fiamWindowManagerA != null) {
                    return fiamWindowManagerA;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class InflaterClientProvider implements Provider<BindingWrapperFactory> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f19866a;

            public InflaterClientProvider(UniversalComponent universalComponent) {
                this.f19866a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                BindingWrapperFactory bindingWrapperFactoryD = this.f19866a.d();
                if (bindingWrapperFactoryD != null) {
                    return bindingWrapperFactoryD;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class MyKeyStringMapProvider implements Provider<Map<String, a>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f19867a;

            public MyKeyStringMapProvider(UniversalComponent universalComponent) {
                this.f19867a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Map mapC = this.f19867a.c();
                if (mapC != null) {
                    return mapC;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ProvidesApplicationProvider implements Provider<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f19868a;

            public ProvidesApplicationProvider(UniversalComponent universalComponent) {
                this.f19868a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Application applicationB = this.f19868a.b();
                if (applicationB != null) {
                    return applicationB;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.AppComponent
        public final FirebaseInAppMessagingDisplay a() {
            return (FirebaseInAppMessagingDisplay) this.f19864i.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HeadlessInAppMessagingModule f19869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GlideModule f19870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UniversalComponent f19871c;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final AppComponent a() {
            Preconditions.a(HeadlessInAppMessagingModule.class, this.f19869a);
            if (this.f19870b == null) {
                this.f19870b = new GlideModule();
            }
            Preconditions.a(UniversalComponent.class, this.f19871c);
            HeadlessInAppMessagingModule headlessInAppMessagingModule = this.f19869a;
            GlideModule glideModule = this.f19870b;
            UniversalComponent universalComponent = this.f19871c;
            AppComponentImpl appComponentImpl = new AppComponentImpl();
            appComponentImpl.f19856a = DoubleCheck.a(new HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory(headlessInAppMessagingModule));
            appComponentImpl.f19857b = new AppComponentImpl.MyKeyStringMapProvider(universalComponent);
            AppComponentImpl.ProvidesApplicationProvider providesApplicationProvider = new AppComponentImpl.ProvidesApplicationProvider(universalComponent);
            appComponentImpl.f19858c = providesApplicationProvider;
            Provider providerA = DoubleCheck.a(new GlideModule_ProvidesGlideRequestManagerFactory(glideModule, providesApplicationProvider));
            appComponentImpl.f19859d = providerA;
            appComponentImpl.f19860e = DoubleCheck.a(new FiamImageLoader_Factory(providerA));
            appComponentImpl.f19861f = new AppComponentImpl.FiamWindowManagerProvider(universalComponent);
            appComponentImpl.f19862g = new AppComponentImpl.InflaterClientProvider(universalComponent);
            appComponentImpl.f19863h = DoubleCheck.a(FiamAnimator_Factory.a());
            appComponentImpl.f19864i = DoubleCheck.a(new FirebaseInAppMessagingDisplay_Factory(appComponentImpl.f19856a, appComponentImpl.f19857b, appComponentImpl.f19860e, RenewableTimer_Factory.a(), RenewableTimer_Factory.a(), appComponentImpl.f19861f, appComponentImpl.f19858c, appComponentImpl.f19862g, appComponentImpl.f19863h));
            return appComponentImpl;
        }

        private Builder() {
        }
    }

    private DaggerAppComponent() {
    }
}
