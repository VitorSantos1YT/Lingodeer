package com.google.firebase.database;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ChildEventListener {
    void d(DatabaseError databaseError);

    void e(DataSnapshot dataSnapshot, String str);

    void f(DataSnapshot dataSnapshot, String str);

    void g(DataSnapshot dataSnapshot, String str);

    void h(DataSnapshot dataSnapshot);
}
