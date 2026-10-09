package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlk {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f11700j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReference f11701k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile zzlk f11702l = null;
    public static final Supplier m = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlp
        @Override // com.google.common.base.Supplier
        public final /* synthetic */ Object get() {
            Object obj = zzlk.f11700j;
            return MoreExecutors.b(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.measurement.zzlo
                @Override // java.util.concurrent.ThreadFactory
                public final /* synthetic */ Thread newThread(Runnable runnable) {
                    Object obj2 = zzlk.f11700j;
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            }));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzol f11703a = new zzol();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f11705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f11706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Supplier f11707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Supplier f11708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzrf f11709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Supplier f11710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzqe f11711i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface zza {
        Optional zza();
    }

    public zzlk(Context context, Supplier supplier, Supplier supplier2, final Supplier supplier3, Supplier supplier4, Supplier supplier5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        supplier.getClass();
        supplier2.getClass();
        supplier3.getClass();
        supplier4.getClass();
        supplier5.getClass();
        Supplier supplierA = Suppliers.a(supplier);
        Supplier supplierA2 = Suppliers.a(supplier2);
        Supplier supplierA3 = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlq
            @Override // com.google.common.base.Supplier
            public final /* synthetic */ Object get() {
                Object obj = zzlk.f11700j;
                return (zzqm) ((Optional) supplier3.get()).g();
            }
        });
        Supplier supplierA4 = Suppliers.a(supplier4);
        Supplier supplierA5 = Suppliers.a(supplier5);
        this.f11704b = applicationContext;
        this.f11705c = supplierA;
        this.f11706d = supplierA2;
        this.f11707e = supplierA3;
        this.f11708f = supplierA4;
        this.f11709g = new zzrf(applicationContext, supplierA, supplierA4, supplierA2);
        this.f11710h = supplierA5;
        this.f11711i = new zzqe(applicationContext, supplierA, supplierA3, supplierA2);
    }

    public static void b() {
        synchronized (zzls.f11718a) {
        }
        if (f11701k.get() == null && zzls.f11719b == null) {
            zzls.f11719b = new zzlr();
        }
    }

    public final ListeningScheduledExecutorService a() {
        return (ListeningScheduledExecutorService) this.f11705c.get();
    }
}
