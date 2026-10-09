package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.CacheNode;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class WriteTreeRef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WriteTree f19378b;

    public WriteTreeRef(Path path, WriteTree writeTree) {
        this.f19377a = path;
        this.f19378b = writeTree;
    }

    public final Node a(ChildKey childKey, CacheNode cacheNode) {
        WriteTree writeTree = this.f19378b;
        writeTree.getClass();
        Path pathF = this.f19377a.f(childKey);
        Node nodeJ = writeTree.f19371a.j(pathF);
        if (nodeJ != null) {
            return nodeJ;
        }
        if (cacheNode.a(childKey)) {
            return writeTree.f19371a.g(pathF).e(cacheNode.f19444a.f19539a.x0(childKey));
        }
        return null;
    }

    public final Node b(Node node) {
        WriteTree writeTree = this.f19378b;
        writeTree.getClass();
        Node nodeH1 = EmptyNode.f19537e;
        CompoundWrite compoundWrite = writeTree.f19371a;
        Path path = this.f19377a;
        Node nodeJ = compoundWrite.j(path);
        if (nodeJ != null) {
            if (!nodeJ.T0()) {
                for (NamedNode namedNode : nodeJ) {
                    nodeH1 = nodeH1.h1(namedNode.f19549a, namedNode.f19550b);
                }
            }
            return nodeH1;
        }
        CompoundWrite compoundWriteG = writeTree.f19371a.g(path);
        for (NamedNode namedNode2 : node) {
            nodeH1 = nodeH1.h1(namedNode2.f19549a, compoundWriteG.g(new Path(namedNode2.f19549a)).e(namedNode2.f19550b));
        }
        ArrayList arrayList = new ArrayList();
        ImmutableTree immutableTree = compoundWriteG.f19185a;
        Object obj = immutableTree.f19417a;
        if (obj != null) {
            for (NamedNode namedNode3 : (Node) obj) {
                arrayList.add(new NamedNode(namedNode3.f19549a, namedNode3.f19550b));
            }
        } else {
            for (Map.Entry entry : immutableTree.f19418b) {
                ImmutableTree immutableTree2 = (ImmutableTree) entry.getValue();
                if (immutableTree2.f19417a != null) {
                    arrayList.add(new NamedNode((ChildKey) entry.getKey(), (Node) immutableTree2.f19417a));
                }
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            NamedNode namedNode4 = (NamedNode) obj2;
            nodeH1 = nodeH1.h1(namedNode4.f19549a, namedNode4.f19550b);
        }
        return nodeH1;
    }

    public final Node c(Path path, Node node, Node node2) {
        WriteTree writeTree = this.f19378b;
        writeTree.getClass();
        char[] cArr = Utilities.f19432a;
        Path pathE = this.f19377a.e(path);
        if (writeTree.f19371a.j(pathE) != null) {
            return null;
        }
        CompoundWrite compoundWriteG = writeTree.f19371a.g(pathE);
        return compoundWriteG.f19185a.isEmpty() ? node2.I(path) : compoundWriteG.e(node2.I(path));
    }

    public final Node d(Path path) {
        return this.f19378b.f19371a.j(this.f19377a.e(path));
    }
}
