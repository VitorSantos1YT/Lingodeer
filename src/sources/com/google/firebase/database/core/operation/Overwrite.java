package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Overwrite extends Operation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Node f19397d;

    public Overwrite(OperationSource operationSource, Path path, Node node) {
        super(Operation.OperationType.Overwrite, operationSource, path);
        this.f19397d = node;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public final Operation a(ChildKey childKey) {
        Path path = this.f19391c;
        boolean zIsEmpty = path.isEmpty();
        Node node = this.f19397d;
        OperationSource operationSource = this.f19390b;
        return zIsEmpty ? new Overwrite(operationSource, Path.f19210d, node.x0(childKey)) : new Overwrite(operationSource, path.n(), node);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", this.f19391c, this.f19390b, this.f19397d);
    }
}
