package com.google.firebase.database.core.view;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CancelEvent implements Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventRegistration f19448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DatabaseError f19449c;

    public CancelEvent(EventRegistration eventRegistration, DatabaseError databaseError, Path path) {
        this.f19448b = eventRegistration;
        this.f19447a = path;
        this.f19449c = databaseError;
    }

    @Override // com.google.firebase.database.core.view.Event
    public final void a() {
        this.f19448b.c(this.f19449c);
    }

    @Override // com.google.firebase.database.core.view.Event
    public final String toString() {
        return this.f19447a + ":CANCEL";
    }
}
