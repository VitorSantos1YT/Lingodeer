package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaja;
import com.google.android.gms.internal.measurement.zzajb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgi extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f12904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12905l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f12908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12910r;

    public zzgi(zzic zzicVar, long j11, long j12, String str) {
        super(zzicVar);
        this.f12909q = 0L;
        this.f12910r = null;
        this.f12902i = j11;
        this.f12903j = j12;
        this.m = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268 A[Catch: NameNotFoundException -> 0x0270, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0270, blocks: (B:99:0x0262, B:101:0x0268), top: B:131:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x026b A[PHI: r5 r37
      0x026b: PHI (r5v19 int) = (r5v18 int), (r5v20 int) binds: [B:105:0x0270, B:100:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:105:0x0270, B:100:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:125:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x019f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:79:0x0204  */
    /* JADX WARN: Code duplicated, block: B:81:0x0219  */
    /* JADX WARN: Code duplicated, block: B:88:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0238  */
    /* JADX WARN: Code duplicated, block: B:93:0x023a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0253  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final zzr k(String str) {
        String str2;
        String str3;
        boolean z11;
        long j11;
        boolean zD;
        boolean z12;
        Class<?> clsLoadClass;
        long j12;
        Object objInvoke;
        String str4;
        long jMin;
        long jA;
        int i11;
        Boolean boolT;
        boolean z13;
        boolean z14;
        int i12;
        String str5;
        Boolean boolT2;
        boolean zBooleanValue;
        zzic zzicVar;
        String strM;
        boolean z15;
        int i13;
        int i14;
        long j13;
        ApplicationInfo applicationInfoA;
        zzfx zzfxVar;
        int iD;
        long jE;
        g();
        String strM2 = m();
        String strN = n();
        h();
        String str6 = this.f12897d;
        h();
        long j14 = this.f12898e;
        h();
        Preconditions.g(this.f12899f);
        String str7 = this.f12899f;
        zzic zzicVar2 = this.f13202a;
        zzal zzalVar = zzicVar2.f13097d;
        zzgu zzguVar = zzicVar2.f13099f;
        zzal zzalVar2 = zzicVar2.f13097d;
        Context context = zzicVar2.f13094a;
        zzpp zzppVar = zzicVar2.f13102i;
        zzhh zzhhVar = zzicVar2.f13098e;
        zzalVar.m();
        h();
        g();
        long j15 = this.f12901h;
        if (j15 == 0) {
            zzic.k(zzppVar);
            zzic zzicVar3 = zzppVar.f13202a;
            String packageName = context.getPackageName();
            zzppVar.g();
            Preconditions.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z11 = false;
            MessageDigest messageDigestZ = zzpp.z();
            long jA2 = -1;
            if (messageDigestZ == null) {
                zzgu zzguVar2 = zzicVar3.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.a("Could not get MD5 instance");
                str2 = strN;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzppVar.P(context, packageName)) {
                            str2 = strN;
                            str3 = str6;
                            jA2 = 0;
                        } else {
                            str2 = strN;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = Wrappers.a(context).b(64, zzicVar3.f13094a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        zzgu zzguVar3 = zzicVar3.f13099f;
                                        zzic.m(zzguVar3);
                                        zzguVar3.f12945i.a("Could not get signatures");
                                    } else {
                                        jA2 = zzpp.A(messageDigestZ.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e8) {
                                    e = e8;
                                    zzgu zzguVar4 = zzicVar3.f13099f;
                                    zzic.m(zzguVar4);
                                    zzguVar4.f12942f.b(e, "Package name not found");
                                    j11 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                str3 = str6;
                                zzgu zzguVar5 = zzicVar3.f13099f;
                                zzic.m(zzguVar5);
                                zzguVar5.f12942f.b(e, "Package name not found");
                                j11 = 0;
                                this.f12901h = j11;
                                zD = zzicVar2.d();
                                zzic.k(zzhhVar);
                                boolean z16 = !zzhhVar.f13034r;
                                g();
                                if (zzicVar2.d()) {
                                    ((zzajb) zzaja.f11435b.f11436a.get()).getClass();
                                    z12 = zD;
                                    if (zzalVar2.r(null, zzfy.H0)) {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                j12 = j11;
                                                try {
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                                                    if (objInvoke == null) {
                                                        str4 = null;
                                                    } else {
                                                        try {
                                                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            zzic.m(zzguVar);
                                                            zzguVar.f12947k.a("Failed to retrieve Firebase Instance Id");
                                                            str4 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    zzic.m(zzguVar);
                                                    zzguVar.f12946j.a("Failed to obtain Firebase Analytics instance");
                                                }
                                                jMin = zzicVar2.D;
                                                zzic.k(zzhhVar);
                                                jA = zzhhVar.f13023f.a();
                                                if (jA != 0) {
                                                    jMin = Math.min(jMin, jA);
                                                }
                                                h();
                                                i11 = this.f12906n;
                                                boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
                                                if (boolT != null) {
                                                    z13 = true;
                                                } else {
                                                    z13 = true;
                                                }
                                                zzic.k(zzhhVar);
                                                zzhhVar.g();
                                                String str8 = str4;
                                                long j16 = jMin;
                                                boolean z17 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
                                                if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z14);
                                                List list = this.f12904k;
                                                String strG = zzhhVar.n().g();
                                                if (this.f12905l == null) {
                                                    zzic.k(zzppVar);
                                                    this.f12905l = zzppVar.e0();
                                                }
                                                String str9 = this.f12905l;
                                                if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                                    g();
                                                    if (this.f12909q == 0) {
                                                        i12 = i11;
                                                    } else {
                                                        zzicVar2.f13104k.getClass();
                                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f12909q;
                                                        i12 = i11;
                                                        if (this.f12908p != null) {
                                                            l();
                                                        }
                                                    }
                                                    if (this.f12908p == null) {
                                                        l();
                                                    }
                                                    str5 = this.f12908p;
                                                } else {
                                                    i12 = i11;
                                                    str5 = null;
                                                }
                                                boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
                                                if (boolT2 == null) {
                                                    zBooleanValue = false;
                                                } else {
                                                    zBooleanValue = boolT2.booleanValue();
                                                }
                                                zzic.k(zzppVar);
                                                zzicVar = zzppVar.f13202a;
                                                String str10 = str5;
                                                strM = m();
                                                boolean z18 = zBooleanValue;
                                                if (zzicVar.f13094a.getPackageManager() == null) {
                                                    z15 = z13;
                                                    j13 = 0;
                                                } else {
                                                    try {
                                                        z15 = z13;
                                                        i13 = 0;
                                                        try {
                                                            applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
                                                            if (applicationInfoA != null) {
                                                                i14 = applicationInfoA.targetSdkVersion;
                                                            } else {
                                                                i14 = i13;
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused3) {
                                                            zzgu zzguVar6 = zzicVar.f13099f;
                                                            zzic.m(zzguVar6);
                                                            zzguVar6.f12948l.b(strM, "PackageManager failed to find running app: app_id");
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused4) {
                                                        z15 = z13;
                                                        i13 = 0;
                                                    }
                                                    j13 = i14;
                                                }
                                                zzic.k(zzhhVar);
                                                int i15 = zzhhVar.n().f13206b;
                                                zzic.k(zzhhVar);
                                                zzhhVar.g();
                                                String str11 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
                                                zzaif.a();
                                                zzfxVar = zzfy.P0;
                                                if (zzalVar2.r(null, zzfxVar)) {
                                                    zzic.k(zzppVar);
                                                    iD = zzpp.D();
                                                } else {
                                                    iD = 0;
                                                }
                                                zzaif.a();
                                                if (zzalVar2.r(null, zzfxVar)) {
                                                    zzic.k(zzppVar);
                                                    jE = zzppVar.E();
                                                } else {
                                                    jE = 0;
                                                }
                                                String str12 = zzalVar2.f12629c;
                                                String strValueOf = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                                                long j17 = j13;
                                                long j18 = zzicVar2.D;
                                                zzic.j(zzicVar2.f13113u);
                                                return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z16, str8, j16, i12, z15, z17, boolValueOf, this.f12902i, list, strG, str9, str10, z18, j17, i15, str11, iD, jE, str12, strValueOf, j18, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
                                            }
                                        } catch (ClassNotFoundException unused5) {
                                        }
                                        str4 = null;
                                        jMin = zzicVar2.D;
                                        zzic.k(zzhhVar);
                                        jA = zzhhVar.f13023f.a();
                                        if (jA != 0) {
                                            jMin = Math.min(jMin, jA);
                                        }
                                        h();
                                        i11 = this.f12906n;
                                        boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
                                        if (boolT != null) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        zzic.k(zzhhVar);
                                        zzhhVar.g();
                                        String str13 = str4;
                                        long j19 = jMin;
                                        boolean z19 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
                                        if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(z14);
                                        List list2 = this.f12904k;
                                        String strG2 = zzhhVar.n().g();
                                        if (this.f12905l == null) {
                                            zzic.k(zzppVar);
                                            this.f12905l = zzppVar.e0();
                                        }
                                        String str14 = this.f12905l;
                                        if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                            i12 = i11;
                                            str5 = null;
                                        } else {
                                            g();
                                            if (this.f12909q == 0) {
                                                i12 = i11;
                                            } else {
                                                zzicVar2.f13104k.getClass();
                                                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f12909q;
                                                i12 = i11;
                                                if (this.f12908p != null) {
                                                    l();
                                                }
                                            }
                                            if (this.f12908p == null) {
                                                l();
                                            }
                                            str5 = this.f12908p;
                                        }
                                        boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
                                        if (boolT2 == null) {
                                            zBooleanValue = false;
                                        } else {
                                            zBooleanValue = boolT2.booleanValue();
                                        }
                                        zzic.k(zzppVar);
                                        zzicVar = zzppVar.f13202a;
                                        String str15 = str5;
                                        strM = m();
                                        boolean z110 = zBooleanValue;
                                        if (zzicVar.f13094a.getPackageManager() == null) {
                                            z15 = z13;
                                            j13 = 0;
                                        } else {
                                            z15 = z13;
                                            i13 = 0;
                                            applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
                                            if (applicationInfoA != null) {
                                                i14 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i14 = i13;
                                            }
                                            j13 = i14;
                                        }
                                        zzic.k(zzhhVar);
                                        int i16 = zzhhVar.n().f13206b;
                                        zzic.k(zzhhVar);
                                        zzhhVar.g();
                                        String str16 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
                                        zzaif.a();
                                        zzfxVar = zzfy.P0;
                                        if (zzalVar2.r(null, zzfxVar)) {
                                            zzic.k(zzppVar);
                                            iD = zzpp.D();
                                        } else {
                                            iD = 0;
                                        }
                                        zzaif.a();
                                        if (zzalVar2.r(null, zzfxVar)) {
                                            zzic.k(zzppVar);
                                            jE = zzppVar.E();
                                        } else {
                                            jE = 0;
                                        }
                                        String str17 = zzalVar2.f12629c;
                                        String strValueOf2 = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                                        long j110 = j13;
                                        long j111 = zzicVar2.D;
                                        zzic.j(zzicVar2.f13113u);
                                        if (zzalVar2.r(null, zzfy.e1)) {
                                        }
                                        return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z16, str13, j19, i12, z15, z19, boolValueOf2, this.f12902i, list2, strG2, str14, str15, z110, j110, i16, str16, iD, jE, str17, strValueOf2, j111, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
                                    }
                                    zzic.m(zzguVar);
                                    zzguVar.f12949n.a("Disabled IID for tests.");
                                } else {
                                    z12 = zD;
                                }
                                j12 = j11;
                                str4 = null;
                                jMin = zzicVar2.D;
                                zzic.k(zzhhVar);
                                jA = zzhhVar.f13023f.a();
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                h();
                                i11 = this.f12906n;
                                boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
                                if (boolT != null) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                zzic.k(zzhhVar);
                                zzhhVar.g();
                                String str18 = str4;
                                long j112 = jMin;
                                boolean z111 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
                                if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z14);
                                List list3 = this.f12904k;
                                String strG3 = zzhhVar.n().g();
                                if (this.f12905l == null) {
                                    zzic.k(zzppVar);
                                    this.f12905l = zzppVar.e0();
                                }
                                String str19 = this.f12905l;
                                if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                    i12 = i11;
                                    str5 = null;
                                } else {
                                    g();
                                    if (this.f12909q == 0) {
                                        i12 = i11;
                                    } else {
                                        zzicVar2.f13104k.getClass();
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.f12909q;
                                        i12 = i11;
                                        if (this.f12908p != null) {
                                            l();
                                        }
                                    }
                                    if (this.f12908p == null) {
                                        l();
                                    }
                                    str5 = this.f12908p;
                                }
                                boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
                                if (boolT2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolT2.booleanValue();
                                }
                                zzic.k(zzppVar);
                                zzicVar = zzppVar.f13202a;
                                String str110 = str5;
                                strM = m();
                                boolean z112 = zBooleanValue;
                                if (zzicVar.f13094a.getPackageManager() == null) {
                                    z15 = z13;
                                    j13 = 0;
                                } else {
                                    z15 = z13;
                                    i13 = 0;
                                    applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
                                    if (applicationInfoA != null) {
                                        i14 = applicationInfoA.targetSdkVersion;
                                    } else {
                                        i14 = i13;
                                    }
                                    j13 = i14;
                                }
                                zzic.k(zzhhVar);
                                int i17 = zzhhVar.n().f13206b;
                                zzic.k(zzhhVar);
                                zzhhVar.g();
                                String str111 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
                                zzaif.a();
                                zzfxVar = zzfy.P0;
                                if (zzalVar2.r(null, zzfxVar)) {
                                    zzic.k(zzppVar);
                                    iD = zzpp.D();
                                } else {
                                    iD = 0;
                                }
                                zzaif.a();
                                if (zzalVar2.r(null, zzfxVar)) {
                                    zzic.k(zzppVar);
                                    jE = zzppVar.E();
                                } else {
                                    jE = 0;
                                }
                                String str112 = zzalVar2.f12629c;
                                String strValueOf3 = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j113 = j13;
                                long j114 = zzicVar2.D;
                                zzic.j(zzicVar2.f13113u);
                                if (zzalVar2.r(null, zzfy.e1)) {
                                }
                                return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z16, str18, j112, i12, z15, z111, boolValueOf3, this.f12902i, list3, strG3, str19, str110, z112, j113, i17, str111, iD, jE, str112, strValueOf3, j114, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        str2 = strN;
                    }
                } else {
                    str2 = strN;
                    str3 = str6;
                }
                j11 = 0;
                this.f12901h = j11;
            }
            j11 = jA2;
            this.f12901h = j11;
        } else {
            str2 = strN;
            str3 = str6;
            z11 = false;
            j11 = j15;
        }
        zD = zzicVar2.d();
        zzic.k(zzhhVar);
        boolean z113 = !zzhhVar.f13034r;
        g();
        if (zzicVar2.d()) {
            z12 = zD;
        } else {
            ((zzajb) zzaja.f11435b.f11436a.get()).getClass();
            z12 = zD;
            if (zzalVar2.r(null, zzfy.H0)) {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    j12 = j11;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                    if (objInvoke == null) {
                        str4 = null;
                    } else {
                        str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                    jMin = zzicVar2.D;
                    zzic.k(zzhhVar);
                    jA = zzhhVar.f13023f.a();
                    if (jA != 0) {
                        jMin = Math.min(jMin, jA);
                    }
                    h();
                    i11 = this.f12906n;
                    boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
                    if (boolT != null || boolT.booleanValue()) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    zzic.k(zzhhVar);
                    zzhhVar.g();
                    String str113 = str4;
                    long j115 = jMin;
                    boolean z114 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
                    if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z14);
                    List list4 = this.f12904k;
                    String strG4 = zzhhVar.n().g();
                    if (this.f12905l == null) {
                        zzic.k(zzppVar);
                        this.f12905l = zzppVar.e0();
                    }
                    String str114 = this.f12905l;
                    if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                        i12 = i11;
                        str5 = null;
                    } else {
                        g();
                        if (this.f12909q == 0) {
                            i12 = i11;
                        } else {
                            zzicVar2.f13104k.getClass();
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - this.f12909q;
                            i12 = i11;
                            if (this.f12908p != null && jCurrentTimeMillis4 > 86400000 && this.f12910r == null) {
                                l();
                            }
                        }
                        if (this.f12908p == null) {
                            l();
                        }
                        str5 = this.f12908p;
                    }
                    boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
                    if (boolT2 == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolT2.booleanValue();
                    }
                    zzic.k(zzppVar);
                    zzicVar = zzppVar.f13202a;
                    String str115 = str5;
                    strM = m();
                    boolean z115 = zBooleanValue;
                    if (zzicVar.f13094a.getPackageManager() == null) {
                        z15 = z13;
                        j13 = 0;
                    } else {
                        z15 = z13;
                        i13 = 0;
                        applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
                        if (applicationInfoA != null) {
                            i14 = applicationInfoA.targetSdkVersion;
                        } else {
                            i14 = i13;
                        }
                        j13 = i14;
                    }
                    zzic.k(zzhhVar);
                    int i18 = zzhhVar.n().f13206b;
                    zzic.k(zzhhVar);
                    zzhhVar.g();
                    String str116 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
                    zzaif.a();
                    zzfxVar = zzfy.P0;
                    if (zzalVar2.r(null, zzfxVar)) {
                        zzic.k(zzppVar);
                        iD = zzpp.D();
                    } else {
                        iD = 0;
                    }
                    zzaif.a();
                    if (zzalVar2.r(null, zzfxVar)) {
                        zzic.k(zzppVar);
                        jE = zzppVar.E();
                    } else {
                        jE = 0;
                    }
                    String str117 = zzalVar2.f12629c;
                    String strValueOf4 = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j116 = j13;
                    long j117 = zzicVar2.D;
                    zzic.j(zzicVar2.f13113u);
                    if (zzalVar2.r(null, zzfy.e1)) {
                    }
                    return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z113, str113, j115, i12, z15, z114, boolValueOf4, this.f12902i, list4, strG4, str114, str115, z115, j116, i18, str116, iD, jE, str117, strValueOf4, j117, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
                }
                str4 = null;
                jMin = zzicVar2.D;
                zzic.k(zzhhVar);
                jA = zzhhVar.f13023f.a();
                if (jA != 0) {
                    jMin = Math.min(jMin, jA);
                }
                h();
                i11 = this.f12906n;
                boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
                if (boolT != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                zzic.k(zzhhVar);
                zzhhVar.g();
                String str118 = str4;
                long j118 = jMin;
                boolean z116 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
                if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z14);
                List list5 = this.f12904k;
                String strG5 = zzhhVar.n().g();
                if (this.f12905l == null) {
                    zzic.k(zzppVar);
                    this.f12905l = zzppVar.e0();
                }
                String str119 = this.f12905l;
                if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                    i12 = i11;
                    str5 = null;
                } else {
                    g();
                    if (this.f12909q == 0) {
                        i12 = i11;
                    } else {
                        zzicVar2.f13104k.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - this.f12909q;
                        i12 = i11;
                        if (this.f12908p != null) {
                            l();
                        }
                    }
                    if (this.f12908p == null) {
                        l();
                    }
                    str5 = this.f12908p;
                }
                boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
                if (boolT2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolT2.booleanValue();
                }
                zzic.k(zzppVar);
                zzicVar = zzppVar.f13202a;
                String str1110 = str5;
                strM = m();
                boolean z117 = zBooleanValue;
                if (zzicVar.f13094a.getPackageManager() == null) {
                    z15 = z13;
                    j13 = 0;
                } else {
                    z15 = z13;
                    i13 = 0;
                    applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
                    if (applicationInfoA != null) {
                        i14 = applicationInfoA.targetSdkVersion;
                    } else {
                        i14 = i13;
                    }
                    j13 = i14;
                }
                zzic.k(zzhhVar);
                int i19 = zzhhVar.n().f13206b;
                zzic.k(zzhhVar);
                zzhhVar.g();
                String str1111 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
                zzaif.a();
                zzfxVar = zzfy.P0;
                if (zzalVar2.r(null, zzfxVar)) {
                    zzic.k(zzppVar);
                    iD = zzpp.D();
                } else {
                    iD = 0;
                }
                zzaif.a();
                if (zzalVar2.r(null, zzfxVar)) {
                    zzic.k(zzppVar);
                    jE = zzppVar.E();
                } else {
                    jE = 0;
                }
                String str1112 = zzalVar2.f12629c;
                String strValueOf5 = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                long j119 = j13;
                long j1110 = zzicVar2.D;
                zzic.j(zzicVar2.f13113u);
                if (zzalVar2.r(null, zzfy.e1)) {
                }
                return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z113, str118, j118, i12, z15, z116, boolValueOf5, this.f12902i, list5, strG5, str119, str1110, z117, j119, i19, str1111, iD, jE, str1112, strValueOf5, j1110, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
            }
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Disabled IID for tests.");
        }
        j12 = j11;
        str4 = null;
        jMin = zzicVar2.D;
        zzic.k(zzhhVar);
        jA = zzhhVar.f13023f.a();
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        h();
        i11 = this.f12906n;
        boolT = zzalVar2.t("google_analytics_adid_collection_enabled");
        if (boolT != null) {
            z13 = true;
        } else {
            z13 = true;
        }
        zzic.k(zzhhVar);
        zzhhVar.g();
        String str1113 = str4;
        long j1111 = jMin;
        boolean z118 = zzhhVar.k().getBoolean("deferred_analytics_collection", z11);
        if (zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED) {
            z14 = true;
        } else {
            z14 = false;
        }
        Boolean boolValueOf6 = Boolean.valueOf(z14);
        List list6 = this.f12904k;
        String strG6 = zzhhVar.n().g();
        if (this.f12905l == null) {
            zzic.k(zzppVar);
            this.f12905l = zzppVar.e0();
        }
        String str1114 = this.f12905l;
        if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
            i12 = i11;
            str5 = null;
        } else {
            g();
            if (this.f12909q == 0) {
                i12 = i11;
            } else {
                zzicVar2.f13104k.getClass();
                long jCurrentTimeMillis6 = System.currentTimeMillis() - this.f12909q;
                i12 = i11;
                if (this.f12908p != null) {
                    l();
                }
            }
            if (this.f12908p == null) {
                l();
            }
            str5 = this.f12908p;
        }
        boolT2 = zzalVar2.t("google_analytics_sgtm_upload_enabled");
        if (boolT2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolT2.booleanValue();
        }
        zzic.k(zzppVar);
        zzicVar = zzppVar.f13202a;
        String str1115 = str5;
        strM = m();
        boolean z119 = zBooleanValue;
        if (zzicVar.f13094a.getPackageManager() == null) {
            z15 = z13;
            j13 = 0;
        } else {
            z15 = z13;
            i13 = 0;
            applicationInfoA = Wrappers.a(zzicVar.f13094a).a(0, strM);
            if (applicationInfoA != null) {
                i14 = applicationInfoA.targetSdkVersion;
            } else {
                i14 = i13;
            }
            j13 = i14;
        }
        zzic.k(zzhhVar);
        int i110 = zzhhVar.n().f13206b;
        zzic.k(zzhhVar);
        zzhhVar.g();
        String str1116 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12676b;
        zzaif.a();
        zzfxVar = zzfy.P0;
        if (zzalVar2.r(null, zzfxVar)) {
            zzic.k(zzppVar);
            iD = zzpp.D();
        } else {
            iD = 0;
        }
        zzaif.a();
        if (zzalVar2.r(null, zzfxVar)) {
            zzic.k(zzppVar);
            jE = zzppVar.E();
        } else {
            jE = 0;
        }
        String str1117 = zzalVar2.f12629c;
        String strValueOf6 = String.valueOf(zzjl.h(zzalVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
        long j1112 = j13;
        long j1113 = zzicVar2.D;
        zzic.j(zzicVar2.f13113u);
        if (zzalVar2.r(null, zzfy.e1)) {
        }
        return new zzr(strM2, str2, str3, j14, str7, 161000L, j12, str, z12, z113, str1113, j1111, i12, z15, z118, boolValueOf6, this.f12902i, list6, strG6, str1114, str1115, z119, j1112, i110, str1116, iD, jE, str1117, strValueOf6, j1113, zzicVar2.f13113u.l().zza(), zzalVar2.r(null, zzfy.e1) ? zzicVar2.E : 0L);
    }

    public final void l() {
        String str;
        g();
        zzic zzicVar = this.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.k(zzhhVar);
        if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzpp zzppVar = zzicVar.f13102i;
            zzic.k(zzppVar);
            zzppVar.g0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzic.m(zzguVar);
            zzguVar.m.a("Analytics Storage consent is not granted");
            str = null;
        }
        zzic.m(zzguVar);
        zzguVar.m.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f12908p = str;
        zzicVar.f13104k.getClass();
        this.f12909q = System.currentTimeMillis();
    }

    public final String m() {
        h();
        Preconditions.g(this.f12896c);
        return this.f12896c;
    }

    public final String n() {
        g();
        h();
        Preconditions.g(this.f12907o);
        return this.f12907o;
    }
}
