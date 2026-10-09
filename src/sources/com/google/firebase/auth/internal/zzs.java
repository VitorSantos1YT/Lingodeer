package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.p002firebaseauthapi.zzjb;
import com.google.android.gms.internal.p002firebaseauthapi.zzkw;
import com.google.android.gms.internal.p002firebaseauthapi.zzkx;
import com.google.android.gms.internal.p002firebaseauthapi.zzle;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static zzs f18025c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzmy f18027b;

    public zzs(Context context, String str) {
        zzmy zzmyVarB;
        this.f18026a = str;
        try {
            zzkx.a();
            zzmy.zza zzaVar = new zzmy.zza();
            String str2 = "com.google.firebase.auth.api.crypto." + str;
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            zzaVar.f10754a = context;
            zzaVar.f10755b = "GenericIdpKeyset";
            zzaVar.f10756c = str2;
            zzaVar.f10760g = zzle.f10690a;
            zzaVar.c("android-keystore://firebear_master_key_id." + str);
            zzmyVarB = zzaVar.b();
            this.f18027b = zzmyVarB;
        } catch (IOException e8) {
            e = e8;
            e.getMessage();
            zzmyVarB = null;
        } catch (GeneralSecurityException e10) {
            e = e10;
            e.getMessage();
            zzmyVarB = null;
        }
    }

    public static zzs a(Context context, String str) {
        zzs zzsVar = f18025c;
        if (zzsVar == null || !Objects.equals(zzsVar.f18026a, str)) {
            f18025c = new zzs(context, str);
        }
        return f18025c;
    }

    public final String b() {
        if (this.f18027b == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p002firebaseauthapi.zzbn zzbnVar = new com.google.android.gms.internal.p002firebaseauthapi.zzbn(byteArrayOutputStream);
        try {
            synchronized (this.f18027b) {
                this.f18027b.a().k().h(zzbnVar);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e8) {
            e8.getMessage();
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzmy zzmyVar = this.f18027b;
        if (zzmyVar == null) {
            return null;
        }
        try {
            synchronized (zzmyVar) {
                com.google.android.gms.internal.p002firebaseauthapi.zzbx zzbxVarA = this.f18027b.a();
                try {
                    com.google.android.gms.internal.p002firebaseauthapi.zzbq zzbqVar = zzkw.f10685a;
                    if (zzjb.a()) {
                        throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
                    }
                    str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbs) zzbxVarA.g(zzkw.f10685a, com.google.android.gms.internal.p002firebaseauthapi.zzbs.class)).zza(Base64.decode(str, 8)), StandardCharsets.UTF_8);
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            e10.getMessage();
            return null;
        }
    }
}
