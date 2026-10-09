package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzop {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzop f10811b = new zzop();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10812a = new ConcurrentHashMap();

    public final void a(zzoo zzooVar, Class cls) throws GeneralSecurityException {
        zzoo zzooVar2 = (zzoo) this.f10812a.putIfAbsent(cls, zzooVar);
        if (zzooVar2 != null && !zzooVar2.equals(zzooVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
