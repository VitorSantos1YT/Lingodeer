package com.google.firebase.appcheck;

import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FirebaseAppCheck implements InteropAppCheckTokenProvider {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AppCheckListener {
        void a();
    }

    public abstract void c(AppCheckProviderFactory appCheckProviderFactory);

    public abstract void d();
}
