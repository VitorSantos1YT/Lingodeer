package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlt {
    public static String a(Context context, String str) {
        Preconditions.g(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = zzhu.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i11 = 0; i11 < iMin; i11++) {
            String str2 = strArr[i11];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i11];
            }
        }
        return null;
    }
}
