package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.util.ProcessUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzgu f12933f;

    public zzgr(zzgu zzguVar, int i11, String str, Object obj, Object obj2, Object obj3) {
        this.f12928a = i11;
        this.f12929b = str;
        this.f12930c = obj;
        this.f12931d = obj2;
        this.f12932e = obj3;
        this.f12933f = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgu zzguVar = this.f12933f;
        zzhh zzhhVar = zzguVar.f13202a.f13098e;
        zzic.k(zzhhVar);
        if (!zzhhVar.f13203b) {
            Log.println(6, zzguVar.q(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzguVar.f12939c == 0) {
            zzal zzalVar = zzguVar.f13202a.f13097d;
            if (zzalVar.f12631e == null) {
                synchronized (zzalVar) {
                    try {
                        if (zzalVar.f12631e == null) {
                            zzic zzicVar = zzalVar.f13202a;
                            ApplicationInfo applicationInfo = zzicVar.f13094a.getApplicationInfo();
                            String strA = ProcessUtils.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                zzalVar.f12631e = Boolean.valueOf(str != null && str.equals(strA));
                            }
                            if (zzalVar.f12631e == null) {
                                zzalVar.f12631e = Boolean.TRUE;
                                zzgu zzguVar2 = zzicVar.f13099f;
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.a("My process not in the list of running processes");
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (zzalVar.f12631e.booleanValue()) {
                zzguVar.f12939c = 'C';
            } else {
                zzguVar.f12939c = 'c';
            }
        }
        if (zzguVar.f12940d < 0) {
            zzguVar.f13202a.f13097d.m();
            zzguVar.f12940d = 161000L;
        }
        int i11 = this.f12928a;
        char c11 = zzguVar.f12939c;
        long j11 = zzguVar.f12940d;
        String str2 = this.f12929b;
        Object obj = this.f12930c;
        Object obj2 = this.f12931d;
        Object obj3 = this.f12932e;
        char cCharAt = "01VDIWEA?".charAt(i11);
        String strR = zzgu.r(true, str2, obj, obj2, obj3);
        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c11).length() + String.valueOf(j11).length() + 1 + strR.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(c11);
        sb2.append(j11);
        sb2.append(":");
        sb2.append(strR);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str2.substring(0, 1024);
        }
        zzhf zzhfVar = zzhhVar.f13022e;
        if (zzhfVar != null) {
            String str3 = zzhfVar.f13012c;
            zzhh zzhhVar2 = zzhfVar.f13014e;
            zzhhVar2.g();
            if (zzhfVar.f13014e.k().getLong(zzhfVar.f13010a, 0L) == 0) {
                zzhfVar.a();
            }
            if (string == null) {
                string = BuildConfig.VERSION_NAME;
            }
            SharedPreferences sharedPreferencesK = zzhhVar2.k();
            String str4 = zzhfVar.f13011b;
            long j12 = sharedPreferencesK.getLong(str4, 0L);
            if (j12 <= 0) {
                SharedPreferences.Editor editorEdit = zzhhVar2.k().edit();
                editorEdit.putString(str3, string);
                editorEdit.putLong(str4, 1L);
                editorEdit.apply();
                return;
            }
            zzpp zzppVar = zzhhVar2.f13202a.f13102i;
            zzic.k(zzppVar);
            long jNextLong = zzppVar.g0().nextLong() & Long.MAX_VALUE;
            long j13 = j12 + 1;
            long j14 = Long.MAX_VALUE / j13;
            SharedPreferences.Editor editorEdit2 = zzhhVar2.k().edit();
            if (jNextLong < j14) {
                editorEdit2.putString(str3, string);
            }
            editorEdit2.putLong(str4, j13);
            editorEdit2.apply();
        }
    }
}
