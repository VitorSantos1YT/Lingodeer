package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class MetadataBackendRegistry implements BackendRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFactoryProvider f8058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationContextFactory f8059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8060c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BackendFactoryProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f8062b = null;

        public BackendFactoryProvider(Context context) {
            this.f8061a = context;
        }

        public final BackendFactory a(String str) {
            Bundle bundle;
            Map map;
            ServiceInfo serviceInfo;
            if (this.f8062b == null) {
                Context context = this.f8061a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (bundle == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String strTrim = str3.trim();
                                if (!strTrim.isEmpty()) {
                                    map2.put(strTrim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = map2;
                }
                this.f8062b = map;
            }
            String str4 = (String) this.f8062b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder("Class ");
                sb2.append(str4);
                sb2.append(" is not found.");
                return null;
            } catch (IllegalAccessException unused3) {
                StringBuilder sb3 = new StringBuilder("Could not instantiate ");
                sb3.append(str4);
                sb3.append(".");
                return null;
            } catch (InstantiationException unused4) {
                StringBuilder sb4 = new StringBuilder("Could not instantiate ");
                sb4.append(str4);
                sb4.append(".");
                return null;
            } catch (NoSuchMethodException unused5) {
                "Could not instantiate ".concat(str4);
                return null;
            } catch (InvocationTargetException unused6) {
                "Could not instantiate ".concat(str4);
                return null;
            }
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        BackendFactoryProvider backendFactoryProvider = new BackendFactoryProvider(context);
        this.f8060c = new HashMap();
        this.f8058a = backendFactoryProvider;
        this.f8059b = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public final synchronized TransportBackend a(String str) {
        if (this.f8060c.containsKey(str)) {
            return (TransportBackend) this.f8060c.get(str);
        }
        BackendFactory backendFactoryA = this.f8058a.a(str);
        if (backendFactoryA == null) {
            return null;
        }
        CreationContextFactory creationContextFactory = this.f8059b;
        TransportBackend transportBackendCreate = backendFactoryA.create(new AutoValue_CreationContext(creationContextFactory.f8052a, creationContextFactory.f8053b, creationContextFactory.f8054c, str));
        this.f8060c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
