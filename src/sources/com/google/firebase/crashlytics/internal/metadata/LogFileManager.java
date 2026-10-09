package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LogFileManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NoopLogStore f18401c = new NoopLogStore(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f18402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLogStore f18403b = f18401c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final String b() {
            return null;
        }

        public /* synthetic */ NoopLogStore(int i11) {
            this();
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public final void c(long j11, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f18402a = fileStore;
    }

    public final String a() {
        return this.f18403b.b();
    }

    public final void b(String str) {
        this.f18403b.a();
        this.f18403b = f18401c;
        if (str == null) {
            return;
        }
        this.f18403b = new QueueFileLogStore(this.f18402a.b(str, "userlog"));
    }

    public final void c(long j11, String str) {
        this.f18403b.c(j11, str);
    }
}
