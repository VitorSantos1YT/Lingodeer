package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class InflaterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InAppMessage f19918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InAppMessageLayoutConfig f19919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f19920c;

    public InflaterModule(InAppMessage inAppMessage, InAppMessageLayoutConfig inAppMessageLayoutConfig, Application application) {
        this.f19918a = inAppMessage;
        this.f19919b = inAppMessageLayoutConfig;
        this.f19920c = application;
    }
}
