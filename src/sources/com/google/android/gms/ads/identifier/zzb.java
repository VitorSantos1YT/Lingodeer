package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f8325c;

    public zzb(AdvertisingIdClient advertisingIdClient, long j11) {
        super("AdIdClientAutoDisconnectThread");
        this.f8323a = new WeakReference(advertisingIdClient);
        this.f8324b = j11;
        this.f8325c = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f8323a;
        try {
            if (this.f8325c.await(this.f8324b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
            }
        }
    }
}
