package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Tree<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChildKey f19426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tree f19427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeNode f19428c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TreeFilter<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TreeVisitor<T> {
        void a(Tree tree);
    }

    public Tree(ChildKey childKey, Tree tree, TreeNode treeNode) {
        this.f19426a = childKey;
        this.f19427b = tree;
        this.f19428c = treeNode;
    }

    public final void a(TreeVisitor treeVisitor) {
        for (Object obj : this.f19428c.f19430a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            treeVisitor.a(new Tree((ChildKey) entry.getKey(), this, (TreeNode) entry.getValue()));
        }
    }

    public final void b(final TreeVisitor treeVisitor, boolean z11) {
        if (z11) {
            treeVisitor.a(this);
        }
        a(new TreeVisitor<Object>() { // from class: com.google.firebase.database.core.utilities.Tree.1
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public final void a(Tree tree) {
                tree.b(treeVisitor, true);
            }
        });
    }

    public final Path c() {
        ChildKey childKey = this.f19426a;
        Tree tree = this.f19427b;
        if (tree == null) {
            return childKey != null ? new Path(childKey) : Path.f19210d;
        }
        char[] cArr = Utilities.f19432a;
        return tree.c().f(childKey);
    }

    public final Tree d(Path path) {
        ChildKey childKeyK = path.k();
        Tree<T> tree = this;
        while (childKeyK != null) {
            TreeNode treeNode = tree.f19428c;
            Tree<T> tree2 = new Tree<>(childKeyK, tree, treeNode.f19430a.containsKey(childKeyK) ? (TreeNode) treeNode.f19430a.get(childKeyK) : new TreeNode());
            path = path.n();
            childKeyK = path.k();
            tree = tree2;
        }
        return tree;
    }

    public final void e() {
        Tree tree = this.f19427b;
        if (tree != null) {
            TreeNode treeNode = tree.f19428c;
            TreeNode treeNode2 = this.f19428c;
            boolean z11 = treeNode2.f19431b == null && treeNode2.f19430a.isEmpty();
            HashMap map = treeNode.f19430a;
            ChildKey childKey = this.f19426a;
            boolean zContainsKey = map.containsKey(childKey);
            if (z11 && zContainsKey) {
                map.remove(childKey);
                tree.e();
            } else {
                if (z11 || zContainsKey) {
                    return;
                }
                map.put(childKey, treeNode2);
                tree.e();
            }
        }
    }

    public final String toString() {
        ChildKey childKey = this.f19426a;
        StringBuilder sbQ = p0.q(BuildConfig.VERSION_NAME, childKey == null ? "<anon>" : childKey.f19513a, "\n");
        sbQ.append(this.f19428c.a("\t"));
        return sbQ.toString();
    }

    public Tree() {
        this(null, null, new TreeNode());
    }
}
