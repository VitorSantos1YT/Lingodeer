package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.Predicate;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class WriteTree {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Predicate f19370d = new Predicate<UserWriteRecord>() { // from class: com.google.firebase.database.core.WriteTree.2
        @Override // com.google.firebase.database.core.utilities.Predicate
        public final boolean a(Object obj) {
            return ((UserWriteRecord) obj).f19361e;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CompoundWrite f19371a = CompoundWrite.f19184b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f19372b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f19373c = -1L;

    public static CompoundWrite b(ArrayList arrayList, Predicate predicate, Path path) {
        CompoundWrite compoundWriteB = CompoundWrite.f19184b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            UserWriteRecord userWriteRecord = (UserWriteRecord) obj;
            if (predicate.a(userWriteRecord)) {
                Path path2 = userWriteRecord.f19358b;
                if (userWriteRecord.c()) {
                    if (path.h(path2)) {
                        compoundWriteB = compoundWriteB.b(Path.m(path, path2), userWriteRecord.b());
                    } else if (path2.h(path)) {
                        compoundWriteB = compoundWriteB.b(Path.f19210d, userWriteRecord.b().I(Path.m(path2, path)));
                    }
                } else if (path.h(path2)) {
                    compoundWriteB = compoundWriteB.d(Path.m(path, path2), userWriteRecord.a());
                } else if (path2.h(path)) {
                    Path pathM = Path.m(path2, path);
                    if (pathM.isEmpty()) {
                        compoundWriteB = compoundWriteB.d(Path.f19210d, userWriteRecord.a());
                    } else {
                        Node nodeJ = userWriteRecord.a().j(pathM);
                        if (nodeJ != null) {
                            compoundWriteB = compoundWriteB.b(Path.f19210d, nodeJ);
                        }
                    }
                }
            }
        }
        return compoundWriteB;
    }

    public final Node a(final Path path, Node node, final List list, final boolean z11) {
        if (!list.isEmpty() || z11) {
            CompoundWrite compoundWriteG = this.f19371a.g(path);
            if (z11 || !compoundWriteG.f19185a.isEmpty()) {
                if (!z11 && node == null && compoundWriteG.j(Path.f19210d) == null) {
                    return null;
                }
                CompoundWrite compoundWriteB = b(this.f19372b, new Predicate<UserWriteRecord>() { // from class: com.google.firebase.database.core.WriteTree.1
                    @Override // com.google.firebase.database.core.utilities.Predicate
                    public final boolean a(Object obj) {
                        UserWriteRecord userWriteRecord = (UserWriteRecord) obj;
                        boolean z12 = userWriteRecord.f19361e;
                        Path path2 = userWriteRecord.f19358b;
                        if (!z12 && !z11) {
                            return false;
                        }
                        if (list.contains(Long.valueOf(userWriteRecord.f19357a))) {
                            return false;
                        }
                        Path path3 = path;
                        return path2.h(path3) || path3.h(path2);
                    }
                }, path);
                if (node == null) {
                    node = EmptyNode.f19537e;
                }
                return compoundWriteB.e(node);
            }
        } else {
            Node nodeJ = this.f19371a.j(path);
            if (nodeJ != null) {
                return nodeJ;
            }
            CompoundWrite compoundWriteG2 = this.f19371a.g(path);
            if (!compoundWriteG2.f19185a.isEmpty()) {
                if (node == null && compoundWriteG2.j(Path.f19210d) == null) {
                    return null;
                }
                if (node == null) {
                    node = EmptyNode.f19537e;
                }
                return compoundWriteG2.e(node);
            }
        }
        return node;
    }
}
