package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f8492l = 1;

    public final Task c() {
        return PendingResultUtil.a(zbm.b(this.f8684i, this.f8676a, d() == 3));
    }

    public final synchronized int d() {
        int i11;
        try {
            i11 = f8492l;
            if (i11 == 1) {
                Context context = this.f8676a;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f8643e;
                int iC = googleApiAvailability.c(context, 12451000);
                if (iC == 0) {
                    i11 = 4;
                    f8492l = 4;
                } else if (googleApiAvailability.a(iC, context, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i11 = 2;
                    f8492l = 2;
                } else {
                    i11 = 3;
                    f8492l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }
}
