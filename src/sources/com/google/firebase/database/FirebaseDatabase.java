package com.google.firebase.database;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.core.DatabaseConfig;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.RepoInfo;
import com.google.firebase.database.core.RepoManager;
import com.google.firebase.database.core.utilities.ParsedUrl;
import com.google.firebase.database.core.utilities.Utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepoInfo f18976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DatabaseConfig f18977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Repo f18978c;

    /* JADX INFO: renamed from: com.google.firebase.database.FirebaseDatabase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public FirebaseDatabase(RepoInfo repoInfo, DatabaseConfig databaseConfig) {
        this.f18976a = repoInfo;
        this.f18977b = databaseConfig;
    }

    public static synchronized FirebaseDatabase b(FirebaseApp firebaseApp, String str) {
        FirebaseDatabaseComponent firebaseDatabaseComponent;
        ParsedUrl parsedUrlB;
        if (TextUtils.isEmpty(str)) {
            throw new DatabaseException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
        }
        firebaseDatabaseComponent = (FirebaseDatabaseComponent) firebaseApp.c(FirebaseDatabaseComponent.class);
        Preconditions.h(firebaseDatabaseComponent, "Firebase Database component is not present.");
        parsedUrlB = Utilities.b(str);
        if (!parsedUrlB.f19424b.isEmpty()) {
            throw new DatabaseException("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + parsedUrlB.f19424b.toString());
        }
        return firebaseDatabaseComponent.a(parsedUrlB.f19423a);
    }

    public final synchronized void a() {
        if (this.f18978c == null) {
            this.f18976a.getClass();
            this.f18978c = RepoManager.a(this.f18977b, this.f18976a);
        }
    }
}
