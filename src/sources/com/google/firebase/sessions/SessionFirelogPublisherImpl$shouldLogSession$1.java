package com.google.firebase.sessions;

import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionFirelogPublisherImpl f20960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, c cVar) {
        super(cVar);
        this.f20960b = sessionFirelogPublisherImpl;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f20959a = obj;
        this.f20961c |= Integer.MIN_VALUE;
        return SessionFirelogPublisherImpl.b(this.f20960b, this);
    }
}
