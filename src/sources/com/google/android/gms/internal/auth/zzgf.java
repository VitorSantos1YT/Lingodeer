package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzgf f9532c = new zzgf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9534b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfp f9533a = new zzfp();

    private zzgf() {
    }

    public final zzgi a(Class cls) {
        zzgi zzgiVarN;
        Class cls2;
        Charset charset = zzfa.f9501a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f9534b;
        zzgi zzgiVar = (zzgi) concurrentHashMap.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzfp zzfpVar = this.f9533a;
        zzfpVar.getClass();
        Class cls3 = zzgk.f9541a;
        if (!zzev.class.isAssignableFrom(cls) && (cls2 = zzgk.f9541a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        zzfu zzfuVarZzb = zzfpVar.f9511a.zzb(cls);
        if (zzfuVarZzb.zzb()) {
            if (zzev.class.isAssignableFrom(cls)) {
                zzgiVarN = new zzgb(zzgk.f9543c, zzeo.f9489a, zzfuVarZzb.zza());
            } else {
                zzgz zzgzVar = zzgk.f9542b;
                zzem zzemVar = zzeo.f9490b;
                if (zzemVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                zzgiVarN = new zzgb(zzgzVar, zzemVar, zzfuVarZzb.zza());
            }
        } else if (zzev.class.isAssignableFrom(cls)) {
            if (zzfuVarZzb.zzc() - 1 != 1) {
                int i11 = zzgd.f9531a;
                zzfj zzfjVar = zzfl.f9506b;
                zzhb zzhbVar = zzgk.f9543c;
                zzen zzenVar = zzeo.f9489a;
                int i12 = zzft.f9514a;
                zzgiVarN = zzga.n(zzfuVarZzb, zzfjVar, zzhbVar);
            } else {
                int i13 = zzgd.f9531a;
                zzfj zzfjVar2 = zzfl.f9506b;
                zzhb zzhbVar2 = zzgk.f9543c;
                int i14 = zzft.f9514a;
                zzgiVarN = zzga.n(zzfuVarZzb, zzfjVar2, zzhbVar2);
            }
        } else if (zzfuVarZzb.zzc() - 1 != 1) {
            int i15 = zzgd.f9531a;
            zzfh zzfhVar = zzfl.f9505a;
            zzgz zzgzVar2 = zzgk.f9542b;
            if (zzeo.f9490b == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = zzft.f9514a;
            zzgiVarN = zzga.n(zzfuVarZzb, zzfhVar, zzgzVar2);
        } else {
            int i17 = zzgd.f9531a;
            zzfh zzfhVar2 = zzfl.f9505a;
            zzgz zzgzVar3 = zzgk.f9542b;
            int i18 = zzft.f9514a;
            zzgiVarN = zzga.n(zzfuVarZzb, zzfhVar2, zzgzVar3);
        }
        zzgi zzgiVar2 = (zzgi) concurrentHashMap.putIfAbsent(cls, zzgiVarN);
        return zzgiVar2 == null ? zzgiVarN : zzgiVar2;
    }
}
