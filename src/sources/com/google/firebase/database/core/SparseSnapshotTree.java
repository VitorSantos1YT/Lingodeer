package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class SparseSnapshotTree {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Node f19290a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f19291b = null;

    /* JADX INFO: renamed from: com.google.firebase.database.core.SparseSnapshotTree$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ChildrenNode.ChildVisitor {
        @Override // com.google.firebase.database.snapshot.ChildrenNode.ChildVisitor
        public final void b(ChildKey childKey, Node node) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.SparseSnapshotTree$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements SparseSnapshotChildVisitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Path f19292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SparseSnapshotTreeVisitor f19293b;

        public AnonymousClass2(Path path, SparseSnapshotTreeVisitor sparseSnapshotTreeVisitor) {
            this.f19292a = path;
            this.f19293b = sparseSnapshotTreeVisitor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SparseSnapshotChildVisitor {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SparseSnapshotTreeVisitor {
    }

    public final void a(Path path, SparseSnapshotTreeVisitor sparseSnapshotTreeVisitor) {
        Node node = this.f19290a;
        if (node != null) {
            Repo.AnonymousClass14 anonymousClass14 = (Repo.AnonymousClass14) sparseSnapshotTreeVisitor;
            Repo repo = Repo.this;
            Node nodeI = repo.f19228n.i(path, new ArrayList());
            anonymousClass14.f19236b.addAll(repo.f19228n.g(path, ServerValues.d(node, new ValueProvider.ExistingValueProvider(nodeI), anonymousClass14.f19235a)));
            repo.u(repo.g(path, -9));
            return;
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(path, sparseSnapshotTreeVisitor);
        HashMap map = this.f19291b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((SparseSnapshotTree) entry.getValue()).a(anonymousClass2.f19292a.f((ChildKey) entry.getKey()), anonymousClass2.f19293b);
            }
        }
    }

    public final void b(Path path, Node node) {
        if (path.isEmpty()) {
            this.f19290a = node;
            this.f19291b = null;
            return;
        }
        Node node2 = this.f19290a;
        if (node2 != null) {
            this.f19290a = node2.i0(path, node);
            return;
        }
        if (this.f19291b == null) {
            this.f19291b = new HashMap();
        }
        ChildKey childKeyK = path.k();
        if (!this.f19291b.containsKey(childKeyK)) {
            this.f19291b.put(childKeyK, new SparseSnapshotTree());
        }
        ((SparseSnapshotTree) this.f19291b.get(childKeyK)).b(path.n(), node);
    }
}
