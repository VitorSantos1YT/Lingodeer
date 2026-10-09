package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Predicate;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TrackedQueryManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Predicate f19406b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Predicate f19407c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Predicate f19408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Predicate f19409e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableTree f19410a;

    /* JADX INFO: renamed from: com.google.firebase.database.core.persistence.TrackedQueryManager$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 implements ImmutableTree.TreeVisitor<Map<QueryParams, TrackedQuery>, Void> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            Iterator it = ((Map) obj).entrySet().iterator();
            while (it.hasNext()) {
                TrackedQuery trackedQuery = (TrackedQuery) ((Map.Entry) it.next()).getValue();
                if (!trackedQuery.f19404d) {
                    new TrackedQuery(trackedQuery.f19401a, trackedQuery.f19402b, trackedQuery.f19403c, true, trackedQuery.f19405e);
                    Predicate predicate = TrackedQueryManager.f19406b;
                    throw null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.persistence.TrackedQueryManager$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass6 implements Comparator<TrackedQuery> {
        @Override // java.util.Comparator
        public final int compare(TrackedQuery trackedQuery, TrackedQuery trackedQuery2) {
            long j11 = trackedQuery.f19403c;
            long j12 = trackedQuery2.f19403c;
            char[] cArr = Utilities.f19432a;
            if (j11 < j12) {
                return -1;
            }
            return j11 == j12 ? 0 : 1;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.persistence.TrackedQueryManager$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass7 implements ImmutableTree.TreeVisitor<Map<QueryParams, TrackedQuery>, Void> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            Iterator it = ((Map) obj).values().iterator();
            if (!it.hasNext()) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.persistence.TrackedQueryManager$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass8 implements Comparator<TrackedQuery> {
        @Override // java.util.Comparator
        public final int compare(TrackedQuery trackedQuery, TrackedQuery trackedQuery2) {
            long j11 = trackedQuery.f19401a;
            long j12 = trackedQuery2.f19401a;
            char[] cArr = Utilities.f19432a;
            if (j11 < j12) {
                return -1;
            }
            return j11 == j12 ? 0 : 1;
        }
    }

    static {
        new Predicate<Map<QueryParams, TrackedQuery>>() { // from class: com.google.firebase.database.core.persistence.TrackedQueryManager.1
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                TrackedQuery trackedQuery = (TrackedQuery) ((Map) obj).get(QueryParams.f19466i);
                return trackedQuery != null && trackedQuery.f19404d;
            }
        };
        new Predicate<Map<QueryParams, TrackedQuery>>() { // from class: com.google.firebase.database.core.persistence.TrackedQueryManager.2
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                TrackedQuery trackedQuery = (TrackedQuery) ((Map) obj).get(QueryParams.f19466i);
                return trackedQuery != null && trackedQuery.f19405e;
            }
        };
        f19408d = new Predicate<TrackedQuery>() { // from class: com.google.firebase.database.core.persistence.TrackedQueryManager.3
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                return !((TrackedQuery) obj).f19405e;
            }
        };
        new Predicate<TrackedQuery>() { // from class: com.google.firebase.database.core.persistence.TrackedQueryManager.4
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                ((AnonymousClass3) TrackedQueryManager.f19408d).getClass();
                return ((TrackedQuery) obj).f19405e;
            }
        };
    }

    public final void a(TrackedQuery trackedQuery) {
        QuerySpec querySpec = trackedQuery.f19402b;
        if (querySpec.f19477b.h()) {
            querySpec.b();
        }
        char[] cArr = Utilities.f19432a;
        ImmutableTree immutableTree = this.f19410a;
        Path path = querySpec.f19476a;
        QueryParams queryParams = querySpec.f19477b;
        Map map = (Map) immutableTree.e(path);
        if (map == null) {
            map = new HashMap();
            this.f19410a = this.f19410a.h(querySpec.f19476a, map);
        }
        TrackedQuery trackedQuery2 = (TrackedQuery) map.get(queryParams);
        if (trackedQuery2 != null) {
            int i11 = (trackedQuery2.f19401a > trackedQuery.f19401a ? 1 : (trackedQuery2.f19401a == trackedQuery.f19401a ? 0 : -1));
        }
        map.put(queryParams, trackedQuery);
    }
}
