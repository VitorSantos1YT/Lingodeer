package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkg extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzlj f13260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkg(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        this.f13260e = zzljVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x026e A[Catch: IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, TryCatch #5 {IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, blocks: (B:71:0x0226, B:73:0x026e, B:78:0x0279, B:80:0x027f, B:82:0x0287, B:83:0x028d, B:84:0x0291), top: B:101:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x027f A[Catch: IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, TryCatch #5 {IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, blocks: (B:71:0x0226, B:73:0x026e, B:78:0x0279, B:80:0x027f, B:82:0x0287, B:83:0x028d, B:84:0x0291), top: B:101:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0287 A[Catch: IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, TryCatch #5 {IllegalArgumentException -> 0x0275, MalformedURLException -> 0x0277, blocks: (B:71:0x0226, B:73:0x026e, B:78:0x0279, B:80:0x027f, B:82:0x0287, B:83:0x028d, B:84:0x0291), top: B:101:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ab  */
    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        boolean z11;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zznl zznlVarP;
        zzic zzicVar;
        zzgb zzgbVar;
        zzao zzaoVarY0;
        Bundle bundle;
        String str;
        int i11;
        String str2;
        String string;
        zzic zzicVar2;
        URL url;
        String strConcat;
        zzlj zzljVar = this.f13260e;
        final zzic zzicVar3 = zzljVar.f13202a;
        zzhh zzhhVar = zzicVar3.f13098e;
        zzgu zzguVar = zzicVar3.f13099f;
        zzhz zzhzVar = zzicVar3.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        zzlo zzloVar = zzicVar3.f13107o;
        zzic.m(zzloVar);
        zzic zzicVar4 = zzloVar.f13202a;
        zzic.m(zzloVar);
        String strM = zzicVar3.r().m();
        Boolean boolT = zzicVar3.f13097d.t("google_analytics_adid_collection_enabled");
        boolean z12 = false;
        if (boolT == null || boolT.booleanValue()) {
            zzic.k(zzhhVar);
            zzic zzicVar5 = zzhhVar.f13202a;
            zzhhVar.g();
            if (zzhhVar.n().i(zzjk.AD_STORAGE)) {
                zzicVar5.f13104k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str3 = zzhhVar.f13025h;
                z11 = true;
                if (str3 == null || jElapsedRealtime >= zzhhVar.f13027j) {
                    zzhhVar.f13027j = zzicVar5.f13097d.o(strM, zzfy.f12839b) + jElapsedRealtime;
                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar5.f13094a);
                        zzhhVar.f13025h = BuildConfig.VERSION_NAME;
                        String id2 = advertisingIdInfo.getId();
                        if (id2 != null) {
                            zzhhVar.f13025h = id2;
                        }
                        zzhhVar.f13026i = advertisingIdInfo.isLimitAdTrackingEnabled();
                    } catch (Exception e8) {
                        zzgu zzguVar2 = zzicVar5.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.m.b(e8, "Unable to get advertising id");
                        zzhhVar.f13025h = BuildConfig.VERSION_NAME;
                    }
                    AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                    pair = new Pair(zzhhVar.f13025h, Boolean.valueOf(zzhhVar.f13026i));
                } else {
                    pair = new Pair(str3, Boolean.valueOf(zzhhVar.f13026i));
                }
            } else {
                z11 = true;
                pair = new Pair(BuildConfig.VERSION_NAME, Boolean.FALSE);
            }
            if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                zzic.m(zzguVar);
                zzguVar.f12949n.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            } else {
                zzic.m(zzloVar);
                zzloVar.i();
                ConnectivityManager connectivityManager = (ConnectivityManager) zzicVar4.f13094a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    } catch (SecurityException unused) {
                        activeNetworkInfo = null;
                    }
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    zzic.m(zzguVar);
                    zzguVar.f12945i.a("Network is not available for Deferred Deep Link request. Skipping");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    zznl zznlVarP2 = zzicVar3.p();
                    zznlVarP2.g();
                    zznlVarP2.h();
                    if (zznlVarP2.n()) {
                        zzpp zzppVar = zznlVarP2.f13202a.f13102i;
                        zzic.k(zzppVar);
                        if (zzppVar.S() >= 234200) {
                            zzlj zzljVar2 = zzicVar3.m;
                            zzic.l(zzljVar2);
                            zzic zzicVar6 = zzljVar2.f13202a;
                            zzljVar2.g();
                            zznlVarP = zzicVar6.p();
                            zzicVar = zznlVarP.f13202a;
                            zznlVarP.g();
                            zznlVarP.h();
                            zzgbVar = zznlVarP.f13489d;
                            if (zzgbVar == null) {
                                zznlVarP.m();
                                zzgu zzguVar3 = zzicVar.f13099f;
                                zzic.m(zzguVar3);
                                zzguVar3.m.a("Failed to get consents; not connected to service yet.");
                            } else {
                                zzaoVarY0 = zzgbVar.y0(zznlVarP.w(false));
                                zznlVarP.t();
                                if (zzaoVarY0 != null) {
                                    bundle = zzaoVarY0.f12633a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i11 = zzicVar3.B;
                                    zzicVar3.B = i11 + 1;
                                    if (i11 < 10) {
                                    }
                                    zzic.m(zzguVar);
                                    zzgs zzgsVar = zzguVar.m;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i11 < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    zzgsVar.b(Integer.valueOf(zzicVar3.B), a.k(sb3, str2, " retryCount"));
                                } else {
                                    zzjl zzjlVarB = zzjl.b(100, bundle);
                                    sb2.append("&gcs=");
                                    sb2.append(zzjlVarB.f());
                                    zzba zzbaVarC = zzba.c(100, bundle);
                                    str = zzbaVarC.f12678d;
                                    sb2.append("&dma=");
                                    sb2.append(!Objects.equals(zzbaVarC.f12677c, Boolean.FALSE) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb2.append("&dma_cps=");
                                        sb2.append(str);
                                    }
                                    int i12 = !Objects.equals(zzba.d(bundle), Boolean.TRUE) ? 1 : 0;
                                    sb2.append("&npa=");
                                    sb2.append(i12);
                                    zzic.m(zzguVar);
                                    zzguVar.f12949n.b(sb2, "Consent query parameters to Bow");
                                    zzpp zzppVar2 = zzicVar3.f13102i;
                                    zzic.k(zzppVar2);
                                    zzicVar3.r().f13202a.f13097d.m();
                                    String str4 = (String) pair.first;
                                    long jA = zzhhVar.f13037u.a() - 1;
                                    string = sb2.toString();
                                    zzicVar2 = zzppVar2.f13202a;
                                    Preconditions.d(str4);
                                    Preconditions.d(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar2.S()) + "&rdid=" + str4 + "&bundleid=" + strM + "&retry=" + jA;
                                    if (strM.equals(zzicVar2.f13097d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        zzic.m(zzloVar);
                                        zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzib
                                            @Override // com.google.android.gms.measurement.internal.zzll
                                            public final /* synthetic */ void a(String str5, int i13, Throwable th2, byte[] bArr, Map map) {
                                                zzicVar3.i(i13, th2, bArr);
                                            }
                                        };
                                        zzloVar.i();
                                        zzhz zzhzVar2 = zzicVar4.f13100g;
                                        zzic.m(zzhzVar2);
                                        zzhzVar2.s(new zzln(zzloVar, strM, url, null, null, zzllVar));
                                    }
                                }
                            }
                            zzaoVarY0 = null;
                            if (zzaoVarY0 != null) {
                                bundle = zzaoVarY0.f12633a;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i11 = zzicVar3.B;
                                zzicVar3.B = i11 + 1;
                                if (i11 < 10) {
                                }
                                zzic.m(zzguVar);
                                zzgs zzgsVar2 = zzguVar.m;
                                StringBuilder sb4 = new StringBuilder(69);
                                sb4.append("Failed to retrieve DMA consent from the service, ");
                                if (i11 < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                zzgsVar2.b(Integer.valueOf(zzicVar3.B), a.k(sb4, str2, " retryCount"));
                            } else {
                                zzjl zzjlVarB2 = zzjl.b(100, bundle);
                                sb2.append("&gcs=");
                                sb2.append(zzjlVarB2.f());
                                zzba zzbaVarC2 = zzba.c(100, bundle);
                                str = zzbaVarC2.f12678d;
                                sb2.append("&dma=");
                                sb2.append(!Objects.equals(zzbaVarC2.f12677c, Boolean.FALSE) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb2.append("&dma_cps=");
                                    sb2.append(str);
                                }
                                int i13 = !Objects.equals(zzba.d(bundle), Boolean.TRUE) ? 1 : 0;
                                sb2.append("&npa=");
                                sb2.append(i13);
                                zzic.m(zzguVar);
                                zzguVar.f12949n.b(sb2, "Consent query parameters to Bow");
                                zzpp zzppVar3 = zzicVar3.f13102i;
                                zzic.k(zzppVar3);
                                zzicVar3.r().f13202a.f13097d.m();
                                String str5 = (String) pair.first;
                                long jA2 = zzhhVar.f13037u.a() - 1;
                                string = sb2.toString();
                                zzicVar2 = zzppVar3.f13202a;
                                Preconditions.d(str5);
                                Preconditions.d(strM);
                                strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar3.S()) + "&rdid=" + str5 + "&bundleid=" + strM + "&retry=" + jA2;
                                if (strM.equals(zzicVar2.f13097d.k("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                if (!string.isEmpty()) {
                                    if (string.charAt(0) != '&') {
                                        strConcat = strConcat.concat("&");
                                    }
                                    strConcat = strConcat.concat(string);
                                }
                                url = new URL(strConcat);
                                if (url != null) {
                                    zzic.m(zzloVar);
                                    zzll zzllVar2 = new zzll() { // from class: com.google.android.gms.measurement.internal.zzib
                                        @Override // com.google.android.gms.measurement.internal.zzll
                                        public final /* synthetic */ void a(String str6, int i14, Throwable th2, byte[] bArr, Map map) {
                                            zzicVar3.i(i14, th2, bArr);
                                        }
                                    };
                                    zzloVar.i();
                                    zzhz zzhzVar3 = zzicVar4.f13100g;
                                    zzic.m(zzhzVar3);
                                    zzhzVar3.s(new zzln(zzloVar, strM, url, null, null, zzllVar2));
                                }
                            }
                        } else {
                            zzpp zzppVar4 = zzicVar3.f13102i;
                            zzic.k(zzppVar4);
                            zzicVar3.r().f13202a.f13097d.m();
                            String str6 = (String) pair.first;
                            long jA3 = zzhhVar.f13037u.a() - 1;
                            string = sb2.toString();
                            zzicVar2 = zzppVar4.f13202a;
                            Preconditions.d(str6);
                            Preconditions.d(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar4.S()) + "&rdid=" + str6 + "&bundleid=" + strM + "&retry=" + jA3;
                            if (strM.equals(zzicVar2.f13097d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                zzic.m(zzloVar);
                                zzll zzllVar3 = new zzll() { // from class: com.google.android.gms.measurement.internal.zzib
                                    @Override // com.google.android.gms.measurement.internal.zzll
                                    public final /* synthetic */ void a(String str7, int i14, Throwable th2, byte[] bArr, Map map) {
                                        zzicVar3.i(i14, th2, bArr);
                                    }
                                };
                                zzloVar.i();
                                zzhz zzhzVar4 = zzicVar4.f13100g;
                                zzic.m(zzhzVar4);
                                zzhzVar4.s(new zzln(zzloVar, strM, url, null, null, zzllVar3));
                            }
                        }
                    } else {
                        zzlj zzljVar3 = zzicVar3.m;
                        zzic.l(zzljVar3);
                        zzic zzicVar7 = zzljVar3.f13202a;
                        zzljVar3.g();
                        zznlVarP = zzicVar7.p();
                        zzicVar = zznlVarP.f13202a;
                        zznlVarP.g();
                        zznlVarP.h();
                        zzgbVar = zznlVarP.f13489d;
                        if (zzgbVar == null) {
                            zznlVarP.m();
                            zzgu zzguVar4 = zzicVar.f13099f;
                            zzic.m(zzguVar4);
                            zzguVar4.m.a("Failed to get consents; not connected to service yet.");
                        } else {
                            try {
                                zzaoVarY0 = zzgbVar.y0(zznlVarP.w(false));
                                zznlVarP.t();
                            } catch (RemoteException e10) {
                                zzgu zzguVar5 = zzicVar.f13099f;
                                zzic.m(zzguVar5);
                                zzguVar5.f12942f.b(e10, "Failed to get consents; remote exception");
                                zzaoVarY0 = null;
                            }
                            if (zzaoVarY0 != null) {
                                bundle = zzaoVarY0.f12633a;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i11 = zzicVar3.B;
                                zzicVar3.B = i11 + 1;
                                z12 = i11 < 10 ? z11 : false;
                                zzic.m(zzguVar);
                                zzgs zzgsVar3 = zzguVar.m;
                                StringBuilder sb5 = new StringBuilder(69);
                                sb5.append("Failed to retrieve DMA consent from the service, ");
                                if (i11 < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                zzgsVar3.b(Integer.valueOf(zzicVar3.B), a.k(sb5, str2, " retryCount"));
                            } else {
                                zzjl zzjlVarB3 = zzjl.b(100, bundle);
                                sb2.append("&gcs=");
                                sb2.append(zzjlVarB3.f());
                                zzba zzbaVarC3 = zzba.c(100, bundle);
                                str = zzbaVarC3.f12678d;
                                sb2.append("&dma=");
                                sb2.append(!Objects.equals(zzbaVarC3.f12677c, Boolean.FALSE) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb2.append("&dma_cps=");
                                    sb2.append(str);
                                }
                                int i14 = !Objects.equals(zzba.d(bundle), Boolean.TRUE) ? 1 : 0;
                                sb2.append("&npa=");
                                sb2.append(i14);
                                zzic.m(zzguVar);
                                zzguVar.f12949n.b(sb2, "Consent query parameters to Bow");
                                zzpp zzppVar5 = zzicVar3.f13102i;
                                zzic.k(zzppVar5);
                                zzicVar3.r().f13202a.f13097d.m();
                                String str7 = (String) pair.first;
                                long jA4 = zzhhVar.f13037u.a() - 1;
                                string = sb2.toString();
                                zzicVar2 = zzppVar5.f13202a;
                                try {
                                    Preconditions.d(str7);
                                    Preconditions.d(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar5.S()) + "&rdid=" + str7 + "&bundleid=" + strM + "&retry=" + jA4;
                                    if (strM.equals(zzicVar2.f13097d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                } catch (IllegalArgumentException e11) {
                                    e = e11;
                                    zzgu zzguVar6 = zzicVar2.f13099f;
                                    zzic.m(zzguVar6);
                                    zzguVar6.f12942f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                } catch (MalformedURLException e12) {
                                    e = e12;
                                    zzgu zzguVar7 = zzicVar2.f13099f;
                                    zzic.m(zzguVar7);
                                    zzguVar7.f12942f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                }
                                if (url != null) {
                                    zzic.m(zzloVar);
                                    zzll zzllVar4 = new zzll() { // from class: com.google.android.gms.measurement.internal.zzib
                                        @Override // com.google.android.gms.measurement.internal.zzll
                                        public final /* synthetic */ void a(String str8, int i15, Throwable th2, byte[] bArr, Map map) {
                                            zzicVar3.i(i15, th2, bArr);
                                        }
                                    };
                                    zzloVar.i();
                                    zzhz zzhzVar5 = zzicVar4.f13100g;
                                    zzic.m(zzhzVar5);
                                    zzhzVar5.s(new zzln(zzloVar, strM, url, null, null, zzllVar4));
                                }
                            }
                        }
                        zzaoVarY0 = null;
                        if (zzaoVarY0 != null) {
                            bundle = zzaoVarY0.f12633a;
                        } else {
                            bundle = null;
                        }
                        if (bundle == null) {
                            i11 = zzicVar3.B;
                            zzicVar3.B = i11 + 1;
                            if (i11 < 10) {
                            }
                            zzic.m(zzguVar);
                            zzgs zzgsVar4 = zzguVar.m;
                            StringBuilder sb6 = new StringBuilder(69);
                            sb6.append("Failed to retrieve DMA consent from the service, ");
                            if (i11 < 10) {
                                str2 = "Retrying.";
                            } else {
                                str2 = "Skipping.";
                            }
                            zzgsVar4.b(Integer.valueOf(zzicVar3.B), a.k(sb6, str2, " retryCount"));
                        } else {
                            zzjl zzjlVarB4 = zzjl.b(100, bundle);
                            sb2.append("&gcs=");
                            sb2.append(zzjlVarB4.f());
                            zzba zzbaVarC4 = zzba.c(100, bundle);
                            str = zzbaVarC4.f12678d;
                            sb2.append("&dma=");
                            sb2.append(!Objects.equals(zzbaVarC4.f12677c, Boolean.FALSE) ? 1 : 0);
                            if (!TextUtils.isEmpty(str)) {
                                sb2.append("&dma_cps=");
                                sb2.append(str);
                            }
                            int i15 = !Objects.equals(zzba.d(bundle), Boolean.TRUE) ? 1 : 0;
                            sb2.append("&npa=");
                            sb2.append(i15);
                            zzic.m(zzguVar);
                            zzguVar.f12949n.b(sb2, "Consent query parameters to Bow");
                            zzpp zzppVar6 = zzicVar3.f13102i;
                            zzic.k(zzppVar6);
                            zzicVar3.r().f13202a.f13097d.m();
                            String str8 = (String) pair.first;
                            long jA5 = zzhhVar.f13037u.a() - 1;
                            string = sb2.toString();
                            zzicVar2 = zzppVar6.f13202a;
                            Preconditions.d(str8);
                            Preconditions.d(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzppVar6.S()) + "&rdid=" + str8 + "&bundleid=" + strM + "&retry=" + jA5;
                            if (strM.equals(zzicVar2.f13097d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                zzic.m(zzloVar);
                                zzll zzllVar5 = new zzll() { // from class: com.google.android.gms.measurement.internal.zzib
                                    @Override // com.google.android.gms.measurement.internal.zzll
                                    public final /* synthetic */ void a(String str9, int i16, Throwable th2, byte[] bArr, Map map) {
                                        zzicVar3.i(i16, th2, bArr);
                                    }
                                };
                                zzloVar.i();
                                zzhz zzhzVar6 = zzicVar4.f13100g;
                                zzic.m(zzhzVar6);
                                zzhzVar6.s(new zzln(zzloVar, strM, url, null, null, zzllVar5));
                            }
                        }
                    }
                }
            }
        } else {
            zzic.m(zzguVar);
            zzguVar.f12949n.a("ADID collection is disabled from Manifest. Skipping");
        }
        if (z12) {
            zzljVar.f13339s.b(2000L);
        }
    }
}
