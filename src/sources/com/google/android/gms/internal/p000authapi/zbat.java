package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.zbx;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbat extends GoogleApi implements SignInClient {
    public static final Api m = new Api("Auth.Api.Identity.SignIn.API", new zbak(), new Api.ClientKey());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9397l;

    public zbat(HiddenActivity hiddenActivity, zbx zbxVar) {
        super(hiddenActivity, hiddenActivity, m, zbxVar, GoogleApi.Settings.f8687c);
        this.f9397l = zbaw.a();
    }

    public final Task c(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.f8400b;
        Preconditions.g(googleIdTokenRequestOptions);
        builder.f8407b = googleIdTokenRequestOptions;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.f8399a;
        Preconditions.g(passwordRequestOptions);
        builder.f8406a = passwordRequestOptions;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f8404f;
        Preconditions.g(passkeysRequestOptions);
        builder.f8408c = passkeysRequestOptions;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.f8405t;
        Preconditions.g(passkeyJsonRequestOptions);
        builder.f8409d = passkeyJsonRequestOptions;
        builder.f8411f = beginSignInRequest.f8402d;
        builder.f8412g = beginSignInRequest.f8403e;
        builder.f8413h = beginSignInRequest.H;
        String str = beginSignInRequest.f8401c;
        if (str != null) {
            builder.f8410e = str;
        }
        builder.f8410e = this.f9397l;
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(builder.f8406a, builder.f8407b, builder.f8410e, builder.f8411f, builder.f8412g, builder.f8408c, builder.f8409d, builder.f8413h);
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8763c = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zbal zbalVar = new zbal(this.f9395a, taskCompletionSource);
                zbv zbvVar = (zbv) ((zbau) anyClient).y();
                ApiMetadata apiMetadataA = zbaz.a();
                Parcel parcelG = zbvVar.g();
                int i11 = zbc.f9415a;
                parcelG.writeStrongBinder(zbalVar);
                zbc.b(parcelG, beginSignInRequest2);
                zbc.b(parcelG, apiMetadataA);
                zbvVar.h(parcelG, 1);
            }
        };
        builderA.f8762b = false;
        builderA.f8764d = 1553;
        return b(0, builderA.a());
    }

    public final Task d(GetSignInIntentRequest getSignInIntentRequest) {
        GetSignInIntentRequest.Builder builder = new GetSignInIntentRequest.Builder();
        String str = getSignInIntentRequest.f8433a;
        Preconditions.g(str);
        builder.f8440a = str;
        builder.f8444e = getSignInIntentRequest.f8436d;
        builder.f8441b = getSignInIntentRequest.f8434b;
        builder.f8445f = getSignInIntentRequest.f8437e;
        builder.f8446g = getSignInIntentRequest.f8438f;
        builder.f8443d = getSignInIntentRequest.f8439t;
        String str2 = getSignInIntentRequest.f8435c;
        if (str2 != null) {
            builder.f8442c = str2;
        }
        builder.f8442c = this.f9397l;
        final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(builder.f8440a, builder.f8441b, builder.f8442c, builder.f8444e, builder.f8445f, builder.f8446g, builder.f8443d);
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8763c = new Feature[]{zbav.f9400b};
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zban zbanVar = new zban(this.f9393a, taskCompletionSource);
                zbv zbvVar = (zbv) ((zbau) anyClient).y();
                ApiMetadata apiMetadataA = zbaz.a();
                Parcel parcelG = zbvVar.g();
                int i11 = zbc.f9415a;
                parcelG.writeStrongBinder(zbanVar);
                zbc.b(parcelG, getSignInIntentRequest2);
                zbc.b(parcelG, apiMetadataA);
                zbvVar.h(parcelG, 3);
            }
        };
        builderA.f8764d = 1555;
        return b(0, builderA.a());
    }
}
