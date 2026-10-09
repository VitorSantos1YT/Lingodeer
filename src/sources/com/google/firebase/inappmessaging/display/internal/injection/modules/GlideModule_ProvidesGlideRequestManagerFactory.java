package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.bumptech.glide.c;
import com.bumptech.glide.p;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GlideModule_ProvidesGlideRequestManagerFactory implements Factory<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlideModule f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19896b;

    public GlideModule_ProvidesGlideRequestManagerFactory(GlideModule glideModule, Provider provider) {
        this.f19895a = glideModule;
        this.f19896b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f19896b.get();
        this.f19895a.getClass();
        p pVarE = c.e(application);
        Preconditions.b(pVarE);
        return pVarE;
    }
}
