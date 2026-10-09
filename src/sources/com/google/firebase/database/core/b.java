package com.google.firebase.database.core;

import com.google.firebase.database.connection.ConnectionTokenProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionTokenProvider.GetTokenCallback f19384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19385c;

    public /* synthetic */ b(ConnectionTokenProvider.GetTokenCallback getTokenCallback, String str, int i11) {
        this.f19383a = i11;
        this.f19384b = getTokenCallback;
        this.f19385c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19383a) {
            case 0:
                this.f19384b.a(this.f19385c);
                break;
            default:
                this.f19384b.b(this.f19385c);
                break;
        }
    }
}
