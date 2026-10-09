package com.google.android.gms.security;

import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zza extends AsyncTask {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("vSBud9bpFyhNU0fU", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            throw null;
        }
        GoogleApiAvailabilityLight googleApiAvailabilityLight = ProviderInstaller.f13690a;
        ProviderInstaller.f13690a.a(num.intValue(), null, "pi");
        throw null;
    }
}
