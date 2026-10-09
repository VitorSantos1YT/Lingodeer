package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f17968a = new Logger("GetTokenResultFactory", new String[0]);

    public static GetTokenResult a(String str) {
        Map map;
        try {
            map = zzbj.b(str);
        } catch (zzzx unused) {
            f17968a.b("Error parsing token claims", new Object[0]);
            map = new HashMap();
        }
        GetTokenResult getTokenResult = new GetTokenResult();
        getTokenResult.f17900a = str;
        getTokenResult.f17901b = map;
        return getTokenResult;
    }
}
