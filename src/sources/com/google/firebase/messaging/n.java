package com.google.firebase.messaging;

import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20598b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f20597a = i11;
        this.f20598b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20597a) {
            case 0:
                SharedPreferencesQueue sharedPreferencesQueue = (SharedPreferencesQueue) this.f20598b;
                synchronized (sharedPreferencesQueue.f20519d) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesQueue.f20516a.edit();
                    String str = sharedPreferencesQueue.f20517b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = sharedPreferencesQueue.f20519d.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append(sharedPreferencesQueue.f20518c);
                    }
                    editorEdit.putString(str, sb2.toString()).apply();
                    break;
                }
                return;
            default:
                WithinAppServiceConnection.BindRequest bindRequest = (WithinAppServiceConnection.BindRequest) this.f20598b;
                bindRequest.f20569a.getAction();
                bindRequest.f20570b.trySetResult(null);
                return;
        }
    }
}
