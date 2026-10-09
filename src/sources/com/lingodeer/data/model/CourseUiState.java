package com.lingodeer.data.model;

import defpackage.e;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface CourseUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements CourseUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -764679301;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements CourseUiState {
        private final int alphabetRes;
        private final List<CourseUnit> courseUnits;
        private final int currentEnterIndex;
        private final boolean finishedAll;
        private final boolean hasAlphabet;
        private final boolean hasPurchased;
        private final boolean showLevelUp;

        public Success(List<CourseUnit> courseUnits, boolean z11, int i11, int i12, boolean z12, boolean z13, boolean z14) {
            m.f(courseUnits, "courseUnits");
            this.courseUnits = courseUnits;
            this.hasAlphabet = z11;
            this.alphabetRes = i11;
            this.currentEnterIndex = i12;
            this.hasPurchased = z12;
            this.showLevelUp = z13;
            this.finishedAll = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, boolean z11, int i11, int i12, boolean z12, boolean z13, boolean z14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = success.courseUnits;
            }
            if ((i13 & 2) != 0) {
                z11 = success.hasAlphabet;
            }
            if ((i13 & 4) != 0) {
                i11 = success.alphabetRes;
            }
            if ((i13 & 8) != 0) {
                i12 = success.currentEnterIndex;
            }
            if ((i13 & 16) != 0) {
                z12 = success.hasPurchased;
            }
            if ((i13 & 32) != 0) {
                z13 = success.showLevelUp;
            }
            if ((i13 & 64) != 0) {
                z14 = success.finishedAll;
            }
            boolean z15 = z13;
            boolean z16 = z14;
            boolean z17 = z12;
            int i14 = i11;
            return success.copy(list, z11, i14, i12, z17, z15, z16);
        }

        public final List<CourseUnit> component1() {
            return this.courseUnits;
        }

        public final boolean component2() {
            return this.hasAlphabet;
        }

        public final int component3() {
            return this.alphabetRes;
        }

        public final int component4() {
            return this.currentEnterIndex;
        }

        public final boolean component5() {
            return this.hasPurchased;
        }

        public final boolean component6() {
            return this.showLevelUp;
        }

        public final boolean component7() {
            return this.finishedAll;
        }

        public final Success copy(List<CourseUnit> courseUnits, boolean z11, int i11, int i12, boolean z12, boolean z13, boolean z14) {
            m.f(courseUnits, "courseUnits");
            return new Success(courseUnits, z11, i11, i12, z12, z13, z14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return m.a(this.courseUnits, success.courseUnits) && this.hasAlphabet == success.hasAlphabet && this.alphabetRes == success.alphabetRes && this.currentEnterIndex == success.currentEnterIndex && this.hasPurchased == success.hasPurchased && this.showLevelUp == success.showLevelUp && this.finishedAll == success.finishedAll;
        }

        public final int getAlphabetRes() {
            return this.alphabetRes;
        }

        public final List<CourseUnit> getCourseUnits() {
            return this.courseUnits;
        }

        public final int getCurrentEnterIndex() {
            return this.currentEnterIndex;
        }

        public final boolean getFinishedAll() {
            return this.finishedAll;
        }

        public final boolean getHasAlphabet() {
            return this.hasAlphabet;
        }

        public final boolean getHasPurchased() {
            return this.hasPurchased;
        }

        public final boolean getShowLevelUp() {
            return this.showLevelUp;
        }

        public int hashCode() {
            return Boolean.hashCode(this.finishedAll) + e.e(e.e(e.b(this.currentEnterIndex, e.b(this.alphabetRes, e.e(this.courseUnits.hashCode() * 31, 31, this.hasAlphabet), 31), 31), 31, this.hasPurchased), 31, this.showLevelUp);
        }

        public String toString() {
            List<CourseUnit> list = this.courseUnits;
            boolean z11 = this.hasAlphabet;
            int i11 = this.alphabetRes;
            int i12 = this.currentEnterIndex;
            boolean z12 = this.hasPurchased;
            boolean z13 = this.showLevelUp;
            boolean z14 = this.finishedAll;
            StringBuilder sb2 = new StringBuilder("Success(courseUnits=");
            sb2.append(list);
            sb2.append(", hasAlphabet=");
            sb2.append(z11);
            sb2.append(", alphabetRes=");
            a.v(i11, i12, ", currentEnterIndex=", ", hasPurchased=", sb2);
            a.B(", showLevelUp=", ", finishedAll=", sb2, z12, z13);
            return p0.p(sb2, z14, ")");
        }
    }
}
