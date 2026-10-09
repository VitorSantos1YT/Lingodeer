package com.lingodeer.data.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RecordingStatus {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ReadyRecord extends RecordingStatus {
        public static final ReadyRecord INSTANCE = new ReadyRecord();

        private ReadyRecord() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReadyRecord);
        }

        public int hashCode() {
            return -1413629484;
        }

        public String toString() {
            return "ReadyRecord";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RecognizeError extends RecordingStatus {
        private final String errorMessage;
        private final RecognizeErrorType errorType;

        /* JADX WARN: Multi-variable type inference failed */
        public RecognizeError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RecognizeError copy$default(RecognizeError recognizeError, String str, RecognizeErrorType recognizeErrorType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = recognizeError.errorMessage;
            }
            if ((i11 & 2) != 0) {
                recognizeErrorType = recognizeError.errorType;
            }
            return recognizeError.copy(str, recognizeErrorType);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final RecognizeErrorType component2() {
            return this.errorType;
        }

        public final RecognizeError copy(String errorMessage, RecognizeErrorType errorType) {
            m.f(errorMessage, "errorMessage");
            m.f(errorType, "errorType");
            return new RecognizeError(errorMessage, errorType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecognizeError)) {
                return false;
            }
            RecognizeError recognizeError = (RecognizeError) obj;
            return m.a(this.errorMessage, recognizeError.errorMessage) && this.errorType == recognizeError.errorType;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final RecognizeErrorType getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return this.errorType.hashCode() + (this.errorMessage.hashCode() * 31);
        }

        public String toString() {
            return "RecognizeError(errorMessage=" + this.errorMessage + ", errorType=" + this.errorType + ")";
        }

        public /* synthetic */ RecognizeError(String str, RecognizeErrorType recognizeErrorType, int i11, f fVar) {
            this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? RecognizeErrorType.UNKNOWN : recognizeErrorType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecognizeError(String errorMessage, RecognizeErrorType errorType) {
            super(null);
            m.f(errorMessage, "errorMessage");
            m.f(errorType, "errorType");
            this.errorMessage = errorMessage;
            this.errorType = errorType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RecognizeShowScore extends RecordingStatus {
        private final boolean isWordItem;
        private final float speechScore;

        public /* synthetic */ RecognizeShowScore(float f5, boolean z11, int i11, f fVar) {
            this(f5, (i11 & 2) != 0 ? false : z11);
        }

        public static /* synthetic */ RecognizeShowScore copy$default(RecognizeShowScore recognizeShowScore, float f5, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f5 = recognizeShowScore.speechScore;
            }
            if ((i11 & 2) != 0) {
                z11 = recognizeShowScore.isWordItem;
            }
            return recognizeShowScore.copy(f5, z11);
        }

        public final float component1() {
            return this.speechScore;
        }

        public final boolean component2() {
            return this.isWordItem;
        }

        public final RecognizeShowScore copy(float f5, boolean z11) {
            return new RecognizeShowScore(f5, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecognizeShowScore)) {
                return false;
            }
            RecognizeShowScore recognizeShowScore = (RecognizeShowScore) obj;
            return Float.compare(this.speechScore, recognizeShowScore.speechScore) == 0 && this.isWordItem == recognizeShowScore.isWordItem;
        }

        public final float getSpeechScore() {
            return this.speechScore;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWordItem) + (Float.hashCode(this.speechScore) * 31);
        }

        public final boolean isWordItem() {
            return this.isWordItem;
        }

        public String toString() {
            return "RecognizeShowScore(speechScore=" + this.speechScore + ", isWordItem=" + this.isWordItem + ")";
        }

        public RecognizeShowScore(float f5, boolean z11) {
            super(null);
            this.speechScore = f5;
            this.isWordItem = z11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RecognizeSuccess extends RecordingStatus {
        private final List<WordAccuracyScoreTimingResult> accuracyScoreList;
        private final String result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecognizeSuccess(String result, List<WordAccuracyScoreTimingResult> accuracyScoreList) {
            super(null);
            m.f(result, "result");
            m.f(accuracyScoreList, "accuracyScoreList");
            this.result = result;
            this.accuracyScoreList = accuracyScoreList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecognizeSuccess copy$default(RecognizeSuccess recognizeSuccess, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = recognizeSuccess.result;
            }
            if ((i11 & 2) != 0) {
                list = recognizeSuccess.accuracyScoreList;
            }
            return recognizeSuccess.copy(str, list);
        }

        public final String component1() {
            return this.result;
        }

        public final List<WordAccuracyScoreTimingResult> component2() {
            return this.accuracyScoreList;
        }

        public final RecognizeSuccess copy(String result, List<WordAccuracyScoreTimingResult> accuracyScoreList) {
            m.f(result, "result");
            m.f(accuracyScoreList, "accuracyScoreList");
            return new RecognizeSuccess(result, accuracyScoreList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecognizeSuccess)) {
                return false;
            }
            RecognizeSuccess recognizeSuccess = (RecognizeSuccess) obj;
            return m.a(this.result, recognizeSuccess.result) && m.a(this.accuracyScoreList, recognizeSuccess.accuracyScoreList);
        }

        public final List<WordAccuracyScoreTimingResult> getAccuracyScoreList() {
            return this.accuracyScoreList;
        }

        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.accuracyScoreList.hashCode() + (this.result.hashCode() * 31);
        }

        public String toString() {
            return "RecognizeSuccess(result=" + this.result + ", accuracyScoreList=" + this.accuracyScoreList + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Recognizing extends RecordingStatus {
        public static final Recognizing INSTANCE = new Recognizing();

        private Recognizing() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Recognizing);
        }

        public int hashCode() {
            return -1026701365;
        }

        public String toString() {
            return "Recognizing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Recording extends RecordingStatus {
        public static final Recording INSTANCE = new Recording();

        private Recording() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Recording);
        }

        public int hashCode() {
            return 223316977;
        }

        public String toString() {
            return "Recording";
        }
    }

    public /* synthetic */ RecordingStatus(f fVar) {
        this();
    }

    private RecordingStatus() {
    }
}
