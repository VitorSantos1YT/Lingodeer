package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AckUserWrite extends Operation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImmutableTree f19387e;

    public AckUserWrite(Path path, ImmutableTree immutableTree, boolean z11) {
        super(Operation.OperationType.AckUserWrite, OperationSource.f19392d, path);
        this.f19387e = immutableTree;
        this.f19386d = z11;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public final Operation a(ChildKey childKey) {
        Path path = this.f19391c;
        boolean zIsEmpty = path.isEmpty();
        boolean z11 = this.f19386d;
        ImmutableTree immutableTree = this.f19387e;
        if (!zIsEmpty) {
            path.k().equals(childKey);
            char[] cArr = Utilities.f19432a;
            return new AckUserWrite(path.n(), immutableTree, z11);
        }
        if (immutableTree.f19417a == null) {
            return new AckUserWrite(Path.f19210d, immutableTree.k(new Path(childKey)), z11);
        }
        immutableTree.f19418b.isEmpty();
        char[] cArr2 = Utilities.f19432a;
        return this;
    }

    public final String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", this.f19391c, Boolean.valueOf(this.f19386d), this.f19387e);
    }
}
