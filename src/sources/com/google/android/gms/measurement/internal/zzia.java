package com.google.android.gms.measurement.internal;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o4.c;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzia implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzjs f13091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzic f13092b;

    public zzia(zzic zzicVar, zzjs zzjsVar) {
        this.f13091a = zzjsVar;
        this.f13092b = zzicVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02af  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b0 A[Catch: NotFoundException -> 0x02b5, TRY_LEAVE, TryCatch #1 {NotFoundException -> 0x02b5, blocks: (B:100:0x029f, B:103:0x02b0), top: B:289:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f4 A[EDGE_INSN: B:118:0x02f4->B:119:0x02f6 BREAK  A[LOOP:0: B:113:0x02da->B:303:?]] */
    /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x031a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0360  */
    /* JADX WARN: Code duplicated, block: B:127:0x0369  */
    /* JADX WARN: Code duplicated, block: B:130:0x038b  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03e1 A[PHI: r13
      0x03e1: PHI (r13v18 boolean) = (r13v8 boolean), (r13v7 boolean) binds: [B:141:0x03e0, B:138:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x040f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0451  */
    /* JADX WARN: Code duplicated, block: B:152:0x0469  */
    /* JADX WARN: Code duplicated, block: B:153:0x047f A[PHI: r28 r29
      0x047f: PHI (r28v2 com.google.android.gms.measurement.internal.zzic) = (r28v0 com.google.android.gms.measurement.internal.zzic), (r28v3 com.google.android.gms.measurement.internal.zzic) binds: [B:151:0x0467, B:149:0x044c] A[DONT_GENERATE, DONT_INLINE]
      0x047f: PHI (r29v2 com.google.android.gms.measurement.internal.zzgs) = (r29v0 com.google.android.gms.measurement.internal.zzgs), (r29v3 com.google.android.gms.measurement.internal.zzgs) binds: [B:151:0x0467, B:149:0x044c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x049c  */
    /* JADX WARN: Code duplicated, block: B:167:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:168:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:171:0x04df  */
    /* JADX WARN: Code duplicated, block: B:174:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:177:0x050e  */
    /* JADX WARN: Code duplicated, block: B:179:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0539  */
    /* JADX WARN: Code duplicated, block: B:187:0x053f  */
    /* JADX WARN: Code duplicated, block: B:189:0x055d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0589  */
    /* JADX WARN: Code duplicated, block: B:196:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:203:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:205:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:212:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:216:0x0602  */
    /* JADX WARN: Code duplicated, block: B:219:0x0610  */
    /* JADX WARN: Code duplicated, block: B:222:0x0624  */
    /* JADX WARN: Code duplicated, block: B:223:0x0627  */
    /* JADX WARN: Code duplicated, block: B:225:0x0637  */
    /* JADX WARN: Code duplicated, block: B:227:0x0657 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:240:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:243:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:252:0x0741  */
    /* JADX WARN: Code duplicated, block: B:254:0x0749  */
    /* JADX WARN: Code duplicated, block: B:255:0x074b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0753  */
    /* JADX WARN: Code duplicated, block: B:261:0x0760  */
    /* JADX WARN: Code duplicated, block: B:265:0x0795  */
    /* JADX WARN: Code duplicated, block: B:267:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:269:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:271:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:274:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:278:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:289:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0176 A[Catch: NameNotFoundException -> 0x0193, TryCatch #4 {NameNotFoundException -> 0x0193, blocks: (B:41:0x016b, B:43:0x0176, B:45:0x0182), top: B:295:0x016b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0182 A[Catch: NameNotFoundException -> 0x0193, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0193, blocks: (B:41:0x016b, B:43:0x0176, B:45:0x0182), top: B:295:0x016b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0208  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213  */
    /* JADX WARN: Code duplicated, block: B:74:0x021e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0229  */
    /* JADX WARN: Code duplicated, block: B:79:0x023d  */
    /* JADX WARN: Code duplicated, block: B:80:0x023e A[Catch: IllegalStateException -> 0x025f, TryCatch #2 {IllegalStateException -> 0x025f, blocks: (B:77:0x0235, B:81:0x0244, B:85:0x024c, B:87:0x0250, B:80:0x023e), top: B:291:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x024a  */
    /* JADX WARN: Code duplicated, block: B:84:0x024b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0250 A[Catch: IllegalStateException -> 0x025f, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x025f, blocks: (B:77:0x0235, B:81:0x0244, B:85:0x024c, B:87:0x0250, B:80:0x023e), top: B:291:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0280  */
    /* JADX WARN: Code duplicated, block: B:95:0x028e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0295  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzgi zzgiVar;
        String str;
        String string;
        int i11;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iG;
        List listAsList;
        zzic zzicVar;
        Bundle bundleS;
        Integer numValueOf;
        String[] stringArray;
        zzlq zzlqVar;
        zzgs zzgsVar;
        zzgs zzgsVar2;
        zzgs zzgsVar3;
        zzgs zzgsVar4;
        String strM;
        int i12;
        AtomicInteger atomicInteger;
        long j11;
        final zzlj zzljVar;
        com.google.android.gms.internal.measurement.zzin zzinVarL;
        com.google.android.gms.internal.measurement.zzin zzinVar;
        boolean zR;
        boolean z11;
        zzhg zzhgVar;
        zzjl zzjlVarN;
        zzji zzjiVarW;
        zzji zzjiVarW2;
        zzji zzjiVar;
        zzic zzicVar2;
        zzgs zzgsVar5;
        zzjl zzjlVar;
        boolean z12;
        zzic zzicVar3;
        zzji zzjiVarW3;
        zzji zzjiVarW4;
        Boolean boolT;
        zzhe zzheVar;
        zzx zzxVar;
        zzic zzicVar4;
        zzhg zzhgVar2;
        zzgu zzguVar;
        boolean zD;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        zzgs zzgsVar6;
        Context context;
        boolean z13;
        Iterator it;
        String str3;
        zzpp zzppVar;
        String strA;
        Bundle bundle;
        zzic zzicVar5 = this.f13092b;
        zzhz zzhzVar = zzicVar5.f13100g;
        zzgu zzguVar2 = zzicVar5.f13099f;
        zzhh zzhhVar = zzicVar5.f13098e;
        zzpp zzppVar2 = zzicVar5.f13102i;
        zzic.m(zzhzVar);
        zzhzVar.g();
        zzal zzalVar = zzicVar5.f13097d;
        zzalVar.f13202a.getClass();
        zzbb zzbbVar = new zzbb(zzicVar5);
        zzbbVar.j();
        zzicVar5.f13111s = zzbbVar;
        zzjs zzjsVar = this.f13091a;
        com.google.android.gms.internal.measurement.zzdb zzdbVar = zzjsVar.f13224d;
        long j12 = zzdbVar == null ? 0L : zzdbVar.f11497a;
        String string2 = BuildConfig.VERSION_NAME;
        if (zzdbVar != null && (bundle = zzdbVar.f11500d) != null) {
            string2 = bundle.getString("runtime_google_app_id", BuildConfig.VERSION_NAME);
        }
        zzgi zzgiVar2 = new zzgi(zzicVar5, zzjsVar.f13223c, j12, string2);
        zzgiVar2.i();
        zzicVar5.f13112t = zzgiVar2;
        zzgl zzglVar = new zzgl(zzicVar5);
        zzglVar.i();
        zzicVar5.f13109q = zzglVar;
        zznl zznlVar = new zznl(zzicVar5);
        zznlVar.i();
        zzicVar5.f13110r = zznlVar;
        boolean z14 = zzppVar2.f13203b;
        zzic zzicVar6 = zzppVar2.f13202a;
        if (z14) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzppVar2.g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzgu zzguVar3 = zzppVar2.f13202a.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12945i.a("Utils falling back to Random for random id");
            }
        }
        zzppVar2.f13648d.set(jNextLong);
        zzicVar6.C.incrementAndGet();
        zzppVar2.f13203b = true;
        if (zzhhVar.f13203b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        SharedPreferences sharedPreferences2 = zzhhVar.f13202a.f13094a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        zzhhVar.f13020c = sharedPreferences2;
        boolean z15 = sharedPreferences2.getBoolean("has_been_opened", false);
        zzhhVar.f13034r = z15;
        if (!z15) {
            SharedPreferences.Editor editorEdit = zzhhVar.f13020c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zzhhVar.f13022e = new zzhf(zzhhVar, Math.max(0L, ((Long) zzfy.f12845d.a(null)).longValue()));
        zzhhVar.f13202a.C.incrementAndGet();
        zzhhVar.f13203b = true;
        zzgi zzgiVar3 = zzicVar5.f13112t;
        if (zzgiVar3.f12895b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzic zzicVar7 = zzgiVar3.f13202a;
        zzgu zzguVar4 = zzicVar7.f13099f;
        zzgu zzguVar5 = zzicVar7.f13099f;
        zzic.m(zzguVar4);
        zzguVar4.f12949n.c(Long.valueOf(zzgiVar3.f12903j), Long.valueOf(zzgiVar3.f12902i), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = zzicVar7.f13094a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str4 = BuildConfig.VERSION_NAME;
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                zzgiVar = zzgiVar2;
                str = "Can't initialize twice";
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12942f.b(zzgu.o(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = BuildConfig.VERSION_NAME;
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i11 = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    zzic.m(zzguVar5);
                                    zzguVar5.f12942f.c(zzgu.o(packageName), string, "Error retrieving package info. appId, appName");
                                    i11 = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        zzgiVar3.f12896c = packageName;
                        zzgiVar3.f12899f = str7;
                        zzgiVar3.f12897d = str2;
                        zzgiVar3.f12898e = i11;
                        zzgiVar3.f12900g = string;
                        zzgiVar3.f12901h = 0L;
                        iG = zzicVar7.g();
                        if (iG == 0) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12949n.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12947k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a(MzwEyWCkjXL.QJorOcgsYCl);
                            zzic.m(zzguVar5);
                            zzguVar5.f12943g.a("Invalid scion state in identity");
                        } else {
                            zzic.m(zzguVar5);
                            zzguVar5.f12948l.a("App measurement disabled due to denied storage consent");
                        }
                        zzgiVar3.f12907o = BuildConfig.VERSION_NAME;
                        strA = zzgiVar3.m;
                        if (TextUtils.isEmpty(strA)) {
                            strA = zzlt.a(context2, zzicVar7.f13108p);
                        }
                        if (!TextUtils.isEmpty(strA)) {
                            str4 = strA;
                        }
                        zzgiVar3.f12907o = str4;
                        if (iG == 0) {
                            zzic.m(zzguVar5);
                            zzguVar5.f12949n.c(zzgiVar3.f12896c, zzgiVar3.f12907o, "App measurement enabled for app package, google app id");
                        }
                        listAsList = null;
                        zzgiVar3.f12904k = null;
                        zzal zzalVar2 = zzicVar7.f13097d;
                        zzicVar = zzalVar2.f13202a;
                        Preconditions.d("analytics.safelisted_events");
                        bundleS = zzalVar2.s();
                        if (bundleS != null) {
                            if (bundleS.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e8) {
                                    zzgu zzguVar6 = zzicVar.f13099f;
                                    zzic.m(zzguVar6);
                                    zzguVar6.f12942f.b(e8, "Failed to load string array from metadata: resource not found");
                                }
                            }
                            if (listAsList != null) {
                                zzgiVar3.f12904k = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        zzgiVar3.f12904k = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        zzppVar = zzicVar7.f13102i;
                                        zzic.k(zzppVar);
                                    }
                                } while (zzppVar.l0("safelisted event", str3));
                            } else {
                                zzic.m(zzguVar5);
                                zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
                            } else {
                                zzgiVar3.f12906n = 0;
                            }
                            zzgiVar3.f13202a.C.incrementAndGet();
                            zzgiVar3.f12895b = true;
                            zzlqVar = new zzlq(zzicVar5);
                            zzlqVar.i();
                            zzicVar5.f13113u = zzlqVar;
                            if (!zzlqVar.f12895b) {
                                throw new IllegalStateException(str);
                            }
                            zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
                            zzlqVar.f13202a.C.incrementAndGet();
                            zzlqVar.f12895b = true;
                            zzic.m(zzguVar2);
                            zzgsVar = zzguVar2.m;
                            zzgsVar2 = zzguVar2.f12948l;
                            zzgsVar3 = zzguVar2.f12949n;
                            zzgsVar4 = zzguVar2.f12942f;
                            zzalVar.m();
                            zzgsVar2.b(161000L, "App measurement initialized, version");
                            zzic.m(zzguVar2);
                            zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM = zzgiVar.m();
                            if (zzppVar2.M(strM, zzalVar.f12629c)) {
                                zzic.m(zzguVar2);
                                zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                zzic.m(zzguVar2);
                                zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                            }
                            zzic.m(zzguVar2);
                            zzgsVar.a("Debug-level message logging enabled");
                            i12 = zzicVar5.A;
                            atomicInteger = zzicVar5.C;
                            if (i12 != atomicInteger.get()) {
                                zzic.m(zzguVar2);
                                zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            zzicVar5.f13114v = true;
                            j11 = zzicVar5.D;
                            zzljVar = zzicVar5.m;
                            zzhz zzhzVar2 = zzicVar5.f13100g;
                            zzic.m(zzhzVar2);
                            zzhzVar2.g();
                            zzic.j(zzicVar5.f13113u);
                            zzinVarL = zzicVar5.f13113u.l();
                            zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                            zzaif.a();
                            zR = zzalVar.r(null, zzfy.P0);
                            if (zzinVarL == zzinVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (zR) {
                                zzppVar2.g();
                                if (zzppVar2.E() == 1) {
                                    zzppVar2.g();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z13 = z11;
                                    c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter, 2);
                                    zzgu zzguVar7 = zzicVar6.f13099f;
                                    zzic.m(zzguVar7);
                                    zzguVar7.m.a(tcppUUQxZjFdy.xpZT);
                                    if (z13) {
                                        zzic.j(zzicVar5.f13113u);
                                        zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                                    }
                                } else if (z11) {
                                    z11 = true;
                                    zzppVar2.g();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z13 = z11;
                                    c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter2, 2);
                                    zzgu zzguVar8 = zzicVar6.f13099f;
                                    zzic.m(zzguVar8);
                                    zzguVar8.m.a(tcppUUQxZjFdy.xpZT);
                                    if (z13) {
                                        zzic.j(zzicVar5.f13113u);
                                        zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                                    }
                                }
                            } else if (z11) {
                                z11 = true;
                                zzppVar2.g();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z11;
                                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter3, 2);
                                zzgu zzguVar9 = zzicVar6.f13099f;
                                zzic.m(zzguVar9);
                                zzguVar9.m.a(tcppUUQxZjFdy.xpZT);
                                if (z13) {
                                    zzic.j(zzicVar5.f13113u);
                                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                                }
                            }
                            zzhgVar = zzhhVar.f13024g;
                            zzjlVarN = zzhhVar.n();
                            int i13 = zzjlVarN.f13206b;
                            zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
                            zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
                            zzjiVar = zzji.UNINITIALIZED;
                            if (zzjiVarW == zzjiVar || zzjiVarW2 != zzjiVar) {
                                zzicVar2 = zzicVar5;
                                zzgsVar5 = zzgsVar4;
                                if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(zzjk.class);
                                    enumMap.put(zzjk.AD_STORAGE, zzjiVarW);
                                    enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                                    zzjlVar = new zzjl(enumMap, -10);
                                    z12 = false;
                                }
                                if (zzjlVar != null) {
                                    zzic.l(zzljVar);
                                    zzljVar.I(zzjlVar, true);
                                } else {
                                    zzjlVar = zzjlVarN;
                                }
                                zzic.l(zzljVar);
                                zzicVar3 = zzljVar.f13202a;
                                zzljVar.M(zzjlVar);
                                zzhhVar.g();
                                int i14 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
                                zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                                if (zzjiVarW3 != zzjiVar) {
                                    zzic.m(zzguVar2);
                                    zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
                                }
                                zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
                                if (zzjiVarW4 == zzjiVar && zzjl.l(-10, i14)) {
                                    zzic.l(zzljVar);
                                    EnumMap enumMap2 = new EnumMap(zzjk.class);
                                    enumMap2.put(zzjk.AD_USER_DATA, zzjiVarW4);
                                    zzljVar.H(new zzba(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(zzicVar2.r().n()) && (i14 == 0 || i14 == 30)) {
                                    zzic.l(zzljVar);
                                    zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolT = zzalVar.t("google_analytics_tcf_data_enabled");
                                if (boolT != null || boolT.booleanValue()) {
                                    zzic.m(zzguVar2);
                                    zzgsVar.a("TCF client enabled.");
                                    zzic.l(zzljVar);
                                    zzljVar.g();
                                    zzgu zzguVar10 = zzicVar3.f13099f;
                                    zzic.m(zzguVar10);
                                    zzguVar10.m.a("Register tcfPrefChangeListener.");
                                    if (zzljVar.f13340t == null) {
                                        zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                                        zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                zzlj zzljVar2 = zzljVar;
                                                zzljVar2.getClass();
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    zzgu zzguVar11 = zzljVar2.f13202a.f13099f;
                                                    zzic.m(zzguVar11);
                                                    zzguVar11.f12949n.a("IABTCF_TCString change picked up in listener.");
                                                    zzkb zzkbVar = zzljVar2.f13341u;
                                                    Preconditions.g(zzkbVar);
                                                    zzkbVar.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    zzhh zzhhVar2 = zzicVar3.f13098e;
                                    zzic.k(zzhhVar2);
                                    zzhhVar2.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                                    zzic.l(zzljVar);
                                    zzljVar.m();
                                }
                                zzheVar = zzhhVar.f13023f;
                                if (zzheVar.a() == 0) {
                                    zzic.m(zzguVar2);
                                    zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                                    zzheVar.b(j11);
                                }
                                zzic.l(zzljVar);
                                zzxVar = zzljVar.f13337q;
                                if (zzxVar.c() && zzxVar.b()) {
                                    zzhh zzhhVar3 = zzxVar.f13674a.f13098e;
                                    zzic.k(zzhhVar3);
                                    zzhhVar3.f13039w.b(null);
                                }
                                if (zzicVar2.h()) {
                                    zzicVar4 = zzicVar2;
                                    if (TextUtils.isEmpty(zzicVar4.r().n())) {
                                        zzhgVar2 = zzhgVar;
                                    } else {
                                        String strN = zzicVar4.r().n();
                                        zzhhVar.g();
                                        String string3 = zzhhVar.k().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            zzhgVar2 = zzhgVar;
                                        } else {
                                            Preconditions.g(strN);
                                            if (strN.equals(string3)) {
                                                zzhgVar2 = zzhgVar;
                                            } else {
                                                zzic.m(zzguVar2);
                                                zzgsVar2.a("Rechecking which service to use due to a GMP App Id change");
                                                zzhhVar.g();
                                                zzhhVar.g();
                                                Boolean boolValueOf = zzhhVar.k().contains("measurement_enabled") ? Boolean.valueOf(zzhhVar.k().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = zzhhVar.k().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    zzhhVar.g();
                                                    SharedPreferences.Editor editorEdit3 = zzhhVar.k().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                zzicVar4.o().k();
                                                zzicVar4.f13110r.o();
                                                zzicVar4.f13110r.m();
                                                zzheVar.b(j11);
                                                zzhgVar2 = zzhgVar;
                                                zzhgVar2.b(null);
                                            }
                                        }
                                        String strN2 = zzicVar4.r().n();
                                        zzhhVar.g();
                                        SharedPreferences.Editor editorEdit4 = zzhhVar.k().edit();
                                        editorEdit4.putString("gmp_app_id", strN2);
                                        editorEdit4.apply();
                                    }
                                    if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                        zzhgVar2.b(null);
                                    }
                                    zzic.l(zzljVar);
                                    zzljVar.f13328g.set(zzhgVar2.a());
                                    try {
                                        zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        zzhg zzhgVar3 = zzhhVar.f13038v;
                                        if (!TextUtils.isEmpty(zzhgVar3.a())) {
                                            zzic.m(zzguVar2);
                                            zzguVar = zzguVar2;
                                            zzguVar.f12945i.a("Remote config removed with active feature rollouts");
                                            zzhgVar3.b(null);
                                        }
                                        if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                                            zD = zzicVar4.d();
                                            sharedPreferences = zzhhVar.f13020c;
                                            if (sharedPreferences == null) {
                                                zContains = z12;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                zzhhVar.o(!zD);
                                            }
                                            if (zD) {
                                                zzic.l(zzljVar);
                                                zzljVar.t();
                                            }
                                            zzoc zzocVar = zzicVar4.f13101h;
                                            zzic.l(zzocVar);
                                            zzocVar.f13538e.a();
                                            zzicVar4.p().k(new AtomicReference());
                                            zzicVar4.p().l(zzhhVar.f13041y.a());
                                        }
                                        zzaif.a();
                                        if (zzalVar.r(null, zzfy.P0)) {
                                            zzppVar2.g();
                                            if (zzppVar2.E() == 1) {
                                                z12 = true;
                                            }
                                            if (z12) {
                                                long jIntValue = ((Integer) zzfy.f12888w0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                zzicVar4.f13104k.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    zzic.m(zzguVar);
                                                    zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                zzic.l(zzljVar);
                                                zzljVar.g();
                                                if (zzljVar.f13333l == null) {
                                                    zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                                                }
                                                zzljVar.f13333l.b(jMax);
                                            }
                                        }
                                        zzhhVar.f13031o.b(true);
                                    }
                                    zzguVar = zzguVar2;
                                    if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                                        zD = zzicVar4.d();
                                        sharedPreferences = zzhhVar.f13020c;
                                        if (sharedPreferences == null) {
                                            zContains = z12;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !zzalVar.u()) {
                                            zzhhVar.o(!zD);
                                        }
                                        if (zD) {
                                            zzic.l(zzljVar);
                                            zzljVar.t();
                                        }
                                        zzoc zzocVar2 = zzicVar4.f13101h;
                                        zzic.l(zzocVar2);
                                        zzocVar2.f13538e.a();
                                        zzicVar4.p().k(new AtomicReference());
                                        zzicVar4.p().l(zzhhVar.f13041y.a());
                                    }
                                } else {
                                    if (zzicVar2.d()) {
                                        if (zzppVar2.K("android.permission.INTERNET")) {
                                            zzgsVar6 = zzgsVar5;
                                        } else {
                                            zzic.m(zzguVar2);
                                            zzgsVar6 = zzgsVar5;
                                            zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                                        }
                                        if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                            zzic.m(zzguVar2);
                                            zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        zzicVar4 = zzicVar2;
                                        context = zzicVar4.f13094a;
                                        if (!Wrappers.a(context).c() && !zzalVar.j()) {
                                            if (!zzpp.c0(context)) {
                                                zzic.m(zzguVar2);
                                                zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!zzpp.B(context)) {
                                                zzic.m(zzguVar2);
                                                zzgsVar6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        zzic.m(zzguVar2);
                                        zzgsVar6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        zzicVar4 = zzicVar2;
                                    }
                                    zzguVar = zzguVar2;
                                }
                                zzaif.a();
                                if (zzalVar.r(null, zzfy.P0)) {
                                    zzppVar2.g();
                                    if (zzppVar2.E() == 1) {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        long jIntValue2 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        zzicVar4.f13104k.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            zzic.m(zzguVar);
                                            zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        zzic.l(zzljVar);
                                        zzljVar.g();
                                        if (zzljVar.f13333l == null) {
                                            zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                                        }
                                        zzljVar.f13333l.b(jMax);
                                    }
                                }
                                zzhhVar.f13031o.b(true);
                            }
                            zzicVar2 = zzicVar5;
                            zzgsVar5 = zzgsVar4;
                            if (TextUtils.isEmpty(zzicVar2.r().n()) && (i13 == 0 || i13 == 30 || i13 == 10 || i13 == 40)) {
                                zzic.l(zzljVar);
                                z12 = false;
                                zzljVar.I(new zzjl(-10), false);
                            } else {
                                z12 = false;
                            }
                            zzjlVar = null;
                            if (zzjlVar != null) {
                                zzic.l(zzljVar);
                                zzljVar.I(zzjlVar, true);
                            } else {
                                zzjlVar = zzjlVarN;
                            }
                            zzic.l(zzljVar);
                            zzicVar3 = zzljVar.f13202a;
                            zzljVar.M(zzjlVar);
                            zzhhVar.g();
                            int i15 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
                            zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                            if (zzjiVarW3 != zzjiVar) {
                                zzic.m(zzguVar2);
                                zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
                            }
                            zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
                            if (zzjiVarW4 == zzjiVar) {
                                if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                                    zzic.l(zzljVar);
                                    zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                                zzic.l(zzljVar);
                                zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolT = zzalVar.t("google_analytics_tcf_data_enabled");
                            if (boolT != null) {
                                zzic.m(zzguVar2);
                                zzgsVar.a("TCF client enabled.");
                                zzic.l(zzljVar);
                                zzljVar.g();
                                zzgu zzguVar11 = zzicVar3.f13099f;
                                zzic.m(zzguVar11);
                                zzguVar11.m.a("Register tcfPrefChangeListener.");
                                if (zzljVar.f13340t == null) {
                                    zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                                    zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            zzlj zzljVar2 = zzljVar;
                                            zzljVar2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                zzgu zzguVar12 = zzljVar2.f13202a.f13099f;
                                                zzic.m(zzguVar12);
                                                zzguVar12.f12949n.a("IABTCF_TCString change picked up in listener.");
                                                zzkb zzkbVar = zzljVar2.f13341u;
                                                Preconditions.g(zzkbVar);
                                                zzkbVar.b(500L);
                                            }
                                        }
                                    };
                                }
                                zzhh zzhhVar4 = zzicVar3.f13098e;
                                zzic.k(zzhhVar4);
                                zzhhVar4.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                                zzic.l(zzljVar);
                                zzljVar.m();
                            } else {
                                zzic.m(zzguVar2);
                                zzgsVar.a("TCF client enabled.");
                                zzic.l(zzljVar);
                                zzljVar.g();
                                zzgu zzguVar12 = zzicVar3.f13099f;
                                zzic.m(zzguVar12);
                                zzguVar12.m.a("Register tcfPrefChangeListener.");
                                if (zzljVar.f13340t == null) {
                                    zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                                    zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            zzlj zzljVar2 = zzljVar;
                                            zzljVar2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                zzgu zzguVar13 = zzljVar2.f13202a.f13099f;
                                                zzic.m(zzguVar13);
                                                zzguVar13.f12949n.a("IABTCF_TCString change picked up in listener.");
                                                zzkb zzkbVar = zzljVar2.f13341u;
                                                Preconditions.g(zzkbVar);
                                                zzkbVar.b(500L);
                                            }
                                        }
                                    };
                                }
                                zzhh zzhhVar5 = zzicVar3.f13098e;
                                zzic.k(zzhhVar5);
                                zzhhVar5.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                                zzic.l(zzljVar);
                                zzljVar.m();
                            }
                            zzheVar = zzhhVar.f13023f;
                            if (zzheVar.a() == 0) {
                                zzic.m(zzguVar2);
                                zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                                zzheVar.b(j11);
                            }
                            zzic.l(zzljVar);
                            zzxVar = zzljVar.f13337q;
                            if (zzxVar.c()) {
                                zzhh zzhhVar6 = zzxVar.f13674a.f13098e;
                                zzic.k(zzhhVar6);
                                zzhhVar6.f13039w.b(null);
                            }
                            if (zzicVar2.h()) {
                                if (zzicVar2.d()) {
                                    if (zzppVar2.K("android.permission.INTERNET")) {
                                        zzic.m(zzguVar2);
                                        zzgsVar6 = zzgsVar5;
                                        zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                                    } else {
                                        zzgsVar6 = zzgsVar5;
                                    }
                                    if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                        zzic.m(zzguVar2);
                                        zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    zzicVar4 = zzicVar2;
                                    context = zzicVar4.f13094a;
                                    if (!Wrappers.a(context).c()) {
                                        if (!zzpp.c0(context)) {
                                            zzic.m(zzguVar2);
                                            zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!zzpp.B(context)) {
                                            zzic.m(zzguVar2);
                                            zzgsVar6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    zzic.m(zzguVar2);
                                    zzgsVar6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    zzicVar4 = zzicVar2;
                                }
                                zzguVar = zzguVar2;
                            } else {
                                zzicVar4 = zzicVar2;
                                if (TextUtils.isEmpty(zzicVar4.r().n())) {
                                    String strN3 = zzicVar4.r().n();
                                    zzhhVar.g();
                                    String string4 = zzhhVar.k().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                                    if (zIsEmpty) {
                                        zzhgVar2 = zzhgVar;
                                    } else {
                                        zzhgVar2 = zzhgVar;
                                    }
                                    String strN4 = zzicVar4.r().n();
                                    zzhhVar.g();
                                    SharedPreferences.Editor editorEdit5 = zzhhVar.k().edit();
                                    editorEdit5.putString("gmp_app_id", strN4);
                                    editorEdit5.apply();
                                } else {
                                    zzhgVar2 = zzhgVar;
                                }
                                if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                    zzhgVar2.b(null);
                                }
                                zzic.l(zzljVar);
                                zzljVar.f13328g.set(zzhgVar2.a());
                                zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                zzguVar = zzguVar2;
                                if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                                    zD = zzicVar4.d();
                                    sharedPreferences = zzhhVar.f13020c;
                                    if (sharedPreferences == null) {
                                        zContains = z12;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        zzhhVar.o(!zD);
                                    }
                                    if (zD) {
                                        zzic.l(zzljVar);
                                        zzljVar.t();
                                    }
                                    zzoc zzocVar3 = zzicVar4.f13101h;
                                    zzic.l(zzocVar3);
                                    zzocVar3.f13538e.a();
                                    zzicVar4.p().k(new AtomicReference());
                                    zzicVar4.p().l(zzhhVar.f13041y.a());
                                }
                            }
                            zzaif.a();
                            if (zzalVar.r(null, zzfy.P0)) {
                                zzppVar2.g();
                                if (zzppVar2.E() == 1) {
                                    z12 = true;
                                }
                                if (z12) {
                                    long jIntValue3 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    zzicVar4.f13104k.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        zzic.m(zzguVar);
                                        zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    zzic.l(zzljVar);
                                    zzljVar.g();
                                    if (zzljVar.f13333l == null) {
                                        zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                                    }
                                    zzljVar.f13333l.b(jMax);
                                }
                            }
                            zzhhVar.f13031o.b(true);
                        }
                        zzgu zzguVar13 = zzicVar.f13099f;
                        zzic.m(zzguVar13);
                        zzguVar13.f12942f.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            }
                        }
                        if (listAsList != null) {
                            zzgiVar3.f12904k = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    zzgiVar3.f12904k = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    zzppVar = zzicVar7.f13102i;
                                    zzic.k(zzppVar);
                                }
                            } while (zzppVar.l0("safelisted event", str3));
                        } else {
                            zzic.m(zzguVar5);
                            zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
                        } else {
                            zzgiVar3.f12906n = 0;
                        }
                        zzgiVar3.f13202a.C.incrementAndGet();
                        zzgiVar3.f12895b = true;
                        zzlqVar = new zzlq(zzicVar5);
                        zzlqVar.i();
                        zzicVar5.f13113u = zzlqVar;
                        if (!zzlqVar.f12895b) {
                            throw new IllegalStateException(str);
                        }
                        zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
                        zzlqVar.f13202a.C.incrementAndGet();
                        zzlqVar.f12895b = true;
                        zzic.m(zzguVar2);
                        zzgsVar = zzguVar2.m;
                        zzgsVar2 = zzguVar2.f12948l;
                        zzgsVar3 = zzguVar2.f12949n;
                        zzgsVar4 = zzguVar2.f12942f;
                        zzalVar.m();
                        zzgsVar2.b(161000L, "App measurement initialized, version");
                        zzic.m(zzguVar2);
                        zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM = zzgiVar.m();
                        if (zzppVar2.M(strM, zzalVar.f12629c)) {
                            zzic.m(zzguVar2);
                            zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            zzic.m(zzguVar2);
                            zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                        }
                        zzic.m(zzguVar2);
                        zzgsVar.a("Debug-level message logging enabled");
                        i12 = zzicVar5.A;
                        atomicInteger = zzicVar5.C;
                        if (i12 != atomicInteger.get()) {
                            zzic.m(zzguVar2);
                            zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        zzicVar5.f13114v = true;
                        j11 = zzicVar5.D;
                        zzljVar = zzicVar5.m;
                        zzhz zzhzVar3 = zzicVar5.f13100g;
                        zzic.m(zzhzVar3);
                        zzhzVar3.g();
                        zzic.j(zzicVar5.f13113u);
                        zzinVarL = zzicVar5.f13113u.l();
                        zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                        zzaif.a();
                        zR = zzalVar.r(null, zzfy.P0);
                        if (zzinVarL == zzinVar) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (zR) {
                            zzppVar2.g();
                            if (zzppVar2.E() == 1) {
                                zzppVar2.g();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z11;
                                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter4, 2);
                                zzgu zzguVar14 = zzicVar6.f13099f;
                                zzic.m(zzguVar14);
                                zzguVar14.m.a(tcppUUQxZjFdy.xpZT);
                                if (z13) {
                                    zzic.j(zzicVar5.f13113u);
                                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                                }
                            } else if (z11) {
                                z11 = true;
                                zzppVar2.g();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z13 = z11;
                                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter5, 2);
                                zzgu zzguVar15 = zzicVar6.f13099f;
                                zzic.m(zzguVar15);
                                zzguVar15.m.a(tcppUUQxZjFdy.xpZT);
                                if (z13) {
                                    zzic.j(zzicVar5.f13113u);
                                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                                }
                            }
                        } else if (z11) {
                            z11 = true;
                            zzppVar2.g();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z11;
                            c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter6, 2);
                            zzgu zzguVar16 = zzicVar6.f13099f;
                            zzic.m(zzguVar16);
                            zzguVar16.m.a(tcppUUQxZjFdy.xpZT);
                            if (z13) {
                                zzic.j(zzicVar5.f13113u);
                                zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                            }
                        }
                        zzhgVar = zzhhVar.f13024g;
                        zzjlVarN = zzhhVar.n();
                        int i16 = zzjlVarN.f13206b;
                        zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
                        zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
                        zzjiVar = zzji.UNINITIALIZED;
                        if (zzjiVarW == zzjiVar) {
                            zzicVar2 = zzicVar5;
                            zzgsVar5 = zzgsVar4;
                            if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(zzjk.class);
                                enumMap3.put(zzjk.AD_STORAGE, zzjiVarW);
                                enumMap3.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                                zzjlVar = new zzjl(enumMap3, -10);
                                z12 = false;
                            } else {
                                if (TextUtils.isEmpty(zzicVar2.r().n())) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                zzjlVar = null;
                            }
                        } else {
                            zzicVar2 = zzicVar5;
                            zzgsVar5 = zzgsVar4;
                            if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(zzjk.class);
                                enumMap4.put(zzjk.AD_STORAGE, zzjiVarW);
                                enumMap4.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                                zzjlVar = new zzjl(enumMap4, -10);
                                z12 = false;
                            } else {
                                if (TextUtils.isEmpty(zzicVar2.r().n())) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                zzjlVar = null;
                            }
                        }
                        if (zzjlVar != null) {
                            zzic.l(zzljVar);
                            zzljVar.I(zzjlVar, true);
                        } else {
                            zzjlVar = zzjlVarN;
                        }
                        zzic.l(zzljVar);
                        zzicVar3 = zzljVar.f13202a;
                        zzljVar.M(zzjlVar);
                        zzhhVar.g();
                        int i17 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
                        zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                        if (zzjiVarW3 != zzjiVar) {
                            zzic.m(zzguVar2);
                            zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
                        }
                        zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
                        if (zzjiVarW4 == zzjiVar) {
                            if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                                zzic.l(zzljVar);
                                zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                            zzic.l(zzljVar);
                            zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolT = zzalVar.t("google_analytics_tcf_data_enabled");
                        if (boolT != null) {
                            zzic.m(zzguVar2);
                            zzgsVar.a("TCF client enabled.");
                            zzic.l(zzljVar);
                            zzljVar.g();
                            zzgu zzguVar17 = zzicVar3.f13099f;
                            zzic.m(zzguVar17);
                            zzguVar17.m.a("Register tcfPrefChangeListener.");
                            if (zzljVar.f13340t == null) {
                                zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                                zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        zzlj zzljVar2 = zzljVar;
                                        zzljVar2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            zzgu zzguVar18 = zzljVar2.f13202a.f13099f;
                                            zzic.m(zzguVar18);
                                            zzguVar18.f12949n.a("IABTCF_TCString change picked up in listener.");
                                            zzkb zzkbVar = zzljVar2.f13341u;
                                            Preconditions.g(zzkbVar);
                                            zzkbVar.b(500L);
                                        }
                                    }
                                };
                            }
                            zzhh zzhhVar7 = zzicVar3.f13098e;
                            zzic.k(zzhhVar7);
                            zzhhVar7.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                            zzic.l(zzljVar);
                            zzljVar.m();
                        } else {
                            zzic.m(zzguVar2);
                            zzgsVar.a("TCF client enabled.");
                            zzic.l(zzljVar);
                            zzljVar.g();
                            zzgu zzguVar18 = zzicVar3.f13099f;
                            zzic.m(zzguVar18);
                            zzguVar18.m.a("Register tcfPrefChangeListener.");
                            if (zzljVar.f13340t == null) {
                                zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                                zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        zzlj zzljVar2 = zzljVar;
                                        zzljVar2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            zzgu zzguVar19 = zzljVar2.f13202a.f13099f;
                                            zzic.m(zzguVar19);
                                            zzguVar19.f12949n.a("IABTCF_TCString change picked up in listener.");
                                            zzkb zzkbVar = zzljVar2.f13341u;
                                            Preconditions.g(zzkbVar);
                                            zzkbVar.b(500L);
                                        }
                                    }
                                };
                            }
                            zzhh zzhhVar8 = zzicVar3.f13098e;
                            zzic.k(zzhhVar8);
                            zzhhVar8.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                            zzic.l(zzljVar);
                            zzljVar.m();
                        }
                        zzheVar = zzhhVar.f13023f;
                        if (zzheVar.a() == 0) {
                            zzic.m(zzguVar2);
                            zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                            zzheVar.b(j11);
                        }
                        zzic.l(zzljVar);
                        zzxVar = zzljVar.f13337q;
                        if (zzxVar.c()) {
                            zzhh zzhhVar9 = zzxVar.f13674a.f13098e;
                            zzic.k(zzhhVar9);
                            zzhhVar9.f13039w.b(null);
                        }
                        if (zzicVar2.h()) {
                            if (zzicVar2.d()) {
                                if (zzppVar2.K("android.permission.INTERNET")) {
                                    zzic.m(zzguVar2);
                                    zzgsVar6 = zzgsVar5;
                                    zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                                } else {
                                    zzgsVar6 = zzgsVar5;
                                }
                                if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                    zzic.m(zzguVar2);
                                    zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                zzicVar4 = zzicVar2;
                                context = zzicVar4.f13094a;
                                if (!Wrappers.a(context).c()) {
                                    if (!zzpp.c0(context)) {
                                        zzic.m(zzguVar2);
                                        zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!zzpp.B(context)) {
                                        zzic.m(zzguVar2);
                                        zzgsVar6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                zzic.m(zzguVar2);
                                zzgsVar6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                zzicVar4 = zzicVar2;
                            }
                            zzguVar = zzguVar2;
                        } else {
                            zzicVar4 = zzicVar2;
                            if (TextUtils.isEmpty(zzicVar4.r().n())) {
                                String strN5 = zzicVar4.r().n();
                                zzhhVar.g();
                                String string5 = zzhhVar.k().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                                if (zIsEmpty) {
                                    zzhgVar2 = zzhgVar;
                                } else {
                                    zzhgVar2 = zzhgVar;
                                }
                                String strN6 = zzicVar4.r().n();
                                zzhhVar.g();
                                SharedPreferences.Editor editorEdit6 = zzhhVar.k().edit();
                                editorEdit6.putString("gmp_app_id", strN6);
                                editorEdit6.apply();
                            } else {
                                zzhgVar2 = zzhgVar;
                            }
                            if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                                zzhgVar2.b(null);
                            }
                            zzic.l(zzljVar);
                            zzljVar.f13328g.set(zzhgVar2.a());
                            zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            zzguVar = zzguVar2;
                            if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                                zD = zzicVar4.d();
                                sharedPreferences = zzhhVar.f13020c;
                                if (sharedPreferences == null) {
                                    zContains = z12;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    zzhhVar.o(!zD);
                                }
                                if (zD) {
                                    zzic.l(zzljVar);
                                    zzljVar.t();
                                }
                                zzoc zzocVar4 = zzicVar4.f13101h;
                                zzic.l(zzocVar4);
                                zzocVar4.f13538e.a();
                                zzicVar4.p().k(new AtomicReference());
                                zzicVar4.p().l(zzhhVar.f13041y.a());
                            }
                        }
                        zzaif.a();
                        if (zzalVar.r(null, zzfy.P0)) {
                            zzppVar2.g();
                            if (zzppVar2.E() == 1) {
                                z12 = true;
                            }
                            if (z12) {
                                long jIntValue4 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                zzicVar4.f13104k.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    zzic.m(zzguVar);
                                    zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                zzic.l(zzljVar);
                                zzljVar.g();
                                if (zzljVar.f13333l == null) {
                                    zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                                }
                                zzljVar.f13333l.b(jMax);
                            }
                        }
                        zzhhVar.f13031o.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i11 = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                zzgiVar3.f12896c = packageName;
                zzgiVar3.f12899f = str8;
                zzgiVar3.f12897d = str2;
                zzgiVar3.f12898e = i11;
                zzgiVar3.f12900g = string;
                zzgiVar3.f12901h = 0L;
                iG = zzicVar7.g();
                if (iG == 0) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12949n.a("App measurement collection enabled");
                } else if (iG == 1) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12947k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a(MzwEyWCkjXL.QJorOcgsYCl);
                    zzic.m(zzguVar5);
                    zzguVar5.f12943g.a("Invalid scion state in identity");
                } else {
                    zzic.m(zzguVar5);
                    zzguVar5.f12948l.a("App measurement disabled due to denied storage consent");
                }
                zzgiVar3.f12907o = BuildConfig.VERSION_NAME;
                strA = zzgiVar3.m;
                if (TextUtils.isEmpty(strA)) {
                    strA = zzlt.a(context2, zzicVar7.f13108p);
                }
                if (!TextUtils.isEmpty(strA)) {
                    str4 = strA;
                }
                zzgiVar3.f12907o = str4;
                if (iG == 0) {
                    zzic.m(zzguVar5);
                    zzguVar5.f12949n.c(zzgiVar3.f12896c, zzgiVar3.f12907o, "App measurement enabled for app package, google app id");
                }
                listAsList = null;
                zzgiVar3.f12904k = null;
                zzal zzalVar3 = zzicVar7.f13097d;
                zzicVar = zzalVar3.f13202a;
                Preconditions.d("analytics.safelisted_events");
                bundleS = zzalVar3.s();
                if (bundleS != null) {
                    if (bundleS.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    }
                    if (listAsList != null) {
                        zzgiVar3.f12904k = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                zzgiVar3.f12904k = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                zzppVar = zzicVar7.f13102i;
                                zzic.k(zzppVar);
                            }
                        } while (zzppVar.l0("safelisted event", str3));
                    } else {
                        zzic.m(zzguVar5);
                        zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
                    } else {
                        zzgiVar3.f12906n = 0;
                    }
                    zzgiVar3.f13202a.C.incrementAndGet();
                    zzgiVar3.f12895b = true;
                    zzlqVar = new zzlq(zzicVar5);
                    zzlqVar.i();
                    zzicVar5.f13113u = zzlqVar;
                    if (!zzlqVar.f12895b) {
                        throw new IllegalStateException(str);
                    }
                    zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
                    zzlqVar.f13202a.C.incrementAndGet();
                    zzlqVar.f12895b = true;
                    zzic.m(zzguVar2);
                    zzgsVar = zzguVar2.m;
                    zzgsVar2 = zzguVar2.f12948l;
                    zzgsVar3 = zzguVar2.f12949n;
                    zzgsVar4 = zzguVar2.f12942f;
                    zzalVar.m();
                    zzgsVar2.b(161000L, "App measurement initialized, version");
                    zzic.m(zzguVar2);
                    zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM = zzgiVar.m();
                    if (zzppVar2.M(strM, zzalVar.f12629c)) {
                        zzic.m(zzguVar2);
                        zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        zzic.m(zzguVar2);
                        zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                    }
                    zzic.m(zzguVar2);
                    zzgsVar.a("Debug-level message logging enabled");
                    i12 = zzicVar5.A;
                    atomicInteger = zzicVar5.C;
                    if (i12 != atomicInteger.get()) {
                        zzic.m(zzguVar2);
                        zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    zzicVar5.f13114v = true;
                    j11 = zzicVar5.D;
                    zzljVar = zzicVar5.m;
                    zzhz zzhzVar4 = zzicVar5.f13100g;
                    zzic.m(zzhzVar4);
                    zzhzVar4.g();
                    zzic.j(zzicVar5.f13113u);
                    zzinVarL = zzicVar5.f13113u.l();
                    zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                    zzaif.a();
                    zR = zzalVar.r(null, zzfy.P0);
                    if (zzinVarL == zzinVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (zR) {
                        zzppVar2.g();
                        if (zzppVar2.E() == 1) {
                            zzppVar2.g();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z11;
                            c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter7, 2);
                            zzgu zzguVar19 = zzicVar6.f13099f;
                            zzic.m(zzguVar19);
                            zzguVar19.m.a(tcppUUQxZjFdy.xpZT);
                            if (z13) {
                                zzic.j(zzicVar5.f13113u);
                                zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                            }
                        } else if (z11) {
                            z11 = true;
                            zzppVar2.g();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z13 = z11;
                            c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter8, 2);
                            zzgu zzguVar110 = zzicVar6.f13099f;
                            zzic.m(zzguVar110);
                            zzguVar110.m.a(tcppUUQxZjFdy.xpZT);
                            if (z13) {
                                zzic.j(zzicVar5.f13113u);
                                zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                            }
                        }
                    } else if (z11) {
                        z11 = true;
                        zzppVar2.g();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z11;
                        c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter9, 2);
                        zzgu zzguVar111 = zzicVar6.f13099f;
                        zzic.m(zzguVar111);
                        zzguVar111.m.a(tcppUUQxZjFdy.xpZT);
                        if (z13) {
                            zzic.j(zzicVar5.f13113u);
                            zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                        }
                    }
                    zzhgVar = zzhhVar.f13024g;
                    zzjlVarN = zzhhVar.n();
                    int i18 = zzjlVarN.f13206b;
                    zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
                    zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
                    zzjiVar = zzji.UNINITIALIZED;
                    if (zzjiVarW == zzjiVar) {
                        zzicVar2 = zzicVar5;
                        zzgsVar5 = zzgsVar4;
                        if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(zzjk.class);
                            enumMap5.put(zzjk.AD_STORAGE, zzjiVarW);
                            enumMap5.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                            zzjlVar = new zzjl(enumMap5, -10);
                            z12 = false;
                        } else {
                            if (TextUtils.isEmpty(zzicVar2.r().n())) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            zzjlVar = null;
                        }
                    } else {
                        zzicVar2 = zzicVar5;
                        zzgsVar5 = zzgsVar4;
                        if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(zzjk.class);
                            enumMap6.put(zzjk.AD_STORAGE, zzjiVarW);
                            enumMap6.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                            zzjlVar = new zzjl(enumMap6, -10);
                            z12 = false;
                        } else {
                            if (TextUtils.isEmpty(zzicVar2.r().n())) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            zzjlVar = null;
                        }
                    }
                    if (zzjlVar != null) {
                        zzic.l(zzljVar);
                        zzljVar.I(zzjlVar, true);
                    } else {
                        zzjlVar = zzjlVarN;
                    }
                    zzic.l(zzljVar);
                    zzicVar3 = zzljVar.f13202a;
                    zzljVar.M(zzjlVar);
                    zzhhVar.g();
                    int i19 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
                    zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                    if (zzjiVarW3 != zzjiVar) {
                        zzic.m(zzguVar2);
                        zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
                    }
                    zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
                    if (zzjiVarW4 == zzjiVar) {
                        if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                            zzic.l(zzljVar);
                            zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                        zzic.l(zzljVar);
                        zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolT = zzalVar.t("google_analytics_tcf_data_enabled");
                    if (boolT != null) {
                        zzic.m(zzguVar2);
                        zzgsVar.a("TCF client enabled.");
                        zzic.l(zzljVar);
                        zzljVar.g();
                        zzgu zzguVar112 = zzicVar3.f13099f;
                        zzic.m(zzguVar112);
                        zzguVar112.m.a("Register tcfPrefChangeListener.");
                        if (zzljVar.f13340t == null) {
                            zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                            zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    zzlj zzljVar2 = zzljVar;
                                    zzljVar2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        zzgu zzguVar113 = zzljVar2.f13202a.f13099f;
                                        zzic.m(zzguVar113);
                                        zzguVar113.f12949n.a("IABTCF_TCString change picked up in listener.");
                                        zzkb zzkbVar = zzljVar2.f13341u;
                                        Preconditions.g(zzkbVar);
                                        zzkbVar.b(500L);
                                    }
                                }
                            };
                        }
                        zzhh zzhhVar10 = zzicVar3.f13098e;
                        zzic.k(zzhhVar10);
                        zzhhVar10.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                        zzic.l(zzljVar);
                        zzljVar.m();
                    } else {
                        zzic.m(zzguVar2);
                        zzgsVar.a("TCF client enabled.");
                        zzic.l(zzljVar);
                        zzljVar.g();
                        zzgu zzguVar113 = zzicVar3.f13099f;
                        zzic.m(zzguVar113);
                        zzguVar113.m.a("Register tcfPrefChangeListener.");
                        if (zzljVar.f13340t == null) {
                            zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                            zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    zzlj zzljVar2 = zzljVar;
                                    zzljVar2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        zzgu zzguVar114 = zzljVar2.f13202a.f13099f;
                                        zzic.m(zzguVar114);
                                        zzguVar114.f12949n.a("IABTCF_TCString change picked up in listener.");
                                        zzkb zzkbVar = zzljVar2.f13341u;
                                        Preconditions.g(zzkbVar);
                                        zzkbVar.b(500L);
                                    }
                                }
                            };
                        }
                        zzhh zzhhVar11 = zzicVar3.f13098e;
                        zzic.k(zzhhVar11);
                        zzhhVar11.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                        zzic.l(zzljVar);
                        zzljVar.m();
                    }
                    zzheVar = zzhhVar.f13023f;
                    if (zzheVar.a() == 0) {
                        zzic.m(zzguVar2);
                        zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                        zzheVar.b(j11);
                    }
                    zzic.l(zzljVar);
                    zzxVar = zzljVar.f13337q;
                    if (zzxVar.c()) {
                        zzhh zzhhVar12 = zzxVar.f13674a.f13098e;
                        zzic.k(zzhhVar12);
                        zzhhVar12.f13039w.b(null);
                    }
                    if (zzicVar2.h()) {
                        if (zzicVar2.d()) {
                            if (zzppVar2.K("android.permission.INTERNET")) {
                                zzic.m(zzguVar2);
                                zzgsVar6 = zzgsVar5;
                                zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                            } else {
                                zzgsVar6 = zzgsVar5;
                            }
                            if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                zzic.m(zzguVar2);
                                zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            zzicVar4 = zzicVar2;
                            context = zzicVar4.f13094a;
                            if (!Wrappers.a(context).c()) {
                                if (!zzpp.c0(context)) {
                                    zzic.m(zzguVar2);
                                    zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!zzpp.B(context)) {
                                    zzic.m(zzguVar2);
                                    zzgsVar6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            zzic.m(zzguVar2);
                            zzgsVar6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            zzicVar4 = zzicVar2;
                        }
                        zzguVar = zzguVar2;
                    } else {
                        zzicVar4 = zzicVar2;
                        if (TextUtils.isEmpty(zzicVar4.r().n())) {
                            String strN7 = zzicVar4.r().n();
                            zzhhVar.g();
                            String string6 = zzhhVar.k().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                            if (zIsEmpty) {
                                zzhgVar2 = zzhgVar;
                            } else {
                                zzhgVar2 = zzhgVar;
                            }
                            String strN8 = zzicVar4.r().n();
                            zzhhVar.g();
                            SharedPreferences.Editor editorEdit7 = zzhhVar.k().edit();
                            editorEdit7.putString("gmp_app_id", strN8);
                            editorEdit7.apply();
                        } else {
                            zzhgVar2 = zzhgVar;
                        }
                        if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                            zzhgVar2.b(null);
                        }
                        zzic.l(zzljVar);
                        zzljVar.f13328g.set(zzhgVar2.a());
                        zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        zzguVar = zzguVar2;
                        if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                            zD = zzicVar4.d();
                            sharedPreferences = zzhhVar.f13020c;
                            if (sharedPreferences == null) {
                                zContains = z12;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                zzhhVar.o(!zD);
                            }
                            if (zD) {
                                zzic.l(zzljVar);
                                zzljVar.t();
                            }
                            zzoc zzocVar5 = zzicVar4.f13101h;
                            zzic.l(zzocVar5);
                            zzocVar5.f13538e.a();
                            zzicVar4.p().k(new AtomicReference());
                            zzicVar4.p().l(zzhhVar.f13041y.a());
                        }
                    }
                    zzaif.a();
                    if (zzalVar.r(null, zzfy.P0)) {
                        zzppVar2.g();
                        if (zzppVar2.E() == 1) {
                            z12 = true;
                        }
                        if (z12) {
                            long jIntValue5 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            zzicVar4.f13104k.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                zzic.m(zzguVar);
                                zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            zzic.l(zzljVar);
                            zzljVar.g();
                            if (zzljVar.f13333l == null) {
                                zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                            }
                            zzljVar.f13333l.b(jMax);
                        }
                    }
                    zzhhVar.f13031o.b(true);
                }
                zzgu zzguVar114 = zzicVar.f13099f;
                zzic.m(zzguVar114);
                zzguVar114.f12942f.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                }
                if (listAsList != null) {
                    zzgiVar3.f12904k = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            zzgiVar3.f12904k = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            zzppVar = zzicVar7.f13102i;
                            zzic.k(zzppVar);
                        }
                    } while (zzppVar.l0("safelisted event", str3));
                } else {
                    zzic.m(zzguVar5);
                    zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
                } else {
                    zzgiVar3.f12906n = 0;
                }
                zzgiVar3.f13202a.C.incrementAndGet();
                zzgiVar3.f12895b = true;
                zzlqVar = new zzlq(zzicVar5);
                zzlqVar.i();
                zzicVar5.f13113u = zzlqVar;
                if (!zzlqVar.f12895b) {
                    throw new IllegalStateException(str);
                }
                zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
                zzlqVar.f13202a.C.incrementAndGet();
                zzlqVar.f12895b = true;
                zzic.m(zzguVar2);
                zzgsVar = zzguVar2.m;
                zzgsVar2 = zzguVar2.f12948l;
                zzgsVar3 = zzguVar2.f12949n;
                zzgsVar4 = zzguVar2.f12942f;
                zzalVar.m();
                zzgsVar2.b(161000L, "App measurement initialized, version");
                zzic.m(zzguVar2);
                zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM = zzgiVar.m();
                if (zzppVar2.M(strM, zzalVar.f12629c)) {
                    zzic.m(zzguVar2);
                    zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    zzic.m(zzguVar2);
                    zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                }
                zzic.m(zzguVar2);
                zzgsVar.a("Debug-level message logging enabled");
                i12 = zzicVar5.A;
                atomicInteger = zzicVar5.C;
                if (i12 != atomicInteger.get()) {
                    zzic.m(zzguVar2);
                    zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                zzicVar5.f13114v = true;
                j11 = zzicVar5.D;
                zzljVar = zzicVar5.m;
                zzhz zzhzVar5 = zzicVar5.f13100g;
                zzic.m(zzhzVar5);
                zzhzVar5.g();
                zzic.j(zzicVar5.f13113u);
                zzinVarL = zzicVar5.f13113u.l();
                zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                zzaif.a();
                zR = zzalVar.r(null, zzfy.P0);
                if (zzinVarL == zzinVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (zR) {
                    zzppVar2.g();
                    if (zzppVar2.E() == 1) {
                        zzppVar2.g();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z11;
                        c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter10, 2);
                        zzgu zzguVar115 = zzicVar6.f13099f;
                        zzic.m(zzguVar115);
                        zzguVar115.m.a(tcppUUQxZjFdy.xpZT);
                        if (z13) {
                            zzic.j(zzicVar5.f13113u);
                            zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                        }
                    } else if (z11) {
                        z11 = true;
                        zzppVar2.g();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z13 = z11;
                        c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter11, 2);
                        zzgu zzguVar116 = zzicVar6.f13099f;
                        zzic.m(zzguVar116);
                        zzguVar116.m.a(tcppUUQxZjFdy.xpZT);
                        if (z13) {
                            zzic.j(zzicVar5.f13113u);
                            zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                        }
                    }
                } else if (z11) {
                    z11 = true;
                    zzppVar2.g();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z13 = z11;
                    c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter12, 2);
                    zzgu zzguVar117 = zzicVar6.f13099f;
                    zzic.m(zzguVar117);
                    zzguVar117.m.a(tcppUUQxZjFdy.xpZT);
                    if (z13) {
                        zzic.j(zzicVar5.f13113u);
                        zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                    }
                }
                zzhgVar = zzhhVar.f13024g;
                zzjlVarN = zzhhVar.n();
                int i110 = zzjlVarN.f13206b;
                zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
                zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
                zzjiVar = zzji.UNINITIALIZED;
                if (zzjiVarW == zzjiVar) {
                    zzicVar2 = zzicVar5;
                    zzgsVar5 = zzgsVar4;
                    if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(zzjk.class);
                        enumMap7.put(zzjk.AD_STORAGE, zzjiVarW);
                        enumMap7.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                        zzjlVar = new zzjl(enumMap7, -10);
                        z12 = false;
                    } else {
                        if (TextUtils.isEmpty(zzicVar2.r().n())) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        zzjlVar = null;
                    }
                } else {
                    zzicVar2 = zzicVar5;
                    zzgsVar5 = zzgsVar4;
                    if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(zzjk.class);
                        enumMap8.put(zzjk.AD_STORAGE, zzjiVarW);
                        enumMap8.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                        zzjlVar = new zzjl(enumMap8, -10);
                        z12 = false;
                    } else {
                        if (TextUtils.isEmpty(zzicVar2.r().n())) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        zzjlVar = null;
                    }
                }
                if (zzjlVar != null) {
                    zzic.l(zzljVar);
                    zzljVar.I(zzjlVar, true);
                } else {
                    zzjlVar = zzjlVarN;
                }
                zzic.l(zzljVar);
                zzicVar3 = zzljVar.f13202a;
                zzljVar.M(zzjlVar);
                zzhhVar.g();
                int i111 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
                zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                if (zzjiVarW3 != zzjiVar) {
                    zzic.m(zzguVar2);
                    zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
                }
                zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
                if (zzjiVarW4 == zzjiVar) {
                    if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                        zzic.l(zzljVar);
                        zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                    zzic.l(zzljVar);
                    zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolT = zzalVar.t("google_analytics_tcf_data_enabled");
                if (boolT != null) {
                    zzic.m(zzguVar2);
                    zzgsVar.a("TCF client enabled.");
                    zzic.l(zzljVar);
                    zzljVar.g();
                    zzgu zzguVar118 = zzicVar3.f13099f;
                    zzic.m(zzguVar118);
                    zzguVar118.m.a("Register tcfPrefChangeListener.");
                    if (zzljVar.f13340t == null) {
                        zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                        zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                zzlj zzljVar2 = zzljVar;
                                zzljVar2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    zzgu zzguVar119 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar119);
                                    zzguVar119.f12949n.a("IABTCF_TCString change picked up in listener.");
                                    zzkb zzkbVar = zzljVar2.f13341u;
                                    Preconditions.g(zzkbVar);
                                    zzkbVar.b(500L);
                                }
                            }
                        };
                    }
                    zzhh zzhhVar13 = zzicVar3.f13098e;
                    zzic.k(zzhhVar13);
                    zzhhVar13.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                    zzic.l(zzljVar);
                    zzljVar.m();
                } else {
                    zzic.m(zzguVar2);
                    zzgsVar.a("TCF client enabled.");
                    zzic.l(zzljVar);
                    zzljVar.g();
                    zzgu zzguVar119 = zzicVar3.f13099f;
                    zzic.m(zzguVar119);
                    zzguVar119.m.a("Register tcfPrefChangeListener.");
                    if (zzljVar.f13340t == null) {
                        zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                        zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                zzlj zzljVar2 = zzljVar;
                                zzljVar2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    zzgu zzguVar1110 = zzljVar2.f13202a.f13099f;
                                    zzic.m(zzguVar1110);
                                    zzguVar1110.f12949n.a("IABTCF_TCString change picked up in listener.");
                                    zzkb zzkbVar = zzljVar2.f13341u;
                                    Preconditions.g(zzkbVar);
                                    zzkbVar.b(500L);
                                }
                            }
                        };
                    }
                    zzhh zzhhVar14 = zzicVar3.f13098e;
                    zzic.k(zzhhVar14);
                    zzhhVar14.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                    zzic.l(zzljVar);
                    zzljVar.m();
                }
                zzheVar = zzhhVar.f13023f;
                if (zzheVar.a() == 0) {
                    zzic.m(zzguVar2);
                    zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                    zzheVar.b(j11);
                }
                zzic.l(zzljVar);
                zzxVar = zzljVar.f13337q;
                if (zzxVar.c()) {
                    zzhh zzhhVar15 = zzxVar.f13674a.f13098e;
                    zzic.k(zzhhVar15);
                    zzhhVar15.f13039w.b(null);
                }
                if (zzicVar2.h()) {
                    if (zzicVar2.d()) {
                        if (zzppVar2.K("android.permission.INTERNET")) {
                            zzic.m(zzguVar2);
                            zzgsVar6 = zzgsVar5;
                            zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                        } else {
                            zzgsVar6 = zzgsVar5;
                        }
                        if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                            zzic.m(zzguVar2);
                            zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        zzicVar4 = zzicVar2;
                        context = zzicVar4.f13094a;
                        if (!Wrappers.a(context).c()) {
                            if (!zzpp.c0(context)) {
                                zzic.m(zzguVar2);
                                zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!zzpp.B(context)) {
                                zzic.m(zzguVar2);
                                zzgsVar6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        zzic.m(zzguVar2);
                        zzgsVar6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        zzicVar4 = zzicVar2;
                    }
                    zzguVar = zzguVar2;
                } else {
                    zzicVar4 = zzicVar2;
                    if (TextUtils.isEmpty(zzicVar4.r().n())) {
                        String strN9 = zzicVar4.r().n();
                        zzhhVar.g();
                        String string7 = zzhhVar.k().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                        if (zIsEmpty) {
                            zzhgVar2 = zzhgVar;
                        } else {
                            zzhgVar2 = zzhgVar;
                        }
                        String strN10 = zzicVar4.r().n();
                        zzhhVar.g();
                        SharedPreferences.Editor editorEdit8 = zzhhVar.k().edit();
                        editorEdit8.putString("gmp_app_id", strN10);
                        editorEdit8.apply();
                    } else {
                        zzhgVar2 = zzhgVar;
                    }
                    if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                        zzhgVar2.b(null);
                    }
                    zzic.l(zzljVar);
                    zzljVar.f13328g.set(zzhgVar2.a());
                    zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    zzguVar = zzguVar2;
                    if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                        zD = zzicVar4.d();
                        sharedPreferences = zzhhVar.f13020c;
                        if (sharedPreferences == null) {
                            zContains = z12;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            zzhhVar.o(!zD);
                        }
                        if (zD) {
                            zzic.l(zzljVar);
                            zzljVar.t();
                        }
                        zzoc zzocVar6 = zzicVar4.f13101h;
                        zzic.l(zzocVar6);
                        zzocVar6.f13538e.a();
                        zzicVar4.p().k(new AtomicReference());
                        zzicVar4.p().l(zzhhVar.f13041y.a());
                    }
                }
                zzaif.a();
                if (zzalVar.r(null, zzfy.P0)) {
                    zzppVar2.g();
                    if (zzppVar2.E() == 1) {
                        z12 = true;
                    }
                    if (z12) {
                        long jIntValue6 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        zzicVar4.f13104k.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            zzic.m(zzguVar);
                            zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        zzic.l(zzljVar);
                        zzljVar.g();
                        if (zzljVar.f13333l == null) {
                            zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                        }
                        zzljVar.f13333l.b(jMax);
                    }
                }
                zzhhVar.f13031o.b(true);
            }
            zzic.m(zzguVar5);
            zzgiVar = zzgiVar2;
            str = "Can't initialize twice";
            zzguVar5.f12942f.b(zzgu.o(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strA = zzgiVar3.m;
            if (TextUtils.isEmpty(strA)) {
                strA = zzlt.a(context2, zzicVar7.f13108p);
            }
            if (!TextUtils.isEmpty(strA)) {
                str4 = strA;
            }
            zzgiVar3.f12907o = str4;
            if (iG == 0) {
                zzic.m(zzguVar5);
                zzguVar5.f12949n.c(zzgiVar3.f12896c, zzgiVar3.f12907o, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e10) {
            zzic.m(zzguVar5);
            zzguVar5.f12942f.c(zzgu.o(packageName), e10, "Fetching Google App Id failed with exception. appId");
        }
        i11 = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        zzgiVar3.f12896c = packageName;
        zzgiVar3.f12899f = str9;
        zzgiVar3.f12897d = str2;
        zzgiVar3.f12898e = i11;
        zzgiVar3.f12900g = string;
        zzgiVar3.f12901h = 0L;
        iG = zzicVar7.g();
        if (iG == 0) {
            zzic.m(zzguVar5);
            zzguVar5.f12949n.a("App measurement collection enabled");
        } else if (iG == 1) {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            zzic.m(zzguVar5);
            zzguVar5.f12947k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a(MzwEyWCkjXL.QJorOcgsYCl);
            zzic.m(zzguVar5);
            zzguVar5.f12943g.a("Invalid scion state in identity");
        } else {
            zzic.m(zzguVar5);
            zzguVar5.f12948l.a("App measurement disabled due to denied storage consent");
        }
        zzgiVar3.f12907o = BuildConfig.VERSION_NAME;
        listAsList = null;
        zzgiVar3.f12904k = null;
        zzal zzalVar4 = zzicVar7.f13097d;
        zzicVar = zzalVar4.f13202a;
        Preconditions.d("analytics.safelisted_events");
        bundleS = zzalVar4.s();
        if (bundleS != null) {
            if (bundleS.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = Arrays.asList(stringArray);
                }
            }
            if (listAsList != null) {
                zzgiVar3.f12904k = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        zzgiVar3.f12904k = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        zzppVar = zzicVar7.f13102i;
                        zzic.k(zzppVar);
                    }
                } while (zzppVar.l0("safelisted event", str3));
            } else {
                zzic.m(zzguVar5);
                zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
            } else {
                zzgiVar3.f12906n = 0;
            }
            zzgiVar3.f13202a.C.incrementAndGet();
            zzgiVar3.f12895b = true;
            zzlqVar = new zzlq(zzicVar5);
            zzlqVar.i();
            zzicVar5.f13113u = zzlqVar;
            if (!zzlqVar.f12895b) {
                throw new IllegalStateException(str);
            }
            zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
            zzlqVar.f13202a.C.incrementAndGet();
            zzlqVar.f12895b = true;
            zzic.m(zzguVar2);
            zzgsVar = zzguVar2.m;
            zzgsVar2 = zzguVar2.f12948l;
            zzgsVar3 = zzguVar2.f12949n;
            zzgsVar4 = zzguVar2.f12942f;
            zzalVar.m();
            zzgsVar2.b(161000L, "App measurement initialized, version");
            zzic.m(zzguVar2);
            zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM = zzgiVar.m();
            if (zzppVar2.M(strM, zzalVar.f12629c)) {
                zzic.m(zzguVar2);
                zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzic.m(zzguVar2);
                zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
            }
            zzic.m(zzguVar2);
            zzgsVar.a("Debug-level message logging enabled");
            i12 = zzicVar5.A;
            atomicInteger = zzicVar5.C;
            if (i12 != atomicInteger.get()) {
                zzic.m(zzguVar2);
                zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            zzicVar5.f13114v = true;
            j11 = zzicVar5.D;
            zzljVar = zzicVar5.m;
            zzhz zzhzVar6 = zzicVar5.f13100g;
            zzic.m(zzhzVar6);
            zzhzVar6.g();
            zzic.j(zzicVar5.f13113u);
            zzinVarL = zzicVar5.f13113u.l();
            zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
            zzaif.a();
            zR = zzalVar.r(null, zzfy.P0);
            if (zzinVarL == zzinVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (zR) {
                zzppVar2.g();
                if (zzppVar2.E() == 1) {
                    zzppVar2.g();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z13 = z11;
                    c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter13, 2);
                    zzgu zzguVar1110 = zzicVar6.f13099f;
                    zzic.m(zzguVar1110);
                    zzguVar1110.m.a(tcppUUQxZjFdy.xpZT);
                    if (z13) {
                        zzic.j(zzicVar5.f13113u);
                        zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                    }
                } else if (z11) {
                    z11 = true;
                    zzppVar2.g();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z13 = z11;
                    c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter14, 2);
                    zzgu zzguVar1111 = zzicVar6.f13099f;
                    zzic.m(zzguVar1111);
                    zzguVar1111.m.a(tcppUUQxZjFdy.xpZT);
                    if (z13) {
                        zzic.j(zzicVar5.f13113u);
                        zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                    }
                }
            } else if (z11) {
                z11 = true;
                zzppVar2.g();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z13 = z11;
                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter15, 2);
                zzgu zzguVar1112 = zzicVar6.f13099f;
                zzic.m(zzguVar1112);
                zzguVar1112.m.a(tcppUUQxZjFdy.xpZT);
                if (z13) {
                    zzic.j(zzicVar5.f13113u);
                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                }
            }
            zzhgVar = zzhhVar.f13024g;
            zzjlVarN = zzhhVar.n();
            int i112 = zzjlVarN.f13206b;
            zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
            zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
            zzjiVar = zzji.UNINITIALIZED;
            if (zzjiVarW == zzjiVar) {
                zzicVar2 = zzicVar5;
                zzgsVar5 = zzgsVar4;
                if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(zzjk.class);
                    enumMap9.put(zzjk.AD_STORAGE, zzjiVarW);
                    enumMap9.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                    zzjlVar = new zzjl(enumMap9, -10);
                    z12 = false;
                } else {
                    if (TextUtils.isEmpty(zzicVar2.r().n())) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    zzjlVar = null;
                }
            } else {
                zzicVar2 = zzicVar5;
                zzgsVar5 = zzgsVar4;
                if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(zzjk.class);
                    enumMap10.put(zzjk.AD_STORAGE, zzjiVarW);
                    enumMap10.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                    zzjlVar = new zzjl(enumMap10, -10);
                    z12 = false;
                } else {
                    if (TextUtils.isEmpty(zzicVar2.r().n())) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    zzjlVar = null;
                }
            }
            if (zzjlVar != null) {
                zzic.l(zzljVar);
                zzljVar.I(zzjlVar, true);
            } else {
                zzjlVar = zzjlVarN;
            }
            zzic.l(zzljVar);
            zzicVar3 = zzljVar.f13202a;
            zzljVar.M(zzjlVar);
            zzhhVar.g();
            int i113 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
            zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
            if (zzjiVarW3 != zzjiVar) {
                zzic.m(zzguVar2);
                zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
            }
            zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
            if (zzjiVarW4 == zzjiVar) {
                if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                    zzic.l(zzljVar);
                    zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                zzic.l(zzljVar);
                zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolT = zzalVar.t("google_analytics_tcf_data_enabled");
            if (boolT != null) {
                zzic.m(zzguVar2);
                zzgsVar.a("TCF client enabled.");
                zzic.l(zzljVar);
                zzljVar.g();
                zzgu zzguVar1113 = zzicVar3.f13099f;
                zzic.m(zzguVar1113);
                zzguVar1113.m.a("Register tcfPrefChangeListener.");
                if (zzljVar.f13340t == null) {
                    zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                    zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            zzlj zzljVar2 = zzljVar;
                            zzljVar2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                zzgu zzguVar1114 = zzljVar2.f13202a.f13099f;
                                zzic.m(zzguVar1114);
                                zzguVar1114.f12949n.a("IABTCF_TCString change picked up in listener.");
                                zzkb zzkbVar = zzljVar2.f13341u;
                                Preconditions.g(zzkbVar);
                                zzkbVar.b(500L);
                            }
                        }
                    };
                }
                zzhh zzhhVar16 = zzicVar3.f13098e;
                zzic.k(zzhhVar16);
                zzhhVar16.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                zzic.l(zzljVar);
                zzljVar.m();
            } else {
                zzic.m(zzguVar2);
                zzgsVar.a("TCF client enabled.");
                zzic.l(zzljVar);
                zzljVar.g();
                zzgu zzguVar1114 = zzicVar3.f13099f;
                zzic.m(zzguVar1114);
                zzguVar1114.m.a("Register tcfPrefChangeListener.");
                if (zzljVar.f13340t == null) {
                    zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                    zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            zzlj zzljVar2 = zzljVar;
                            zzljVar2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                zzgu zzguVar1115 = zzljVar2.f13202a.f13099f;
                                zzic.m(zzguVar1115);
                                zzguVar1115.f12949n.a("IABTCF_TCString change picked up in listener.");
                                zzkb zzkbVar = zzljVar2.f13341u;
                                Preconditions.g(zzkbVar);
                                zzkbVar.b(500L);
                            }
                        }
                    };
                }
                zzhh zzhhVar17 = zzicVar3.f13098e;
                zzic.k(zzhhVar17);
                zzhhVar17.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
                zzic.l(zzljVar);
                zzljVar.m();
            }
            zzheVar = zzhhVar.f13023f;
            if (zzheVar.a() == 0) {
                zzic.m(zzguVar2);
                zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
                zzheVar.b(j11);
            }
            zzic.l(zzljVar);
            zzxVar = zzljVar.f13337q;
            if (zzxVar.c()) {
                zzhh zzhhVar18 = zzxVar.f13674a.f13098e;
                zzic.k(zzhhVar18);
                zzhhVar18.f13039w.b(null);
            }
            if (zzicVar2.h()) {
                if (zzicVar2.d()) {
                    if (zzppVar2.K("android.permission.INTERNET")) {
                        zzic.m(zzguVar2);
                        zzgsVar6 = zzgsVar5;
                        zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                    } else {
                        zzgsVar6 = zzgsVar5;
                    }
                    if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                        zzic.m(zzguVar2);
                        zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    zzicVar4 = zzicVar2;
                    context = zzicVar4.f13094a;
                    if (!Wrappers.a(context).c()) {
                        if (!zzpp.c0(context)) {
                            zzic.m(zzguVar2);
                            zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!zzpp.B(context)) {
                            zzic.m(zzguVar2);
                            zzgsVar6.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    zzic.m(zzguVar2);
                    zzgsVar6.a("Uploading is not possible. App measurement disabled");
                } else {
                    zzicVar4 = zzicVar2;
                }
                zzguVar = zzguVar2;
            } else {
                zzicVar4 = zzicVar2;
                if (TextUtils.isEmpty(zzicVar4.r().n())) {
                    String strN11 = zzicVar4.r().n();
                    zzhhVar.g();
                    String string8 = zzhhVar.k().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strN11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string8);
                    if (zIsEmpty) {
                        zzhgVar2 = zzhgVar;
                    } else {
                        zzhgVar2 = zzhgVar;
                    }
                    String strN12 = zzicVar4.r().n();
                    zzhhVar.g();
                    SharedPreferences.Editor editorEdit9 = zzhhVar.k().edit();
                    editorEdit9.putString("gmp_app_id", strN12);
                    editorEdit9.apply();
                } else {
                    zzhgVar2 = zzhgVar;
                }
                if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                    zzhgVar2.b(null);
                }
                zzic.l(zzljVar);
                zzljVar.f13328g.set(zzhgVar2.a());
                zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                zzguVar = zzguVar2;
                if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                    zD = zzicVar4.d();
                    sharedPreferences = zzhhVar.f13020c;
                    if (sharedPreferences == null) {
                        zContains = z12;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        zzhhVar.o(!zD);
                    }
                    if (zD) {
                        zzic.l(zzljVar);
                        zzljVar.t();
                    }
                    zzoc zzocVar7 = zzicVar4.f13101h;
                    zzic.l(zzocVar7);
                    zzocVar7.f13538e.a();
                    zzicVar4.p().k(new AtomicReference());
                    zzicVar4.p().l(zzhhVar.f13041y.a());
                }
            }
            zzaif.a();
            if (zzalVar.r(null, zzfy.P0)) {
                zzppVar2.g();
                if (zzppVar2.E() == 1) {
                    z12 = true;
                }
                if (z12) {
                    long jIntValue7 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    zzicVar4.f13104k.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        zzic.m(zzguVar);
                        zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    zzic.l(zzljVar);
                    zzljVar.g();
                    if (zzljVar.f13333l == null) {
                        zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                    }
                    zzljVar.f13333l.b(jMax);
                }
            }
            zzhhVar.f13031o.b(true);
        }
        zzgu zzguVar1115 = zzicVar.f13099f;
        zzic.m(zzguVar1115);
        zzguVar1115.f12942f.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = zzicVar.f13094a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            zzgiVar3.f12904k = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    zzgiVar3.f12904k = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    zzppVar = zzicVar7.f13102i;
                    zzic.k(zzppVar);
                }
            } while (zzppVar.l0("safelisted event", str3));
        } else {
            zzic.m(zzguVar5);
            zzguVar5.f12947k.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            zzgiVar3.f12906n = InstantApps.a(context2) ? 1 : 0;
        } else {
            zzgiVar3.f12906n = 0;
        }
        zzgiVar3.f13202a.C.incrementAndGet();
        zzgiVar3.f12895b = true;
        zzlqVar = new zzlq(zzicVar5);
        zzlqVar.i();
        zzicVar5.f13113u = zzlqVar;
        if (!zzlqVar.f12895b) {
            throw new IllegalStateException(str);
        }
        zzlqVar.f13354c = (JobScheduler) zzlqVar.f13202a.f13094a.getSystemService("jobscheduler");
        zzlqVar.f13202a.C.incrementAndGet();
        zzlqVar.f12895b = true;
        zzic.m(zzguVar2);
        zzgsVar = zzguVar2.m;
        zzgsVar2 = zzguVar2.f12948l;
        zzgsVar3 = zzguVar2.f12949n;
        zzgsVar4 = zzguVar2.f12942f;
        zzalVar.m();
        zzgsVar2.b(161000L, "App measurement initialized, version");
        zzic.m(zzguVar2);
        zzgsVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM = zzgiVar.m();
        if (zzppVar2.M(strM, zzalVar.f12629c)) {
            zzic.m(zzguVar2);
            zzgsVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            zzic.m(zzguVar2);
            zzgsVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
        }
        zzic.m(zzguVar2);
        zzgsVar.a("Debug-level message logging enabled");
        i12 = zzicVar5.A;
        atomicInteger = zzicVar5.C;
        if (i12 != atomicInteger.get()) {
            zzic.m(zzguVar2);
            zzgsVar4.c(Integer.valueOf(zzicVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        zzicVar5.f13114v = true;
        j11 = zzicVar5.D;
        zzljVar = zzicVar5.m;
        zzhz zzhzVar7 = zzicVar5.f13100g;
        zzic.m(zzhzVar7);
        zzhzVar7.g();
        zzic.j(zzicVar5.f13113u);
        zzinVarL = zzicVar5.f13113u.l();
        zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
        zzaif.a();
        zR = zzalVar.r(null, zzfy.P0);
        if (zzinVarL == zzinVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zR) {
            zzppVar2.g();
            if (zzppVar2.E() == 1) {
                zzppVar2.g();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z13 = z11;
                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter16, 2);
                zzgu zzguVar1116 = zzicVar6.f13099f;
                zzic.m(zzguVar1116);
                zzguVar1116.m.a(tcppUUQxZjFdy.xpZT);
                if (z13) {
                    zzic.j(zzicVar5.f13113u);
                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                }
            } else if (z11) {
                z11 = true;
                zzppVar2.g();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z13 = z11;
                c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter17, 2);
                zzgu zzguVar1117 = zzicVar6.f13099f;
                zzic.m(zzguVar1117);
                zzguVar1117.m.a(tcppUUQxZjFdy.xpZT);
                if (z13) {
                    zzic.j(zzicVar5.f13113u);
                    zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
                }
            }
        } else if (z11) {
            z11 = true;
            zzppVar2.g();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z13 = z11;
            c.d(zzicVar6.f13094a, new zzw(zzicVar6), intentFilter18, 2);
            zzgu zzguVar1118 = zzicVar6.f13099f;
            zzic.m(zzguVar1118);
            zzguVar1118.m.a(tcppUUQxZjFdy.xpZT);
            if (z13) {
                zzic.j(zzicVar5.f13113u);
                zzicVar5.f13113u.k(((Long) zzfy.C.a(null)).longValue());
            }
        }
        zzhgVar = zzhhVar.f13024g;
        zzjlVarN = zzhhVar.n();
        int i114 = zzjlVarN.f13206b;
        zzjiVarW = zzalVar.w("google_analytics_default_allow_ad_storage", false);
        zzjiVarW2 = zzalVar.w("google_analytics_default_allow_analytics_storage", false);
        zzjiVar = zzji.UNINITIALIZED;
        if (zzjiVarW == zzjiVar) {
            zzicVar2 = zzicVar5;
            zzgsVar5 = zzgsVar4;
            if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(zzjk.class);
                enumMap11.put(zzjk.AD_STORAGE, zzjiVarW);
                enumMap11.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                zzjlVar = new zzjl(enumMap11, -10);
                z12 = false;
            } else {
                if (TextUtils.isEmpty(zzicVar2.r().n())) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzjlVar = null;
            }
        } else {
            zzicVar2 = zzicVar5;
            zzgsVar5 = zzgsVar4;
            if (zzjl.l(-10, zzhhVar.k().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(zzjk.class);
                enumMap12.put(zzjk.AD_STORAGE, zzjiVarW);
                enumMap12.put(zzjk.ANALYTICS_STORAGE, zzjiVarW2);
                zzjlVar = new zzjl(enumMap12, -10);
                z12 = false;
            } else {
                if (TextUtils.isEmpty(zzicVar2.r().n())) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzjlVar = null;
            }
        }
        if (zzjlVar != null) {
            zzic.l(zzljVar);
            zzljVar.I(zzjlVar, true);
        } else {
            zzjlVar = zzjlVarN;
        }
        zzic.l(zzljVar);
        zzicVar3 = zzljVar.f13202a;
        zzljVar.M(zzjlVar);
        zzhhVar.g();
        int i115 = zzba.b(zzhhVar.k().getString("dma_consent_settings", null)).f12675a;
        zzjiVarW3 = zzalVar.w("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzjiVarW3 != zzjiVar) {
            zzic.m(zzguVar2);
            zzgsVar3.b(zzjiVarW3, "Default ad personalization consent from Manifest");
        }
        zzjiVarW4 = zzalVar.w("google_analytics_default_allow_ad_user_data", true);
        if (zzjiVarW4 == zzjiVar) {
            if (!TextUtils.isEmpty(zzicVar2.r().n())) {
                zzic.l(zzljVar);
                zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(zzicVar2.r().n())) {
            zzic.l(zzljVar);
            zzljVar.H(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolT = zzalVar.t("google_analytics_tcf_data_enabled");
        if (boolT != null) {
            zzic.m(zzguVar2);
            zzgsVar.a("TCF client enabled.");
            zzic.l(zzljVar);
            zzljVar.g();
            zzgu zzguVar1119 = zzicVar3.f13099f;
            zzic.m(zzguVar1119);
            zzguVar1119.m.a("Register tcfPrefChangeListener.");
            if (zzljVar.f13340t == null) {
                zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        zzlj zzljVar2 = zzljVar;
                        zzljVar2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            zzgu zzguVar11110 = zzljVar2.f13202a.f13099f;
                            zzic.m(zzguVar11110);
                            zzguVar11110.f12949n.a("IABTCF_TCString change picked up in listener.");
                            zzkb zzkbVar = zzljVar2.f13341u;
                            Preconditions.g(zzkbVar);
                            zzkbVar.b(500L);
                        }
                    }
                };
            }
            zzhh zzhhVar19 = zzicVar3.f13098e;
            zzic.k(zzhhVar19);
            zzhhVar19.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
            zzic.l(zzljVar);
            zzljVar.m();
        } else {
            zzic.m(zzguVar2);
            zzgsVar.a("TCF client enabled.");
            zzic.l(zzljVar);
            zzljVar.g();
            zzgu zzguVar11110 = zzicVar3.f13099f;
            zzic.m(zzguVar11110);
            zzguVar11110.m.a("Register tcfPrefChangeListener.");
            if (zzljVar.f13340t == null) {
                zzljVar.f13341u = new zzkb(zzljVar, zzicVar3);
                zzljVar.f13340t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        zzlj zzljVar2 = zzljVar;
                        zzljVar2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            zzgu zzguVar11111 = zzljVar2.f13202a.f13099f;
                            zzic.m(zzguVar11111);
                            zzguVar11111.f12949n.a("IABTCF_TCString change picked up in listener.");
                            zzkb zzkbVar = zzljVar2.f13341u;
                            Preconditions.g(zzkbVar);
                            zzkbVar.b(500L);
                        }
                    }
                };
            }
            zzhh zzhhVar110 = zzicVar3.f13098e;
            zzic.k(zzhhVar110);
            zzhhVar110.l().registerOnSharedPreferenceChangeListener(zzljVar.f13340t);
            zzic.l(zzljVar);
            zzljVar.m();
        }
        zzheVar = zzhhVar.f13023f;
        if (zzheVar.a() == 0) {
            zzic.m(zzguVar2);
            zzgsVar3.b(Long.valueOf(j11), "Persisting first open");
            zzheVar.b(j11);
        }
        zzic.l(zzljVar);
        zzxVar = zzljVar.f13337q;
        if (zzxVar.c()) {
            zzhh zzhhVar111 = zzxVar.f13674a.f13098e;
            zzic.k(zzhhVar111);
            zzhhVar111.f13039w.b(null);
        }
        if (zzicVar2.h()) {
            if (zzicVar2.d()) {
                if (zzppVar2.K("android.permission.INTERNET")) {
                    zzic.m(zzguVar2);
                    zzgsVar6 = zzgsVar5;
                    zzgsVar6.a(xItStCyvVEZ.GSAlcZeYlhrAcy);
                } else {
                    zzgsVar6 = zzgsVar5;
                }
                if (!zzppVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                    zzic.m(zzguVar2);
                    zzgsVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                zzicVar4 = zzicVar2;
                context = zzicVar4.f13094a;
                if (!Wrappers.a(context).c()) {
                    if (!zzpp.c0(context)) {
                        zzic.m(zzguVar2);
                        zzgsVar6.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzpp.B(context)) {
                        zzic.m(zzguVar2);
                        zzgsVar6.a("AppMeasurementService not registered/enabled");
                    }
                }
                zzic.m(zzguVar2);
                zzgsVar6.a("Uploading is not possible. App measurement disabled");
            } else {
                zzicVar4 = zzicVar2;
            }
            zzguVar = zzguVar2;
        } else {
            zzicVar4 = zzicVar2;
            if (TextUtils.isEmpty(zzicVar4.r().n())) {
                String strN13 = zzicVar4.r().n();
                zzhhVar.g();
                String string9 = zzhhVar.k().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strN13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string9);
                if (zIsEmpty) {
                    zzhgVar2 = zzhgVar;
                } else {
                    zzhgVar2 = zzhgVar;
                }
                String strN14 = zzicVar4.r().n();
                zzhhVar.g();
                SharedPreferences.Editor editorEdit10 = zzhhVar.k().edit();
                editorEdit10.putString("gmp_app_id", strN14);
                editorEdit10.apply();
            } else {
                zzhgVar2 = zzhgVar;
            }
            if (!zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                zzhgVar2.b(null);
            }
            zzic.l(zzljVar);
            zzljVar.f13328g.set(zzhgVar2.a());
            zzicVar6.f13094a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            zzguVar = zzguVar2;
            if (!TextUtils.isEmpty(zzicVar4.r().n())) {
                zD = zzicVar4.d();
                sharedPreferences = zzhhVar.f13020c;
                if (sharedPreferences == null) {
                    zContains = z12;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    zzhhVar.o(!zD);
                }
                if (zD) {
                    zzic.l(zzljVar);
                    zzljVar.t();
                }
                zzoc zzocVar8 = zzicVar4.f13101h;
                zzic.l(zzocVar8);
                zzocVar8.f13538e.a();
                zzicVar4.p().k(new AtomicReference());
                zzicVar4.p().l(zzhhVar.f13041y.a());
            }
        }
        zzaif.a();
        if (zzalVar.r(null, zzfy.P0)) {
            zzppVar2.g();
            if (zzppVar2.E() == 1) {
                z12 = true;
            }
            if (z12) {
                long jIntValue8 = ((Integer) zzfy.f12888w0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                zzicVar4.f13104k.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    zzic.m(zzguVar);
                    zzgsVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                zzic.l(zzljVar);
                zzljVar.g();
                if (zzljVar.f13333l == null) {
                    zzljVar.f13333l = new zzju(zzljVar, zzicVar3);
                }
                zzljVar.f13333l.b(jMax);
            }
        }
        zzhhVar.f13031o.b(true);
    }
}
