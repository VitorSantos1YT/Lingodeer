package com.google.firebase.analytics.connector;

import a.ar.MFeWs;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile AnalyticsConnectorImpl f17779c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f17780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f17781b;

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.g(appMeasurementSdk);
        this.f17780a = appMeasurementSdk;
        this.f17781b = new ConcurrentHashMap();
    }

    public static AnalyticsConnector i(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.g(firebaseApp);
        Preconditions.g(context);
        Preconditions.g(subscriber);
        Preconditions.g(context.getApplicationContext());
        if (f17779c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (f17779c == null) {
                        Bundle bundle = new Bundle(1);
                        firebaseApp.b();
                        if ("[DEFAULT]".equals(firebaseApp.f17715b)) {
                            subscriber.b(new Executor() { // from class: com.google.firebase.analytics.connector.zzb
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new EventHandler() { // from class: com.google.firebase.analytics.connector.zza
                                @Override // com.google.firebase.events.EventHandler
                                public final void a(Event event) {
                                    throw null;
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.k());
                        }
                        f17779c = new AnalyticsConnectorImpl(zzez.i(context, bundle).f11585c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17779c;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final Map a(boolean z11) {
        return this.f17780a.f12596a.c(null, null, z11);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void c(Object obj, String str) {
        if (zzc.a(str) && zzc.c(str, "_ln")) {
            this.f17780a.f12596a.l(str, "_ln", obj, true);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void d(String str, String str2, Bundle bundle) {
        if (zzc.a(str) && zzc.b(str2, bundle) && zzc.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f17780a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final int e(String str) {
        return this.f17780a.f12596a.d(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void f(String str) {
        this.f17780a.f12596a.n(str, null, null);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final AnalyticsConnector.AnalyticsConnectorHandle h(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        if (zzc.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f17781b;
            if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
                return null;
            }
            boolean zEquals = "fiam".equals(str);
            AppMeasurementSdk appMeasurementSdk = this.f17780a;
            if (zEquals) {
                zzgVar = new zze(appMeasurementSdk, analyticsConnectorListener);
            } else {
                zzgVar = "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
            }
            if (zzgVar != null) {
                concurrentHashMap.put(str, zzgVar);
                return new AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AnalyticsConnectorImpl f17783b;

                    {
                        this.f17783b = this;
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public final void a(Set set) {
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.f17783b;
                        analyticsConnectorImpl.getClass();
                        ConcurrentHashMap concurrentHashMap2 = analyticsConnectorImpl.f17781b;
                        String str2 = str;
                        if (str2.isEmpty() || !concurrentHashMap2.containsKey(str2) || concurrentHashMap2.get(str2) == null || !str2.equals("fiam") || set == null || set.isEmpty()) {
                            return;
                        }
                        ((com.google.firebase.analytics.connector.internal.zza) concurrentHashMap2.get(str2)).a(set);
                    }
                };
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void b(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Throwable th2;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ImmutableSet immutableSet = zzc.f17785a;
        String str = conditionalUserProperty.f17765a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = conditionalUserProperty.f17767c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                            if (obj2 == null) {
                                return;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th2;
                            }
                            objectInputStream.close();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th5) {
                th2 = th5;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (zzc.a(str) && zzc.c(str, conditionalUserProperty.f17766b)) {
            String str2 = conditionalUserProperty.f17775k;
            if (str2 == null || (zzc.b(str2, conditionalUserProperty.f17776l) && zzc.d(str, conditionalUserProperty.f17775k, conditionalUserProperty.f17776l))) {
                String str3 = conditionalUserProperty.f17772h;
                if (str3 == null || (zzc.b(str3, conditionalUserProperty.f17773i) && zzc.d(str, conditionalUserProperty.f17772h, conditionalUserProperty.f17773i))) {
                    String str4 = conditionalUserProperty.f17770f;
                    if (str4 == null || (zzc.b(str4, conditionalUserProperty.f17771g) && zzc.d(str, conditionalUserProperty.f17770f, conditionalUserProperty.f17771g))) {
                        Bundle bundle = new Bundle();
                        String str5 = conditionalUserProperty.f17765a;
                        if (str5 != null) {
                            bundle.putString(OSSHeaders.ORIGIN, str5);
                        }
                        String str6 = conditionalUserProperty.f17766b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = conditionalUserProperty.f17767c;
                        if (obj3 != null) {
                            zzjh.a(bundle, obj3);
                        }
                        String str7 = conditionalUserProperty.f17768d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", conditionalUserProperty.f17769e);
                        String str8 = conditionalUserProperty.f17770f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = conditionalUserProperty.f17771g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = conditionalUserProperty.f17772h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = conditionalUserProperty.f17773i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", conditionalUserProperty.f17774j);
                        String str10 = conditionalUserProperty.f17775k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = conditionalUserProperty.f17776l;
                        if (bundle4 != null) {
                            bundle.putBundle(MFeWs.OJWSJZgQQWtUe, bundle4);
                        }
                        bundle.putLong("creation_timestamp", conditionalUserProperty.m);
                        bundle.putBoolean("active", conditionalUserProperty.f17777n);
                        bundle.putLong("triggered_timestamp", conditionalUserProperty.f17778o);
                        this.f17780a.f12596a.m(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final List g(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f17780a.f12596a.o(str, BuildConfig.VERSION_NAME)) {
            ImmutableSet immutableSet = zzc.f17785a;
            Preconditions.g(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            String str2 = (String) zzjh.b(bundle, OSSHeaders.ORIGIN, String.class, null);
            Preconditions.g(str2);
            conditionalUserProperty.f17765a = str2;
            String str3 = (String) zzjh.b(bundle, "name", String.class, null);
            Preconditions.g(str3);
            conditionalUserProperty.f17766b = str3;
            conditionalUserProperty.f17767c = zzjh.b(bundle, "value", Object.class, null);
            conditionalUserProperty.f17768d = (String) zzjh.b(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.f17769e = ((Long) zzjh.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.f17770f = (String) zzjh.b(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.f17771g = (Bundle) zzjh.b(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.f17772h = (String) zzjh.b(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.f17773i = (Bundle) zzjh.b(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.f17774j = ((Long) zzjh.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.f17775k = (String) zzjh.b(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.f17776l = (Bundle) zzjh.b(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.f17777n = ((Boolean) zzjh.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.m = ((Long) zzjh.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.f17778o = ((Long) zzjh.b(bundle, aYZzTH.sOg, Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }
}
