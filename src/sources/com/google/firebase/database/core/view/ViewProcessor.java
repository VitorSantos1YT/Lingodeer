package com.google.firebase.database.core.view;

import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.WriteTree;
import com.google.firebase.database.core.WriteTreeRef;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.filter.ChildChangeAccumulator;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.KeyIndex;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NodeFilter.CompleteChildSource f19487b = new NodeFilter.CompleteChildSource() { // from class: com.google.firebase.database.core.view.ViewProcessor.1
        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public final NamedNode a(Index index, NamedNode namedNode, boolean z11) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NodeFilter f19488a;

    /* JADX INFO: renamed from: com.google.firebase.database.core.view.ViewProcessor$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19489a;

        static {
            int[] iArr = new int[Operation.OperationType.values().length];
            f19489a = iArr;
            try {
                iArr[Operation.OperationType.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19489a[Operation.OperationType.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19489a[Operation.OperationType.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19489a[Operation.OperationType.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ProcessorResult {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WriteTreeCompleteChildSource implements NodeFilter.CompleteChildSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WriteTreeRef f19490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewCache f19491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Node f19492c;

        public WriteTreeCompleteChildSource(WriteTreeRef writeTreeRef, ViewCache viewCache, Node node) {
            this.f19490a = writeTreeRef;
            this.f19491b = viewCache;
            this.f19492c = node;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0031  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Code duplicated, block: B:17:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0046 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0048  */
        /* JADX WARN: Code duplicated, block: B:22:0x004d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x002b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x002b A[SYNTHETIC] */
        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public final NamedNode a(Index index, NamedNode namedNode, boolean z11) {
            int iCompare;
            int iCompare2;
            Node nodeB = this.f19492c;
            if (nodeB == null) {
                nodeB = this.f19491b.b();
            }
            WriteTreeRef writeTreeRef = this.f19490a;
            WriteTree writeTree = writeTreeRef.f19378b;
            CompoundWrite compoundWriteG = writeTree.f19371a.g(writeTreeRef.f19377a);
            Node nodeJ = compoundWriteG.j(Path.f19210d);
            NamedNode namedNode2 = null;
            if (nodeJ != null) {
                for (NamedNode namedNode3 : nodeJ) {
                    if (z11) {
                        iCompare = index.compare(namedNode, namedNode3);
                    } else {
                        iCompare = index.compare(namedNode3, namedNode);
                    }
                    if (iCompare <= 0) {
                        if (namedNode2 == null) {
                            if (z11) {
                                iCompare2 = index.compare(namedNode2, namedNode3);
                            } else {
                                iCompare2 = index.compare(namedNode3, namedNode2);
                            }
                            if (iCompare2 < 0) {
                            }
                        }
                        namedNode2 = namedNode3;
                    }
                }
            } else if (nodeB != null) {
                nodeJ = compoundWriteG.e(nodeB);
                while (r0.hasNext()) {
                    if (z11) {
                        iCompare = index.compare(namedNode, namedNode3);
                    } else {
                        iCompare = index.compare(namedNode3, namedNode);
                    }
                    if (iCompare <= 0) {
                        if (namedNode2 == null) {
                            if (z11) {
                                iCompare2 = index.compare(namedNode2, namedNode3);
                            } else {
                                iCompare2 = index.compare(namedNode3, namedNode2);
                            }
                            if (iCompare2 < 0) {
                            }
                        }
                        namedNode2 = namedNode3;
                    }
                }
            }
            return namedNode2;
        }
    }

    public ViewProcessor(NodeFilter nodeFilter) {
        this.f19488a = nodeFilter;
    }

    public final ViewCache a(ViewCache viewCache, Path path, CompoundWrite compoundWrite, WriteTreeRef writeTreeRef, Node node, boolean z11, ChildChangeAccumulator childChangeAccumulator) {
        ViewCache viewCacheB;
        Map.Entry entry;
        ChildKey childKey;
        CacheNode cacheNode = viewCache.f19486b;
        if (cacheNode.f19444a.f19539a.isEmpty() && !cacheNode.f19445b) {
            return viewCache;
        }
        char[] cArr = Utilities.f19432a;
        CompoundWrite compoundWriteD = path.isEmpty() ? compoundWrite : CompoundWrite.f19184b.d(path, compoundWrite);
        Node node2 = cacheNode.f19444a.f19539a;
        compoundWriteD.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry2 : compoundWriteD.f19185a.f19418b) {
            map.put((ChildKey) entry2.getKey(), new CompoundWrite((ImmutableTree) entry2.getValue()));
        }
        Iterator it = map.entrySet().iterator();
        loop1: while (true) {
            viewCacheB = viewCache;
            do {
                if (!it.hasNext()) {
                    break loop1;
                }
                entry = (Map.Entry) it.next();
                childKey = (ChildKey) entry.getKey();
            } while (!node2.c1(childKey));
            viewCache = b(viewCacheB, new Path(childKey), ((CompoundWrite) entry.getValue()).e(node2.x0(childKey)), writeTreeRef, node, z11, childChangeAccumulator);
        }
        for (Map.Entry entry3 : map.entrySet()) {
            ChildKey childKey2 = (ChildKey) entry3.getKey();
            boolean z12 = !cacheNode.a(childKey2) && ((Node) ((CompoundWrite) entry3.getValue()).f19185a.f19417a) == null;
            if (!node2.c1(childKey2) && !z12) {
                viewCacheB = b(viewCacheB, new Path(childKey2), ((CompoundWrite) entry3.getValue()).e(node2.x0(childKey2)), writeTreeRef, node, z11, childChangeAccumulator);
            }
        }
        return viewCacheB;
    }

    public final ViewCache b(ViewCache viewCache, Path path, Node node, WriteTreeRef writeTreeRef, Node node2, boolean z11, ChildChangeAccumulator childChangeAccumulator) {
        Path path2;
        IndexedNode indexedNodeB;
        CacheNode cacheNode = viewCache.f19486b;
        IndexedNode indexedNode = cacheNode.f19444a;
        NodeFilter nodeFilterA = this.f19488a;
        if (!z11) {
            nodeFilterA = nodeFilterA.a();
        }
        NodeFilter nodeFilter = nodeFilterA;
        boolean z12 = true;
        if (!path.isEmpty()) {
            if (!nodeFilter.c() || cacheNode.f19446c) {
                ChildKey childKeyK = path.k();
                path2 = path;
                if (!cacheNode.b(path2) && path2.size() > 1) {
                    return viewCache;
                }
                Path pathN = path2.n();
                Node nodeI0 = indexedNode.f19539a.x0(childKeyK).i0(pathN, node);
                indexedNodeB = childKeyK.equals(ChildKey.f19512d) ? nodeFilter.b(indexedNode, nodeI0) : nodeFilter.d(cacheNode.f19444a, childKeyK, nodeI0, pathN, f19487b, null);
            } else {
                char[] cArr = Utilities.f19432a;
                ChildKey childKeyK2 = path.k();
                indexedNodeB = nodeFilter.e(indexedNode, indexedNode.e(childKeyK2, indexedNode.f19539a.x0(childKeyK2).i0(path.n(), node)), null);
            }
            if (!cacheNode.f19445b && !path2.isEmpty()) {
                z12 = false;
            }
            ViewCache viewCache2 = new ViewCache(viewCache.f19485a, new CacheNode(indexedNodeB, z12, nodeFilter.c()));
            return d(viewCache2, path, writeTreeRef, new WriteTreeCompleteChildSource(writeTreeRef, viewCache2, node2), childChangeAccumulator);
        }
        indexedNodeB = nodeFilter.e(indexedNode, new IndexedNode(node, nodeFilter.getIndex()), null);
        path2 = path;
        if (!cacheNode.f19445b) {
            z12 = false;
        }
        ViewCache viewCache3 = new ViewCache(viewCache.f19485a, new CacheNode(indexedNodeB, z12, nodeFilter.c()));
        return d(viewCache3, path, writeTreeRef, new WriteTreeCompleteChildSource(writeTreeRef, viewCache3, node2), childChangeAccumulator);
    }

    public final ViewCache c(ViewCache viewCache, Path path, Node node, WriteTreeRef writeTreeRef, Node node2, ChildChangeAccumulator childChangeAccumulator) {
        Node nodeA;
        Node nodeI0;
        Node node3;
        CacheNode cacheNode = viewCache.f19485a;
        boolean z11 = cacheNode.f19445b;
        IndexedNode indexedNode = cacheNode.f19444a;
        WriteTreeCompleteChildSource writeTreeCompleteChildSource = new WriteTreeCompleteChildSource(writeTreeRef, viewCache, node2);
        boolean zIsEmpty = path.isEmpty();
        NodeFilter nodeFilter = this.f19488a;
        if (zIsEmpty) {
            return viewCache.c(nodeFilter.e(indexedNode, new IndexedNode(node, nodeFilter.getIndex()), childChangeAccumulator), true, nodeFilter.c());
        }
        ChildKey childKeyK = path.k();
        ChildKey childKey = ChildKey.f19512d;
        if (childKeyK.equals(childKey)) {
            return viewCache.c(nodeFilter.b(indexedNode, node), z11, cacheNode.f19446c);
        }
        Path pathN = path.n();
        Node nodeX0 = cacheNode.f19444a.f19539a.x0(childKeyK);
        if (pathN.isEmpty()) {
            node3 = node;
            nodeFilter = nodeFilter;
        } else {
            if (cacheNode.a(childKeyK)) {
                nodeA = indexedNode.f19539a.x0(childKeyK);
                nodeFilter = nodeFilter;
            } else {
                nodeA = writeTreeRef.a(childKeyK, node2 != null ? new CacheNode(new IndexedNode(node2, KeyIndex.f19542a), true, false) : viewCache.f19486b);
            }
            if (nodeA == null) {
                nodeI0 = EmptyNode.f19537e;
            } else if (pathN.j().equals(childKey) && nodeA.I(pathN.l()).isEmpty()) {
                node3 = nodeA;
            } else {
                nodeI0 = nodeA.i0(pathN, node);
            }
            node3 = nodeI0;
        }
        if (nodeX0.equals(node3)) {
            return viewCache;
        }
        return viewCache.c(nodeFilter.d(cacheNode.f19444a, childKeyK, node3, pathN, writeTreeCompleteChildSource, childChangeAccumulator), z11, nodeFilter.c());
    }

    public final ViewCache d(ViewCache viewCache, Path path, WriteTreeRef writeTreeRef, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        Node nodeA;
        Node nodeA2;
        CacheNode cacheNode = viewCache.f19485a;
        IndexedNode indexedNodeD = cacheNode.f19444a;
        CacheNode cacheNode2 = viewCache.f19486b;
        IndexedNode indexedNode = cacheNode2.f19444a;
        if (writeTreeRef.d(path) != null) {
            return viewCache;
        }
        boolean zIsEmpty = path.isEmpty();
        NodeFilter nodeFilter = this.f19488a;
        if (zIsEmpty) {
            char[] cArr = Utilities.f19432a;
            if (cacheNode2.f19446c) {
                Node nodeB = viewCache.b();
                if (!(nodeB instanceof ChildrenNode)) {
                    nodeB = EmptyNode.f19537e;
                }
                nodeA2 = writeTreeRef.b(nodeB);
            } else {
                nodeA2 = writeTreeRef.f19378b.a(writeTreeRef.f19377a, viewCache.b(), Collections.EMPTY_LIST, false);
            }
            indexedNodeD = nodeFilter.e(cacheNode.f19444a, new IndexedNode(nodeA2, nodeFilter.getIndex()), childChangeAccumulator);
        } else {
            ChildKey childKeyK = path.k();
            if (childKeyK.equals(ChildKey.f19512d)) {
                char[] cArr2 = Utilities.f19432a;
                Node nodeC = writeTreeRef.c(path, indexedNodeD.f19539a, indexedNode.f19539a);
                if (nodeC != null) {
                    indexedNodeD = nodeFilter.b(indexedNodeD, nodeC);
                }
            } else {
                Path pathN = path.n();
                if (cacheNode.a(childKeyK)) {
                    Node node = indexedNode.f19539a;
                    Node node2 = indexedNodeD.f19539a;
                    Node node3 = indexedNodeD.f19539a;
                    Node nodeC2 = writeTreeRef.c(path, node2, node);
                    nodeA = nodeC2 != null ? node3.x0(childKeyK).i0(pathN, nodeC2) : node3.x0(childKeyK);
                } else {
                    nodeA = writeTreeRef.a(childKeyK, cacheNode2);
                }
                Node node4 = nodeA;
                if (node4 != null) {
                    indexedNodeD = nodeFilter.d(cacheNode.f19444a, childKeyK, node4, pathN, completeChildSource, childChangeAccumulator);
                }
            }
        }
        return viewCache.c(indexedNodeD, cacheNode.f19445b || path.isEmpty(), nodeFilter.c());
    }
}
