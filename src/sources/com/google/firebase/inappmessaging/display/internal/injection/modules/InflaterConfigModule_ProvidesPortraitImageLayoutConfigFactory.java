package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory implements Factory<InAppMessageLayoutConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterConfigModule f19916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InflaterConfigModule_ProvidesDisplayMetricsFactory f19917b;

    public InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory(InflaterConfigModule inflaterConfigModule, InflaterConfigModule_ProvidesDisplayMetricsFactory inflaterConfigModule_ProvidesDisplayMetricsFactory) {
        this.f19916a = inflaterConfigModule;
        this.f19917b = inflaterConfigModule_ProvidesDisplayMetricsFactory;
    }

    @Override // oy.a
    public final Object get() {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f19917b.get();
        this.f19916a.getClass();
        InAppMessageLayoutConfig.Builder builder = new InAppMessageLayoutConfig.Builder();
        Integer numValueOf = Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f));
        InAppMessageLayoutConfig inAppMessageLayoutConfig = builder.f19785a;
        inAppMessageLayoutConfig.f19776c = numValueOf;
        inAppMessageLayoutConfig.f19777d = Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f));
        Float fValueOf = Float.valueOf(0.8f);
        inAppMessageLayoutConfig.f19775b = fValueOf;
        inAppMessageLayoutConfig.f19774a = fValueOf;
        inAppMessageLayoutConfig.f19779f = 17;
        inAppMessageLayoutConfig.f19778e = 327938;
        inAppMessageLayoutConfig.f19780g = -2;
        inAppMessageLayoutConfig.f19781h = -2;
        Boolean bool = Boolean.FALSE;
        inAppMessageLayoutConfig.f19782i = bool;
        inAppMessageLayoutConfig.f19783j = bool;
        inAppMessageLayoutConfig.f19784k = bool;
        return inAppMessageLayoutConfig;
    }
}
