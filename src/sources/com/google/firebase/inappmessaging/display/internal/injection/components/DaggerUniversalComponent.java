package com.google.firebase.inappmessaging.display.internal.injection.components;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.display.dagger.internal.MapBuilder;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory_Factory;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager_Factory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.ApplicationModule_ProvidesApplicationFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesBannerPortraitLayoutConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesCardLandscapeConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesCardPortraitConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesDisplayMetricsFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesModalLandscapeConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesModalPortraitConfigFactory;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerUniversalComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ApplicationModule f19880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InflaterConfigModule f19881b;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final UniversalComponent a() {
            Preconditions.a(ApplicationModule.class, this.f19880a);
            if (this.f19881b == null) {
                this.f19881b = new InflaterConfigModule();
            }
            ApplicationModule applicationModule = this.f19880a;
            InflaterConfigModule inflaterConfigModule = this.f19881b;
            UniversalComponentImpl universalComponentImpl = new UniversalComponentImpl();
            universalComponentImpl.f19882a = DoubleCheck.a(new ApplicationModule_ProvidesApplicationFactory(applicationModule));
            universalComponentImpl.f19883b = DoubleCheck.a(FiamWindowManager_Factory.a());
            universalComponentImpl.f19884c = DoubleCheck.a(new BindingWrapperFactory_Factory(universalComponentImpl.f19882a));
            InflaterConfigModule_ProvidesDisplayMetricsFactory inflaterConfigModule_ProvidesDisplayMetricsFactory = new InflaterConfigModule_ProvidesDisplayMetricsFactory(inflaterConfigModule, universalComponentImpl.f19882a);
            universalComponentImpl.f19885d = new InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19886e = new InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19887f = new InflaterConfigModule_ProvidesModalLandscapeConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19888g = new InflaterConfigModule_ProvidesModalPortraitConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19889h = new InflaterConfigModule_ProvidesCardLandscapeConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19890i = new InflaterConfigModule_ProvidesCardPortraitConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19891j = new InflaterConfigModule_ProvidesBannerPortraitLayoutConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            universalComponentImpl.f19892k = new InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory(inflaterConfigModule, inflaterConfigModule_ProvidesDisplayMetricsFactory);
            return universalComponentImpl;
        }

        private Builder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UniversalComponentImpl implements UniversalComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Provider f19882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Provider f19883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Provider f19884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory f19885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory f19886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InflaterConfigModule_ProvidesModalLandscapeConfigFactory f19887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InflaterConfigModule_ProvidesModalPortraitConfigFactory f19888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InflaterConfigModule_ProvidesCardLandscapeConfigFactory f19889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InflaterConfigModule_ProvidesCardPortraitConfigFactory f19890i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InflaterConfigModule_ProvidesBannerPortraitLayoutConfigFactory f19891j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory f19892k;

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.UniversalComponent
        public final FiamWindowManager a() {
            return (FiamWindowManager) this.f19883b.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.UniversalComponent
        public final Application b() {
            return (Application) this.f19882a.get();
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.UniversalComponent
        public final Map c() {
            MapBuilder mapBuilder = new MapBuilder();
            InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory inflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory = this.f19885d;
            LinkedHashMap linkedHashMap = mapBuilder.f19755a;
            linkedHashMap.put("IMAGE_ONLY_PORTRAIT", inflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory);
            linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", this.f19886e);
            linkedHashMap.put("MODAL_LANDSCAPE", this.f19887f);
            linkedHashMap.put("MODAL_PORTRAIT", this.f19888g);
            linkedHashMap.put("CARD_LANDSCAPE", this.f19889h);
            linkedHashMap.put("CARD_PORTRAIT", this.f19890i);
            linkedHashMap.put("BANNER_PORTRAIT", this.f19891j);
            linkedHashMap.put("BANNER_LANDSCAPE", this.f19892k);
            return linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
        }

        @Override // com.google.firebase.inappmessaging.display.internal.injection.components.UniversalComponent
        public final BindingWrapperFactory d() {
            return (BindingWrapperFactory) this.f19884c.get();
        }
    }

    private DaggerUniversalComponent() {
    }
}
