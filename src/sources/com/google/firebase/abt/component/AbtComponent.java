package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inject.Provider;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AbtComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17758a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f17759b;

    public AbtComponent(Context context, Provider provider) {
        this.f17759b = provider;
    }

    public final synchronized FirebaseABTesting a(String str) {
        try {
            if (!this.f17758a.containsKey(str)) {
                this.f17758a.put(str, new FirebaseABTesting(this.f17759b, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (FirebaseABTesting) this.f17758a.get(str);
    }
}
