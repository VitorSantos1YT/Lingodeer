package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahf {
    public static long a(String str) {
        Preconditions.d(str);
        List listC = zzt.b('.').c(str);
        if (listC.size() < 2) {
            throw new RuntimeException("Invalid idToken ".concat(str));
        }
        String str2 = (String) listC.get(1);
        try {
            zzahi zzahiVarA = zzahi.a(new String(str2 == null ? null : Base64.decode(str2, 11), StandardCharsets.UTF_8));
            return zzahiVarA.f9968b.longValue() - zzahiVarA.f9967a.longValue();
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Unable to decode token", e8);
        }
    }
}
