package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Merge extends Operation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CompoundWrite f19388d;

    public Merge(OperationSource operationSource, Path path, CompoundWrite compoundWrite) {
        super(Operation.OperationType.Merge, operationSource, path);
        this.f19388d = compoundWrite;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public final Operation a(ChildKey childKey) {
        Path path = this.f19391c;
        boolean zIsEmpty = path.isEmpty();
        CompoundWrite compoundWrite = this.f19388d;
        OperationSource operationSource = this.f19390b;
        if (!zIsEmpty) {
            if (path.k().equals(childKey)) {
                return new Merge(operationSource, path.n(), compoundWrite);
            }
            return null;
        }
        CompoundWrite compoundWriteG = compoundWrite.g(new Path(childKey));
        ImmutableTree immutableTree = compoundWriteG.f19185a;
        if (immutableTree.isEmpty()) {
            return null;
        }
        Object obj = immutableTree.f19417a;
        return ((Node) obj) != null ? new Overwrite(operationSource, Path.f19210d, (Node) obj) : new Merge(operationSource, Path.f19210d, compoundWriteG);
    }

    public final String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", this.f19391c, this.f19390b, this.f19388d);
    }
}
