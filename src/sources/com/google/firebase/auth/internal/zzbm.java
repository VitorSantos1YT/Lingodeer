package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.p002firebaseauthapi.zzah f17973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzbm f17974b;

    static {
        Object[] objArr = {"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"};
        com.google.android.gms.internal.p002firebaseauthapi.zzaz zzazVar = com.google.android.gms.internal.p002firebaseauthapi.zzah.f9955b;
        for (int i11 = 0; i11 < 8; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(p.j(i11, "at index "));
            }
        }
        f17973a = com.google.android.gms.internal.p002firebaseauthapi.zzah.j(8, objArr);
        f17974b = new zzbm();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f8706a);
        editorEdit.putString("statusMessage", status.f8707b);
        DefaultClock.f9117a.getClass();
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzah zzahVar = f17973a;
        int size = zzahVar.size();
        int i11 = 0;
        while (i11 < size) {
            E e8 = zzahVar.get(i11);
            i11++;
            editorEdit.remove((String) e8);
        }
        editorEdit.commit();
    }
}
