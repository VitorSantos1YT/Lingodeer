package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzww {
    public abstract ImmutableList a();

    public abstract ImmutableList b();

    public abstract UUID c();

    public abstract long d();

    public final String toString() {
        return TextUtils.join(" -> ", a());
    }
}
