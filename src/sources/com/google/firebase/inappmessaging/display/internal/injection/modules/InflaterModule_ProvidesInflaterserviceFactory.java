package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterModule_ProvidesInflaterserviceFactory implements Factory<LayoutInflater> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InflaterModule f19923a;

    public InflaterModule_ProvidesInflaterserviceFactory(InflaterModule inflaterModule) {
        this.f19923a = inflaterModule;
    }

    @Override // oy.a
    public final Object get() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f19923a.f19920c.getSystemService("layout_inflater");
        Preconditions.b(layoutInflater);
        return layoutInflater;
    }
}
