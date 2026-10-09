package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) throws JSONException {
        String strE;
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zbt zbtVar = (zbt) this;
            zbtVar.h();
            zbn.a(zbtVar.f8550a).b();
            return true;
        }
        zbt zbtVar2 = (zbt) this;
        zbtVar2.h();
        RevocationBoundService revocationBoundService = zbtVar2.f8550a;
        Storage storageA = Storage.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = storageA.b();
        GoogleSignInOptions googleSignInOptionsD1 = GoogleSignInOptions.M;
        if (googleSignInAccountB != null) {
            String strE2 = storageA.e("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strE2) || (strE = storageA.e(Storage.f("googleSignInOptions", strE2))) == null) {
                googleSignInOptionsD1 = null;
            } else {
                try {
                    googleSignInOptionsD1 = GoogleSignInOptions.D1(strE);
                } catch (JSONException unused) {
                    googleSignInOptionsD1 = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsD1;
        Preconditions.g(googleSignInOptions);
        Api api = Auth.f8351a;
        GoogleApi.Settings.Builder builder = new GoogleApi.Settings.Builder();
        builder.f8690a = new ApiExceptionMapper();
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(revocationBoundService, null, api, googleSignInOptions, builder.a());
        if (googleSignInAccountB != null) {
            PendingResultUtil.a(zbm.c(googleSignInClient.f8684i, googleSignInClient.f8676a, googleSignInClient.d() == 3));
        } else {
            googleSignInClient.c();
        }
        return true;
    }
}
