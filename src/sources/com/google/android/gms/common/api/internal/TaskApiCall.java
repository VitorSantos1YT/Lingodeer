package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature[] f8758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8760c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RemoteCall f8761a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Feature[] f8763c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8762b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8764d = 0;

        private Builder() {
        }

        public final TaskApiCall a() {
            Preconditions.a("execute parameter required", this.f8761a != null);
            return new zacn(this, this.f8763c, this.f8762b, this.f8764d);
        }
    }

    @Deprecated
    public TaskApiCall() {
        this.f8758a = null;
        this.f8759b = false;
        this.f8760c = 0;
    }

    public static Builder a() {
        Builder builder = new Builder();
        builder.f8762b = true;
        builder.f8764d = 0;
        return builder;
    }

    public TaskApiCall(Feature[] featureArr, boolean z11, int i11) {
        this.f8758a = featureArr;
        boolean z12 = false;
        if (featureArr != null && z11) {
            z12 = true;
        }
        this.f8759b = z12;
        this.f8760c = i11;
    }
}
