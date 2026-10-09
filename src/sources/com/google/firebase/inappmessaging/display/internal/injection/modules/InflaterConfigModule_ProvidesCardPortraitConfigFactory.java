package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterConfigModule_ProvidesCardPortraitConfigFactory implements Factory<InAppMessageLayoutConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterConfigModule f19906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InflaterConfigModule_ProvidesDisplayMetricsFactory f19907b;

    public InflaterConfigModule_ProvidesCardPortraitConfigFactory(InflaterConfigModule inflaterConfigModule, InflaterConfigModule_ProvidesDisplayMetricsFactory inflaterConfigModule_ProvidesDisplayMetricsFactory) {
        this.f19906a = inflaterConfigModule;
        this.f19907b = inflaterConfigModule_ProvidesDisplayMetricsFactory;
    }

    @Override // oy.a
    public final Object get() {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f19907b.get();
        this.f19906a.getClass();
        InAppMessageLayoutConfig.Builder builder = new InAppMessageLayoutConfig.Builder();
        Integer numValueOf = Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d));
        InAppMessageLayoutConfig inAppMessageLayoutConfig = builder.f19785a;
        inAppMessageLayoutConfig.f19776c = numValueOf;
        inAppMessageLayoutConfig.f19777d = Integer.valueOf((int) (displayMetrics.widthPixels * 0.7f));
        inAppMessageLayoutConfig.f19774a = Float.valueOf(0.6f);
        inAppMessageLayoutConfig.f19775b = Float.valueOf(1.0f);
        inAppMessageLayoutConfig.f19779f = 17;
        inAppMessageLayoutConfig.f19778e = 327970;
        inAppMessageLayoutConfig.f19780g = -2;
        inAppMessageLayoutConfig.f19781h = -2;
        Boolean bool = Boolean.FALSE;
        inAppMessageLayoutConfig.f19782i = bool;
        inAppMessageLayoutConfig.f19783j = bool;
        inAppMessageLayoutConfig.f19784k = bool;
        return inAppMessageLayoutConfig;
    }
}
