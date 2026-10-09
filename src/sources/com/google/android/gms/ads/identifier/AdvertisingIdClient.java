package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f8311h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile AdvertisingIdClient f8312i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BlockingServiceConnection f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzf f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzb f8317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f8318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8319g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8321b;

        @Deprecated
        public Info(String str, boolean z11) {
            this.f8320a = str;
            this.f8321b = z11;
        }

        public String getId() {
            return this.f8320a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f8321b;
        }

        public String toString() {
            return "{" + this.f8320a + "}" + this.f8321b;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static void d(Info info, long j11, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id2 = info.getId();
                if (id2 != null) {
                    map.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j11));
            new zza(map).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        int i11;
        AdvertisingIdClient advertisingIdClient = f8312i;
        if (advertisingIdClient == null) {
            synchronized (f8311h) {
                try {
                    advertisingIdClient = f8312i;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        f8312i = advertisingIdClient;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zzd zzdVarZza = zzd.zza(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Info infoE = advertisingIdClient.e();
            d(infoE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            return infoE;
        } catch (Throwable th3) {
            d(null, -1L, th3);
            if (th3 instanceof IOException) {
                i11 = 1;
            } else if (th3 instanceof GooglePlayServicesNotAvailableException) {
                i11 = 9;
            } else if (th3 instanceof GooglePlayServicesRepairableException) {
                i11 = 16;
            } else {
                i11 = th3 instanceof IllegalStateException ? 8 : -1;
            }
            zzdVarZza.zzc(35401, i11, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th3;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.b(false);
            Preconditions.f("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.c();
                Preconditions.g(advertisingIdClient.f8313a);
                Preconditions.g(advertisingIdClient.f8314b);
                try {
                    zZzd = advertisingIdClient.f8314b.zzd();
                } catch (RemoteException e8) {
                    throw new IOException("Remote exception", e8);
                }
            }
            advertisingIdClient.a();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z11) {
    }

    public final void a() {
        synchronized (this.f8316d) {
            zzb zzbVar = this.f8317e;
            if (zzbVar != null) {
                zzbVar.f8325c.countDown();
                try {
                    this.f8317e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j11 = this.f8319g;
            if (j11 > 0) {
                this.f8317e = new zzb(this, j11);
            }
        }
    }

    public final synchronized void c() {
        try {
            if (!this.f8315c) {
                try {
                    b(false);
                    if (!this.f8315c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e8) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Info e() {
        Info info;
        Preconditions.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            c();
            Preconditions.g(this.f8313a);
            Preconditions.g(this.f8314b);
            try {
                info = new Info(this.f8314b.zzc(), this.f8314b.zze());
            } catch (RemoteException e8) {
                throw new IOException("Remote exception", e8);
            }
        }
        a();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return e();
    }

    public void start() {
        b(true);
    }

    public final void zza() {
        Preconditions.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f8318f == null || this.f8313a == null) {
                    return;
                }
                try {
                    if (this.f8315c) {
                        ConnectionTracker.b().c(this.f8318f, this.f8313a);
                    }
                } catch (Throwable unused) {
                }
                this.f8315c = false;
                this.f8314b = null;
                this.f8313a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AdvertisingIdClient(Context context, long j11, boolean z11, boolean z12) {
        this.f8316d = new Object();
        Preconditions.g(context);
        this.f8318f = context.getApplicationContext();
        this.f8315c = false;
        this.f8319g = j11;
    }

    public final void b(boolean z11) {
        Preconditions.f("Calling this from your main thread can lead to deadlock");
        if (z11) {
            a();
        }
        synchronized (this) {
            try {
                if (this.f8315c) {
                    return;
                }
                Context context = this.f8318f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = GoogleApiAvailabilityLight.f8646b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.b().a(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException(OCBJEWZHh.oLSk);
                        }
                        this.f8313a = blockingServiceConnection;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder iBinderA = blockingServiceConnection.a();
                                int i11 = com.google.android.gms.internal.ads_identifier.zze.f9373a;
                                IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.f8314b = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads_identifier.zzd(iBinderA);
                                this.f8315c = true;
                            } catch (Throwable th2) {
                                throw new IOException(th2);
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
