package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.collection.LLRBNode;
import com.google.firebase.database.connection.CompoundHash;
import com.google.firebase.database.connection.ListenHashProvider;
import com.google.firebase.database.core.Path.AnonymousClass1;
import com.google.firebase.database.core.operation.AckUserWrite;
import com.google.firebase.database.core.operation.ListenComplete;
import com.google.firebase.database.core.operation.Merge;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.operation.OperationSource;
import com.google.firebase.database.core.operation.Overwrite;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.utilities.Clock;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.NodeSizeEstimator;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.CacheNode;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.core.view.View;
import com.google.firebase.database.core.view.ViewCache;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SyncTree {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListenProvider f19300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NoopPersistenceManager f19301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LogWrapper f19302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19303h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableTree f19296a = ImmutableTree.f19416d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WriteTree f19297b = new WriteTree();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19298c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19299d = new HashMap();

    /* JADX INFO: renamed from: com.google.firebase.database.core.SyncTree$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass11 implements Callable<Void> {
        @Override // java.util.concurrent.Callable
        public final Void call() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.SyncTree$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass12 implements Callable<Void> {
        @Override // java.util.concurrent.Callable
        public final Void call() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.SyncTree$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Callable<List<? extends Event>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f19327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Path f19328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f19329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CompoundWrite f19330d;

        public AnonymousClass2(boolean z11, Path path, CompoundWrite compoundWrite, long j11, CompoundWrite compoundWrite2) {
            this.f19327a = z11;
            this.f19328b = path;
            this.f19329c = j11;
            this.f19330d = compoundWrite2;
        }

        @Override // java.util.concurrent.Callable
        public final List<? extends Event> call() {
            boolean z11 = this.f19327a;
            SyncTree syncTree = SyncTree.this;
            if (z11) {
                syncTree.f19301f.getClass();
                char[] cArr = Utilities.f19432a;
            }
            WriteTree writeTree = syncTree.f19297b;
            long j11 = this.f19329c;
            Long lValueOf = Long.valueOf(j11);
            writeTree.getClass();
            writeTree.f19373c.getClass();
            char[] cArr2 = Utilities.f19432a;
            ArrayList arrayList = writeTree.f19372b;
            Path path = this.f19328b;
            CompoundWrite compoundWrite = this.f19330d;
            arrayList.add(new UserWriteRecord(j11, path, compoundWrite));
            writeTree.f19371a = writeTree.f19371a.d(path, compoundWrite);
            writeTree.f19373c = lValueOf;
            return SyncTree.a(syncTree, new Merge(OperationSource.f19392d, path, compoundWrite));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.SyncTree$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements Callable<List<? extends Event>> {
        @Override // java.util.concurrent.Callable
        public final List<? extends Event> call() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.SyncTree$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 implements Callable<List<? extends Event>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Tag f19347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Path f19348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Node f19349c;

        public AnonymousClass9(Tag tag, Path path, Node node) {
            this.f19347a = tag;
            this.f19348b = path;
            this.f19349c = node;
        }

        @Override // java.util.concurrent.Callable
        public final List<? extends Event> call() {
            Tag tag = this.f19347a;
            SyncTree syncTree = SyncTree.this;
            QuerySpec querySpec = (QuerySpec) syncTree.f19298c.get(tag);
            if (querySpec == null) {
                return Collections.EMPTY_LIST;
            }
            Path path = querySpec.f19476a;
            Path path2 = this.f19348b;
            Path pathM = Path.m(path, path2);
            if (!pathM.isEmpty()) {
                QuerySpec.a(path2);
            }
            syncTree.f19301f.getClass();
            char[] cArr = Utilities.f19432a;
            return SyncTree.b(syncTree, querySpec, new Overwrite(OperationSource.a(querySpec.f19477b), pathM, this.f19349c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CompletionListener {
        List a(DatabaseError databaseError);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ListenContainer implements ListenHashProvider, CompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f19352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Tag f19353b;

        public ListenContainer(View view) {
            this.f19352a = view;
            this.f19353b = SyncTree.this.m(view.f19478a);
        }

        @Override // com.google.firebase.database.core.SyncTree.CompletionListener
        public final List a(DatabaseError databaseError) {
            final SyncTree syncTree = SyncTree.this;
            NoopPersistenceManager noopPersistenceManager = syncTree.f19301f;
            View view = this.f19352a;
            if (databaseError == null) {
                QuerySpec querySpec = view.f19478a;
                final Tag tag = this.f19353b;
                if (tag != null) {
                    return (List) noopPersistenceManager.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.8
                        @Override // java.util.concurrent.Callable
                        public final List<? extends Event> call() {
                            Tag tag2 = tag;
                            SyncTree syncTree2 = SyncTree.this;
                            QuerySpec querySpec2 = (QuerySpec) syncTree2.f19298c.get(tag2);
                            if (querySpec2 == null) {
                                return Collections.EMPTY_LIST;
                            }
                            syncTree2.f19301f.getClass();
                            char[] cArr = Utilities.f19432a;
                            return SyncTree.b(syncTree2, querySpec2, new ListenComplete(OperationSource.a(querySpec2.f19477b), Path.f19210d));
                        }
                    });
                }
                final Path path = querySpec.f19476a;
                return (List) noopPersistenceManager.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.7
                    @Override // java.util.concurrent.Callable
                    public final List<? extends Event> call() {
                        SyncTree syncTree2 = SyncTree.this;
                        NoopPersistenceManager noopPersistenceManager2 = syncTree2.f19301f;
                        Path path2 = path;
                        QuerySpec.a(path2);
                        noopPersistenceManager2.getClass();
                        char[] cArr = Utilities.f19432a;
                        return SyncTree.a(syncTree2, new ListenComplete(OperationSource.f19393e, path2));
                    }
                });
            }
            syncTree.f19302g.e("Listen at " + view.f19478a.f19476a + " failed: " + databaseError.toString());
            return syncTree.l(view.f19478a, null, databaseError);
        }

        @Override // com.google.firebase.database.connection.ListenHashProvider
        public final CompoundHash b() {
            com.google.firebase.database.snapshot.CompoundHash compoundHashA = com.google.firebase.database.snapshot.CompoundHash.a(this.f19352a.f19480c.f19486b.f19444a.f19539a);
            List listUnmodifiableList = Collections.unmodifiableList(compoundHashA.f19523a);
            ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList.add(((Path) it.next()).b());
            }
            return new CompoundHash(arrayList, Collections.unmodifiableList(compoundHashA.f19524b));
        }

        @Override // com.google.firebase.database.connection.ListenHashProvider
        public final boolean c() {
            return NodeSizeEstimator.b(this.f19352a.f19480c.f19486b.f19444a.f19539a) > 1024;
        }

        @Override // com.google.firebase.database.connection.ListenHashProvider
        public final String d() {
            return this.f19352a.f19480c.f19486b.f19444a.f19539a.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ListenProvider {
        void a(QuerySpec querySpec);

        void b(QuerySpec querySpec, Tag tag, ListenHashProvider listenHashProvider, CompletionListener completionListener);
    }

    public SyncTree(Context context, NoopPersistenceManager noopPersistenceManager, ListenProvider listenProvider) {
        new HashSet();
        this.f19300e = listenProvider;
        this.f19301f = noopPersistenceManager;
        this.f19302g = context.b("SyncTree");
    }

    public static ArrayList a(SyncTree syncTree, Operation operation) {
        ImmutableTree immutableTree = syncTree.f19296a;
        WriteTree writeTree = syncTree.f19297b;
        Path path = Path.f19210d;
        writeTree.getClass();
        return syncTree.f(operation, immutableTree, null, new WriteTreeRef(path, writeTree));
    }

    public static List b(SyncTree syncTree, QuerySpec querySpec, Operation operation) {
        syncTree.getClass();
        Path path = querySpec.f19476a;
        SyncPoint syncPoint = (SyncPoint) syncTree.f19296a.e(path);
        char[] cArr = Utilities.f19432a;
        WriteTree writeTree = syncTree.f19297b;
        writeTree.getClass();
        return syncPoint.a(operation, new WriteTreeRef(path, writeTree), null);
    }

    public static void j(ImmutableTree immutableTree, ArrayList arrayList) {
        SyncPoint syncPoint = (SyncPoint) immutableTree.f19417a;
        if (syncPoint != null && syncPoint.f()) {
            arrayList.add(syncPoint.d());
            return;
        }
        if (syncPoint != null) {
            arrayList.addAll(syncPoint.e());
        }
        Iterator<Map.Entry<K, V>> it = immutableTree.f19418b.iterator();
        while (it.hasNext()) {
            j((ImmutableTree) ((Map.Entry) it.next()).getValue(), arrayList);
        }
    }

    public static QuerySpec k(QuerySpec querySpec) {
        return (!querySpec.f19477b.h() || querySpec.b()) ? querySpec : QuerySpec.a(querySpec.f19476a);
    }

    public final List c(final long j11, final boolean z11, final boolean z12, final Clock clock) {
        return (List) this.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.3
            /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:38:0x00af  */
            /* JADX WARN: Code duplicated, block: B:92:0x00b0 A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            public final List<? extends Event> call() {
                UserWriteRecord userWriteRecord;
                long j12;
                UserWriteRecord userWriteRecord2;
                boolean zH;
                SyncTree syncTree = SyncTree.this;
                WriteTree writeTree = syncTree.f19297b;
                NoopPersistenceManager noopPersistenceManager = syncTree.f19301f;
                if (z12) {
                    noopPersistenceManager.getClass();
                    char[] cArr = Utilities.f19432a;
                }
                ArrayList arrayList = writeTree.f19372b;
                int size = arrayList.size();
                boolean z13 = false;
                int i11 = 0;
                do {
                    userWriteRecord = null;
                    j12 = j11;
                    if (i11 >= size) {
                        userWriteRecord2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i11);
                    i11++;
                    userWriteRecord2 = (UserWriteRecord) obj;
                } while (userWriteRecord2.f19357a != j12);
                ArrayList arrayList2 = writeTree.f19372b;
                int size2 = arrayList2.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    UserWriteRecord userWriteRecord3 = (UserWriteRecord) obj2;
                    if (userWriteRecord3.f19357a == j12) {
                        userWriteRecord = userWriteRecord3;
                        break;
                    }
                    i12++;
                }
                char[] cArr2 = Utilities.f19432a;
                writeTree.f19372b.remove(userWriteRecord);
                boolean z14 = userWriteRecord.f19361e;
                Path path = userWriteRecord.f19358b;
                boolean z15 = false;
                for (int size3 = writeTree.f19372b.size() - 1; z14 && size3 >= 0; size3--) {
                    UserWriteRecord userWriteRecord4 = (UserWriteRecord) writeTree.f19372b.get(size3);
                    boolean z16 = userWriteRecord4.f19361e;
                    Path path2 = userWriteRecord4.f19358b;
                    if (z16) {
                        if (size3 >= i12) {
                            if (!userWriteRecord4.c()) {
                                Iterator it = userWriteRecord4.a().f19185a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        zH = false;
                                        break;
                                    }
                                    if (path2.e((Path) ((Map.Entry) it.next()).getKey()).h(path)) {
                                        zH = true;
                                        break;
                                    }
                                }
                            } else {
                                zH = path2.h(path);
                            }
                            if (zH) {
                                z14 = false;
                            } else if (path.h(path2)) {
                                z15 = true;
                            }
                        } else if (path.h(path2)) {
                            z15 = true;
                        }
                    }
                }
                if (z14) {
                    if (z15) {
                        writeTree.f19371a = WriteTree.b(writeTree.f19372b, WriteTree.f19370d, Path.f19210d);
                        if (writeTree.f19372b.size() > 0) {
                            writeTree.f19373c = Long.valueOf(((UserWriteRecord) p.f(1, writeTree.f19372b)).f19357a);
                        } else {
                            writeTree.f19373c = -1L;
                        }
                    } else if (userWriteRecord.c()) {
                        CompoundWrite compoundWrite = writeTree.f19371a;
                        compoundWrite.getClass();
                        writeTree.f19371a = path.isEmpty() ? CompoundWrite.f19184b : new CompoundWrite(compoundWrite.f19185a.j(path, ImmutableTree.f19416d));
                    } else {
                        Iterator it2 = userWriteRecord.a().f19185a.iterator();
                        while (it2.hasNext()) {
                            Path path3 = (Path) ((Map.Entry) it2.next()).getKey();
                            CompoundWrite compoundWrite2 = writeTree.f19371a;
                            Path pathE = path.e(path3);
                            compoundWrite2.getClass();
                            writeTree.f19371a = pathE.isEmpty() ? CompoundWrite.f19184b : new CompoundWrite(compoundWrite2.f19185a.j(pathE, ImmutableTree.f19416d));
                        }
                    }
                    z13 = true;
                }
                boolean z17 = userWriteRecord2.f19361e;
                Path path4 = userWriteRecord2.f19358b;
                boolean z18 = z11;
                if (z17 && !z18) {
                    HashMap mapA = ServerValues.a(clock);
                    if (userWriteRecord2.c()) {
                        ServerValues.d(userWriteRecord2.b(), new ValueProvider.DeferredValueProvider(syncTree, path4), mapA);
                        noopPersistenceManager.getClass();
                        char[] cArr3 = Utilities.f19432a;
                    } else {
                        ServerValues.c(userWriteRecord2.a(), syncTree, path4, mapA);
                        noopPersistenceManager.getClass();
                        char[] cArr4 = Utilities.f19432a;
                    }
                }
                if (!z13) {
                    return Collections.EMPTY_LIST;
                }
                ImmutableTree immutableTreeH = ImmutableTree.f19416d;
                if (userWriteRecord2.c()) {
                    immutableTreeH = immutableTreeH.h(Path.f19210d, Boolean.TRUE);
                } else {
                    Iterator it3 = userWriteRecord2.a().f19185a.iterator();
                    while (it3.hasNext()) {
                        immutableTreeH = immutableTreeH.h((Path) ((Map.Entry) it3.next()).getKey(), Boolean.TRUE);
                    }
                }
                return SyncTree.a(syncTree, new AckUserWrite(path4, immutableTreeH, z18));
            }
        });
    }

    public final List d(final EventRegistration eventRegistration) {
        return (List) this.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.13
            @Override // java.util.concurrent.Callable
            public final List<? extends Event> call() {
                CacheNode cacheNode;
                Node nodeC;
                IndexedNode indexedNode;
                boolean z11;
                EventRegistration eventRegistration2 = eventRegistration;
                QuerySpec querySpecE = eventRegistration2.e();
                Path path = querySpecE.f19476a;
                QueryParams queryParams = querySpecE.f19477b;
                final SyncTree syncTree = SyncTree.this;
                ImmutableTree immutableTreeF = syncTree.f19296a;
                HashMap map = syncTree.f19299d;
                NoopPersistenceManager noopPersistenceManager = syncTree.f19301f;
                Path pathN = path;
                boolean z12 = false;
                Node nodeC2 = null;
                while (!immutableTreeF.isEmpty()) {
                    SyncPoint syncPoint = (SyncPoint) immutableTreeF.f19417a;
                    if (syncPoint != null) {
                        if (nodeC2 == null) {
                            nodeC2 = syncPoint.c(pathN);
                        }
                        z12 = z12 || syncPoint.f();
                    }
                    immutableTreeF = immutableTreeF.f(pathN.isEmpty() ? ChildKey.b(BuildConfig.VERSION_NAME) : pathN.k());
                    pathN = pathN.n();
                }
                SyncPoint syncPoint2 = (SyncPoint) syncTree.f19296a.e(path);
                if (syncPoint2 == null) {
                    syncPoint2 = new SyncPoint(noopPersistenceManager);
                    syncTree.f19296a = syncTree.f19296a.h(path, syncPoint2);
                } else {
                    z12 = z12 || syncPoint2.f();
                    if (nodeC2 == null) {
                        nodeC2 = syncPoint2.c(Path.f19210d);
                    }
                }
                HashMap map2 = syncPoint2.f19294a;
                noopPersistenceManager.getClass();
                char[] cArr = Utilities.f19432a;
                if (nodeC2 != null) {
                    cacheNode = new CacheNode(new IndexedNode(nodeC2, queryParams.f19473g), true, false);
                } else {
                    Node nodeH1 = EmptyNode.f19537e;
                    CacheNode cacheNode2 = new CacheNode(new IndexedNode(nodeH1, queryParams.f19473g), false, false);
                    for (Map.Entry entry : syncTree.f19296a.k(path).f19418b) {
                        SyncPoint syncPoint3 = (SyncPoint) ((ImmutableTree) entry.getValue()).f19417a;
                        if (syncPoint3 != null && (nodeC = syncPoint3.c(Path.f19210d)) != null) {
                            nodeH1 = nodeH1.h1((ChildKey) entry.getKey(), nodeC);
                        }
                    }
                    for (NamedNode namedNode : cacheNode2.f19444a.f19539a) {
                        if (!nodeH1.c1(namedNode.f19549a)) {
                            nodeH1 = nodeH1.h1(namedNode.f19549a, namedNode.f19550b);
                        }
                    }
                    cacheNode = new CacheNode(new IndexedNode(nodeH1, queryParams.f19473g), false, false);
                }
                boolean z13 = syncPoint2.g(querySpecE) != null;
                if (!z13 && !queryParams.h()) {
                    map.containsKey(querySpecE);
                    char[] cArr2 = Utilities.f19432a;
                    long j11 = syncTree.f19303h;
                    syncTree.f19303h = j11 + 1;
                    Tag tag = new Tag(j11);
                    map.put(querySpecE, tag);
                    syncTree.f19298c.put(tag, querySpecE);
                }
                WriteTree writeTree = syncTree.f19297b;
                writeTree.getClass();
                WriteTreeRef writeTreeRef = new WriteTreeRef(path, writeTree);
                QuerySpec querySpecE2 = eventRegistration2.e();
                QueryParams queryParams2 = querySpecE2.f19477b;
                QueryParams queryParams3 = querySpecE2.f19477b;
                View view = (View) map2.get(queryParams2);
                if (view == null) {
                    boolean z14 = cacheNode.f19445b;
                    IndexedNode indexedNode2 = cacheNode.f19444a;
                    Node nodeA = writeTree.a(path, z14 ? indexedNode2.f19539a : null, Collections.EMPTY_LIST, false);
                    if (nodeA != null) {
                        z11 = true;
                    } else {
                        Node node = indexedNode2.f19539a;
                        if (node == null) {
                            node = EmptyNode.f19537e;
                        }
                        nodeA = writeTreeRef.b(node);
                        z11 = false;
                    }
                    view = new View(querySpecE2, new ViewCache(new CacheNode(new IndexedNode(nodeA, queryParams3.f19473g), z11, false), cacheNode));
                }
                if (!queryParams3.h()) {
                    HashSet hashSet = new HashSet();
                    Iterator<NamedNode> it = view.f19480c.f19485a.f19444a.f19539a.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next().f19549a);
                    }
                    syncPoint2.f19295b.b(querySpecE2, hashSet);
                }
                if (!map2.containsKey(queryParams3)) {
                    map2.put(queryParams3, view);
                }
                map2.put(queryParams3, view);
                view.f19481d.add(eventRegistration2);
                CacheNode cacheNode3 = view.f19480c.f19485a;
                ArrayList arrayList = new ArrayList();
                IndexedNode indexedNode3 = cacheNode3.f19444a;
                for (NamedNode namedNode2 : indexedNode3.f19539a) {
                    arrayList.add(new Change(Event.EventType.CHILD_ADDED, IndexedNode.d(namedNode2.f19550b), namedNode2.f19549a, null, null));
                }
                if (cacheNode3.f19445b) {
                    indexedNode = indexedNode3;
                    arrayList.add(new Change(Event.EventType.VALUE, indexedNode3, null, null, null));
                } else {
                    indexedNode = indexedNode3;
                }
                ArrayList arrayListB = view.b(arrayList, indexedNode, eventRegistration2);
                if (!z13 && !z12) {
                    View viewG = syncPoint2.g(querySpecE);
                    Path path2 = querySpecE.f19476a;
                    Tag tagM = syncTree.m(querySpecE);
                    ListenContainer listenContainer = syncTree.new ListenContainer(viewG);
                    syncTree.f19300e.b(SyncTree.k(querySpecE), tagM, listenContainer, listenContainer);
                    ImmutableTree immutableTreeK = syncTree.f19296a.k(path2);
                    if (tagM != null) {
                        ((SyncPoint) immutableTreeK.f19417a).f();
                        char[] cArr3 = Utilities.f19432a;
                        return arrayListB;
                    }
                    ImmutableTree.TreeVisitor<SyncPoint, Void> treeVisitor = new ImmutableTree.TreeVisitor<SyncPoint, Void>() { // from class: com.google.firebase.database.core.SyncTree.15
                        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
                        public final Object a(Path path3, Object obj, Object obj2) {
                            SyncPoint syncPoint4 = (SyncPoint) obj;
                            SyncTree syncTree2 = SyncTree.this;
                            ListenProvider listenProvider = syncTree2.f19300e;
                            if (!path3.isEmpty() && syncPoint4.f()) {
                                QuerySpec querySpec = syncPoint4.d().f19478a;
                                QuerySpec querySpecK = SyncTree.k(querySpec);
                                syncTree2.m(querySpec);
                                listenProvider.a(querySpecK);
                                return null;
                            }
                            ArrayList arrayListE = syncPoint4.e();
                            int size = arrayListE.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayListE.get(i11);
                                i11++;
                                QuerySpec querySpec2 = ((View) obj3).f19478a;
                                QuerySpec querySpecK2 = SyncTree.k(querySpec2);
                                syncTree2.m(querySpec2);
                                listenProvider.a(querySpecK2);
                            }
                            return null;
                        }
                    };
                    immutableTreeK.getClass();
                    immutableTreeK.d(Path.f19210d, treeVisitor, null);
                }
                return arrayListB;
            }
        });
    }

    public final ArrayList e(final Operation operation, ImmutableTree immutableTree, Node node, final WriteTreeRef writeTreeRef) {
        SyncPoint syncPoint = (SyncPoint) immutableTree.f19417a;
        if (node == null && syncPoint != null) {
            node = syncPoint.c(Path.f19210d);
        }
        final Node node2 = node;
        final ArrayList arrayList = new ArrayList();
        immutableTree.f19418b.j(new LLRBNode.NodeVisitor<ChildKey, ImmutableTree<SyncPoint>>() { // from class: com.google.firebase.database.core.SyncTree.16
            @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
            public final void a(Object obj, Object obj2) {
                ChildKey childKey = (ChildKey) obj;
                ImmutableTree immutableTree2 = (ImmutableTree) obj2;
                Node node3 = node2;
                Node nodeX0 = node3 != null ? node3.x0(childKey) : null;
                WriteTreeRef writeTreeRef2 = writeTreeRef;
                WriteTreeRef writeTreeRef3 = new WriteTreeRef(writeTreeRef2.f19377a.f(childKey), writeTreeRef2.f19378b);
                Operation operationA = operation.a(childKey);
                if (operationA != null) {
                    arrayList.addAll(SyncTree.this.e(operationA, immutableTree2, nodeX0, writeTreeRef3));
                }
            }
        });
        if (syncPoint != null) {
            arrayList.addAll(syncPoint.a(operation, writeTreeRef, node2));
        }
        return arrayList;
    }

    public final ArrayList f(Operation operation, ImmutableTree immutableTree, Node node, WriteTreeRef writeTreeRef) {
        Path path = operation.f19391c;
        if (path.isEmpty()) {
            return e(operation, immutableTree, node, writeTreeRef);
        }
        SyncPoint syncPoint = (SyncPoint) immutableTree.f19417a;
        if (node == null && syncPoint != null) {
            node = syncPoint.c(Path.f19210d);
        }
        ArrayList arrayList = new ArrayList();
        ChildKey childKeyK = path.k();
        Operation operationA = operation.a(childKeyK);
        ImmutableTree immutableTree2 = (ImmutableTree) immutableTree.f19418b.d(childKeyK);
        if (immutableTree2 != null && operationA != null) {
            arrayList.addAll(f(operationA, immutableTree2, node != null ? node.x0(childKeyK) : null, new WriteTreeRef(writeTreeRef.f19377a.f(childKeyK), writeTreeRef.f19378b)));
        }
        if (syncPoint != null) {
            arrayList.addAll(syncPoint.a(operation, writeTreeRef, node));
        }
        return arrayList;
    }

    public final List g(final Path path, final Node node) {
        return (List) this.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.5
            @Override // java.util.concurrent.Callable
            public final List<? extends Event> call() {
                SyncTree syncTree = SyncTree.this;
                NoopPersistenceManager noopPersistenceManager = syncTree.f19301f;
                Path path2 = path;
                QuerySpec.a(path2);
                noopPersistenceManager.getClass();
                char[] cArr = Utilities.f19432a;
                return SyncTree.a(syncTree, new Overwrite(OperationSource.f19393e, path2, node));
            }
        });
    }

    public final List h(final Path path, final Node node, final Node node2, final long j11, final boolean z11, final boolean z12) {
        char[] cArr = Utilities.f19432a;
        return (List) this.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.1
            @Override // java.util.concurrent.Callable
            public final List<? extends Event> call() {
                boolean z13 = z12;
                SyncTree syncTree = SyncTree.this;
                if (z13) {
                    syncTree.f19301f.getClass();
                    char[] cArr2 = Utilities.f19432a;
                }
                WriteTree writeTree = syncTree.f19297b;
                long j12 = j11;
                Long lValueOf = Long.valueOf(j12);
                writeTree.getClass();
                writeTree.f19373c.getClass();
                char[] cArr3 = Utilities.f19432a;
                ArrayList arrayList = writeTree.f19372b;
                Path path2 = path;
                Node node3 = node2;
                boolean z14 = z11;
                arrayList.add(new UserWriteRecord(j12, path2, node3, z14));
                if (z14) {
                    writeTree.f19371a = writeTree.f19371a.b(path2, node3);
                }
                writeTree.f19373c = lValueOf;
                if (!z11) {
                    return Collections.EMPTY_LIST;
                }
                return SyncTree.a(syncTree, new Overwrite(OperationSource.f19392d, path, node2));
            }
        });
    }

    public final Node i(Path path, ArrayList arrayList) {
        ImmutableTree immutableTreeF = this.f19296a;
        Path pathF = Path.f19210d;
        Node nodeC = null;
        Path pathN = path;
        do {
            ChildKey childKeyK = pathN.k();
            pathN = pathN.n();
            pathF = pathF.f(childKeyK);
            Path pathM = Path.m(pathF, path);
            immutableTreeF = childKeyK != null ? immutableTreeF.f(childKeyK) : ImmutableTree.f19416d;
            SyncPoint syncPoint = (SyncPoint) immutableTreeF.f19417a;
            if (syncPoint != null) {
                nodeC = syncPoint.c(pathM);
            }
            if (pathN.isEmpty()) {
                break;
            }
        } while (nodeC == null);
        return this.f19297b.a(path, nodeC, arrayList, true);
    }

    public final List l(final QuerySpec querySpec, final EventRegistration eventRegistration, final DatabaseError databaseError) {
        return (List) this.f19301f.c(new Callable<List<Event>>() { // from class: com.google.firebase.database.core.SyncTree.14
            @Override // java.util.concurrent.Callable
            public final List<Event> call() {
                Object obj;
                QuerySpec querySpec2 = querySpec;
                Path path = querySpec2.f19476a;
                SyncTree syncTree = SyncTree.this;
                ImmutableTree immutableTree = syncTree.f19296a;
                ListenProvider listenProvider = syncTree.f19300e;
                SyncPoint syncPoint = (SyncPoint) immutableTree.e(path);
                ArrayList arrayList = new ArrayList();
                if (syncPoint == null) {
                    return arrayList;
                }
                HashMap map = syncPoint.f19294a;
                if (!querySpec2.b() && syncPoint.g(querySpec2) == null) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean zF = syncPoint.f();
                boolean zB = querySpec2.b();
                QueryParams queryParams = querySpec2.f19477b;
                DatabaseError databaseError2 = databaseError;
                EventRegistration eventRegistration2 = eventRegistration;
                if (zB) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        View view = (View) ((Map.Entry) it.next()).getValue();
                        List listC = view.c(eventRegistration2, databaseError2);
                        QuerySpec querySpec3 = view.f19478a;
                        arrayList3.addAll(listC);
                        if (view.f19481d.isEmpty()) {
                            it.remove();
                            if (!querySpec3.f19477b.h()) {
                                arrayList2.add(querySpec3);
                            }
                        }
                    }
                } else {
                    View view2 = (View) map.get(queryParams);
                    if (view2 != null) {
                        QuerySpec querySpec4 = view2.f19478a;
                        arrayList3.addAll(view2.c(eventRegistration2, databaseError2));
                        if (view2.f19481d.isEmpty()) {
                            map.remove(queryParams);
                            if (!querySpec4.f19477b.h()) {
                                arrayList2.add(querySpec4);
                            }
                        }
                    }
                }
                if (zF && !syncPoint.f()) {
                    arrayList2.add(QuerySpec.a(querySpec2.f19476a));
                }
                if (map.isEmpty()) {
                    syncTree.f19296a = syncTree.f19296a.g(path);
                }
                int size = arrayList2.size();
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    QuerySpec querySpec5 = (QuerySpec) obj2;
                    syncTree.f19301f.getClass();
                    char[] cArr = Utilities.f19432a;
                    z11 = z11 || querySpec5.f19477b.h();
                }
                ImmutableTree immutableTreeF = syncTree.f19296a;
                Object obj3 = immutableTreeF.f19417a;
                boolean z12 = obj3 != null && ((SyncPoint) obj3).f();
                Path.AnonymousClass1 anonymousClass1 = path.new AnonymousClass1();
                while (anonymousClass1.hasNext()) {
                    immutableTreeF = immutableTreeF.f((ChildKey) anonymousClass1.next());
                    z12 = z12 || ((obj = immutableTreeF.f19417a) != null && ((SyncPoint) obj).f());
                    if (z12 || immutableTreeF.isEmpty()) {
                        break;
                    }
                }
                if (z11 && !z12) {
                    ImmutableTree immutableTreeK = syncTree.f19296a.k(path);
                    if (!immutableTreeK.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList();
                        SyncTree.j(immutableTreeK, arrayList4);
                        int size2 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            View view3 = (View) obj4;
                            ListenContainer listenContainer = syncTree.new ListenContainer(view3);
                            listenProvider.b(SyncTree.k(view3.f19478a), listenContainer.f19353b, listenContainer, listenContainer);
                        }
                    }
                }
                if (!z12 && !arrayList2.isEmpty() && databaseError2 == null) {
                    if (z11) {
                        listenProvider.a(SyncTree.k(querySpec2));
                    } else {
                        int size3 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj5 = arrayList2.get(i14);
                            i14++;
                            QuerySpec querySpec6 = (QuerySpec) obj5;
                            syncTree.m(querySpec6);
                            char[] cArr2 = Utilities.f19432a;
                            listenProvider.a(SyncTree.k(querySpec6));
                        }
                    }
                }
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj6 = arrayList2.get(i11);
                    i11++;
                    QuerySpec querySpec7 = (QuerySpec) obj6;
                    if (!querySpec7.f19477b.h()) {
                        Tag tagM = syncTree.m(querySpec7);
                        char[] cArr3 = Utilities.f19432a;
                        syncTree.f19299d.remove(querySpec7);
                        syncTree.f19298c.remove(tagM);
                    }
                }
                return arrayList3;
            }
        });
    }

    public final Tag m(QuerySpec querySpec) {
        return (Tag) this.f19299d.get(querySpec);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class KeepSyncedEventRegistration extends EventRegistration {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public QuerySpec f19351d;

        @Override // com.google.firebase.database.core.EventRegistration
        public final EventRegistration a(QuerySpec querySpec) {
            KeepSyncedEventRegistration keepSyncedEventRegistration = new KeepSyncedEventRegistration();
            keepSyncedEventRegistration.f19351d = querySpec;
            return keepSyncedEventRegistration;
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final DataEvent b(Change change, QuerySpec querySpec) {
            return null;
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final QuerySpec e() {
            return this.f19351d;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof KeepSyncedEventRegistration) && ((KeepSyncedEventRegistration) obj).f19351d.equals(this.f19351d);
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final boolean f(EventRegistration eventRegistration) {
            return eventRegistration instanceof KeepSyncedEventRegistration;
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final boolean g(Event.EventType eventType) {
            return false;
        }

        public final int hashCode() {
            return this.f19351d.hashCode();
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final void c(DatabaseError databaseError) {
        }

        @Override // com.google.firebase.database.core.EventRegistration
        public final void d(DataEvent dataEvent) {
        }
    }
}
