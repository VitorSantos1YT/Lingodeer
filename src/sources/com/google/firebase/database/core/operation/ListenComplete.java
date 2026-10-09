package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ListenComplete extends Operation {
    public ListenComplete(OperationSource operationSource, Path path) {
        super(Operation.OperationType.ListenComplete, operationSource, path);
        operationSource.c();
        char[] cArr = Utilities.f19432a;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public final Operation a(ChildKey childKey) {
        Path path = this.f19391c;
        boolean zIsEmpty = path.isEmpty();
        OperationSource operationSource = this.f19390b;
        return zIsEmpty ? new ListenComplete(operationSource, Path.f19210d) : new ListenComplete(operationSource, path.n());
    }

    public final String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", this.f19391c, this.f19390b);
    }
}
