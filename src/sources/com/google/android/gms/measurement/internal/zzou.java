package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzou extends zzol {
    public static final boolean j(String str) {
        String str2 = (String) zzfy.f12881t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (java.lang.Math.abs(r5.hashCode() % 100) < r7.N().y()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzot h(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzou.h(java.lang.String):com.google.android.gms.measurement.internal.zzot");
    }

    public final String i(String str) {
        zzht zzhtVar = this.f13552b.f13595a;
        zzpg.U(zzhtVar);
        String strT = zzhtVar.t(str);
        if (TextUtils.isEmpty(strT)) {
            return (String) zzfy.f12877r.a(null);
        }
        Uri uri = Uri.parse((String) zzfy.f12877r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(authority).length());
        sb2.append(strT);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
