package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcy {
    public static zzcq a(byte[] bArr) {
        try {
            zzwn zzwnVarW = zzwn.w(bArr, zzakj.f10117b);
            zzou zzouVar = zzou.f10818b;
            zzzv zzzvVarA = zzqj.a(zzwnVarW.E());
            zzpw zzpwVar = new zzpw(zzwnVarW, zzzvVarA);
            zzqa zzqaVar = (zzqa) zzouVar.f10819a.get();
            zzqaVar.getClass();
            return !zzqaVar.f10855d.containsKey(new zzqc(zzpw.class, zzzvVarA)) ? new zzod(zzpwVar) : zzouVar.b(zzpwVar);
        } catch (IOException e8) {
            throw new GeneralSecurityException("Failed to parse proto", e8);
        }
    }

    public static byte[] b(zzcq zzcqVar) {
        return zzcqVar instanceof zzod ? ((zzod) zzcqVar).f10805a.f10844b.g() : ((zzpw) zzou.f10818b.d(zzcqVar)).f10844b.g();
    }
}
