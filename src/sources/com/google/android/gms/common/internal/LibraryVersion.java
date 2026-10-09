package com.google.android.gms.common.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class LibraryVersion {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GmsLogger f8932b = new GmsLogger("LibraryVersion", BuildConfig.VERSION_NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LibraryVersion f8933c = new LibraryVersion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8934a = new ConcurrentHashMap();
}
