package com.google.firebase.auth.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import x6.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzav {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zzav f17964b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BroadcastReceiver f17965a;

    public static zzav a() {
        if (f17964b == null) {
            f17964b = new zzav();
        }
        return f17964b;
    }

    public static void b(Context context) {
        zzav zzavVar = f17964b;
        zzavVar.getClass();
        if (zzavVar.f17965a != null) {
            b.a(context).d(f17964b.f17965a);
        }
        f17964b.f17965a = null;
    }
}
