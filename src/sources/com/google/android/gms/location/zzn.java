package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn implements Comparator<ActivityTransition> {
    @Override // java.util.Comparator
    public final int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        Preconditions.g(activityTransition3);
        Preconditions.g(activityTransition4);
        int i11 = activityTransition3.f12500a;
        int i12 = activityTransition4.f12500a;
        if (i11 != i12) {
            return i11 >= i12 ? 1 : -1;
        }
        int i13 = activityTransition3.f12501b;
        int i14 = activityTransition4.f12501b;
        if (i13 == i14) {
            return 0;
        }
        return i13 < i14 ? -1 : 1;
    }
}
