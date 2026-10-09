package com.google.firebase.inappmessaging.model;

import com.google.firebase.inappmessaging.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoMarshallerClient_Factory implements Factory<ProtoMarshallerClient> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProtoMarshallerClient_Factory f20335a = new ProtoMarshallerClient_Factory();

        private InstanceHolder() {
        }
    }

    public static ProtoMarshallerClient_Factory a() {
        return InstanceHolder.f20335a;
    }

    @Override // oy.a
    public final Object get() {
        return new ProtoMarshallerClient();
    }
}
