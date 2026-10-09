package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RangedFilter implements NodeFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexedFilter f19499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Index f19500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NamedNode f19501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NamedNode f19502d;

    public RangedFilter(QueryParams queryParams) {
        NamedNode namedNodeC;
        NamedNode namedNodeD;
        Index index = queryParams.f19473g;
        this.f19499a = new IndexedFilter(index);
        this.f19500b = index;
        if (!queryParams.e()) {
            queryParams.f19473g.getClass();
            namedNodeC = NamedNode.f19547c;
        } else {
            if (!queryParams.e()) {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
            ChildKey childKey = queryParams.f19470d;
            childKey = childKey == null ? ChildKey.f19510b : childKey;
            Index index2 = queryParams.f19473g;
            if (!queryParams.e()) {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
            namedNodeC = index2.c(childKey, queryParams.f19469c);
        }
        this.f19501c = namedNodeC;
        if (!queryParams.c()) {
            namedNodeD = queryParams.f19473g.d();
        } else {
            if (!queryParams.c()) {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
            ChildKey childKey2 = queryParams.f19472f;
            childKey2 = childKey2 == null ? ChildKey.f19511c : childKey2;
            Index index3 = queryParams.f19473g;
            if (!queryParams.c()) {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
            namedNodeD = index3.c(childKey2, queryParams.f19471e);
        }
        this.f19502d = namedNodeD;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedFilter a() {
        return this.f19499a;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final boolean c() {
        return true;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode d(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        if (!f(new NamedNode(childKey, node))) {
            node = EmptyNode.f19537e;
        }
        return this.f19499a.d(indexedNode, childKey, node, path, completeChildSource, childChangeAccumulator);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode e(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        IndexedNode indexedNodeE;
        if (indexedNode2.f19539a.T0()) {
            indexedNodeE = new IndexedNode(EmptyNode.f19537e, this.f19500b);
        } else {
            IndexedNode indexedNode3 = new IndexedNode(indexedNode2.f19539a.S(EmptyNode.f19537e), indexedNode2.f19541c, indexedNode2.f19540b);
            indexedNodeE = indexedNode3;
            for (NamedNode namedNode : indexedNode2) {
                if (!f(namedNode)) {
                    indexedNodeE = indexedNodeE.e(namedNode.f19549a, EmptyNode.f19537e);
                }
            }
        }
        this.f19499a.e(indexedNode, indexedNodeE, childChangeAccumulator);
        return indexedNodeE;
    }

    public final boolean f(NamedNode namedNode) {
        NamedNode namedNode2 = this.f19501c;
        Index index = this.f19500b;
        return index.compare(namedNode2, namedNode) <= 0 && index.compare(namedNode, this.f19502d) <= 0;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final Index getIndex() {
        return this.f19500b;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public final IndexedNode b(IndexedNode indexedNode, Node node) {
        return indexedNode;
    }
}
