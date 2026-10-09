package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f21240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ExtensionRegistryLite f21241c = new ExtensionRegistryLite(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21242a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }

        private ExtensionClassHolder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ObjectIntPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f21243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21244b;

        public ObjectIntPair(int i11, MessageLite messageLite) {
            this.f21243a = messageLite;
            this.f21244b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f21243a == objectIntPair.f21243a && this.f21244b == objectIntPair.f21244b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f21243a) * 65535) + this.f21244b;
        }
    }

    public ExtensionRegistryLite() {
        this.f21242a = new HashMap();
    }

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLite;
        ExtensionRegistryLite extensionRegistryLite2 = f21240b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = f21240b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.f21239a;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : f21241c;
                    f21240b = extensionRegistryLite;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return extensionRegistryLite;
    }

    public ExtensionRegistryLite(int i11) {
        this.f21242a = Collections.EMPTY_MAP;
    }
}
