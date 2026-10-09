package com.google.firebase.sessions.api;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SharedSessionRepository;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashEventReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CrashEventReceiver f21030a = new CrashEventReceiver();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedSessionRepository f21031b;

    private CrashEventReceiver() {
    }

    public static final void a() {
        try {
            SharedSessionRepository sharedSessionRepository = f21031b;
            CrashEventReceiver crashEventReceiver = f21030a;
            if (sharedSessionRepository == null) {
                SharedSessionRepository.f20980a.getClass();
                m.f(Firebase.f17711a, "<this>");
                SharedSessionRepository sharedSessionRepositoryB = ((FirebaseSessionsComponent) FirebaseApp.e().c(FirebaseSessionsComponent.class)).b();
                crashEventReceiver.getClass();
                m.f(sharedSessionRepositoryB, "<set-?>");
                f21031b = sharedSessionRepositoryB;
            }
            crashEventReceiver.getClass();
            SharedSessionRepository sharedSessionRepository2 = f21031b;
            if (sharedSessionRepository2 == null) {
                m.n("sharedSessionRepository");
                throw null;
            }
            if (sharedSessionRepository2.a()) {
                SharedSessionRepository sharedSessionRepository3 = f21031b;
                if (sharedSessionRepository3 != null) {
                    sharedSessionRepository3.b();
                } else {
                    m.n("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
