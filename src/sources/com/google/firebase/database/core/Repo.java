package com.google.firebase.database.core;

import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.android.AndroidPlatform;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.ConnectionUtils;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.ListenHashProvider;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.connection.PersistentConnectionImpl;
import com.google.firebase.database.connection.RequestResultCallback;
import com.google.firebase.database.core.SyncTree.AnonymousClass2;
import com.google.firebase.database.core.SyncTree.AnonymousClass9;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.database.core.operation.Merge;
import com.google.firebase.database.core.operation.OperationSource;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.utilities.DefaultClock;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.OffsetClock;
import com.google.firebase.database.core.utilities.Tree;
import com.google.firebase.database.core.utilities.TreeNode;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.EventRaiser;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.core.view.View;
import com.google.firebase.database.logging.AndroidLogger;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.RangeMerge;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Repo implements PersistentConnection.Delegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepoInfo f19216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OffsetClock f19217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PersistentConnectionImpl f19218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SnapshotHolder f19219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseSnapshotTree f19220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Tree f19221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EventRaiser f19222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f19223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LogWrapper f19224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LogWrapper f19225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LogWrapper f19226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19227l;
    public SyncTree m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SyncTree f19228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19229o;

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass11 implements RequestResultCallback {
        @Override // com.google.firebase.database.connection.RequestResultCallback
        public final void a(String str, String str2) {
            Repo.i(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass12 implements RequestResultCallback {
        @Override // com.google.firebase.database.connection.RequestResultCallback
        public final void a(String str, String str2) {
            Repo.i(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass13 implements RequestResultCallback {
        @Override // com.google.firebase.database.connection.RequestResultCallback
        public final void a(String str, String str2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$14, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass14 implements SparseSnapshotTree.SparseSnapshotTreeVisitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f19235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f19236b;

        public AnonymousClass14(HashMap map, ArrayList arrayList) {
            this.f19235a = map;
            this.f19236b = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$23, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass23 implements Tree.TreeFilter<List<TransactionData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f19252a;

        public AnonymousClass23(int i11) {
            this.f19252a = i11;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransactionData implements Comparable<TransactionData> {
        public DatabaseError H;
        public long K;
        public Node L;
        public Node M;
        public Node N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f19274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Transaction.Handler f19275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ValueEventListener f19276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TransactionStatus f19277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f19278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19279f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19280t;

        @Override // java.lang.Comparable
        public final int compareTo(TransactionData transactionData) {
            long j11 = this.f19278e;
            long j12 = transactionData.f19278e;
            if (j11 < j12) {
                return -1;
            }
            return j11 == j12 ? 0 : 1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransactionStatus {
        private static final /* synthetic */ TransactionStatus[] $VALUES;
        public static final TransactionStatus COMPLETED;
        public static final TransactionStatus INITIALIZING;
        public static final TransactionStatus NEEDS_ABORT;
        public static final TransactionStatus RUN;
        public static final TransactionStatus SENT;
        public static final TransactionStatus SENT_NEEDS_ABORT;

        static {
            TransactionStatus transactionStatus = new TransactionStatus("INITIALIZING", 0);
            INITIALIZING = transactionStatus;
            TransactionStatus transactionStatus2 = new TransactionStatus("RUN", 1);
            RUN = transactionStatus2;
            TransactionStatus transactionStatus3 = new TransactionStatus("SENT", 2);
            SENT = transactionStatus3;
            TransactionStatus transactionStatus4 = new TransactionStatus("COMPLETED", 3);
            COMPLETED = transactionStatus4;
            TransactionStatus transactionStatus5 = new TransactionStatus("SENT_NEEDS_ABORT", 4);
            SENT_NEEDS_ABORT = transactionStatus5;
            TransactionStatus transactionStatus6 = new TransactionStatus("NEEDS_ABORT", 5);
            NEEDS_ABORT = transactionStatus6;
            $VALUES = new TransactionStatus[]{transactionStatus, transactionStatus2, transactionStatus3, transactionStatus4, transactionStatus5, transactionStatus6};
        }

        public static TransactionStatus valueOf(String str) {
            return (TransactionStatus) Enum.valueOf(TransactionStatus.class, str);
        }

        public static TransactionStatus[] values() {
            return (TransactionStatus[]) $VALUES.clone();
        }
    }

    public Repo(Context context, RepoInfo repoInfo) {
        new DefaultClock();
        OffsetClock offsetClock = new OffsetClock();
        offsetClock.f19420a = 0L;
        this.f19217b = offsetClock;
        this.f19227l = 1L;
        this.f19229o = 0L;
        this.f19216a = repoInfo;
        this.f19223h = context;
        this.f19224i = context.b("RepoOperation");
        this.f19225j = context.b("Transaction");
        this.f19226k = context.b("DataOperation");
        this.f19222g = new EventRaiser(context);
        v(new Runnable() { // from class: com.google.firebase.database.core.Repo.1
            @Override // java.lang.Runnable
            public final void run() {
                final Repo repo = Repo.this;
                RepoInfo repoInfo2 = repo.f19216a;
                HostInfo hostInfo = new HostInfo(repoInfo2.f19281a, repoInfo2.f19283c, repoInfo2.f19282b);
                Context context2 = repo.f19223h;
                AndroidPlatform androidPlatformC = context2.c();
                AndroidLogger androidLogger = context2.f19192a;
                a aVar = new a(context2.f19194c, context2.a());
                a aVar2 = new a(context2.f19195d, context2.a());
                ScheduledExecutorService scheduledExecutorServiceA = context2.a();
                String str = context2.f19198g;
                FirebaseApp firebaseApp = context2.f19200i;
                firebaseApp.b();
                repo.f19218c = androidPlatformC.a(new ConnectionContext(androidLogger, aVar, aVar2, scheduledExecutorServiceA, str, firebaseApp.f17716c.f17732b, context2.c().f19006a.getApplicationContext().getDir("sslcache", 0).getAbsolutePath()), hostInfo, repo);
                AndroidAuthTokenProvider androidAuthTokenProvider = context2.f19194c;
                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((DefaultRunLoop) context2.f19196e).f19411a;
                final TokenProvider.TokenChangeListener tokenChangeListener = new TokenProvider.TokenChangeListener() { // from class: com.google.firebase.database.core.Repo.2
                    @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
                    public final void a(String str2) {
                        Repo repo2 = Repo.this;
                        repo2.f19224i.a("Auth token changed, triggering auth token refresh", null, new Object[0]);
                        PersistentConnectionImpl persistentConnectionImpl = repo2.f19218c;
                        persistentConnectionImpl.f19093x.a("Auth token refreshed.", null, new Object[0]);
                        persistentConnectionImpl.f19085p = str2;
                        if (persistentConnectionImpl.f()) {
                            if (str2 != null) {
                                persistentConnectionImpl.p(false);
                                return;
                            }
                            ConnectionUtils.a(persistentConnectionImpl.f(), "Must be connected to send unauth.", new Object[0]);
                            ConnectionUtils.a(persistentConnectionImpl.f19085p == null, "Auth token must not be set.", new Object[0]);
                            persistentConnectionImpl.s("unauth", false, Collections.EMPTY_MAP, null);
                        }
                    }
                };
                final int i11 = 1;
                androidAuthTokenProvider.f19003a.a(new Deferred.DeferredHandler() { // from class: com.google.firebase.database.android.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.database.android.e] */
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void h(Provider provider) {
                        switch (i11) {
                            case 0:
                                ((InteropAppCheckTokenProvider) provider.get()).b(new b(scheduledThreadPoolExecutor, tokenChangeListener));
                                break;
                            default:
                                InternalAuthProvider internalAuthProvider = (InternalAuthProvider) provider.get();
                                final ExecutorService executorService = scheduledThreadPoolExecutor;
                                final TokenProvider.TokenChangeListener tokenChangeListener2 = tokenChangeListener;
                                internalAuthProvider.a(new IdTokenListener() { // from class: com.google.firebase.database.android.e
                                    @Override // com.google.firebase.auth.internal.IdTokenListener
                                    public final void a(InternalTokenResult internalTokenResult) {
                                        executorService.execute(new b2.c(9, tokenChangeListener2, internalTokenResult));
                                    }
                                });
                                break;
                        }
                    }
                });
                AndroidAppCheckTokenProvider androidAppCheckTokenProvider = context2.f19195d;
                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = ((DefaultRunLoop) context2.f19196e).f19411a;
                final TokenProvider.TokenChangeListener tokenChangeListener2 = new TokenProvider.TokenChangeListener() { // from class: com.google.firebase.database.core.Repo.3
                    @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
                    public final void a(String str2) {
                        Repo repo2 = Repo.this;
                        repo2.f19224i.a("App check token changed, triggering app check token refresh", null, new Object[0]);
                        PersistentConnectionImpl persistentConnectionImpl = repo2.f19218c;
                        persistentConnectionImpl.f19093x.a("App check token refreshed.", null, new Object[0]);
                        persistentConnectionImpl.f19087r = str2;
                        if (persistentConnectionImpl.f()) {
                            if (str2 != null) {
                                persistentConnectionImpl.o(false);
                                return;
                            }
                            ConnectionUtils.a(persistentConnectionImpl.f(), "Must be connected to send unauth.", new Object[0]);
                            ConnectionUtils.a(persistentConnectionImpl.f19087r == null, "App check token must not be set.", new Object[0]);
                            persistentConnectionImpl.s("unappcheck", false, Collections.EMPTY_MAP, null);
                        }
                    }
                };
                final int i12 = 0;
                androidAppCheckTokenProvider.f19001a.a(new Deferred.DeferredHandler() { // from class: com.google.firebase.database.android.a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.database.android.e] */
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void h(Provider provider) {
                        switch (i12) {
                            case 0:
                                ((InteropAppCheckTokenProvider) provider.get()).b(new b(scheduledThreadPoolExecutor2, tokenChangeListener2));
                                break;
                            default:
                                InternalAuthProvider internalAuthProvider = (InternalAuthProvider) provider.get();
                                final ExecutorService executorService = scheduledThreadPoolExecutor2;
                                final TokenProvider.TokenChangeListener tokenChangeListener3 = tokenChangeListener2;
                                internalAuthProvider.a(new IdTokenListener() { // from class: com.google.firebase.database.android.e
                                    @Override // com.google.firebase.auth.internal.IdTokenListener
                                    public final void a(InternalTokenResult internalTokenResult) {
                                        executorService.execute(new b2.c(9, tokenChangeListener3, internalTokenResult));
                                    }
                                });
                                break;
                        }
                    }
                });
                repo.f19218c.t();
                NoopPersistenceManager noopPersistenceManager = new NoopPersistenceManager();
                repo.f19219d = new SnapshotHolder();
                repo.f19220e = new SparseSnapshotTree();
                repo.f19221f = new Tree();
                repo.m = new SyncTree(context2, new NoopPersistenceManager(), new SyncTree.ListenProvider() { // from class: com.google.firebase.database.core.Repo.4
                    @Override // com.google.firebase.database.core.SyncTree.ListenProvider
                    public final void b(final QuerySpec querySpec, Tag tag, ListenHashProvider listenHashProvider, final SyncTree.CompletionListener completionListener) {
                        Repo.this.v(new Runnable() { // from class: com.google.firebase.database.core.Repo.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Repo repo2 = Repo.this;
                                SnapshotHolder snapshotHolder = repo2.f19219d;
                                Path path = querySpec.f19476a;
                                Node nodeI = snapshotHolder.f19289a.I(path);
                                if (nodeI.isEmpty()) {
                                    return;
                                }
                                repo2.r(repo2.m.g(path, nodeI));
                                ((SyncTree.ListenContainer) completionListener).a(null);
                            }
                        });
                    }

                    @Override // com.google.firebase.database.core.SyncTree.ListenProvider
                    public final void a(QuerySpec querySpec) {
                    }
                });
                repo.f19228n = new SyncTree(context2, noopPersistenceManager, new SyncTree.ListenProvider() { // from class: com.google.firebase.database.core.Repo.5
                    @Override // com.google.firebase.database.core.SyncTree.ListenProvider
                    public final void a(QuerySpec querySpec) {
                        Repo.this.f19218c.u(querySpec.f19476a.b(), querySpec.f19477b.b());
                    }

                    @Override // com.google.firebase.database.core.SyncTree.ListenProvider
                    public final void b(QuerySpec querySpec, Tag tag, ListenHashProvider listenHashProvider, final SyncTree.CompletionListener completionListener) {
                        Repo.this.f19218c.j(querySpec.f19476a.b(), querySpec.f19477b.b(), listenHashProvider, tag != null ? Long.valueOf(tag.f19355a) : null, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.5.1
                            @Override // com.google.firebase.database.connection.RequestResultCallback
                            public final void a(String str2, String str3) {
                                Repo.this.r(completionListener.a(Repo.i(str2, str3)));
                            }
                        });
                    }
                });
                LogWrapper logWrapper = repo.f19224i;
                List<UserWriteRecord> list = Collections.EMPTY_LIST;
                HashMap mapA = ServerValues.a(repo.f19217b);
                long j11 = Long.MIN_VALUE;
                for (final UserWriteRecord userWriteRecord : list) {
                    RequestResultCallback requestResultCallback = new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.6
                        @Override // com.google.firebase.database.connection.RequestResultCallback
                        public final void a(String str2, String str3) {
                            DatabaseError databaseErrorI = Repo.i(str2, str3);
                            UserWriteRecord userWriteRecord2 = userWriteRecord;
                            Path path = userWriteRecord2.f19358b;
                            Repo repo2 = Repo.this;
                            Repo.j(repo2, "Persisted write", path, databaseErrorI);
                            Repo.k(repo2, userWriteRecord2.f19357a, userWriteRecord2.f19358b, databaseErrorI);
                        }
                    };
                    j11 = userWriteRecord.f19357a;
                    Path path = userWriteRecord.f19358b;
                    if (j11 >= j11) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    repo.f19227l = 1 + j11;
                    if (userWriteRecord.c()) {
                        if (logWrapper.c()) {
                            logWrapper.a(e.h(j11, "Restoring overwrite with id "), null, new Object[0]);
                        }
                        repo.f19218c.k("p", path.b(), userWriteRecord.b().p1(true), null, requestResultCallback);
                        repo.f19228n.h(userWriteRecord.f19358b, userWriteRecord.b(), ServerValues.d(userWriteRecord.b(), new ValueProvider.DeferredValueProvider(repo.f19228n, path), mapA), userWriteRecord.f19357a, true, false);
                    } else {
                        if (logWrapper.c()) {
                            logWrapper.a(e.h(j11, "Restoring merge with id "), null, new Object[0]);
                        }
                        repo.f19218c.k("m", path.b(), userWriteRecord.a().k(), null, requestResultCallback);
                        CompoundWrite compoundWriteC = ServerValues.c(userWriteRecord.a(), repo.f19228n, path, mapA);
                        SyncTree syncTree = repo.f19228n;
                    }
                }
                ChildKey childKey = Constants.f19190c;
                Boolean bool = Boolean.FALSE;
                repo.A(childKey, bool);
                repo.A(Constants.f19191d, bool);
            }
        });
    }

    public static DatabaseError i(String str, String str2) {
        if (str != null) {
            return DatabaseError.b(str, str2);
        }
        return null;
    }

    public static void j(Repo repo, String str, Path path, DatabaseError databaseError) {
        int i11;
        repo.getClass();
        if (databaseError == null || (i11 = databaseError.f18961a) == -1 || i11 == -25) {
            return;
        }
        LogWrapper logWrapper = repo.f19224i;
        StringBuilder sbR = e.r(str, " at ");
        sbR.append(path.toString());
        sbR.append(" failed: ");
        sbR.append(databaseError.toString());
        logWrapper.e(sbR.toString());
    }

    public static void k(Repo repo, long j11, Path path, DatabaseError databaseError) {
        repo.getClass();
        if (databaseError == null || databaseError.f18961a != -25) {
            List listC = repo.f19228n.c(j11, !(databaseError == null), true, repo.f19217b);
            if (listC.size() > 0) {
                repo.u(path);
            }
            repo.r(listC);
        }
    }

    public final void A(ChildKey childKey, Object obj) {
        if (childKey.equals(Constants.f19189b)) {
            this.f19217b.f19420a = ((Long) obj).longValue();
        }
        Path path = new Path(Constants.f19188a, childKey);
        try {
            Node nodeA = NodeUtilities.a(obj, EmptyNode.f19537e);
            SnapshotHolder snapshotHolder = this.f19219d;
            snapshotHolder.f19289a = snapshotHolder.f19289a.i0(path, nodeA);
            r(this.m.g(path, nodeA));
        } catch (DatabaseException e8) {
            this.f19224i.b("Failed to parse info update", e8);
        }
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void a(ArrayList arrayList, Object obj, boolean z11, Long l9) {
        List listG;
        final Path path = new Path(arrayList);
        LogWrapper logWrapper = this.f19224i;
        if (logWrapper.c()) {
            logWrapper.a("onDataUpdate: " + path, null, new Object[0]);
        }
        if (this.f19226k.c()) {
            logWrapper.a("onDataUpdate: " + path + " " + obj, null, new Object[0]);
        }
        try {
            if (l9 != null) {
                final Tag tag = new Tag(l9.longValue());
                if (z11) {
                    final HashMap map = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        map.put(new Path((String) entry.getKey()), NodeUtilities.a(entry.getValue(), EmptyNode.f19537e));
                    }
                    final SyncTree syncTree = this.f19228n;
                    listG = (List) syncTree.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.10
                        @Override // java.util.concurrent.Callable
                        public final List<? extends Event> call() {
                            Tag tag2 = tag;
                            SyncTree syncTree2 = SyncTree.this;
                            QuerySpec querySpec = (QuerySpec) syncTree2.f19298c.get(tag2);
                            if (querySpec == null) {
                                return Collections.EMPTY_LIST;
                            }
                            Path pathM = Path.m(querySpec.f19476a, path);
                            CompoundWrite compoundWriteH = CompoundWrite.h(map);
                            syncTree2.f19301f.getClass();
                            char[] cArr = Utilities.f19432a;
                            return SyncTree.b(syncTree2, querySpec, new Merge(OperationSource.a(querySpec.f19477b), pathM, compoundWriteH));
                        }
                    });
                } else {
                    Node nodeA = NodeUtilities.a(obj, EmptyNode.f19537e);
                    SyncTree syncTree2 = this.f19228n;
                    listG = (List) syncTree2.f19301f.c(syncTree2.new AnonymousClass9(tag, path, nodeA));
                }
            } else if (z11) {
                final HashMap map2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    map2.put(new Path((String) entry2.getKey()), NodeUtilities.a(entry2.getValue(), EmptyNode.f19537e));
                }
                final SyncTree syncTree3 = this.f19228n;
                listG = (List) syncTree3.f19301f.c(new Callable<List<? extends Event>>() { // from class: com.google.firebase.database.core.SyncTree.6
                    @Override // java.util.concurrent.Callable
                    public final List<? extends Event> call() {
                        CompoundWrite compoundWriteH = CompoundWrite.h(map2);
                        SyncTree syncTree4 = SyncTree.this;
                        syncTree4.f19301f.getClass();
                        char[] cArr = Utilities.f19432a;
                        return SyncTree.a(syncTree4, new Merge(OperationSource.f19393e, path, compoundWriteH));
                    }
                });
            } else {
                listG = this.f19228n.g(path, NodeUtilities.a(obj, EmptyNode.f19537e));
            }
            if (listG.size() > 0) {
                u(path);
            }
            r(listG);
        } catch (DatabaseException e8) {
            logWrapper.b("FIREBASE INTERNAL ERROR", e8);
        }
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void b() {
        A(Constants.f19191d, Boolean.TRUE);
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void c(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            A(ChildKey.b((String) entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void d() {
        A(Constants.f19191d, Boolean.FALSE);
        HashMap mapA = ServerValues.a(this.f19217b);
        ArrayList arrayList = new ArrayList();
        this.f19220e.a(Path.f19210d, new AnonymousClass14(mapA, arrayList));
        this.f19220e = new SparseSnapshotTree();
        r(arrayList);
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void e() {
        A(Constants.f19190c, Boolean.FALSE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public final void f(ArrayList arrayList, ArrayList arrayList2, Long l9) {
        View viewD;
        List listG;
        Path path = new Path(arrayList);
        LogWrapper logWrapper = this.f19224i;
        int i11 = 0;
        if (logWrapper.c()) {
            logWrapper.a("onRangeMergeUpdate: " + path, null, new Object[0]);
        }
        if (this.f19226k.c()) {
            logWrapper.a("onRangeMergeUpdate: " + path + " " + arrayList2, null, new Object[0]);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList3.add(new RangeMerge((com.google.firebase.database.connection.RangeMerge) obj));
        }
        if (l9 != null) {
            SyncTree syncTree = this.f19228n;
            Tag tag = new Tag(l9.longValue());
            QuerySpec querySpec = (QuerySpec) syncTree.f19298c.get(tag);
            if (querySpec != null) {
                Path path2 = querySpec.f19476a;
                path.equals(path2);
                char[] cArr = Utilities.f19432a;
                Node nodeA = ((SyncPoint) syncTree.f19296a.e(path2)).g(querySpec).f19480c.f19486b.f19444a.f19539a;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    RangeMerge rangeMerge = (RangeMerge) obj2;
                    rangeMerge.getClass();
                    nodeA = rangeMerge.a(Path.f19210d, nodeA, rangeMerge.f19556c);
                }
                listG = (List) syncTree.f19301f.c(syncTree.new AnonymousClass9(tag, path, nodeA));
            } else {
                listG = Collections.EMPTY_LIST;
            }
        } else {
            SyncTree syncTree2 = this.f19228n;
            SyncPoint syncPoint = (SyncPoint) syncTree2.f19296a.e(path);
            if (syncPoint == null || (viewD = syncPoint.d()) == null) {
                listG = Collections.EMPTY_LIST;
            } else {
                Node nodeA2 = viewD.f19480c.f19486b.f19444a.f19539a;
                int size3 = arrayList3.size();
                while (i11 < size3) {
                    Object obj3 = arrayList3.get(i11);
                    i11++;
                    RangeMerge rangeMerge2 = (RangeMerge) obj3;
                    rangeMerge2.getClass();
                    nodeA2 = rangeMerge2.a(Path.f19210d, nodeA2, rangeMerge2.f19556c);
                }
                listG = syncTree2.g(path, nodeA2);
            }
        }
        if (listG.size() > 0) {
            u(path);
        }
        r(listG);
    }

    public final Path g(Path path, final int i11) {
        Path pathC = p(path).c();
        if (this.f19225j.c()) {
            this.f19224i.a("Aborting transactions for path: " + path + ". Affected: " + pathC, null, new Object[0]);
        }
        Tree treeD = this.f19221f.d(path);
        AnonymousClass23 anonymousClass23 = new AnonymousClass23(i11);
        for (Tree tree = treeD.f19427b; tree != null; tree = tree.f19427b) {
            Repo.this.h(tree, anonymousClass23.f19252a);
        }
        h(treeD, i11);
        treeD.b(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.24
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public final void a(Tree tree2) {
                Repo.this.h(tree2, i11);
            }
        }, false);
        return pathC;
    }

    public final void l(EventRegistration eventRegistration) {
        ChildKey childKeyK = eventRegistration.e().f19476a.k();
        r((childKeyK == null || !childKeyK.equals(Constants.f19188a)) ? this.f19228n.d(eventRegistration) : this.m.d(eventRegistration));
    }

    public final void m(final ArrayList arrayList, Tree tree) {
        List list = (List) tree.f19428c.f19431b;
        if (list != null) {
            arrayList.addAll(list);
        }
        tree.a(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.22
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public final void a(Tree tree2) {
                Repo.this.m(arrayList, tree2);
            }
        });
    }

    public final ArrayList n(Tree tree) {
        ArrayList arrayList = new ArrayList();
        m(arrayList, tree);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void o(final DatabaseReference.CompletionListener completionListener, final DatabaseError databaseError, Path path) {
        if (completionListener != null) {
            ChildKey childKeyJ = path.j();
            final DatabaseReference databaseReference = (childKeyJ == null || !childKeyJ.equals(ChildKey.f19512d)) ? new DatabaseReference(this, path) : new DatabaseReference(this, path.l());
            q(new Runnable() { // from class: com.google.firebase.database.core.Repo.7
                @Override // java.lang.Runnable
                public final void run() {
                    completionListener.a(databaseError, databaseReference);
                }
            });
        }
    }

    public final Tree p(Path path) {
        Tree treeD = this.f19221f;
        while (!path.isEmpty() && treeD.f19428c.f19431b == null) {
            treeD = treeD.d(new Path(path.k()));
            path = path.n();
        }
        return treeD;
    }

    public final void q(Runnable runnable) {
        Context context = this.f19223h;
        context.e();
        context.f19193b.f19005a.post(runnable);
    }

    public final void r(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f19222g.a(list);
    }

    public final void s(Tree tree) {
        TreeNode treeNode = tree.f19428c;
        TreeNode treeNode2 = tree.f19428c;
        List list = (List) treeNode.f19431b;
        if (list != null) {
            int i11 = 0;
            while (i11 < list.size()) {
                if (((TransactionData) list.get(i11)).f19277d == TransactionStatus.COMPLETED) {
                    list.remove(i11);
                } else {
                    i11++;
                }
            }
            if (list.size() > 0) {
                treeNode2.f19431b = list;
                tree.e();
            } else {
                treeNode2.f19431b = null;
                tree.e();
            }
        }
        tree.a(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.19
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public final void a(Tree tree2) {
                Repo.this.s(tree2);
            }
        });
    }

    public final void t(EventRegistration eventRegistration) {
        List listL;
        if (Constants.f19188a.equals(eventRegistration.e().f19476a.k())) {
            SyncTree syncTree = this.m;
            syncTree.getClass();
            listL = syncTree.l(eventRegistration.e(), eventRegistration, null);
        } else {
            SyncTree syncTree2 = this.f19228n;
            syncTree2.getClass();
            listL = syncTree2.l(eventRegistration.e(), eventRegistration, null);
        }
        r(listL);
    }

    public final String toString() {
        return this.f19216a.toString();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0166  */
    /* JADX WARN: Code duplicated, block: B:51:0x018a A[SYNTHETIC] */
    public final Path u(Path path) {
        DatabaseError databaseErrorB;
        boolean z11;
        DatabaseError databaseErrorA;
        Transaction.Result result;
        Tree treeP = p(path);
        Path pathC = treeP.c();
        ArrayList arrayListN = n(treeP);
        if (arrayListN.isEmpty()) {
            return pathC;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListN.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListN.get(i11);
            i11++;
            arrayList2.add(Long.valueOf(((TransactionData) obj).K));
        }
        int size2 = arrayListN.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            final TransactionData transactionData = (TransactionData) arrayListN.get(i12);
            Path path2 = transactionData.f19274a;
            Path.m(pathC, path2);
            ArrayList arrayList3 = new ArrayList();
            char[] cArr = Utilities.f19432a;
            TransactionStatus transactionStatus = transactionData.f19277d;
            if (transactionStatus == TransactionStatus.NEEDS_ABORT) {
                databaseErrorB = transactionData.H;
                if (databaseErrorB.f18961a != -25) {
                    arrayList3.addAll(this.f19228n.c(transactionData.K, true, false, this.f19217b));
                }
            } else {
                if (transactionStatus == TransactionStatus.RUN) {
                    if (transactionData.f19280t >= 25) {
                        databaseErrorB = DatabaseError.b("maxretries", null);
                        arrayList3.addAll(this.f19228n.c(transactionData.K, true, false, this.f19217b));
                    } else {
                        Node nodeI = this.f19228n.i(path2, arrayList2);
                        if (nodeI == null) {
                            nodeI = EmptyNode.f19537e;
                        }
                        Node node = nodeI;
                        transactionData.L = node;
                        try {
                            result = transactionData.f19275b.a(new MutableData(new SnapshotHolder(node), new Path(BuildConfig.VERSION_NAME)));
                            databaseErrorA = null;
                        } catch (Throwable th2) {
                            this.f19224i.b("Caught Throwable.", th2);
                            databaseErrorA = DatabaseError.a(th2);
                            result = new Transaction.Result(false, null);
                        }
                        if (result.f18999a) {
                            long j11 = transactionData.K;
                            Long lValueOf = Long.valueOf(j11);
                            HashMap mapA = ServerValues.a(this.f19217b);
                            Node node2 = result.f19000b;
                            Node nodeD = ServerValues.d(node2, new ValueProvider.ExistingValueProvider(node), mapA);
                            transactionData.M = node2;
                            transactionData.N = nodeD;
                            long j12 = this.f19227l;
                            arrayListN = arrayListN;
                            this.f19227l = j12 + 1;
                            transactionData.K = j12;
                            arrayList2.remove(lValueOf);
                            arrayList3.addAll(this.f19228n.h(transactionData.f19274a, node2, nodeD, transactionData.K, transactionData.f19279f, false));
                            arrayList3.addAll(this.f19228n.c(j11, true, false, this.f19217b));
                        } else {
                            arrayList3.addAll(this.f19228n.c(transactionData.K, true, false, this.f19217b));
                            databaseErrorB = databaseErrorA;
                        }
                    }
                    z11 = true;
                    r(arrayList3);
                    if (z11) {
                        transactionData.f19277d = TransactionStatus.COMPLETED;
                        DataSnapshot dataSnapshot = new DataSnapshot(new DatabaseReference(this, path2), IndexedNode.d(transactionData.L));
                        v(new Runnable() { // from class: com.google.firebase.database.core.Repo.20
                            @Override // java.lang.Runnable
                            public final void run() {
                                TransactionData transactionData2 = transactionData;
                                ValueEventListener valueEventListener = transactionData2.f19276c;
                                QuerySpec querySpecA = QuerySpec.a(transactionData2.f19274a);
                                Repo repo = Repo.this;
                                repo.t(new ValueEventRegistration(repo, valueEventListener, querySpecA));
                            }
                        });
                        arrayList.add(new Runnable(databaseErrorB, dataSnapshot) { // from class: com.google.firebase.database.core.Repo.21
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f19249a.f19275b.getClass();
                            }
                        });
                    }
                    i12 = i13;
                    arrayListN = arrayListN;
                    pathC = pathC;
                } else {
                    arrayListN = arrayListN;
                }
                databaseErrorB = null;
                z11 = false;
                r(arrayList3);
                if (z11) {
                    transactionData.f19277d = TransactionStatus.COMPLETED;
                    DataSnapshot dataSnapshot2 = new DataSnapshot(new DatabaseReference(this, path2), IndexedNode.d(transactionData.L));
                    v(new Runnable() { // from class: com.google.firebase.database.core.Repo.20
                        @Override // java.lang.Runnable
                        public final void run() {
                            TransactionData transactionData2 = transactionData;
                            ValueEventListener valueEventListener = transactionData2.f19276c;
                            QuerySpec querySpecA = QuerySpec.a(transactionData2.f19274a);
                            Repo repo = Repo.this;
                            repo.t(new ValueEventRegistration(repo, valueEventListener, querySpecA));
                        }
                    });
                    arrayList.add(new Runnable(databaseErrorB, dataSnapshot2) { // from class: com.google.firebase.database.core.Repo.21
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19249a.f19275b.getClass();
                        }
                    });
                }
                i12 = i13;
                arrayListN = arrayListN;
                pathC = pathC;
            }
            z11 = true;
            r(arrayList3);
            if (z11) {
                transactionData.f19277d = TransactionStatus.COMPLETED;
                DataSnapshot dataSnapshot3 = new DataSnapshot(new DatabaseReference(this, path2), IndexedNode.d(transactionData.L));
                v(new Runnable() { // from class: com.google.firebase.database.core.Repo.20
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransactionData transactionData2 = transactionData;
                        ValueEventListener valueEventListener = transactionData2.f19276c;
                        QuerySpec querySpecA = QuerySpec.a(transactionData2.f19274a);
                        Repo repo = Repo.this;
                        repo.t(new ValueEventRegistration(repo, valueEventListener, querySpecA));
                    }
                });
                arrayList.add(new Runnable(databaseErrorB, dataSnapshot3) { // from class: com.google.firebase.database.core.Repo.21
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19249a.f19275b.getClass();
                    }
                });
            }
            i12 = i13;
            arrayListN = arrayListN;
            pathC = pathC;
        }
        Path path3 = pathC;
        s(this.f19221f);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            q((Runnable) arrayList.get(i14));
        }
        Tree tree = this.f19221f;
        s(tree);
        w(tree);
        return path3;
    }

    public final void v(Runnable runnable) {
        Context context = this.f19223h;
        context.e();
        context.f19196e.b(runnable);
    }

    public final void w(Tree tree) {
        TreeNode treeNode = tree.f19428c;
        if (((List) treeNode.f19431b) == null) {
            if (treeNode.f19430a.isEmpty()) {
                return;
            }
            tree.a(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.17
                @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
                public final void a(Tree tree2) {
                    Repo.this.w(tree2);
                }
            });
            return;
        }
        final ArrayList arrayListN = n(tree);
        arrayListN.size();
        char[] cArr = Utilities.f19432a;
        Boolean bool = Boolean.TRUE;
        int size = arrayListN.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListN.get(i12);
            i12++;
            if (((TransactionData) obj).f19277d != TransactionStatus.RUN) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            final Path pathC = tree.c();
            ArrayList arrayList = new ArrayList();
            int size2 = arrayListN.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayListN.get(i13);
                i13++;
                arrayList.add(Long.valueOf(((TransactionData) obj2).K));
            }
            Node nodeI = this.f19228n.i(pathC, arrayList);
            if (nodeI == null) {
                nodeI = EmptyNode.f19537e;
            }
            String strI = nodeI.i();
            int size3 = arrayListN.size();
            while (i11 < size3) {
                Object obj3 = arrayListN.get(i11);
                i11++;
                TransactionData transactionData = (TransactionData) obj3;
                TransactionStatus transactionStatus = transactionData.f19277d;
                char[] cArr2 = Utilities.f19432a;
                transactionData.f19277d = TransactionStatus.SENT;
                transactionData.f19280t++;
                nodeI = nodeI.i0(Path.m(pathC, transactionData.f19274a), transactionData.M);
            }
            this.f19218c.k("p", pathC.b(), nodeI.p1(true), strI, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.18
                @Override // com.google.firebase.database.connection.RequestResultCallback
                public final void a(String str, String str2) {
                    Repo repo;
                    DatabaseError databaseErrorI = Repo.i(str, str2);
                    Repo repo2 = Repo.this;
                    Path path = pathC;
                    Repo.j(repo2, "Transaction", path, databaseErrorI);
                    ArrayList arrayList2 = new ArrayList();
                    List<TransactionData> list = arrayListN;
                    if (databaseErrorI != null) {
                        if (databaseErrorI.f18961a == -1) {
                            for (TransactionData transactionData2 : list) {
                                if (transactionData2.f19277d == TransactionStatus.SENT_NEEDS_ABORT) {
                                    transactionData2.f19277d = TransactionStatus.NEEDS_ABORT;
                                } else {
                                    transactionData2.f19277d = TransactionStatus.RUN;
                                }
                            }
                        } else {
                            for (TransactionData transactionData3 : list) {
                                transactionData3.f19277d = TransactionStatus.NEEDS_ABORT;
                                transactionData3.H = databaseErrorI;
                            }
                        }
                        repo2.u(path);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        repo = this;
                        if (!zHasNext) {
                            break;
                        }
                        TransactionData transactionData4 = (TransactionData) it.next();
                        transactionData4.f19277d = TransactionStatus.COMPLETED;
                        Path path2 = transactionData4.f19274a;
                        arrayList2.addAll(repo2.f19228n.c(transactionData4.K, false, false, repo2.f19217b));
                        arrayList3.add(new Runnable(new DataSnapshot(new DatabaseReference(repo, path2), IndexedNode.d(transactionData4.N))) { // from class: com.google.firebase.database.core.Repo.18.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f19244a.f19275b.getClass();
                            }
                        });
                        repo2.t(new ValueEventRegistration(repo2, transactionData4.f19276c, QuerySpec.a(path2)));
                    }
                    repo2.s(repo2.f19221f.d(path));
                    Tree tree2 = repo2.f19221f;
                    repo2.s(tree2);
                    repo2.w(tree2);
                    repo.r(arrayList2);
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        repo2.q((Runnable) arrayList3.get(i14));
                    }
                }
            });
        }
    }

    public final void x(final Path path, Node node, final DatabaseReference.CompletionListener completionListener) {
        LogWrapper logWrapper = this.f19224i;
        if (logWrapper.c()) {
            logWrapper.a("set: " + path, null, new Object[0]);
        }
        LogWrapper logWrapper2 = this.f19226k;
        if (logWrapper2.c()) {
            logWrapper2.a("set: " + path + " " + node, null, new Object[0]);
        }
        Node nodeD = ServerValues.d(node, new ValueProvider.ExistingValueProvider(this.f19228n.i(path, new ArrayList())), ServerValues.a(this.f19217b));
        final long j11 = this.f19227l;
        this.f19227l = 1 + j11;
        r(this.f19228n.h(path, node, nodeD, j11, true, true));
        this.f19218c.k("p", path.b(), node.p1(true), null, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.8
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public final void a(String str, String str2) {
                DatabaseError databaseErrorI = Repo.i(str, str2);
                Repo repo = Repo.this;
                Path path2 = path;
                Repo.j(repo, "setValue", path2, databaseErrorI);
                Repo.k(repo, j11, path2, databaseErrorI);
                repo.o(completionListener, databaseErrorI, path2);
            }
        });
        u(g(path, -9));
    }

    public final void y(Path path, Transaction.Handler handler) {
        DatabaseError databaseErrorA;
        Transaction.Result result;
        LogWrapper logWrapper = this.f19224i;
        if (logWrapper.c()) {
            logWrapper.a("transaction: " + path, null, new Object[0]);
        }
        if (this.f19226k.c()) {
            logWrapper.a("transaction: " + path, null, new Object[0]);
        }
        this.f19223h.getClass();
        DatabaseReference databaseReference = new DatabaseReference(this, path);
        AnonymousClass15 anonymousClass15 = new AnonymousClass15();
        l(new ValueEventRegistration(this, anonymousClass15, databaseReference.c()));
        TransactionStatus transactionStatus = TransactionStatus.INITIALIZING;
        long j11 = this.f19229o;
        this.f19229o = j11 + 1;
        TransactionData transactionData = new TransactionData();
        transactionData.f19274a = path;
        transactionData.f19275b = handler;
        transactionData.f19276c = anonymousClass15;
        transactionData.f19277d = transactionStatus;
        transactionData.f19280t = 0;
        transactionData.f19279f = true;
        transactionData.f19278e = j11;
        transactionData.H = null;
        transactionData.L = null;
        transactionData.M = null;
        transactionData.N = null;
        Node nodeI = this.f19228n.i(path, new ArrayList());
        if (nodeI == null) {
            nodeI = EmptyNode.f19537e;
        }
        transactionData.L = nodeI;
        try {
            result = handler.a(new MutableData(new SnapshotHolder(nodeI), new Path(BuildConfig.VERSION_NAME)));
            databaseErrorA = null;
        } catch (Throwable th2) {
            logWrapper.b("Caught Throwable.", th2);
            databaseErrorA = DatabaseError.a(th2);
            result = new Transaction.Result(false, null);
        }
        if (!result.f18999a) {
            transactionData.M = null;
            transactionData.N = null;
            q(new Runnable(databaseErrorA, new DataSnapshot(databaseReference, IndexedNode.d(transactionData.L))) { // from class: com.google.firebase.database.core.Repo.16
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
            return;
        }
        transactionData.f19277d = TransactionStatus.RUN;
        Tree treeD = this.f19221f.d(path);
        TreeNode treeNode = treeD.f19428c;
        List arrayList = (List) treeNode.f19431b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(transactionData);
        treeNode.f19431b = arrayList;
        treeD.e();
        HashMap mapA = ServerValues.a(this.f19217b);
        Node node = result.f19000b;
        Node nodeD = ServerValues.d(node, new ValueProvider.ExistingValueProvider(transactionData.L), mapA);
        transactionData.M = node;
        transactionData.N = nodeD;
        long j12 = this.f19227l;
        this.f19227l = 1 + j12;
        transactionData.K = j12;
        r(this.f19228n.h(path, node, nodeD, j12, true, false));
        Tree tree = this.f19221f;
        s(tree);
        w(tree);
    }

    public final void z(final Path path, CompoundWrite compoundWrite, final DatabaseReference.CompletionListener completionListener, Map map) {
        ImmutableTree immutableTree = compoundWrite.f19185a;
        LogWrapper logWrapper = this.f19224i;
        if (logWrapper.c()) {
            logWrapper.a("update: " + path, null, new Object[0]);
        }
        LogWrapper logWrapper2 = this.f19226k;
        if (logWrapper2.c()) {
            logWrapper2.a("update: " + path + " " + map, null, new Object[0]);
        }
        if (immutableTree.isEmpty()) {
            if (logWrapper.c()) {
                logWrapper.a("update called with no changes. No-op", null, new Object[0]);
            }
            o(completionListener, null, path);
            return;
        }
        CompoundWrite compoundWriteC = ServerValues.c(compoundWrite, this.f19228n, path, ServerValues.a(this.f19217b));
        final long j11 = this.f19227l;
        this.f19227l = 1 + j11;
        SyncTree syncTree = this.f19228n;
        r((List) syncTree.f19301f.c(syncTree.new AnonymousClass2(true, path, compoundWrite, j11, compoundWriteC)));
        this.f19218c.k("m", path.b(), map, null, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.10
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public final void a(String str, String str2) {
                DatabaseError databaseErrorI = Repo.i(str, str2);
                Repo repo = Repo.this;
                Path path2 = path;
                Repo.j(repo, "updateChildren", path2, databaseErrorI);
                Repo.k(repo, j11, path2, databaseErrorI);
                repo.o(completionListener, databaseErrorI, path2);
            }
        });
        Iterator it = immutableTree.iterator();
        while (it.hasNext()) {
            u(g(path.e((Path) ((Map.Entry) it.next()).getKey()), -9));
        }
    }

    public final void h(Tree tree, int i11) {
        DatabaseError databaseError;
        int i12;
        TreeNode treeNode = tree.f19428c;
        List list = (List) treeNode.f19431b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            int i13 = -9;
            if (i11 == -9) {
                databaseError = DatabaseError.b(aYZzTH.pNSJjHS, null);
            } else {
                char[] cArr = Utilities.f19432a;
                HashMap map = DatabaseError.f18959c;
                if (!map.containsKey(-25)) {
                    throw new IllegalArgumentException("Invalid Firebase Database error code: -25");
                }
                databaseError = new DatabaseError(-25, (String) map.get(-25));
            }
            int i14 = -1;
            int i15 = 0;
            while (i15 < list.size()) {
                TransactionData transactionData = (TransactionData) list.get(i15);
                TransactionStatus transactionStatus = transactionData.f19277d;
                TransactionStatus transactionStatus2 = TransactionStatus.SENT_NEEDS_ABORT;
                if (transactionStatus != transactionStatus2) {
                    if (transactionStatus == TransactionStatus.SENT) {
                        char[] cArr2 = Utilities.f19432a;
                        transactionData.f19277d = transactionStatus2;
                        transactionData.H = databaseError;
                        i14 = i15;
                    } else {
                        char[] cArr3 = Utilities.f19432a;
                        t(new ValueEventRegistration(this, transactionData.f19276c, QuerySpec.a(transactionData.f19274a)));
                        if (i11 == i13) {
                            arrayList.addAll(this.f19228n.c(transactionData.K, true, false, this.f19217b));
                        }
                        arrayList2.add(new Runnable(databaseError) { // from class: com.google.firebase.database.core.Repo.25
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f19256a.f19275b.getClass();
                            }
                        });
                    }
                }
                i15++;
                i13 = -9;
            }
            if (i14 == -1) {
                treeNode.f19431b = null;
                tree.e();
                i12 = 0;
            } else {
                i12 = 0;
                treeNode.f19431b = list.subList(0, i14 + 1);
                tree.e();
            }
            r(arrayList);
            int size = arrayList2.size();
            int i16 = i12;
            while (i16 < size) {
                Object obj = arrayList2.get(i16);
                i16++;
                q((Runnable) obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.Repo$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass15 implements ValueEventListener {
        @Override // com.google.firebase.database.ValueEventListener
        public final void E(DataSnapshot dataSnapshot) {
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void d(DatabaseError databaseError) {
        }
    }
}
