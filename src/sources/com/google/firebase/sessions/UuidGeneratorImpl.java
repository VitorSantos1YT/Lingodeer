package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UuidGeneratorImpl implements UuidGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UuidGeneratorImpl f21027a = new UuidGeneratorImpl();

    private UuidGeneratorImpl() {
    }

    @Override // com.google.firebase.sessions.UuidGenerator
    public final UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        m.e(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
