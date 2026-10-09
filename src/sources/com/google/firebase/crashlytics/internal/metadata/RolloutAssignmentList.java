package com.google.firebase.crashlytics.internal.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RolloutAssignmentList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18429a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18430b = 128;

    public final synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f18429a));
    }

    public final synchronized boolean b(List list) {
        this.f18429a.clear();
        int size = list.size();
        int i11 = this.f18430b;
        if (size <= i11) {
            return this.f18429a.addAll(list);
        }
        return this.f18429a.addAll(list.subList(0, i11));
    }
}
