package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11723a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzlc f11724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f11725c;

    static {
        new AtomicReference();
        Preconditions.k(new Object() { // from class: com.google.android.gms.internal.measurement.zzlu
        }, "BuildInfo must be non-null");
        f11725c = new AtomicInteger();
    }

    public static void a(final Context context) {
        if (f11724b != null || context == null) {
            return;
        }
        Object obj = f11723a;
        synchronized (obj) {
            try {
                if (f11724b == null) {
                    synchronized (obj) {
                        try {
                            zzlc zzlcVar = f11724b;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzlcVar == null || zzlcVar.f11686a != context) {
                                if (zzlcVar != null) {
                                    Iterator it = zzld.f11688a.values().iterator();
                                    if (it.hasNext()) {
                                        throw null;
                                    }
                                    zzma.a();
                                }
                                f11724b = new zzlc(context, Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlv
                                    @Override // com.google.common.base.Supplier
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = zzlw.f11723a;
                                        return zzlf.a(context);
                                    }
                                }));
                                f11725c.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
