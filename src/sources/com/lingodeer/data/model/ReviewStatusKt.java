package com.lingodeer.data.model;

import com.bumptech.glide.e;
import com.lingodeer.database.model.ReviewStatusEntity;
import kotlin.jvm.internal.m;
import oz.q;
import qy.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ReviewStatusKt {
    public static final ReviewStatusEntity asEntityModel(ReviewStatus reviewStatus) {
        m.f(reviewStatus, "<this>");
        return new ReviewStatusEntity(reviewStatus.getId(), reviewStatus.getUnitId(), reviewStatus.getElemId(), reviewStatus.getElemType(), reviewStatus.getLastStudyTime(), reviewStatus.getStatus());
    }

    public static final ReviewStatus asExternalModel(ReviewStatusEntity reviewStatusEntity) {
        m.f(reviewStatusEntity, "<this>");
        return new ReviewStatus(reviewStatusEntity.getId(), reviewStatusEntity.getUnitId(), reviewStatusEntity.getElemId(), reviewStatusEntity.getElemType(), reviewStatusEntity.getLastStudyTime(), reviewStatusEntity.getStatus());
    }

    public static final int level(ReviewStatus reviewStatus) {
        m.f(reviewStatus, "<this>");
        String status = reviewStatus.getStatus();
        if (m.a(status, "D")) {
            return 1;
        }
        return m.a(status, "C") ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    public static final ReviewStatusEntity recordToReviewStatus(String str) {
        m.f(str, "<this>");
        int i11 = 0;
        String str2 = (String) q.W0(str, new String[]{":"}, 0, 6).get(0);
        long j11 = Long.parseLong((String) q.W0(str, new String[]{":"}, 0, 6).get(1));
        long j12 = Long.parseLong((String) q.W0(str, new String[]{":"}, 0, 6).get(2));
        String str3 = (String) q.W0(str, new String[]{":"}, 0, 6).get(3);
        long j13 = Long.parseLong((String) q.W0(str2, new String[]{"_"}, 0, 6).get(2));
        String str4 = (String) q.W0(str2, new String[]{"_"}, 0, 6).get(1);
        int iHashCode = str4.hashCode();
        if (iHashCode != 99) {
            if (iHashCode != 115) {
                if (iHashCode != 119) {
                    if (iHashCode == 3664 && str4.equals("sc")) {
                        i11 = 3;
                    } else {
                        i11 = -1;
                    }
                } else if (!str4.equals("w")) {
                    i11 = -1;
                }
            } else if (str4.equals("s")) {
                i11 = 1;
            } else {
                i11 = -1;
            }
        } else if (str4.equals("c")) {
            i11 = 2;
        } else {
            i11 = -1;
        }
        return new ReviewStatusEntity(str2, j11, j13, i11, j12, str3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    public static final ReviewStatus toReviewStatus(String str) {
        Object objL;
        m.f(str, "<this>");
        try {
            int i11 = 0;
            String str2 = (String) q.W0(str, new String[]{":"}, 0, 6).get(0);
            long j11 = Long.parseLong((String) q.W0(str, new String[]{":"}, 0, 6).get(1));
            long j12 = Long.parseLong((String) q.W0(str, new String[]{":"}, 0, 6).get(2));
            String str3 = (String) q.W0(str, new String[]{":"}, 0, 6).get(3);
            long j13 = Long.parseLong((String) q.W0(str2, new String[]{"_"}, 0, 6).get(2));
            String str4 = (String) q.W0(str2, new String[]{"_"}, 0, 6).get(1);
            int iHashCode = str4.hashCode();
            if (iHashCode != 99) {
                if (iHashCode != 115) {
                    if (iHashCode != 119) {
                        if (iHashCode == 3664 && str4.equals("sc")) {
                            i11 = 3;
                        } else {
                            i11 = -1;
                        }
                    } else if (!str4.equals("w")) {
                        i11 = -1;
                    }
                } else if (str4.equals("s")) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
            } else if (str4.equals("c")) {
                i11 = 2;
            } else {
                i11 = -1;
            }
            objL = new ReviewStatus(str2, j11, j13, i11, j12, str3);
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        if (o.a(objL) == null) {
            return (ReviewStatus) objL;
        }
        return null;
    }
}
