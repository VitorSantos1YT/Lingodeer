package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zad extends zao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f9146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f9146b = googleApiAvailability;
        this.f9145a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            new StringBuilder(String.valueOf(i11).length() + 39);
            return;
        }
        int i12 = GoogleApiAvailabilityLight.f8645a;
        GoogleApiAvailability googleApiAvailability = this.f9146b;
        Context context = this.f9145a;
        int iC = googleApiAvailability.c(context, i12);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = googleApiAvailability.a(iC, context, "n");
            googleApiAvailability.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
