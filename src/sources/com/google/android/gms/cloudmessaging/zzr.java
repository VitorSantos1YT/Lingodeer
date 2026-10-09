package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzr extends zzs {
    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void a(Bundle bundle) {
        if (!bundle.getBoolean("ack", false)) {
            c(new zzt("Invalid response to one way request", null));
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
        }
        this.f8612b.setResult(null);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean b() {
        return true;
    }
}
