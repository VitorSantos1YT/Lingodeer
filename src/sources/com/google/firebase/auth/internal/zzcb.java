package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.internal.p002firebaseauthapi.zzda;
import com.google.android.gms.internal.p002firebaseauthapi.zzdd;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import ep.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static zzcb f17998c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzmy f18000b;

    public zzcb(String str, zzmy zzmyVar) {
        this.f17999a = str;
        this.f18000b = zzmyVar;
    }

    public static zzcb a(Context context, String str) {
        zzmy zzmyVarB;
        zzcb zzcbVar = f17998c;
        if (zzcbVar == null || !Objects.equals(zzcbVar.f17999a, str)) {
            try {
                zzda.a();
                zzmyVarB = b(context, str);
            } catch (IOException | GeneralSecurityException e8) {
                e8.getMessage();
                if (e8 instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto." + str, 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        zzmyVarB = b(context, str);
                    } catch (IOException | GeneralSecurityException e10) {
                        e10.getMessage();
                        zzmyVarB = null;
                    }
                } else {
                    zzmyVarB = null;
                }
            }
            f17998c = new zzcb(str, zzmyVarB);
        }
        return f17998c;
    }

    public static zzmy b(Context context, String str) {
        zzmy.zza zzaVar = new zzmy.zza();
        String strE = a.e("com.google.firebase.auth.api.crypto.", str);
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        zzaVar.f10754a = context;
        zzaVar.f10755b = "StorageCryptoKeyset";
        zzaVar.f10756c = strE;
        zzaVar.f10760g = zzdd.f10293b;
        zzaVar.c("android-keystore://firebear_main_key_id_for_storage_crypto." + str);
        return zzaVar.b();
    }
}
