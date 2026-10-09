package com.google.firebase.database.android;

import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.database.core.TokenProvider;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements AppCheckTokenListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f19016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TokenProvider.TokenChangeListener f19017b;

    public /* synthetic */ b(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener) {
        this.f19016a = executorService;
        this.f19017b = tokenChangeListener;
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public final void a(DefaultAppCheckTokenResult defaultAppCheckTokenResult) {
        this.f19016a.execute(new b2.c(8, this.f19017b, defaultAppCheckTokenResult));
    }
}
