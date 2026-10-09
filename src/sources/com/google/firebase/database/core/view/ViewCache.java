package com.google.firebase.database.core.view;

import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheNode f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheNode f19486b;

    public ViewCache(CacheNode cacheNode, CacheNode cacheNode2) {
        this.f19485a = cacheNode;
        this.f19486b = cacheNode2;
    }

    public final Node a() {
        CacheNode cacheNode = this.f19485a;
        if (cacheNode.f19445b) {
            return cacheNode.f19444a.f19539a;
        }
        return null;
    }

    public final Node b() {
        CacheNode cacheNode = this.f19486b;
        if (cacheNode.f19445b) {
            return cacheNode.f19444a.f19539a;
        }
        return null;
    }

    public final ViewCache c(IndexedNode indexedNode, boolean z11, boolean z12) {
        return new ViewCache(new CacheNode(indexedNode, z11, z12), this.f19486b);
    }
}
