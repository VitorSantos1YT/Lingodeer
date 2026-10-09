package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zznp implements zzom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzph f11762b;

    public zznp(String str, zzph zzphVar) {
        this.f11761a = str;
        this.f11762b = zzphVar;
    }

    public Object b() {
        return null;
    }

    public abstract Object c(zzlk zzlkVar);

    public abstract Object d(String str);

    public abstract Object e(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Supplier
    public final Object get() {
        boolean z11;
        zzlk zzlkVar;
        if (zzls.f11720c == null) {
            Object obj = zzlk.f11700j;
            zzls.f11720c = new zzlr();
        }
        Context context = (Context) zzlk.f11701k.get();
        if (context == null) {
            synchronized (zzls.f11718a) {
            }
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        zzlk zzlkVar2 = zzlk.f11702l;
        if (zzlkVar2 == null) {
            final Context context2 = context.getApplicationContext();
            try {
                m.f(context2, "context");
                Object applicationContext = context2.getApplicationContext();
                m.e(applicationContext, "getApplicationContext(...)");
                if (!(applicationContext instanceof zzagp)) {
                    Class<?> cls = applicationContext.getClass();
                    new StringBuilder(String.valueOf(cls).length() + 72);
                    cls.toString();
                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                }
                try {
                    Object objCast = zzlk.zza.class.cast(((zzagp) applicationContext).zza());
                    m.c(objCast);
                    Optional optionalZza = ((zzlk.zza) objCast).zza();
                    z11 = true;
                    try {
                        if (optionalZza.c()) {
                            zzlkVar2 = (zzlk) optionalZza.b();
                        }
                    } catch (IllegalStateException unused) {
                    }
                } catch (ClassCastException e8) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e8);
                }
            } catch (IllegalStateException unused2) {
                z11 = false;
            }
            synchronized (zzlk.f11700j) {
                try {
                    if (zzlk.f11702l != null) {
                        zzlkVar = zzlk.f11702l;
                    } else {
                        Optional optionalA = Optional.a();
                        boolean z12 = context2 instanceof zzlk.zza;
                        if (z12) {
                            optionalA = ((zzlk.zza) context2).zza();
                        }
                        zzlkVar = (zzlk) optionalA.e(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzll
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                Object obj2 = zzlk.f11700j;
                                final zzlj zzljVar = new zzlj();
                                Context context3 = context2;
                                zzljVar.f11694a = context3;
                                context3.getClass();
                                if (zzljVar.f11695b == null) {
                                    zzljVar.f11695b = zzlk.m;
                                }
                                if (zzljVar.f11696c == null) {
                                    final Context context4 = zzljVar.f11694a;
                                    zzljVar.f11696c = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzln
                                        @Override // com.google.common.base.Supplier
                                        public final Object get() {
                                            Object obj3 = zzlk.f11700j;
                                            Api api = zzjx.f11653a;
                                            return new zzmn(new zzkk(context4, null, zzjx.f11653a, Api.ApiOptions.f8664h, GoogleApi.Settings.f8687c));
                                        }
                                    });
                                }
                                if (zzljVar.f11697d == null) {
                                    zzljVar.f11697d = new Supplier() { // from class: com.google.android.gms.internal.measurement.zzli
                                        @Override // com.google.common.base.Supplier
                                        public final /* synthetic */ Object get() {
                                            return Optional.d(new zzqi(zzljVar.f11695b));
                                        }
                                    };
                                }
                                if (zzljVar.f11698e == null) {
                                    Context context5 = zzljVar.f11694a;
                                    final ArrayList arrayList = new ArrayList();
                                    Collections.addAll(arrayList, new zzrx(new zzrw(context5)), new zzsd());
                                    zzljVar.f11698e = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlm
                                        @Override // com.google.common.base.Supplier
                                        public final /* synthetic */ Object get() {
                                            Object obj3 = zzlk.f11700j;
                                            return new zzru(arrayList);
                                        }
                                    });
                                }
                                if (zzljVar.f11699f == null) {
                                    zzljVar.f11699f = new Supplier() { // from class: com.google.android.gms.internal.measurement.zzlh
                                        @Override // com.google.common.base.Supplier
                                        public final /* synthetic */ Object get() {
                                            Context context6 = zzljVar.f11694a;
                                            Object obj3 = zzlk.f11700j;
                                            try {
                                                return Optional.d(context6.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                            } catch (PackageManager.NameNotFoundException unused3) {
                                                return Optional.a();
                                            }
                                        }
                                    };
                                }
                                return new zzlk(zzljVar.f11694a, zzljVar.f11695b, zzljVar.f11696c, zzljVar.f11697d, zzljVar.f11698e, zzljVar.f11699f);
                            }
                        });
                        zzlk.f11702l = zzlkVar;
                        if (!z11 && !z12) {
                            zzlz.a(Level.CONFIG, zzlkVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzlkVar2 = zzlkVar;
        }
        Object objC = c(zzlkVar2);
        objC.getClass();
        return objC;
    }
}
