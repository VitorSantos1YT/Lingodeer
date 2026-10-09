package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zabr f8798b;

    public zabs(zabr zabrVar) {
        this.f8798b = zabrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        } else {
            schemeSpecificPart = null;
        }
        if (aYZzTH.HxYZBnFdxsSKLZ.equals(schemeSpecificPart)) {
            this.f8798b.a();
            synchronized (this) {
                try {
                    Context context2 = this.f8797a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f8797a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
