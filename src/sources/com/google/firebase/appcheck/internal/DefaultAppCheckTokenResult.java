package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAppCheckTokenResult extends AppCheckTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseException f17805b;

    public DefaultAppCheckTokenResult(String str, FirebaseException firebaseException) {
        Preconditions.d(str);
        this.f17804a = str;
        this.f17805b = firebaseException;
    }

    public static DefaultAppCheckTokenResult c(AppCheckToken appCheckToken) {
        Preconditions.g(appCheckToken);
        return new DefaultAppCheckTokenResult(appCheckToken.b(), null);
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    public final FirebaseException a() {
        return this.f17805b;
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    public final String b() {
        return this.f17804a;
    }
}
