package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f10597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f10598f;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        f10593a = new zzpf(zzjn.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) throws GeneralSecurityException {
                zzjn zzjnVar = (zzjn) zzcqVar;
                zzpc zzpcVar = zzjv.f10593a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesSivKey");
                zzue.zza zzaVarZ = zzue.z();
                int i11 = zzjnVar.f10582a;
                zzaVarZ.i();
                ((zzue) zzaVarZ.f10131b).zze = i11;
                zzaVarV.m(((zzue) zzaVarZ.g()).f());
                zzjn.zzb zzbVar = zzjnVar.f10583b;
                Map map = zzjv.f10597e;
                if (!map.containsKey(zzbVar)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
                }
                zzaVarV.k((zzxl) map.get(zzbVar));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10594b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzjv.f10593a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesSivParameters.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzue zzueVarW = zzue.w(zzwnVar.D(), zzakj.f10117b);
                    if (zzueVarW.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzjn.zza zzaVar = new zzjn.zza(0);
                    zzaVar.b(zzueVarW.v());
                    zzaVar.f10585b = zzjv.a(zzwnVar.C());
                    return zzaVar.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e8);
                }
            }
        });
        f10595c = new zznx(zzjg.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzjg zzjgVar = (zzjg) zzbtVar;
                zzpc zzpcVar = zzjv.f10593a;
                zzub.zza zzaVarY = zzub.y();
                zzzw zzzwVar = zzjgVar.f10572b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zzub.x((zzub) zzaVarY.f10131b, zzajeVarG);
                zzaje zzajeVarF = ((zzub) zzaVarY.g()).f();
                zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
                zzjn.zzb zzbVar = zzjgVar.f10571a.f10583b;
                Map map = zzjv.f10597e;
                if (map.containsKey(zzbVar)) {
                    return zzpx.a("type.googleapis.com/google.crypto.tink.AesSivKey", zzajeVarF, zzaVar, (zzxl) map.get(zzbVar), zzjgVar.f10574d);
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
            }
        });
        f10596d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzjv.f10593a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    zzub zzubVarW = zzub.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzubVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzjn.zza zzaVar = new zzjn.zza(0);
                    zzaVar.b(zzubVarW.A().d());
                    zzaVar.f10585b = zzjv.a(zzpxVar.f10849e);
                    zzjn zzjnVarA = zzaVar.a();
                    zzjg.zza zzaVar2 = new zzjg.zza(0);
                    zzaVar2.f10575a = zzjnVarA;
                    byte[] bArrR = zzubVarW.A().r();
                    zzcw.a(zzcwVar);
                    zzaVar2.f10576b = zzzw.b(bArrR, zzcwVar);
                    zzaVar2.f10577c = zzpxVar.f10850f;
                    return zzaVar2.a();
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        zzxl zzxlVar = zzxl.RAW;
        zzjn.zzb zzbVar = zzjn.zzb.f10588d;
        map.put(zzbVar, zzxlVar);
        zzxl zzxlVar2 = zzxl.TINK;
        zzjn.zzb zzbVar2 = zzjn.zzb.f10586b;
        map.put(zzbVar2, zzxlVar2);
        zzxl zzxlVar3 = zzxl.CRUNCHY;
        zzjn.zzb zzbVar3 = zzjn.zzb.f10587c;
        map.put(zzbVar3, zzxlVar3);
        f10597e = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzxl.class);
        enumMap.put(zzxlVar, zzbVar);
        enumMap.put(zzxlVar2, zzbVar2);
        enumMap.put(zzxlVar3, zzbVar3);
        enumMap.put(zzxl.LEGACY, zzbVar3);
        f10598f = Collections.unmodifiableMap(enumMap);
    }

    public static zzjn.zzb a(zzxl zzxlVar) throws GeneralSecurityException {
        Map map = f10598f;
        if (map.containsKey(zzxlVar)) {
            return (zzjn.zzb) map.get(zzxlVar);
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }
}
