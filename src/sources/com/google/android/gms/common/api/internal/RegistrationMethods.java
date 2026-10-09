package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegisterListenerMethod f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnregisterListenerMethod f8749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f8750c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<A extends Api.AnyClient, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RemoteCall f8751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RemoteCall f8752b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ListenerHolder f8754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Feature[] f8755e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f8753c = zacg.f8818a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8756f = true;

        private Builder() {
        }

        public final RegistrationMethods a() {
            Preconditions.a("Must set register function", this.f8751a != null);
            Preconditions.a("Must set unregister function", this.f8752b != null);
            Preconditions.a("Must set holder", this.f8754d != null);
            ListenerHolder.ListenerKey listenerKey = this.f8754d.f8741b;
            Preconditions.h(listenerKey, "Key must not be null");
            return new RegistrationMethods(new zace(this, this.f8754d, this.f8755e, this.f8756f, 0), new zacf(this, listenerKey), this.f8753c);
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        this.f8748a = registerListenerMethod;
        this.f8749b = unregisterListenerMethod;
        this.f8750c = runnable;
    }

    public static Builder a() {
        Builder builder = new Builder();
        builder.f8753c = zacg.f8818a;
        builder.f8756f = true;
        return builder;
    }
}
