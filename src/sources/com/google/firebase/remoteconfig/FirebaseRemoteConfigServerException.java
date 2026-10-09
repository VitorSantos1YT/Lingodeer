package com.google.firebase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20657a;

    public FirebaseRemoteConfigServerException(int i11, String str) {
        super(str);
        this.f20657a = i11;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f20657a = i11;
    }

    public FirebaseRemoteConfigServerException(int i11, int i12, String str) {
        super(str);
        this.f20657a = i11;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f20657a = -1;
    }
}
