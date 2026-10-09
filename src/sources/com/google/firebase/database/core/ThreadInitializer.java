package com.google.firebase.database.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ThreadInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadInitializer f19356a = new ThreadInitializer() { // from class: com.google.firebase.database.core.ThreadInitializer.1
        @Override // com.google.firebase.database.core.ThreadInitializer
        public final void a(Thread thread) {
            thread.setName("FirebaseDatabaseWorker");
        }

        @Override // com.google.firebase.database.core.ThreadInitializer
        public final void b(Thread thread) {
            thread.setDaemon(true);
        }

        @Override // com.google.firebase.database.core.ThreadInitializer
        public final void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    };

    void a(Thread thread);

    void b(Thread thread);

    void c(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
