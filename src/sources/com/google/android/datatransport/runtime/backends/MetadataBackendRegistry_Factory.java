package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationContextFactory_Factory f8064b;

    public MetadataBackendRegistry_Factory(a aVar, CreationContextFactory_Factory creationContextFactory_Factory) {
        this.f8063a = aVar;
        this.f8064b = creationContextFactory_Factory;
    }

    @Override // oy.a
    public final Object get() {
        return new MetadataBackendRegistry((Context) this.f8063a.get(), (CreationContextFactory) this.f8064b.get());
    }
}
