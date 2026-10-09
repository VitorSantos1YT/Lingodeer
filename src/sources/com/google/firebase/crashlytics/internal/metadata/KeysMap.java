package com.google.firebase.crashlytics.internal.metadata;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class KeysMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18398a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18399b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18400c;

    public KeysMap(int i11) {
        this.f18400c = i11;
    }

    public static String a(int i11, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i11) {
                return str.substring(0, i11);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean zEquals;
        String strA = a(this.f18400c, "com.crashlytics.version-control-info");
        if (this.f18398a.size() >= this.f18399b && !this.f18398a.containsKey(strA)) {
            return false;
        }
        String strA2 = a(this.f18400c, str);
        String str2 = (String) this.f18398a.get(strA);
        if (str2 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str2.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        this.f18398a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f18400c, str);
                if (this.f18398a.size() < this.f18399b || this.f18398a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f18398a.put(strA, str2 == null ? BuildConfig.VERSION_NAME : a(this.f18400c, str2));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
