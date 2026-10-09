package com.google.firebase.messaging;

import android.content.Context;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceStarter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ServiceStarter f20511e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20512a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f20513b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20514c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f20515d = new ArrayDeque();

    private ServiceStarter() {
    }

    public static synchronized ServiceStarter a() {
        try {
            if (f20511e == null) {
                f20511e = new ServiceStarter();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20511e;
    }

    public final boolean b(Context context) {
        if (this.f20514c == null) {
            this.f20514c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        this.f20513b.booleanValue();
        return this.f20514c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f20513b == null) {
            this.f20513b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.f20513b.booleanValue();
        return this.f20513b.booleanValue();
    }
}
