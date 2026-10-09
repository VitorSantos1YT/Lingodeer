package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10838b;

    public /* synthetic */ zzpq(int i11) {
        this();
    }

    public final void a(zzpn zzpnVar) throws GeneralSecurityException {
        if (zzpnVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzpt zzptVar = new zzpt(zzpnVar.f10835a, zzpnVar.f10836b);
        HashMap map = this.f10837a;
        if (!map.containsKey(zzptVar)) {
            map.put(zzptVar, zzpnVar);
            return;
        }
        zzpn zzpnVar2 = (zzpn) map.get(zzptVar);
        if (!zzpnVar2.equals(zzpnVar) || !zzpnVar.equals(zzpnVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(zzptVar)));
        }
    }

    public final void b(zzpv zzpvVar) throws GeneralSecurityException {
        if (zzpvVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsZza = zzpvVar.zza();
        HashMap map = this.f10838b;
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzpvVar);
            return;
        }
        zzpv zzpvVar2 = (zzpv) map.get(clsZza);
        if (!zzpvVar2.equals(zzpvVar) || !zzpvVar.equals(zzpvVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(clsZza)));
        }
    }

    private zzpq() {
        this.f10837a = new HashMap();
        this.f10838b = new HashMap();
    }

    public zzpq(zzpr zzprVar) {
        this.f10837a = new HashMap(zzprVar.f10839a);
        this.f10838b = new HashMap(zzprVar.f10840b);
    }
}
