package com.google.firebase.database;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.SnapshotHolder;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MutableData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnapshotHolder f18983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18984b;

    /* JADX INFO: renamed from: com.google.firebase.database.MutableData$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterable<MutableData> {

        /* JADX INFO: renamed from: com.google.firebase.database.MutableData$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class C00351 implements Iterator<MutableData> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final MutableData next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<MutableData> iterator() {
            return new C00351();
        }
    }

    public MutableData(SnapshotHolder snapshotHolder, Path path) {
        this.f18983a = snapshotHolder;
        this.f18984b = path;
        new ValidationPath(path).e(snapshotHolder.f19289a.I(path).getValue());
    }

    public final MutableData a(String str) {
        Validation.a(str);
        return new MutableData(this.f18983a, this.f18984b.e(new Path(str)));
    }

    public final Iterable b() {
        Node nodeI = this.f18983a.f19289a.I(this.f18984b);
        if (nodeI.isEmpty() || nodeI.T0()) {
            return new AnonymousClass1();
        }
        final Iterator<NamedNode> it = IndexedNode.d(nodeI).iterator();
        return new Iterable<MutableData>() { // from class: com.google.firebase.database.MutableData.2
            @Override // java.lang.Iterable
            public final Iterator<MutableData> iterator() {
                return new Iterator<MutableData>() { // from class: com.google.firebase.database.MutableData.2.1
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final MutableData next() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        NamedNode namedNode = (NamedNode) it.next();
                        MutableData mutableData = MutableData.this;
                        return new MutableData(mutableData.f18983a, mutableData.f18984b.f(namedNode.f19549a));
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    public final boolean c() {
        Node nodeI = this.f18983a.f19289a.I(this.f18984b);
        return (nodeI.T0() || nodeI.isEmpty()) ? false : true;
    }

    public final void d(Map map) {
        Path path = this.f18984b;
        new ValidationPath(path).e(map);
        Object objF = CustomClassMapper.f(map);
        Validation.c(objF);
        Node nodeA = NodeUtilities.a(objF, EmptyNode.f19537e);
        SnapshotHolder snapshotHolder = this.f18983a;
        snapshotHolder.f19289a = snapshotHolder.f19289a.i0(path, nodeA);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutableData)) {
            return false;
        }
        MutableData mutableData = (MutableData) obj;
        return this.f18983a.equals(mutableData.f18983a) && this.f18984b.equals(mutableData.f18984b);
    }

    public final String toString() {
        ChildKey childKeyK = this.f18984b.k();
        StringBuilder sb2 = new StringBuilder("MutableData { key = ");
        sb2.append(childKeyK != null ? childKeyK.f19513a : "<none>");
        sb2.append(", value = ");
        sb2.append(this.f18983a.f19289a.p1(true));
        sb2.append(" }");
        return sb2.toString();
    }
}
