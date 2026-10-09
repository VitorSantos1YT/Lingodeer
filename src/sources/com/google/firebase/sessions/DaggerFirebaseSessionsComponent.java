package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerFirebaseSessionsComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder implements FirebaseSessionsComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f20852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f20853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f20854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FirebaseApp f20855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public FirebaseInstallationsApi f20856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Provider f20857f;

        private Builder() {
        }

        public /* synthetic */ Builder(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InstanceFactory f20858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InstanceFactory f20859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InstanceFactory f20862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InstanceFactory f20864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20865h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InstanceFactory f20866i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20867j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20868k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20869l;
        public com.google.firebase.sessions.dagger.internal.Provider m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20872p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20873q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20874r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20875s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20876t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20877u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20878v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.google.firebase.sessions.dagger.internal.Provider f20879w;

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final FirebaseSessions a() {
            return (FirebaseSessions) this.f20879w.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SharedSessionRepository b() {
            return (SharedSessionRepository) this.f20877u.get();
        }
    }

    private DaggerFirebaseSessionsComponent() {
    }
}
