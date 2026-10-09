package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zbh extends zbb implements zbi {
    public zbh() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) zbc.a(parcel, Status.CREATOR);
        AuthorizationResult authorizationResult = (AuthorizationResult) zbc.a(parcel, AuthorizationResult.CREATOR);
        zbc.c(parcel);
        boolean zD1 = status.D1();
        TaskCompletionSource taskCompletionSource = ((zbx) this).f9419a;
        if (zD1) {
            taskCompletionSource.setResult(authorizationResult);
            return true;
        }
        taskCompletionSource.setException(ApiExceptionUtil.a(status));
        return true;
    }
}
