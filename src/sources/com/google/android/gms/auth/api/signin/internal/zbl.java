package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zbl extends BaseImplementation.ApiMethodImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbl(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        Api api = Auth.f8351a;
        Preconditions.h(googleApiClient, "GoogleApiClient must not be null");
        Preconditions.h(api, "Api must not be null");
        Api.ClientKey clientKey = api.f8662b;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((Result) obj);
    }
}
