package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Predicate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PruneForest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Predicate f19398b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Predicate f19399c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableTree f19400a = ImmutableTree.f19416d;

    /* JADX INFO: renamed from: com.google.firebase.database.core.persistence.PruneForest$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements ImmutableTree.TreeVisitor<Boolean, Object> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            if (((Boolean) obj).booleanValue()) {
                return obj2;
            }
            throw null;
        }
    }

    static {
        new Predicate<Boolean>() { // from class: com.google.firebase.database.core.persistence.PruneForest.1
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                return !((Boolean) obj).booleanValue();
            }
        };
        new Predicate<Boolean>() { // from class: com.google.firebase.database.core.persistence.PruneForest.2
            @Override // com.google.firebase.database.core.utilities.Predicate
            public final boolean a(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        };
        new ImmutableTree(Boolean.TRUE);
        new ImmutableTree(Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PruneForest) && this.f19400a.equals(((PruneForest) obj).f19400a);
    }

    public final int hashCode() {
        return this.f19400a.hashCode();
    }

    public final String toString() {
        return "{PruneForest:" + this.f19400a.toString() + "}";
    }
}
