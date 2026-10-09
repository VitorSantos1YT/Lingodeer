package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GoogleApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f8694a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f8695a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f8698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f8699e;

        public Builder(Context context) {
            new HashSet();
            this.f8698d = new e(0);
            this.f8699e = new e(0);
            Object obj = GoogleApiAvailability.f8642d;
            Api.AbstractClientBuilder abstractClientBuilder = com.google.android.gms.signin.zad.f13709a;
            new ArrayList();
            new ArrayList();
            context.getMainLooper();
            this.f8696b = context.getPackageName();
            this.f8697c = context.getClass().getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public boolean b() {
        throw new UnsupportedOperationException();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }
}
