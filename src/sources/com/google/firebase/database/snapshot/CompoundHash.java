package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.NodeSizeEstimator;
import com.google.firebase.database.core.utilities.Utilities;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CompoundHash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19524b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CompoundHashBuilder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19529d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SplitStrategy f19533h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StringBuilder f19526a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Stack f19527b = new Stack();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19528c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19530e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f19531f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f19532g = new ArrayList();

        public CompoundHashBuilder(SplitStrategy splitStrategy) {
            this.f19533h = splitStrategy;
        }

        public final Path a(int i11) {
            ChildKey[] childKeyArr = new ChildKey[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                childKeyArr[i12] = (ChildKey) this.f19527b.get(i12);
            }
            return new Path(childKeyArr);
        }

        public final void b() {
            char[] cArr = Utilities.f19432a;
            for (int i11 = 0; i11 < this.f19529d; i11++) {
                this.f19526a.append(")");
            }
            this.f19526a.append(")");
            Path pathA = a(this.f19528c);
            this.f19532g.add(Utilities.c(this.f19526a.toString()));
            this.f19531f.add(pathA);
            this.f19526a = null;
        }

        public final void c() {
            if (this.f19526a != null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f19526a = sb2;
            sb2.append("(");
            Iterator<ChildKey> it = a(this.f19529d).iterator();
            while (it.hasNext()) {
                this.f19526a.append(Utilities.d(it.next().f19513a));
                this.f19526a.append(":(");
            }
            this.f19530e = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SimpleSizeSplitStrategy implements SplitStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19534a;

        public SimpleSizeSplitStrategy(Node node) {
            this.f19534a = Math.max(512L, (long) Math.sqrt(NodeSizeEstimator.b(node) * 100));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SplitStrategy {
    }

    public CompoundHash(List list, List list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f19523a = list;
        this.f19524b = list2;
    }

    public static CompoundHash a(Node node) {
        SimpleSizeSplitStrategy simpleSizeSplitStrategy = new SimpleSizeSplitStrategy(node);
        if (node.isEmpty()) {
            return new CompoundHash(Collections.EMPTY_LIST, Collections.singletonList(BuildConfig.VERSION_NAME));
        }
        CompoundHashBuilder compoundHashBuilder = new CompoundHashBuilder(simpleSizeSplitStrategy);
        b(node, compoundHashBuilder);
        char[] cArr = Utilities.f19432a;
        if (compoundHashBuilder.f19526a != null) {
            compoundHashBuilder.b();
        }
        ArrayList arrayList = compoundHashBuilder.f19532g;
        arrayList.add(BuildConfig.VERSION_NAME);
        return new CompoundHash(compoundHashBuilder.f19531f, arrayList);
    }

    public static void b(Node node, final CompoundHashBuilder compoundHashBuilder) {
        if (!node.T0()) {
            if (node.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (node instanceof ChildrenNode) {
                ((ChildrenNode) node).e(new ChildrenNode.ChildVisitor() { // from class: com.google.firebase.database.snapshot.CompoundHash.1
                    @Override // com.google.firebase.database.snapshot.ChildrenNode.ChildVisitor
                    public final void b(ChildKey childKey, Node node2) {
                        CompoundHashBuilder compoundHashBuilder2 = compoundHashBuilder;
                        Stack stack = compoundHashBuilder2.f19527b;
                        compoundHashBuilder2.c();
                        if (compoundHashBuilder2.f19530e) {
                            compoundHashBuilder2.f19526a.append(",");
                        }
                        compoundHashBuilder2.f19526a.append(Utilities.d(childKey.f19513a));
                        compoundHashBuilder2.f19526a.append(":(");
                        if (compoundHashBuilder2.f19529d == stack.size()) {
                            stack.add(childKey);
                        } else {
                            stack.set(compoundHashBuilder2.f19529d, childKey);
                        }
                        compoundHashBuilder2.f19529d++;
                        compoundHashBuilder2.f19530e = false;
                        CompoundHash.b(node2, compoundHashBuilder2);
                        compoundHashBuilder2.f19529d--;
                        StringBuilder sb2 = compoundHashBuilder2.f19526a;
                        if (sb2 != null) {
                            sb2.append(")");
                        }
                        compoundHashBuilder2.f19530e = true;
                    }
                }, true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + node);
            }
        }
        compoundHashBuilder.c();
        compoundHashBuilder.f19528c = compoundHashBuilder.f19529d;
        compoundHashBuilder.f19526a.append(((LeafNode) node).v0(Node.HashVersion.V2));
        compoundHashBuilder.f19530e = true;
        SimpleSizeSplitStrategy simpleSizeSplitStrategy = (SimpleSizeSplitStrategy) compoundHashBuilder.f19533h;
        simpleSizeSplitStrategy.getClass();
        if (compoundHashBuilder.f19526a.length() > simpleSizeSplitStrategy.f19534a) {
            if (compoundHashBuilder.a(compoundHashBuilder.f19529d).isEmpty() || !compoundHashBuilder.a(compoundHashBuilder.f19529d).j().equals(ChildKey.f19512d)) {
                compoundHashBuilder.b();
            }
        }
    }
}
