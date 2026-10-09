package com.google.firebase.database.core;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RepoManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RepoManager f19284b = new RepoManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19285a = new HashMap();

    /* JADX INFO: renamed from: com.google.firebase.database.core.RepoManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.RepoManager$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.RepoManager$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.core.RepoManager$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static Repo a(Context context, RepoInfo repoInfo) {
        Repo repo;
        RepoManager repoManager = f19284b;
        repoManager.getClass();
        synchronized (context) {
            if (!context.f19201j) {
                context.f19201j = true;
                context.d();
            }
        }
        String str = "https://" + repoInfo.f19281a + "/" + repoInfo.f19283c;
        synchronized (repoManager.f19285a) {
            try {
                if (!repoManager.f19285a.containsKey(context)) {
                    repoManager.f19285a.put(context, new HashMap());
                }
                Map map = (Map) repoManager.f19285a.get(context);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                repo = new Repo(context, repoInfo);
                map.put(str, repo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return repo;
    }
}
