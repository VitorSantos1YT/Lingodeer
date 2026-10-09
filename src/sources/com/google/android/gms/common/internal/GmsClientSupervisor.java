package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClientSupervisor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8926a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zzq f8927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f8928c;

    public static GmsClientSupervisor a(Context context) {
        synchronized (f8926a) {
            try {
                if (f8927b == null) {
                    f8927b = new zzq(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f8927b;
    }

    public abstract ConnectionResult b(zzn zznVar, zze zzeVar, String str, Executor executor);

    public abstract void c(zzn zznVar, ServiceConnection serviceConnection);
}
