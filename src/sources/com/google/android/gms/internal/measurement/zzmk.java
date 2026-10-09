package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmk extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11733a;

    public zzmk(int i11, String str, ApiException apiException) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 2 + str.length());
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i11);
        }
        super(strValueOf, apiException);
        this.f11733a = i11;
    }
}
