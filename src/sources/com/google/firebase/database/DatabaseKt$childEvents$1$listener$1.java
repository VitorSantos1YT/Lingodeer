package com.google.firebase.database;

import kotlin.jvm.internal.m;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseKt$childEvents$1$listener$1 implements ChildEventListener {
    @Override // com.google.firebase.database.ChildEventListener
    public final void d(DatabaseError error) {
        m.f(error, "error");
        e0.i(null, e0.a("Error getting Query childEvent", error.c()));
        throw null;
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void e(DataSnapshot dataSnapshot, String str) {
        throw null;
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void f(DataSnapshot dataSnapshot, String str) {
        throw null;
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void g(DataSnapshot dataSnapshot, String str) {
        throw null;
    }

    @Override // com.google.firebase.database.ChildEventListener
    public final void h(DataSnapshot dataSnapshot) {
        throw null;
    }
}
