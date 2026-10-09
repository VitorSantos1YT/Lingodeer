package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.pairip.VMRunner;
import fa.EQx.nuRcCS;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ns.o;
import y.d;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseApp {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17712k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f17713l = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseOptions f17716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentRuntime f17717d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f17720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider f17721h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f17718e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17719f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f17722i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f17723j = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BackgroundStateChangeListener {
        void a(boolean z11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference f17724a = new AtomicReference();

        private GlobalBackgroundStateListener() {
        }

        public static void b(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                AtomicReference atomicReference = f17724a;
                if (atomicReference.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    while (!atomicReference.compareAndSet(null, globalBackgroundStateListener)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    BackgroundDetector.b(application);
                    BackgroundDetector.f8715e.a(globalBackgroundStateListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void a(boolean z11) {
            synchronized (FirebaseApp.f17712k) {
                try {
                    ArrayList arrayList = new ArrayList(FirebaseApp.f17713l.values());
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        FirebaseApp firebaseApp = (FirebaseApp) obj;
                        if (firebaseApp.f17718e.get()) {
                            Iterator it = firebaseApp.f17722i.iterator();
                            while (it.hasNext()) {
                                ((BackgroundStateChangeListener) it.next()).a(z11);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UserUnlockReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicReference f17725b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17726a;

        public UserUnlockReceiver(Context context) {
            this.f17726a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("0z51cBvV40uBhTx9", new Object[]{this, context, intent});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public FirebaseApp(final Context context, FirebaseOptions firebaseOptions, String str) {
        ?? arrayList;
        this.f17714a = context;
        Preconditions.d(str);
        this.f17715b = str;
        this.f17716c = firebaseOptions;
        StartupTime startupTime = FirebaseInitProvider.f20642a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ComponentDiscovery componentDiscoveryA = ComponentDiscovery.a(context);
        ArrayList arrayList2 = new ArrayList();
        Context context2 = componentDiscoveryA.f18098a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context2.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context2, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            final int i11 = 0;
            arrayList2.add(new Provider() { // from class: com.google.firebase.components.a
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    switch (i11) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                return null;
                            } catch (IllegalAccessException e8) {
                                throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e8);
                            } catch (InstantiationException e10) {
                                throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e10);
                            } catch (NoSuchMethodException e11) {
                                throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e11);
                            } catch (InvocationTargetException e12) {
                                throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e12);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ComponentRuntime.Builder builder = new ComponentRuntime.Builder(UiExecutor.INSTANCE);
        ArrayList arrayList3 = builder.f18109b;
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        final int i12 = 1;
        arrayList3.add(new Provider() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i12) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            return null;
                        } catch (IllegalAccessException e8) {
                            throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e8);
                        } catch (InstantiationException e10) {
                            throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e10);
                        } catch (NoSuchMethodException e11) {
                            throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e11);
                        } catch (InvocationTargetException e12) {
                            throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e12);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new Provider() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i12) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            return null;
                        } catch (IllegalAccessException e8) {
                            throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e8);
                        } catch (InstantiationException e10) {
                            throw new InvalidRegistrarException(ep.a.g("Could not instantiate ", str4, "."), e10);
                        } catch (NoSuchMethodException e11) {
                            throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e11);
                        } catch (InvocationTargetException e12) {
                            throw new InvalidRegistrarException(ep.a.e("Could not instantiate ", str4), e12);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        Component componentC = Component.c(context, Context.class, new Class[0]);
        ArrayList arrayList4 = builder.f18110c;
        arrayList4.add(componentC);
        arrayList4.add(Component.c(this, FirebaseApp.class, new Class[0]));
        arrayList4.add(Component.c(firebaseOptions, FirebaseOptions.class, new Class[0]));
        builder.f18111d = new ComponentMonitor();
        if (o.H(context) && FirebaseInitProvider.f20643b.get()) {
            arrayList4.add(Component.c(startupTime, StartupTime.class, new Class[0]));
        }
        ComponentRuntime componentRuntime = new ComponentRuntime(builder.f18108a, arrayList3, arrayList4, builder.f18111d);
        this.f17717d = componentRuntime;
        Trace.endSection();
        this.f17720g = new Lazy(new Provider() { // from class: com.google.firebase.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseApp.f17712k;
                FirebaseApp firebaseApp = this.f17745a;
                return new DataCollectionConfigStorage(context, firebaseApp.g(), (Publisher) firebaseApp.f17717d.a(Publisher.class));
            }
        });
        this.f17721h = componentRuntime.c(DefaultHeartBeatController.class);
        a(new BackgroundStateChangeListener() { // from class: com.google.firebase.b
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void a(boolean z11) {
                if (z11) {
                    Object obj = FirebaseApp.f17712k;
                } else {
                    ((DefaultHeartBeatController) this.f18083a.f17721h.get()).c();
                }
            }
        });
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f17712k) {
            try {
                for (FirebaseApp firebaseApp : (d) f17713l.values()) {
                    firebaseApp.b();
                    arrayList.add(firebaseApp.f17715b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static FirebaseApp e() {
        FirebaseApp firebaseApp;
        synchronized (f17712k) {
            try {
                firebaseApp = (FirebaseApp) f17713l.get("[DEFAULT]");
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((DefaultHeartBeatController) firebaseApp.f17721h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp f(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f17712k) {
            try {
                firebaseApp = (FirebaseApp) f17713l.get(str.trim());
                if (firebaseApp == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((DefaultHeartBeatController) firebaseApp.f17721h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp i(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.b(context);
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f17712k) {
            e eVar = f17713l;
            Preconditions.i("FirebaseApp name " + strTrim + " already exists!", !eVar.containsKey(strTrim));
            Preconditions.h(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, firebaseOptions, strTrim);
            eVar.put(strTrim, firebaseApp);
        }
        firebaseApp.h();
        return firebaseApp;
    }

    public static void j(Context context) {
        synchronized (f17712k) {
            try {
                if (f17713l.containsKey("[DEFAULT]")) {
                    e();
                    return;
                }
                FirebaseOptions firebaseOptionsA = FirebaseOptions.a(context);
                if (firebaseOptionsA == null) {
                    return;
                }
                i(context, firebaseOptionsA, "[DEFAULT]");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        b();
        if (this.f17718e.get() && BackgroundDetector.f8715e.f8716a.get()) {
            backgroundStateChangeListener.a(true);
        }
        this.f17722i.add(backgroundStateChangeListener);
    }

    public final void b() {
        Preconditions.i("FirebaseApp was deleted", !this.f17719f.get());
    }

    public final Object c(Class cls) {
        b();
        return this.f17717d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.b();
        return this.f17715b.equals(firebaseApp.f17715b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        b();
        byte[] bytes = this.f17715b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        b();
        byte[] bytes2 = this.f17716c.f17732b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap map;
        if (!o.H(this.f17714a)) {
            b();
            Context context = this.f17714a;
            AtomicReference atomicReference = UserUnlockReceiver.f17725b;
            if (atomicReference.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        b();
        ComponentRuntime componentRuntime = this.f17717d;
        b();
        boolean zEquals = "[DEFAULT]".equals(this.f17715b);
        AtomicReference atomicReference2 = componentRuntime.f18106f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((DefaultHeartBeatController) this.f17721h.get()).c();
            }
        }
        synchronized (componentRuntime) {
            map = new HashMap(componentRuntime.f18101a);
        }
        componentRuntime.j(map, zEquals);
        ((DefaultHeartBeatController) this.f17721h.get()).c();
    }

    public final int hashCode() {
        return this.f17715b.hashCode();
    }

    public final boolean k() {
        boolean z11;
        b();
        DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) this.f17720g.get();
        synchronized (dataCollectionConfigStorage) {
            z11 = dataCollectionConfigStorage.f20427b;
        }
        return z11;
    }

    public final String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper = new com.google.android.gms.common.internal.Objects.ToStringHelper(this);
        toStringHelper.a(this.f17715b, "name");
        toStringHelper.a(this.f17716c, nuRcCS.jcPlTOWfDax);
        return toStringHelper.toString();
    }
}
