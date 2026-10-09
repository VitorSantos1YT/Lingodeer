package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18148c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f18146a = i11;
        this.f18148c = obj;
        this.f18147b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Deferred.DeferredHandler deferredHandler;
        switch (this.f18146a) {
            case 0:
                OptionalProvider optionalProvider = (OptionalProvider) this.f18148c;
                Provider provider = (Provider) this.f18147b;
                if (optionalProvider.f18131b != OptionalProvider.f18129d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (optionalProvider) {
                    deferredHandler = optionalProvider.f18130a;
                    optionalProvider.f18130a = null;
                    optionalProvider.f18131b = provider;
                    break;
                }
                deferredHandler.h(provider);
                return;
            case 1:
                LazySet lazySet = (LazySet) this.f18148c;
                Provider provider2 = (Provider) this.f18147b;
                synchronized (lazySet) {
                    try {
                        if (lazySet.f18127b == null) {
                            lazySet.f18126a.add(provider2);
                        } else {
                            lazySet.f18127b.add(provider2.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                Map.Entry entry = (Map.Entry) this.f18148c;
                ((EventHandler) entry.getKey()).a((Event) this.f18147b);
                return;
        }
    }
}
