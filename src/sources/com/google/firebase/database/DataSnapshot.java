package com.google.firebase.database;

import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DataSnapshot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexedNode f18954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DatabaseReference f18955b;

    public DataSnapshot(DatabaseReference databaseReference, IndexedNode indexedNode) {
        this.f18954a = indexedNode;
        this.f18955b = databaseReference;
    }

    public final Iterable a() {
        final Iterator<NamedNode> it = this.f18954a.iterator();
        return new Iterable<DataSnapshot>() { // from class: com.google.firebase.database.DataSnapshot.1
            @Override // java.lang.Iterable
            public final Iterator<DataSnapshot> iterator() {
                return new Iterator<DataSnapshot>() { // from class: com.google.firebase.database.DataSnapshot.1.1
                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public final DataSnapshot next() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        NamedNode namedNode = (NamedNode) it.next();
                        return new DataSnapshot(DataSnapshot.this.f18955b.e(namedNode.f19549a.f19513a), IndexedNode.d(namedNode.f19550b));
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    public final Object b() {
        return CustomClassMapper.b(PodUser.class, this.f18954a.f19539a.getValue());
    }

    public final String toString() {
        return "DataSnapshot { key = " + this.f18955b.f() + ", value = " + this.f18954a.f19539a.p1(true) + " }";
    }
}
