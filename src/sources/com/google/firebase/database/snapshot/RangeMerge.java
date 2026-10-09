package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RangeMerge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Node f19556c;

    public RangeMerge(com.google.firebase.database.connection.RangeMerge rangeMerge) {
        List list = rangeMerge.f19124a;
        this.f19554a = list != null ? new Path(list) : null;
        List list2 = rangeMerge.f19125b;
        this.f19555b = list2 != null ? new Path(list2) : null;
        this.f19556c = NodeUtilities.a(rangeMerge.f19126c, EmptyNode.f19537e);
    }

    public final Node a(Path path, Node node, Node node2) {
        Path path2 = this.f19554a;
        int iCompareTo = path2 == null ? 1 : path.compareTo(path2);
        Path path3 = this.f19555b;
        int iCompareTo2 = path3 == null ? -1 : path.compareTo(path3);
        int i11 = 0;
        boolean z11 = path2 != null && path.h(path2);
        boolean z12 = path3 != null && path.h(path3);
        if (iCompareTo > 0 && iCompareTo2 < 0 && !z12) {
            return node2;
        }
        if (iCompareTo > 0 && z12 && node2.T0()) {
            return node2;
        }
        if (iCompareTo > 0 && iCompareTo2 == 0) {
            char[] cArr = Utilities.f19432a;
            node2.getClass();
            return node.T0() ? EmptyNode.f19537e : node;
        }
        if (!z11 && !z12) {
            char[] cArr2 = Utilities.f19432a;
            return node;
        }
        HashSet hashSet = new HashSet();
        Iterator<NamedNode> it = node.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f19549a);
        }
        Iterator<NamedNode> it2 = node2.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().f19549a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!node2.y().isEmpty() || !node.y().isEmpty()) {
            arrayList.add(ChildKey.f19512d);
        }
        int size = arrayList.size();
        Node nodeH1 = node;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ChildKey childKey = (ChildKey) obj;
            Node nodeX0 = node.x0(childKey);
            Node nodeA = a(path.f(childKey), node.x0(childKey), node2.x0(childKey));
            if (nodeA != nodeX0) {
                nodeH1 = nodeH1.h1(childKey, nodeA);
            }
        }
        return nodeH1;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f19554a + ", optInclusiveEnd=" + this.f19555b + ", snap=" + this.f19556c + '}';
    }
}
