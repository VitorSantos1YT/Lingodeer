package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpx implements zzqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzv f10846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzaje f10847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzwj.zza f10848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzxl f10849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f10850f;

    public zzpx(String str, zzzv zzzvVar, zzaje zzajeVar, zzwj.zza zzaVar, zzxl zzxlVar, Integer num) {
        this.f10845a = str;
        this.f10846b = zzzvVar;
        this.f10847c = zzajeVar;
        this.f10848d = zzaVar;
        this.f10849e = zzxlVar;
        this.f10850f = num;
    }

    public static zzpx a(String str, zzaje zzajeVar, zzwj.zza zzaVar, zzxl zzxlVar, Integer num) throws GeneralSecurityException {
        if (zzxlVar == zzxl.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzpx(str, zzqj.a(str), zzajeVar, zzaVar, zzxlVar, num);
    }
}
