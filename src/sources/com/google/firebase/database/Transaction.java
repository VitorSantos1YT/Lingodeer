package com.google.firebase.database;

import com.google.firebase.database.core.SnapshotHolder;
import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Transaction {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Handler {
        Result a(MutableData mutableData);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f18999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Node f19000b;

        public Result(boolean z11, Node node) {
            this.f18999a = z11;
            this.f19000b = node;
        }
    }

    public static Result a(MutableData mutableData) {
        SnapshotHolder snapshotHolder = mutableData.f18983a;
        return new Result(true, snapshotHolder.f19289a.I(mutableData.f18984b));
    }
}
