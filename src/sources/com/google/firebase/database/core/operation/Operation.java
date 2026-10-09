package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Operation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OperationType f19389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OperationSource f19390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f19391c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class OperationType {
        private static final /* synthetic */ OperationType[] $VALUES;
        public static final OperationType AckUserWrite;
        public static final OperationType ListenComplete;
        public static final OperationType Merge;
        public static final OperationType Overwrite;

        static {
            OperationType operationType = new OperationType("Overwrite", 0);
            Overwrite = operationType;
            OperationType operationType2 = new OperationType("Merge", 1);
            Merge = operationType2;
            OperationType operationType3 = new OperationType("AckUserWrite", 2);
            AckUserWrite = operationType3;
            OperationType operationType4 = new OperationType("ListenComplete", 3);
            ListenComplete = operationType4;
            $VALUES = new OperationType[]{operationType, operationType2, operationType3, operationType4};
        }

        public static OperationType valueOf(String str) {
            return (OperationType) Enum.valueOf(OperationType.class, str);
        }

        public static OperationType[] values() {
            return (OperationType[]) $VALUES.clone();
        }
    }

    public Operation(OperationType operationType, OperationSource operationSource, Path path) {
        this.f19389a = operationType;
        this.f19390b = operationSource;
        this.f19391c = path;
    }

    public abstract Operation a(ChildKey childKey);
}
