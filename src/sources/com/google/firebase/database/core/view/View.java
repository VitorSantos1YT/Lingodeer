package com.google.firebase.database.core.view;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.WriteTree;
import com.google.firebase.database.core.WriteTreeRef;
import com.google.firebase.database.core.operation.AckUserWrite;
import com.google.firebase.database.core.operation.Merge;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.operation.OperationSource;
import com.google.firebase.database.core.operation.Overwrite;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.filter.ChildChangeAccumulator;
import com.google.firebase.database.core.view.filter.IndexedFilter;
import com.google.firebase.database.core.view.filter.LimitedFilter;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.core.view.filter.RangedFilter;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuerySpec f19478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewProcessor f19479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewCache f19480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EventGenerator f19482e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OperationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f19484b;

        public OperationResult(ArrayList arrayList, ArrayList arrayList2) {
            this.f19483a = arrayList;
            this.f19484b = arrayList2;
        }
    }

    public View(QuerySpec querySpec, ViewCache viewCache) {
        this.f19478a = querySpec;
        QueryParams queryParams = querySpec.f19477b;
        IndexedFilter indexedFilter = new IndexedFilter(queryParams.f19473g);
        NodeFilter indexedFilter2 = queryParams.h() ? new IndexedFilter(queryParams.f19473g) : queryParams.d() ? new LimitedFilter(queryParams) : new RangedFilter(queryParams);
        this.f19479b = new ViewProcessor(indexedFilter2);
        CacheNode cacheNode = viewCache.f19486b;
        CacheNode cacheNode2 = viewCache.f19485a;
        IndexedNode indexedNode = new IndexedNode(EmptyNode.f19537e, querySpec.f19477b.f19473g);
        IndexedNode indexedNode2 = cacheNode.f19444a;
        indexedFilter.e(indexedNode, indexedNode2, null);
        this.f19480c = new ViewCache(new CacheNode(indexedFilter2.e(indexedNode, cacheNode2.f19444a, null), cacheNode2.f19445b, indexedFilter2.c()), new CacheNode(indexedNode2, cacheNode.f19445b, false));
        this.f19481d = new ArrayList();
        this.f19482e = new EventGenerator(querySpec);
    }

    public final OperationResult a(Operation operation, WriteTreeRef writeTreeRef, Node node) {
        ViewCache viewCache;
        boolean z11;
        ViewCache viewCacheB;
        ViewProcessor viewProcessor;
        boolean z12;
        IndexedNode indexedNodeE;
        ViewCache viewCacheC;
        ChildChangeAccumulator childChangeAccumulator;
        ViewCache viewCache2;
        ViewCache viewCache3;
        WriteTreeRef writeTreeRef2 = writeTreeRef;
        Path path = writeTreeRef2.f19377a;
        WriteTree writeTree = writeTreeRef2.f19378b;
        Operation.OperationType operationType = operation.f19389a;
        if (operationType == Operation.OperationType.Merge && operation.f19390b.f19395b != null) {
            this.f19480c.b();
            char[] cArr = Utilities.f19432a;
            this.f19480c.a();
        }
        ViewCache viewCacheA = this.f19480c;
        ViewProcessor viewProcessor2 = this.f19479b;
        viewProcessor2.getClass();
        NodeFilter nodeFilter = viewProcessor2.f19488a;
        ChildChangeAccumulator childChangeAccumulator2 = new ChildChangeAccumulator();
        int i11 = ViewProcessor.AnonymousClass2.f19489a[operationType.ordinal()];
        if (i11 == 1) {
            viewCache = viewCacheA;
            z11 = true;
            Overwrite overwrite = (Overwrite) operation;
            OperationSource operationSource = overwrite.f19390b;
            if (operationSource.c()) {
                viewCacheB = viewProcessor2.c(viewCache, overwrite.f19391c, overwrite.f19397d, writeTreeRef, node, childChangeAccumulator2);
            } else {
                operationSource.b();
                char[] cArr2 = Utilities.f19432a;
                viewCacheB = viewProcessor2.b(viewCache, overwrite.f19391c, overwrite.f19397d, writeTreeRef, node, operationSource.f19396c || (viewCache.f19486b.f19446c && !overwrite.f19391c.isEmpty()), childChangeAccumulator2);
            }
        } else if (i11 != 2) {
            if (i11 == 3) {
                AckUserWrite ackUserWrite = (AckUserWrite) operation;
                Path path2 = ackUserWrite.f19391c;
                if (ackUserWrite.f19386d) {
                    if (writeTreeRef2.d(path2) != null) {
                        viewCacheC = viewCacheA;
                        z11 = true;
                    } else {
                        ViewProcessor.WriteTreeCompleteChildSource writeTreeCompleteChildSource = new ViewProcessor.WriteTreeCompleteChildSource(writeTreeRef2, viewCacheA, node);
                        CacheNode cacheNode = viewCacheA.f19485a;
                        CacheNode cacheNode2 = viewCacheA.f19486b;
                        boolean z13 = cacheNode2.f19445b;
                        IndexedNode indexedNode = cacheNode.f19444a;
                        if (path2.isEmpty() || path2.k().equals(ChildKey.f19512d)) {
                            z12 = z13;
                            z11 = true;
                            indexedNodeE = nodeFilter.e(indexedNode, new IndexedNode(z12 ? writeTree.a(path, viewCacheA.b(), Collections.EMPTY_LIST, false) : writeTreeRef2.b(cacheNode2.f19444a.f19539a), nodeFilter.getIndex()), childChangeAccumulator2);
                        } else {
                            ChildKey childKeyK = path2.k();
                            Node nodeA = writeTreeRef2.a(childKeyK, cacheNode2);
                            if (nodeA == null && cacheNode2.a(childKeyK)) {
                                nodeA = indexedNode.f19539a.x0(childKeyK);
                            }
                            if (nodeA != null) {
                                z12 = z13;
                                z11 = true;
                                indexedNodeE = nodeFilter.d(indexedNode, childKeyK, nodeA, path2.n(), writeTreeCompleteChildSource, childChangeAccumulator2);
                            } else {
                                z12 = z13;
                                z11 = true;
                                indexedNodeE = (nodeA == null && viewCacheA.f19485a.f19444a.f19539a.c1(childKeyK)) ? nodeFilter.d(indexedNode, childKeyK, EmptyNode.f19537e, path2.n(), writeTreeCompleteChildSource, childChangeAccumulator2) : indexedNode;
                            }
                            if (indexedNodeE.f19539a.isEmpty() && z12) {
                                Node nodeA2 = writeTree.a(path, viewCacheA.b(), Collections.EMPTY_LIST, false);
                                if (nodeA2.T0()) {
                                    indexedNodeE = nodeFilter.e(indexedNodeE, new IndexedNode(nodeA2, nodeFilter.getIndex()), childChangeAccumulator2);
                                }
                            }
                        }
                        viewCacheC = viewCacheA.c(indexedNodeE, (z12 || writeTreeRef2.d(Path.f19210d) != null) ? z11 : false, nodeFilter.c());
                    }
                    viewCache = viewCacheA;
                    viewCacheB = viewCacheC;
                } else {
                    ImmutableTree immutableTree = ackUserWrite.f19387e;
                    if (writeTreeRef2.d(path2) != null) {
                        viewCache3 = viewCacheA;
                    } else {
                        CacheNode cacheNode3 = viewCacheA.f19486b;
                        boolean z14 = cacheNode3.f19446c;
                        IndexedNode indexedNode2 = cacheNode3.f19444a;
                        if (immutableTree.f19417a == null) {
                            childChangeAccumulator = childChangeAccumulator2;
                            CompoundWrite compoundWriteB = CompoundWrite.f19184b;
                            Iterator it = immutableTree.iterator();
                            while (it.hasNext()) {
                                Path path3 = (Path) ((Map.Entry) it.next()).getKey();
                                Path pathE = path2.e(path3);
                                if (cacheNode3.b(pathE)) {
                                    compoundWriteB = compoundWriteB.b(path3, indexedNode2.f19539a.I(pathE));
                                }
                            }
                            viewCache2 = viewCacheA;
                            viewCacheA = viewProcessor2.a(viewCache2, path2, compoundWriteB, writeTreeRef, node, z14, childChangeAccumulator);
                        } else if ((path2.isEmpty() && cacheNode3.f19445b) || cacheNode3.b(path2)) {
                            viewCacheA = viewProcessor2.b(viewCacheA, path2, indexedNode2.f19539a.I(path2), writeTreeRef2, node, z14, childChangeAccumulator2);
                            viewCache3 = viewCacheA;
                        } else {
                            viewCache2 = viewCacheA;
                            childChangeAccumulator = childChangeAccumulator2;
                            if (path2.isEmpty()) {
                                CompoundWrite compoundWriteB2 = CompoundWrite.f19184b;
                                for (NamedNode namedNode : indexedNode2.f19539a) {
                                    ChildKey childKey = namedNode.f19549a;
                                    Node node2 = namedNode.f19550b;
                                    compoundWriteB2.getClass();
                                    compoundWriteB2 = compoundWriteB2.b(new Path(childKey), node2);
                                }
                                viewCacheA = viewProcessor2.a(viewCache2, path2, compoundWriteB2, writeTreeRef, node, z14, childChangeAccumulator);
                            } else {
                                viewCache3 = viewCache2;
                                viewCacheA = viewCache3;
                            }
                            childChangeAccumulator2 = childChangeAccumulator;
                        }
                        viewCache3 = viewCache2;
                        childChangeAccumulator2 = childChangeAccumulator;
                    }
                    viewCache = viewCache3;
                    viewCacheB = viewCacheA;
                }
            } else {
                if (i11 != 4) {
                    throw new AssertionError("Unknown operation: " + operationType);
                }
                Path path4 = operation.f19391c;
                CacheNode cacheNode4 = viewCacheA.f19486b;
                viewCacheB = viewProcessor2.d(new ViewCache(viewCacheA.f19485a, new CacheNode(cacheNode4.f19444a, cacheNode4.f19445b || path4.isEmpty(), cacheNode4.f19446c)), path4, writeTreeRef, ViewProcessor.f19487b, childChangeAccumulator2);
                viewCache = viewCacheA;
            }
            z11 = true;
        } else {
            ViewProcessor viewProcessor3 = viewProcessor2;
            ViewCache viewCache4 = viewCacheA;
            z11 = true;
            Merge merge = (Merge) operation;
            OperationSource operationSource2 = merge.f19390b;
            if (operationSource2.c()) {
                Path path5 = merge.f19391c;
                ImmutableTree<Map.Entry> immutableTree2 = merge.f19388d.f19185a;
                char[] cArr3 = Utilities.f19432a;
                ViewCache viewCacheC2 = viewCache4;
                for (Map.Entry entry : immutableTree2) {
                    Path pathE2 = path5.e((Path) entry.getKey());
                    if (viewCache4.f19485a.a(pathE2.k())) {
                        viewProcessor = viewProcessor3;
                        viewCacheC2 = viewProcessor.c(viewCacheC2, pathE2, (Node) entry.getValue(), writeTreeRef2, node, childChangeAccumulator2);
                    } else {
                        viewProcessor = viewProcessor3;
                    }
                    writeTreeRef2 = writeTreeRef;
                    viewProcessor3 = viewProcessor;
                    viewCache4 = viewCache4;
                }
                ViewCache viewCache5 = viewCache4;
                ViewProcessor viewProcessor4 = viewProcessor3;
                ViewCache viewCacheC3 = viewCacheC2;
                for (Map.Entry entry2 : immutableTree2) {
                    Path pathE3 = path5.e((Path) entry2.getKey());
                    if (!viewCache5.f19485a.a(pathE3.k())) {
                        viewCacheC3 = viewProcessor4.c(viewCacheC3, pathE3, (Node) entry2.getValue(), writeTreeRef, node, childChangeAccumulator2);
                    }
                }
                viewCacheB = viewCacheC3;
                viewCache = viewCache5;
            } else {
                operationSource2.b();
                char[] cArr4 = Utilities.f19432a;
                viewCache = viewCache4;
                viewCacheB = viewProcessor3.a(viewCache, merge.f19391c, merge.f19388d, writeTreeRef, node, operationSource2.f19396c || viewCache4.f19486b.f19446c, childChangeAccumulator2);
            }
        }
        ArrayList arrayList = new ArrayList(new ArrayList(childChangeAccumulator2.f19493a.values()));
        CacheNode cacheNode5 = viewCacheB.f19485a;
        boolean z15 = cacheNode5.f19445b;
        IndexedNode indexedNode3 = cacheNode5.f19444a;
        if (z15) {
            Node node3 = indexedNode3.f19539a;
            boolean z16 = (node3.T0() || node3.isEmpty()) ? z11 : false;
            if (!arrayList.isEmpty() || !viewCache.f19485a.f19445b || ((z16 && !node3.equals(viewCache.a())) || !node3.y().equals(viewCache.a().y()))) {
                arrayList.add(new Change(Event.EventType.VALUE, indexedNode3, null, null, null));
            }
        }
        if (!viewCacheB.f19486b.f19445b) {
            boolean z17 = viewCache.f19486b.f19445b;
        }
        char[] cArr5 = Utilities.f19432a;
        this.f19480c = viewCacheB;
        return new OperationResult(b(arrayList, viewCacheB.f19485a.f19444a, null), arrayList);
    }

    public final ArrayList b(ArrayList arrayList, IndexedNode indexedNode, EventRegistration eventRegistration) {
        List listAsList = eventRegistration == null ? this.f19481d : Arrays.asList(eventRegistration);
        EventGenerator eventGenerator = this.f19482e;
        eventGenerator.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Change change = (Change) obj;
            if (change.f19450a.equals(Event.EventType.CHILD_CHANGED)) {
                Index index = eventGenerator.f19460b;
                Node node = change.f19452c.f19539a;
                Node node2 = change.f19451b.f19539a;
                index.getClass();
                ChildKey childKey = ChildKey.f19510b;
                if (index.compare(new NamedNode(childKey, node), new NamedNode(childKey, node2)) != 0) {
                    arrayList3.add(new Change(Event.EventType.CHILD_MOVED, change.f19451b, change.f19453d, null, null));
                }
            }
        }
        eventGenerator.a(arrayList2, Event.EventType.CHILD_REMOVED, arrayList, listAsList, indexedNode);
        eventGenerator.a(arrayList2, Event.EventType.CHILD_ADDED, arrayList, listAsList, indexedNode);
        eventGenerator.a(arrayList2, Event.EventType.CHILD_MOVED, arrayList3, listAsList, indexedNode);
        eventGenerator.a(arrayList2, Event.EventType.CHILD_CHANGED, arrayList, listAsList, indexedNode);
        eventGenerator.a(arrayList2, Event.EventType.VALUE, arrayList, listAsList, indexedNode);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final List c(EventRegistration eventRegistration, DatabaseError databaseError) {
        ?? arrayList;
        int i11 = 0;
        ArrayList arrayList2 = this.f19481d;
        if (databaseError != null) {
            arrayList = new ArrayList();
            char[] cArr = Utilities.f19432a;
            Path path = this.f19478a.f19476a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                arrayList.add(new CancelEvent((EventRegistration) obj, databaseError, path));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        if (eventRegistration == null) {
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((EventRegistration) obj2).h();
            }
            arrayList2.clear();
            return arrayList;
        }
        int i13 = -1;
        while (true) {
            if (i11 >= arrayList2.size()) {
                i11 = i13;
                break;
            }
            EventRegistration eventRegistration2 = (EventRegistration) arrayList2.get(i11);
            if (eventRegistration2.f(eventRegistration)) {
                if (eventRegistration2.f19207a.get()) {
                    break;
                }
                i13 = i11;
            }
            i11++;
        }
        if (i11 != -1) {
            EventRegistration eventRegistration3 = (EventRegistration) arrayList2.get(i11);
            arrayList2.remove(i11);
            eventRegistration3.h();
        }
        return arrayList;
    }
}
