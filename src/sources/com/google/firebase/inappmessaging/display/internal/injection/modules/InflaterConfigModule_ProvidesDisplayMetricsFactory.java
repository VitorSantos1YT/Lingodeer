package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterConfigModule_ProvidesDisplayMetricsFactory implements Factory<DisplayMetrics> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterConfigModule f19908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19909b;

    public InflaterConfigModule_ProvidesDisplayMetricsFactory(InflaterConfigModule inflaterConfigModule, Provider provider) {
        this.f19908a = inflaterConfigModule;
        this.f19909b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f19909b.get();
        this.f19908a.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }
}
