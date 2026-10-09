package com.google.android.gms.internal.auth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f9463b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9464a;

    static {
        new AtomicReference();
        int i11 = zzcu.f9459a;
        f9463b = new AtomicInteger();
    }

    public /* synthetic */ zzdc(zzcz zzczVar, Object obj) {
        if (zzczVar.f9460a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f9464a = obj;
    }
}
