package com.google.zxing.qrcode.detector;

import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FinderPatternFinder {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            finderPattern2.getClass();
            finderPattern.getClass();
            int iCompare = Integer.compare(0, 0);
            return iCompare == 0 ? Float.compare(Math.abs(CropImageView.DEFAULT_ASPECT_RATIO), Math.abs(CropImageView.DEFAULT_ASPECT_RATIO)) : iCompare;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            finderPattern2.getClass();
            float fAbs = Math.abs(CropImageView.DEFAULT_ASPECT_RATIO);
            finderPattern.getClass();
            return Float.compare(fAbs, Math.abs(CropImageView.DEFAULT_ASPECT_RATIO));
        }
    }
}
