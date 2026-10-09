package com.google.firebase.database.android;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TokenProvider.GetTokenCompletionListener f19019b;

    public /* synthetic */ c(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, int i11) {
        this.f19018a = i11;
        this.f19019b = getTokenCompletionListener;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f19018a) {
            case 1:
                this.f19019b.b(exc.getMessage());
                break;
            default:
                boolean z11 = exc instanceof FirebaseApiNotAvailableException;
                TokenProvider.GetTokenCompletionListener getTokenCompletionListener = this.f19019b;
                if (z11 || (exc instanceof FirebaseNoSignedInUserException)) {
                    getTokenCompletionListener.a(null);
                } else {
                    getTokenCompletionListener.b(exc.getMessage());
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f19018a) {
            case 0:
                this.f19019b.a(((AppCheckTokenResult) obj).b());
                break;
            default:
                this.f19019b.a(((GetTokenResult) obj).f17900a);
                break;
        }
    }
}
