package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer_Factory;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInAppMessagingDisplay_Factory implements Factory<FirebaseInAppMessagingDisplay> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f19745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f19746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f19747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f19748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider f19749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Provider f19750i;

    public FirebaseInAppMessagingDisplay_Factory(Provider provider, Provider provider2, Provider provider3, RenewableTimer_Factory renewableTimer_Factory, RenewableTimer_Factory renewableTimer_Factory2, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f19742a = provider;
        this.f19743b = provider2;
        this.f19744c = provider3;
        this.f19745d = renewableTimer_Factory;
        this.f19746e = renewableTimer_Factory2;
        this.f19747f = provider4;
        this.f19748g = provider5;
        this.f19749h = provider6;
        this.f19750i = provider7;
    }

    @Override // oy.a
    public final Object get() {
        return new FirebaseInAppMessagingDisplay((FirebaseInAppMessaging) this.f19742a.get(), (Map) this.f19743b.get(), (FiamImageLoader) this.f19744c.get(), (RenewableTimer) this.f19745d.get(), (RenewableTimer) this.f19746e.get(), (FiamWindowManager) this.f19747f.get(), (Application) this.f19748g.get(), (BindingWrapperFactory) this.f19749h.get(), (FiamAnimator) this.f19750i.get());
    }
}
