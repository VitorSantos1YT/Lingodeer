package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzic;
import s6.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a implements zzhl.zza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzhl f12594c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12594c == null) {
            this.f12594c = new zzhl(this);
        }
        zzhl zzhlVar = this.f12594c;
        zzhlVar.getClass();
        zzgu zzguVar = zzic.s(context, null, null, null).f13099f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.f12949n;
        zzgs zzgsVar2 = zzguVar.f12945i;
        if (intent == null) {
            zzgsVar2.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzgsVar.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzgsVar2.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzgsVar.a("Starting wakeful intent.");
        zzhlVar.f13047a.getClass();
        SparseArray sparseArray = a.f51386a;
        synchronized (sparseArray) {
            try {
                int i11 = a.f51387b;
                int i12 = i11 + 1;
                a.f51387b = i12;
                if (i12 <= 0) {
                    a.f51387b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i11);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i11, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
