package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzos {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzos f10816b = new zzos();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10817a = new HashMap();

    public final synchronized void a(String str, zzcq zzcqVar) {
        try {
            if (!this.f10817a.containsKey(str)) {
                this.f10817a.put(str, zzcqVar);
                return;
            }
            if (((zzcq) this.f10817a.get(str)).equals(zzcqVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f10817a.get(str)) + "), cannot insert " + String.valueOf(zzcqVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (zzcq) entry.getValue());
        }
    }
}
