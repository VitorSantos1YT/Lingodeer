package com.google.firebase.database.core.view;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.IndexedNode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CacheNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexedNode f19444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19446c;

    public CacheNode(IndexedNode indexedNode, boolean z11, boolean z12) {
        this.f19444a = indexedNode;
        this.f19445b = z11;
        this.f19446c = z12;
    }

    public final boolean a(ChildKey childKey) {
        return (this.f19445b && !this.f19446c) || this.f19444a.f19539a.c1(childKey);
    }

    public final boolean b(Path path) {
        if (path.isEmpty()) {
            return this.f19445b && !this.f19446c;
        }
        return a(path.k());
    }
}
