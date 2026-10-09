package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Schedulers_Factory implements Factory<Schedulers> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20071c;

    public Schedulers_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f20069a = provider;
        this.f20070b = provider2;
        this.f20071c = provider3;
    }

    @Override // oy.a
    public final Object get() {
        uw.n nVar = (uw.n) this.f20069a.get();
        return new Schedulers(nVar, (uw.n) this.f20071c.get());
    }
}
