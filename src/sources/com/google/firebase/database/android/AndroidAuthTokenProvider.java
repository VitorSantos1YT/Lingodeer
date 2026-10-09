package com.google.firebase.database.android;

import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidAuthTokenProvider implements TokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f19003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19004b = new AtomicReference();

    public AndroidAuthTokenProvider(Deferred deferred) {
        this.f19003a = deferred;
        deferred.a(new d(this, 0));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public final void a(boolean z11, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InternalAuthProvider internalAuthProvider = (InternalAuthProvider) this.f19004b.get();
        if (internalAuthProvider != null) {
            internalAuthProvider.b(z11).addOnSuccessListener(new c(getTokenCompletionListener, 2)).addOnFailureListener(new c(getTokenCompletionListener, 3));
        } else {
            getTokenCompletionListener.a(null);
        }
    }
}
