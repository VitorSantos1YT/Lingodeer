package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenerHolder f8744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Feature[] f8745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8747d;

    public RegisterListenerMethod(ListenerHolder listenerHolder, Feature[] featureArr, boolean z11, int i11) {
        this.f8744a = listenerHolder;
        this.f8745b = featureArr;
        this.f8746c = z11;
        this.f8747d = i11;
    }

    public abstract void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource);
}
