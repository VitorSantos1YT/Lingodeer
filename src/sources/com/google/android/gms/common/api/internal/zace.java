package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zace extends RegisterListenerMethod {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RegistrationMethods.Builder f8816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zace(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z11, int i11) {
        super(listenerHolder, featureArr, z11, i11);
        this.f8816e = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.f8816e.f8751a.a(anyClient, taskCompletionSource);
    }
}
