package com.google.firebase.database;

import kotlin.jvm.internal.m;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseKt$snapshots$1$listener$1 implements ValueEventListener {
    @Override // com.google.firebase.database.ValueEventListener
    public final void E(DataSnapshot dataSnapshot) {
        throw null;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void d(DatabaseError error) {
        m.f(error, "error");
        e0.i(null, e0.a("Error getting Query snapshot", error.c()));
        throw null;
    }
}
