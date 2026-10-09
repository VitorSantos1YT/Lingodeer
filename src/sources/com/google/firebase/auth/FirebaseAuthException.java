package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAuthException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17899a;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        Preconditions.d(str);
        this.f17899a = str;
    }
}
