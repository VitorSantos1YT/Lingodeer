package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20659b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20660a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20661b = ConfigFetchHandler.f20709j;

        public final void a(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException(p.m(j11, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
            }
            this.f20661b = j11;
        }
    }

    public FirebaseRemoteConfigSettings(Builder builder) {
        this.f20658a = builder.f20660a;
        this.f20659b = builder.f20661b;
    }
}
