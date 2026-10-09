package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.e;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActionCodeUrl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17869c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17871b;

    static {
        HashMap map = new HashMap();
        e.z(2, map, "recoverEmail", 0, "resetPassword");
        e.z(4, map, "signIn", 1, "verifyEmail");
        e.z(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        com.google.android.gms.internal.p002firebaseauthapi.zzal.b(map);
    }

    public ActionCodeUrl(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        Preconditions.d(strA);
        Preconditions.d(strA2);
        this.f17870a = strA2;
        Preconditions.d(strA3);
        a(str, "continueUrl");
        a(str, "lang");
        this.f17871b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            Preconditions.d(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
