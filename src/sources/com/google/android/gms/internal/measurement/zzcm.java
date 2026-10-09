package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcm extends zzcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11495a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11496b;

    public static final Object h1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void A0(Bundle bundle) {
        AtomicReference atomicReference = this.f11495a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f11496b = true;
                    this.f11495a.notify();
                } catch (Throwable th2) {
                    this.f11495a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String h(long j11) {
        return (String) h1(j(j11), String.class);
    }

    public final Bundle j(long j11) {
        Bundle bundle;
        AtomicReference atomicReference = this.f11495a;
        synchronized (atomicReference) {
            if (!this.f11496b) {
                try {
                    atomicReference.wait(j11);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f11495a.get();
        }
        return bundle;
    }
}
