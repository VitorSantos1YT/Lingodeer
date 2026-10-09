package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SnapshotHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Node f19289a;

    public SnapshotHolder() {
        this.f19289a = EmptyNode.f19537e;
    }

    public SnapshotHolder(Node node) {
        this.f19289a = node;
    }
}
