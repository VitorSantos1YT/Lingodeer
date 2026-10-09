package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafi {
    public static zzais a(PhoneAuthCredential phoneAuthCredential) {
        return !TextUtils.isEmpty(phoneAuthCredential.f17909e) ? zzais.b(phoneAuthCredential.f17907c, phoneAuthCredential.f17909e, phoneAuthCredential.f17908d) : zzais.a(phoneAuthCredential.f17905a, phoneAuthCredential.f17906b, phoneAuthCredential.f17908d);
    }
}
