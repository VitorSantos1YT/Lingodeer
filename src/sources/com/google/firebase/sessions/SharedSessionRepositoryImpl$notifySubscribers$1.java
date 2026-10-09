package com.google.firebase.sessions;

import vy.d;
import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {206}, m = "notifySubscribers")
final class SharedSessionRepositoryImpl$notifySubscribers$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedSessionRepositoryImpl.NotificationType f21011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedSessionRepositoryImpl f21013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$notifySubscribers$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, d dVar) {
        super(dVar);
        this.f21013d = sharedSessionRepositoryImpl;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f21012c = obj;
        this.f21014e |= Integer.MIN_VALUE;
        return SharedSessionRepositoryImpl.d(this.f21013d, null, null, this);
    }
}
