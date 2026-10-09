package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends d {
    public final Context D;
    public volatile int E;
    public volatile zzau F;
    public volatile f0 G;
    public volatile ScheduledExecutorService H;

    public g0(ay.k0 k0Var, Context context, c cVar) {
        super(k0Var, context, cVar);
        this.E = 0;
        this.D = context;
    }

    public final zzcz G(int i11) {
        int i12 = 0;
        if (M()) {
            return zzu.a(new c0(this, i11, i12));
        }
        int i13 = zzc.f12272a;
        H(zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, j0.a(-1, "Billing Override Service connection is disconnected."));
        return zzcu.a(0);
    }

    public final void H(zzie zzieVar, int i11, j jVar) {
        int i12 = h0.f7514a;
        zzhx zzhxVarB = h0.b(zzieVar, i11, jVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzhxVarB, "ApiFailure should not be null");
        this.f7479h.w(zzhxVarB);
    }

    public final void I(int i11) {
        int i12 = h0.f7514a;
        zzib zzibVarC = h0.c(i11, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzibVarC, "ApiSuccess should not be null");
        ob.c cVar = this.f7479h;
        cVar.getClass();
        try {
            cVar.D(zzibVarC, (zzis) cVar.f44799b);
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
        }
    }

    public final void J(int i11, y4.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        zzcz zzczVarG = G(i11);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzcu.c(zzcu.b(zzczVarG, scheduledExecutorService), new d0(this, i11, aVar, runnable), g());
    }

    public final synchronized boolean M() {
        return (this.E != 2 || this.F == null || this.G == null) ? false : true;
    }

    @Override // com.android.billingclient.api.d
    public final void a(b bVar, a5.j jVar) {
        J(3, new a0(jVar, 1), new b0(this, bVar, jVar, 1));
    }

    @Override // com.android.billingclient.api.d
    public final void b() {
        synchronized (this) {
            I(27);
            try {
                try {
                    if (this.G != null && this.F != null) {
                        zzc.h("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.D.unbindService(this.G);
                        this.G = new f0(this);
                    }
                    this.F = null;
                    if (this.H != null) {
                        this.H.shutdownNow();
                        this.H = null;
                    }
                } catch (RuntimeException unused) {
                    int i11 = zzc.f12272a;
                }
                this.E = 3;
            } catch (Throwable th2) {
                this.E = 3;
                throw th2;
            }
        }
        super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.d
    public final j c(Activity activity, h hVar) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) G(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            H(zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, j0.f7538r);
            int i11 = zzc.f12272a;
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            H(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, j0.f7538r);
            int i12 = zzc.f12272a;
        }
        if (iIntValue > 0) {
            j jVarA = j0.a(iIntValue, "Billing override value was set by a license tester.");
            H(zzie.LICENSE_TESTER_BILLING_OVERRIDE, 2, jVarA);
            F(jVarA);
            return jVarA;
        }
        try {
            return super.c(activity, hVar);
        } catch (Exception unused2) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            j jVar = j0.f7529h;
            H(zzieVar, 2, jVar);
            int i13 = zzc.f12272a;
            return jVar;
        }
    }

    @Override // com.android.billingclient.api.d
    public final void d(hd.b bVar, a5.f fVar) {
        J(7, new a0(fVar, 0), new b0(this, bVar, fVar, 0));
    }

    @Override // com.android.billingclient.api.d
    public final void f(e eVar) {
        synchronized (this) {
            if (M()) {
                zzc.h("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                I(26);
            } else if (this.E == 1) {
                int i11 = zzc.f12272a;
            } else if (this.E == 3) {
                int i12 = zzc.f12272a;
                H(zzie.BILLING_CLIENT_CLOSED, 26, j0.a(-1, "Billing Override Service connection is disconnected."));
            } else {
                this.E = 1;
                zzc.h("BillingClientTesting", anrPHlQ.ojujqMyjUB);
                this.G = new f0(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.D;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, this.G, 1)) {
                                zzc.h("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                            }
                        }
                    }
                }
                this.E = 0;
                zzc.h("BillingClientTesting", "Billing Override Service unavailable on device.");
                H(zzieVar, 26, j0.a(2, "Billing Override Service unavailable on device."));
            }
        }
        n(eVar);
    }

    public g0(ay.k0 k0Var, Context context, r rVar, c cVar) {
        super(k0Var, context, rVar, cVar);
        this.E = 0;
        this.D = context;
    }
}
