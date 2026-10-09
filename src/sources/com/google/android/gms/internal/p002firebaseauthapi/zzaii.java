package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10009a;

    public zzaii() {
        this(0);
    }

    public zzaii(int i11) {
        this.f10009a = new ArrayList();
    }

    public zzaii(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            this.f10009a = Collections.EMPTY_LIST;
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.set(i11, Strings.a((String) arrayList.get(i11)));
        }
        this.f10009a = Collections.unmodifiableList(arrayList);
    }
}
