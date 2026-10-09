package com.google.firebase.sessions.api;

import java.util.Iterator;
import java.util.Map;
import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {76}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f21036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f21037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SessionSubscriber.Name f21038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f21039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21041f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FirebaseSessionsDependencies f21042t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, c cVar) {
        super(cVar);
        this.f21042t = firebaseSessionsDependencies;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f21041f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f21042t.c(this);
    }
}
