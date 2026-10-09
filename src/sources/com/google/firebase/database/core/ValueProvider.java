package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class ValueProvider {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DeferredValueProvider extends ValueProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SyncTree f19367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f19368b;

        public DeferredValueProvider(SyncTree syncTree, Path path) {
            this.f19367a = syncTree;
            this.f19368b = path;
        }

        @Override // com.google.firebase.database.core.ValueProvider
        public final ValueProvider a(ChildKey childKey) {
            return new DeferredValueProvider(this.f19367a, this.f19368b.f(childKey));
        }

        @Override // com.google.firebase.database.core.ValueProvider
        public final Node b() {
            return this.f19367a.i(this.f19368b, new ArrayList());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ExistingValueProvider extends ValueProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Node f19369a;

        public ExistingValueProvider(Node node) {
            this.f19369a = node;
        }

        @Override // com.google.firebase.database.core.ValueProvider
        public final ValueProvider a(ChildKey childKey) {
            return new ExistingValueProvider(this.f19369a.x0(childKey));
        }

        @Override // com.google.firebase.database.core.ValueProvider
        public final Node b() {
            return this.f19369a;
        }
    }

    public abstract ValueProvider a(ChildKey childKey);

    public abstract Node b();
}
