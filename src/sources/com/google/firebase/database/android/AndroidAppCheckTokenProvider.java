package com.google.firebase.database.android;

import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidAppCheckTokenProvider implements TokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f19001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19002b = new AtomicReference();

    public AndroidAppCheckTokenProvider(Deferred deferred) {
        this.f19001a = deferred;
        deferred.a(new app.rive.runtime.kotlin.core.a(this, 29));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public final void a(boolean z11, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) this.f19002b.get();
        if (interopAppCheckTokenProvider != null) {
            interopAppCheckTokenProvider.a(z11).addOnSuccessListener(new c(getTokenCompletionListener, 0)).addOnFailureListener(new c(getTokenCompletionListener, 1));
        } else {
            getTokenCompletionListener.a(null);
        }
    }
}
