package com.lingodeer.data.model;

import kotlin.jvm.internal.m;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CoursePracticeTypeKt {
    public static final boolean isTestOut(CoursePracticeType coursePracticeType) {
        m.f(coursePracticeType, "<this>");
        return l.D(new CoursePracticeType[]{CoursePracticeType.COURSE_TEST_OUT, CoursePracticeType.COURSE_TEST_OUT_REVIEW}, coursePracticeType);
    }
}
