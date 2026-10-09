package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzql extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile zzqk f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zzqj f11861b;

    public static void a(Context context, zzqk zzqkVar, zzqj zzqjVar) {
        if (f11860a == null) {
            synchronized (zzql.class) {
                try {
                    if (f11860a == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        f11860a = zzqkVar;
                        f11861b = zzqjVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzoo zzooVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            new StringBuilder(stringExtra.length() + 68);
            return;
        }
        zzqk zzqkVar = f11860a;
        if (zzqkVar == null || (zzooVar = (zzoo) ((zzoz) zzqkVar).f11800a.f11806a.get(stringExtra)) == null) {
            return;
        }
        int i11 = zzpc.f11804a;
        zzooVar.f11787a.b();
    }
}
