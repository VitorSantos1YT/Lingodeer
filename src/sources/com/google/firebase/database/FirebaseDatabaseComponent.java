package com.google.firebase.database;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.DatabaseConfig;
import com.google.firebase.database.core.RepoInfo;
import com.google.firebase.inject.Deferred;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseDatabaseComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18979a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f18980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidAuthTokenProvider f18981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidAppCheckTokenProvider f18982d;

    public FirebaseDatabaseComponent(FirebaseApp firebaseApp, Deferred deferred, Deferred deferred2) {
        this.f18980b = firebaseApp;
        this.f18981c = new AndroidAuthTokenProvider(deferred);
        this.f18982d = new AndroidAppCheckTokenProvider(deferred2);
    }

    public final synchronized FirebaseDatabase a(RepoInfo repoInfo) {
        FirebaseDatabase firebaseDatabase;
        try {
            firebaseDatabase = (FirebaseDatabase) this.f18979a.get(repoInfo);
            if (firebaseDatabase == null) {
                DatabaseConfig databaseConfig = new DatabaseConfig();
                FirebaseApp firebaseApp = this.f18980b;
                firebaseApp.b();
                if (!"[DEFAULT]".equals(firebaseApp.f17715b)) {
                    FirebaseApp firebaseApp2 = this.f18980b;
                    firebaseApp2.b();
                    databaseConfig.f(firebaseApp2.f17715b);
                }
                FirebaseApp firebaseApp3 = this.f18980b;
                synchronized (databaseConfig) {
                    databaseConfig.f19200i = firebaseApp3;
                }
                databaseConfig.f19194c = this.f18981c;
                databaseConfig.f19195d = this.f18982d;
                FirebaseDatabase firebaseDatabase2 = new FirebaseDatabase(repoInfo, databaseConfig);
                this.f18979a.put(repoInfo, firebaseDatabase2);
                firebaseDatabase = firebaseDatabase2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return firebaseDatabase;
    }
}
