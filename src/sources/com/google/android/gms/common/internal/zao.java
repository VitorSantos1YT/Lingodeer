package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f8984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f8985b;

    public zao() {
        this(GoogleApiAvailability.f8643e);
    }

    public final int a(Context context, Api.Client client) {
        int i11;
        Preconditions.g(context);
        Preconditions.g(client);
        int iC = 0;
        if (!client.l()) {
            return 0;
        }
        int iM = client.m();
        SparseIntArray sparseIntArray = this.f8984a;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(iM, -1);
        }
        if (i11 != -1) {
            return i11;
        }
        SparseIntArray sparseIntArray2 = this.f8984a;
        synchronized (sparseIntArray2) {
            int i12 = 0;
            while (true) {
                try {
                    if (i12 >= sparseIntArray2.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i12);
                    if (iKeyAt > iM && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i12++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iC == -1) {
                iC = this.f8985b.c(context, iM);
            }
            sparseIntArray2.put(iM, iC);
        }
        return iC;
    }

    public zao(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f8984a = new SparseIntArray();
        Preconditions.g(googleApiAvailabilityLight);
        this.f8985b = googleApiAvailabilityLight;
    }
}
