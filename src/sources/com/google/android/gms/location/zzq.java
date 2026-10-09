package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzq implements Comparator<DetectedActivity> {
    @Override // java.util.Comparator
    public final int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        Preconditions.g(detectedActivity3);
        Preconditions.g(detectedActivity4);
        int iCompareTo = Integer.valueOf(detectedActivity4.f12513b).compareTo(Integer.valueOf(detectedActivity3.f12513b));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i11 = detectedActivity3.f12512a;
        int i12 = 4;
        if (i11 > 22 || i11 < 0) {
            i11 = 4;
        }
        Integer numValueOf = Integer.valueOf(i11);
        int i13 = detectedActivity4.f12512a;
        if (i13 <= 22 && i13 >= 0) {
            i12 = i13;
        }
        return numValueOf.compareTo(Integer.valueOf(i12));
    }
}
