package com.google.firebase.database.connection;

import com.google.firebase.database.logging.AndroidLogger;
import com.google.firebase.database.logging.Logger;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f19061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.database.core.a f19062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.database.core.a f19063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f19064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19067g;

    public ConnectionContext(AndroidLogger androidLogger, com.google.firebase.database.core.a aVar, com.google.firebase.database.core.a aVar2, ScheduledExecutorService scheduledExecutorService, String str, String str2, String str3) {
        this.f19064d = androidLogger;
        this.f19062b = aVar;
        this.f19063c = aVar2;
        this.f19061a = scheduledExecutorService;
        this.f19065e = str;
        this.f19066f = str2;
        this.f19067g = str3;
    }
}
