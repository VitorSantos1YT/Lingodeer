package com.google.firebase.remoteconfig.internal;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Personalization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20776b = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider provider) {
        this.f20775a = provider;
    }
}
