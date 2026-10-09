package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrf {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f11895j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f11896k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f11898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f11899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f11900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Supplier f11901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Supplier f11902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f11903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile zzni f11904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f11905i;

    public zzrf(Context context, final Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.f11897a = context;
        this.f11899c = supplier;
        this.f11898b = supplier3;
        this.f11900d = supplier2;
        Pattern pattern = zzsa.f11942a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.a("phenotype_storage_info");
        zzrzVar.b("storage-info.pb");
        this.f11903g = zzrzVar.c();
        zzrz zzrzVar2 = new zzrz(context);
        zzrzVar2.a("phenotype_storage_info");
        zzrzVar2.b("device-encrypted-storage-info.pb");
        Set set = zzsa.f11945d;
        zzsq.a(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        zzrzVar2.f11934b = "directboot-files";
        this.f11905i = zzrzVar2.c();
        this.f11901e = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzre
            @Override // com.google.common.base.Supplier
            public final Object get() {
                final zzrf zzrfVar = this.f11894a;
                ListeningScheduledExecutorService listeningScheduledExecutorService = (ListeningScheduledExecutorService) zzrfVar.f11899c.get();
                listeningScheduledExecutorService.getClass();
                zzmj zzmjVar = (zzmj) zzrfVar.f11898b.get();
                zzmjVar.getClass();
                final FluentFuture fluentFuture = (FluentFuture) Futures.l((FluentFuture) Futures.b(FluentFuture.q(zzmjVar.zzd()), zzmk.class, new Function() { // from class: com.google.android.gms.internal.measurement.zzqz
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        zzmk zzmkVar = (zzmk) obj;
                        if (zzmkVar.f11733a != 29514) {
                            throw zzmkVar;
                        }
                        zznn zznnVarB = zzno.B();
                        zznh zznhVarL = zzni.L();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        zznhVarL.m();
                        ((zzni) zznhVarL.f11266b).N(jCurrentTimeMillis);
                        zznnVarB.m();
                        ((zzno) zznnVarB.f11266b).C((zzni) zznhVarL.p());
                        return (zzno) zznnVarB.p();
                    }
                }, listeningScheduledExecutorService), new Function() { // from class: com.google.android.gms.internal.measurement.zzra
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        zzrf zzrfVar2 = zzrfVar;
                        zzno zznoVar = (zzno) obj;
                        zzrfVar2.getClass();
                        zzse zzseVar = new zzse();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        try {
                            try {
                                synchronized (zzrf.f11895j) {
                                    zzru zzruVar = (zzru) zzrfVar2.f11900d.get();
                                    Uri uri = zzrfVar2.f11903g;
                                    zzsv zzsvVar = new zzsv(zznoVar.y());
                                    zzsvVar.f11960b = new zzro[]{zzseVar};
                                    zzruVar.a(uri, zzsvVar);
                                    zzrfVar2.f11904h = zznoVar.y();
                                }
                                synchronized (zzrf.f11896k) {
                                    zzru zzruVar2 = (zzru) zzrfVar2.f11900d.get();
                                    Uri uri2 = zzrfVar2.f11905i;
                                    zzsv zzsvVar2 = new zzsv(zznoVar.z());
                                    zzsvVar2.f11960b = new zzro[]{zzseVar};
                                    zzruVar2.a(uri2, zzsvVar2);
                                    zznoVar.z();
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e8) {
                                throw new RuntimeException(e8);
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th2;
                        }
                    }
                }, listeningScheduledExecutorService);
                fluentFuture.N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzrb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        try {
                            Futures.d(fluentFuture);
                        } catch (Exception unused) {
                        }
                    }
                }, listeningScheduledExecutorService);
                return fluentFuture;
            }
        });
        this.f11902f = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzqy
            @Override // com.google.common.base.Supplier
            public final Object get() {
                ListeningScheduledExecutorService listeningScheduledExecutorService = (ListeningScheduledExecutorService) supplier.get();
                listeningScheduledExecutorService.getClass();
                return listeningScheduledExecutorService.schedule((Callable) new Callable() { // from class: com.google.android.gms.internal.measurement.zzrd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return null;
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    public final void a() {
        if (zzky.b(this.f11897a)) {
            if (TimeUnit.HOURS.toMillis(24L) + c().C() < System.currentTimeMillis()) {
                ListeningScheduledExecutorService listeningScheduledExecutorService = (ListeningScheduledExecutorService) this.f11899c.get();
                listeningScheduledExecutorService.getClass();
                Futures.m(FluentFuture.q(Futures.i((ListenableFuture) this.f11902f.get())), new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzrc
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return Futures.i((ListenableFuture) this.f11892a.f11901e.get());
                    }
                }, listeningScheduledExecutorService);
                return;
            }
        }
        Futures.h();
    }

    public final zzqn b() {
        zzni zzniVarC = c();
        return new zzqn(zzniVarC.A(), ImmutableList.n(zzniVarC.F()), zzniVarC.z(), zzniVarC.B(), (zzniVarC.G() && zzniVarC.H().z() == ((long) Build.VERSION.SDK_INT)) ? zzniVarC.H().y() : BuildConfig.VERSION_NAME, ImmutableList.n(zzniVarC.D()), ImmutableList.n(zzniVarC.E()), zzniVarC.y(), zzniVarC.J(), zzniVarC.I(), zzniVarC.K());
    }

    public final zzni c() {
        zzni zzniVarM;
        zzni zzniVar = this.f11904h;
        if (zzniVar != null) {
            return zzniVar;
        }
        synchronized (f11895j) {
            try {
                zzniVarM = this.f11904h;
                if (zzniVarM == null) {
                    zzniVarM = zzni.M();
                    if (zzky.b(this.f11897a)) {
                        zzss zzssVar = new zzss(zzniVarM.f());
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            try {
                                zzni zzniVar2 = (zzni) ((zzru) this.f11900d.get()).a(this.f11903g, zzssVar);
                                StrictMode.setThreadPolicy(threadPolicy);
                                zzniVarM = zzniVar2;
                            } catch (IOException unused) {
                                StrictMode.setThreadPolicy(threadPolicy);
                            }
                            this.f11904h = zzniVarM;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzniVarM;
    }
}
