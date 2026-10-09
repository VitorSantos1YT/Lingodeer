package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zack implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.signin.internal.zak f8821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zacm f8822b;

    public zack(zacm zacmVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.f8821a = zakVar;
        this.f8822b = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor zztVar;
        zacm zacmVar = this.f8822b;
        zacmVar.getClass();
        com.google.android.gms.signin.internal.zak zakVar = this.f8821a;
        ConnectionResult connectionResult = zakVar.f13707b;
        if (connectionResult.E1()) {
            com.google.android.gms.common.internal.zay zayVar = zakVar.f13708c;
            Preconditions.g(zayVar);
            ConnectionResult connectionResult2 = zayVar.f8996c;
            if (!connectionResult2.E1()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                ((zabn) zacmVar.f8829t).b(connectionResult2);
                zacmVar.f8828f.j();
                return;
            }
            zacl zaclVar = zacmVar.f8829t;
            IBinder iBinder = zayVar.f8995b;
            if (iBinder == null) {
                zztVar = null;
            } else {
                int i11 = IAccountAccessor.Stub.f8931a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set set = zacmVar.f8826d;
            zabn zabnVar = (zabn) zaclVar;
            zabnVar.getClass();
            if (zztVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zabnVar.b(new ConnectionResult(4, null, null));
            } else {
                zabnVar.f8791c = zztVar;
                zabnVar.f8792d = set;
                if (zabnVar.f8793e) {
                    zabnVar.f8789a.e(zztVar, set);
                }
            }
        } else {
            ((zabn) zacmVar.f8829t).b(connectionResult);
        }
        zacmVar.f8828f.j();
    }
}
