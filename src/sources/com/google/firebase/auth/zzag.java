package com.google.firebase.auth;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzag implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Qualified f18061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Qualified f18062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Qualified f18063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Qualified f18064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Qualified f18065e;

    @Override // com.google.firebase.components.ComponentFactory
    public final Object d(ComponentContainer componentContainer) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(this.f18061a, this.f18062b, this.f18063c, this.f18064d, this.f18065e, componentContainer);
    }
}
