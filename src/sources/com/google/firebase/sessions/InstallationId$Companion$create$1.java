package com.google.firebase.sessions;

import com.google.protobuf.DescriptorProtos;
import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {31, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "create")
final class InstallationId$Companion$create$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f20908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InstallationId.Companion f20910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, c cVar) {
        super(cVar);
        this.f20910c = companion;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f20909b = obj;
        this.f20911d |= Integer.MIN_VALUE;
        return this.f20910c.a(null, this);
    }
}
