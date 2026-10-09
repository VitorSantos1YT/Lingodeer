package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgu extends zzjf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f12939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzgs f12942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzgs f12943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzgs f12944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzgs f12945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzgs f12946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzgs f12947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzgs f12948l;
    public final zzgs m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzgs f12949n;

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.f12939c = (char) 0;
        this.f12940d = -1L;
        this.f12942f = new zzgs(this, 6, false, false);
        this.f12943g = new zzgs(this, 6, true, false);
        this.f12944h = new zzgs(this, 6, false, true);
        this.f12945i = new zzgs(this, 5, false, false);
        this.f12946j = new zzgs(this, 5, true, false);
        this.f12947k = new zzgs(this, 5, false, true);
        this.f12948l = new zzgs(this, 4, false, false);
        this.m = new zzgs(this, 3, false, false);
        this.f12949n = new zzgs(this, 2, false, false);
    }

    public static Object o(String str) {
        if (str == null) {
            return null;
        }
        return new zzgt(str);
    }

    public static String r(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String strS = s(obj, z11);
        String strS2 = s(obj2, z11);
        String strS3 = s(obj3, z11);
        StringBuilder sb2 = new StringBuilder();
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strS)) {
            sb2.append(str2);
            sb2.append(strS);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strS2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strS2);
        }
        if (!TextUtils.isEmpty(strS3)) {
            sb2.append(str3);
            sb2.append(strS3);
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean h() {
        return false;
    }

    public final zzgs k() {
        return this.f12942f;
    }

    public final zzgs l() {
        return this.f12945i;
    }

    public final zzgs m() {
        return this.m;
    }

    public final zzgs n() {
        return this.f12949n;
    }

    public final void p(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        if (!z11 && Log.isLoggable(q(), i11)) {
            Log.println(i11, q(), r(false, str, obj, obj2, obj3));
        }
        if (z12 || i11 < 5) {
            return;
        }
        Preconditions.g(str);
        zzhz zzhzVar = this.f13202a.f13100g;
        if (zzhzVar == null) {
            Log.println(6, q(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzhzVar.f13203b) {
                Log.println(6, q(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i11 >= 9) {
                i11 = 8;
            }
            zzhzVar.p(new zzgr(this, i11, str, obj, obj2, obj3));
        }
    }

    public final String q() {
        String str;
        synchronized (this) {
            try {
                if (this.f12941e == null) {
                    this.f13202a.f13097d.f13202a.getClass();
                    this.f12941e = nuRcCS.incrlfAzI;
                }
                Preconditions.g(this.f12941e);
                str = this.f12941e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static String s(Object obj, boolean z11) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        String str = BuildConfig.VERSION_NAME;
        if (obj == null) {
            return BuildConfig.VERSION_NAME;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l9.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            if (cCharAt == '-') {
                str = "-";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            a.y(jRound, str, SemtNwfPgIhi.SJZ, sb2);
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zzgt) {
                return ((zzgt) obj).f12938a;
            }
            return z11 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z11 ? th2.getClass().getName() : th2.toString());
        String canonicalName = zzic.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? BuildConfig.VERSION_NAME : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? BuildConfig.VERSION_NAME : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb3.toString();
    }
}
