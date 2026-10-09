package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.zbk;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbaj extends GoogleApi implements CredentialSavingClient {
    public static final Api m = new Api("Auth.Api.Identity.CredentialSaving.API", new zbae(), new Api.ClientKey());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9390l;

    public zbaj(HiddenActivity hiddenActivity, zbk zbkVar) {
        super(hiddenActivity, hiddenActivity, m, zbkVar, GoogleApi.Settings.f8687c);
        this.f9390l = zbaw.a();
    }

    public final Task c(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.Builder builder = new SavePasswordRequest.Builder();
        builder.f8460a = savePasswordRequest.f8457a;
        builder.f8462c = savePasswordRequest.f8459c;
        String str = savePasswordRequest.f8458b;
        if (str != null) {
            builder.f8461b = str;
        }
        builder.f8461b = this.f9390l;
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(builder.f8460a, builder.f8461b, builder.f8462c);
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8763c = new Feature[]{zbav.f9399a};
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zbag zbagVar = new zbag(this.f9388a, taskCompletionSource);
                zbm zbmVar = (zbm) ((zbg) anyClient).y();
                ApiMetadata apiMetadataA = zbaz.a();
                Parcel parcelG = zbmVar.g();
                int i11 = zbc.f9415a;
                parcelG.writeStrongBinder(zbagVar);
                zbc.b(parcelG, savePasswordRequest2);
                zbc.b(parcelG, apiMetadataA);
                zbmVar.h(parcelG, 2);
            }
        };
        builderA.f8762b = false;
        builderA.f8764d = 1536;
        return b(0, builderA.a());
    }
}
