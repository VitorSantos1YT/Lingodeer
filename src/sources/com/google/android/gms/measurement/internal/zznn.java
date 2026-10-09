package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznn extends zzos {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f13499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzhe f13500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzhe f13501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzhe f13502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzhe f13503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzhe f13504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzhe f13505j;

    public zznn(zzpg zzpgVar) {
        super(zzpgVar);
        this.f13499d = new HashMap();
        zzhh zzhhVar = this.f13202a.f13098e;
        zzic.k(zzhhVar);
        this.f13500e = new zzhe(zzhhVar, "last_delete_stale", 0L);
        zzhh zzhhVar2 = this.f13202a.f13098e;
        zzic.k(zzhhVar2);
        this.f13501f = new zzhe(zzhhVar2, "last_delete_stale_batch", 0L);
        zzhh zzhhVar3 = this.f13202a.f13098e;
        zzic.k(zzhhVar3);
        this.f13502g = new zzhe(zzhhVar3, "backoff", 0L);
        zzhh zzhhVar4 = this.f13202a.f13098e;
        zzic.k(zzhhVar4);
        this.f13503h = new zzhe(zzhhVar4, "last_upload", 0L);
        zzhh zzhhVar5 = this.f13202a.f13098e;
        zzic.k(zzhhVar5);
        this.f13504i = new zzhe(zzhhVar5, "last_upload_attempt", 0L);
        zzhh zzhhVar6 = this.f13202a.f13098e;
        zzic.k(zzhhVar6);
        this.f13505j = new zzhe(zzhhVar6, "midnight_offset", 0L);
    }

    public final Pair k(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        return (zzjlVar.i(zzjk.AD_STORAGE) && zzrVar.P) ? l(str) : new Pair(BuildConfig.VERSION_NAME, Boolean.FALSE);
    }

    public final Pair l(String str) {
        zznm zznmVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        g();
        zzic zzicVar = this.f13202a;
        DefaultClock defaultClock = zzicVar.f13104k;
        zzal zzalVar = zzicVar.f13097d;
        defaultClock.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f13499d;
        zznm zznmVar2 = (zznm) map.get(str);
        if (zznmVar2 != null && jElapsedRealtime < zznmVar2.f13498c) {
            return new Pair(zznmVar2.f13496a, Boolean.valueOf(zznmVar2.f13497b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jO = zzalVar.o(str, zzfy.f12839b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar.f13094a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (zznmVar2 != null && jElapsedRealtime < zznmVar2.f13498c + zzalVar.o(str, zzfy.f12842c)) {
                    return new Pair(zznmVar2.f13496a, Boolean.valueOf(zznmVar2.f13497b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo.getId();
            zznmVar = id2 != null ? new zznm(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), jO) : new zznm(BuildConfig.VERSION_NAME, advertisingIdInfo.isLimitAdTrackingEnabled(), jO);
            map.put(str, zznmVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zznmVar.f13496a, Boolean.valueOf(zznmVar.f13497b));
        } catch (Exception e8) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.m.b(e8, "Unable to get advertising id");
            zznmVar = new zznm(BuildConfig.VERSION_NAME, false, jO);
        }
    }

    public final String m(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        if (!zzjlVar.i(zzjk.AD_STORAGE) || !zzrVar.P) {
            return BuildConfig.VERSION_NAME;
        }
        g();
        String str2 = (String) l(str).first;
        MessageDigest messageDigestZ = zzpp.z();
        if (messageDigestZ == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZ.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
    }
}
