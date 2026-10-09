package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f9011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f9013c;

    public zzc(BaseGmsClient baseGmsClient) {
        Boolean bool = Boolean.TRUE;
        this.f9013c = baseGmsClient;
        this.f9011a = bool;
        this.f9012b = false;
    }

    public abstract void a(Object obj);
}
