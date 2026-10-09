package com.google.firebase.database.snapshot;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Index implements Comparator<NamedNode> {
    public abstract String a();

    public abstract boolean b(Node node);

    public abstract NamedNode c(ChildKey childKey, Node node);

    public abstract NamedNode d();
}
