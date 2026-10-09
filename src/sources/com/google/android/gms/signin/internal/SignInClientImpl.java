package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f13695e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ClientSettings f13696f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Bundle f13697g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Integer f13698h0;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f13695e0 = true;
        this.f13696f0 = clientSettings;
        this.f13697g0 = bundle;
        this.f13698h0 = clientSettings.f8905h;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.signin.zae
    public final void a(zac zacVar) {
        try {
            Account account = this.f13696f0.f8898a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? Storage.a(this.f8889c).b() : null;
            Integer num = this.f13698h0;
            Preconditions.g(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountB);
            zaf zafVar = (zaf) y();
            zai zaiVar = new zai(1, zawVar);
            Parcel parcelG = zafVar.g();
            com.google.android.gms.internal.base.zac.b(parcelG, zaiVar);
            com.google.android.gms.internal.base.zac.c(parcelG, zacVar);
            zafVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            try {
                zafVar.f9585a.transact(12, parcelG, parcelObtain, 0);
                parcelObtain.readException();
            } finally {
                parcelG.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e8) {
            try {
                zacVar.Q(new zak(1, new ConnectionResult(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void b() {
        i(new BaseGmsClient.LegacyClientCallbackAdapter(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean p() {
        return this.f13695e0;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle w() {
        ClientSettings clientSettings = this.f13696f0;
        boolean zEquals = this.f8889c.getPackageName().equals(clientSettings.f8902e);
        Bundle bundle = this.f13697g0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.f8902e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String z() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
}
