package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10861d;

    public zzqd() {
        this.f10858a = new HashMap();
        this.f10859b = new HashMap();
        this.f10860c = new HashMap();
        this.f10861d = new HashMap();
    }

    public final void a(zznq zznqVar) throws GeneralSecurityException {
        zznqVar.getClass();
        zzqc zzqcVar = new zzqc(zzpx.class, zznqVar.f10789a);
        HashMap map = this.f10859b;
        if (!map.containsKey(zzqcVar)) {
            map.put(zzqcVar, zznqVar);
            return;
        }
        zznq zznqVar2 = (zznq) map.get(zzqcVar);
        if (!zznqVar2.equals(zznqVar) || !zznqVar.equals(zznqVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(zzqcVar)));
        }
    }

    public final void b(zznu zznuVar) throws GeneralSecurityException {
        zzqf zzqfVar = new zzqf(zznuVar.f10795a, zzpx.class);
        HashMap map = this.f10858a;
        if (!map.containsKey(zzqfVar)) {
            map.put(zzqfVar, zznuVar);
            return;
        }
        zznu zznuVar2 = (zznu) map.get(zzqfVar);
        if (!zznuVar2.equals(zznuVar) || !zznuVar.equals(zznuVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(zzqfVar)));
        }
    }

    public final void c(zzoy zzoyVar) throws GeneralSecurityException {
        zzoyVar.getClass();
        zzqc zzqcVar = new zzqc(zzpw.class, zzoyVar.f10822a);
        HashMap map = this.f10861d;
        if (!map.containsKey(zzqcVar)) {
            map.put(zzqcVar, zzoyVar);
            return;
        }
        zzoy zzoyVar2 = (zzoy) map.get(zzqcVar);
        if (!zzoyVar2.equals(zzoyVar) || !zzoyVar.equals(zzoyVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(zzqcVar)));
        }
    }

    public final void d(zzpc zzpcVar) throws GeneralSecurityException {
        zzqf zzqfVar = new zzqf(zzpcVar.f10826a, zzpw.class);
        HashMap map = this.f10860c;
        if (!map.containsKey(zzqfVar)) {
            map.put(zzqfVar, zzpcVar);
            return;
        }
        zzpc zzpcVar2 = (zzpc) map.get(zzqfVar);
        if (!zzpcVar2.equals(zzpcVar) || !zzpcVar.equals(zzpcVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(zzqfVar)));
        }
    }

    public zzqd(zzqa zzqaVar) {
        this.f10858a = new HashMap(zzqaVar.f10852a);
        this.f10859b = new HashMap(zzqaVar.f10853b);
        this.f10860c = new HashMap(zzqaVar.f10854c);
        this.f10861d = new HashMap(zzqaVar.f10855d);
    }
}
