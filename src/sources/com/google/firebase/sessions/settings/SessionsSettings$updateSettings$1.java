package com.google.firebase.sessions.settings;

import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, 99}, m = "updateSettings")
final class SessionsSettings$updateSettings$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionsSettings f21095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, c cVar) {
        super(cVar);
        this.f21095b = sessionsSettings;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f21094a = obj;
        this.f21096c |= Integer.MIN_VALUE;
        return this.f21095b.b(this);
    }
}
