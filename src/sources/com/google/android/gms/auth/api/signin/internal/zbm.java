package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.base.zao;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f8547a = new Logger("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f8547a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static BasePendingResult b(zabq zabqVar, Context context, boolean z11) {
        f8547a.a("Signing out", new Object[0]);
        d(context);
        if (!z11) {
            zbi zbiVar = new zbi(zabqVar);
            zabqVar.d(zbiVar);
            return zbiVar;
        }
        Status status = Status.f8703e;
        Preconditions.h(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(zabqVar);
        statusPendingResult.a(status);
        return statusPendingResult;
    }

    public static BasePendingResult c(zabq zabqVar, Context context, boolean z11) {
        PendingResult pendingResultA;
        f8547a.a("Revoking access", new Object[0]);
        String strE = Storage.a(context).e("refreshToken");
        d(context);
        if (!z11) {
            zbk zbkVar = new zbk(zabqVar);
            zabqVar.d(zbkVar);
            return zbkVar;
        }
        if (strE == null) {
            Logger logger = zbb.f8530c;
            pendingResultA = PendingResults.a(new Status(4, null, null, null));
        } else {
            zbb zbbVar = new zbb(strE);
            new Thread(zbbVar).start();
            pendingResultA = zbbVar.f8532b;
        }
        return (BasePendingResult) pendingResultA;
    }

    public static void d(Context context) {
        zbn.a(context).b();
        Set set = GoogleApiClient.f8694a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((GoogleApiClient) it.next()).c();
        }
        synchronized (GoogleApiManager.T) {
            try {
                GoogleApiManager googleApiManager = GoogleApiManager.U;
                if (googleApiManager != null) {
                    googleApiManager.K.incrementAndGet();
                    zao zaoVar = googleApiManager.P;
                    zaoVar.sendMessageAtFrontOfQueue(zaoVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
