package com.lingodeer.data.model.uistate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface CommonUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements CommonUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 932150266;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements CommonUiState {
        private final boolean hasPurchased;
        private final int keyLanguage;

        public Success(boolean z11, int i11) {
            this.hasPurchased = z11;
            this.keyLanguage = i11;
        }

        public static /* synthetic */ Success copy$default(Success success, boolean z11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z11 = success.hasPurchased;
            }
            if ((i12 & 2) != 0) {
                i11 = success.keyLanguage;
            }
            return success.copy(z11, i11);
        }

        public final boolean component1() {
            return this.hasPurchased;
        }

        public final int component2() {
            return this.keyLanguage;
        }

        public final Success copy(boolean z11, int i11) {
            return new Success(z11, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.hasPurchased == success.hasPurchased && this.keyLanguage == success.keyLanguage;
        }

        public final boolean getHasPurchased() {
            return this.hasPurchased;
        }

        public final int getKeyLanguage() {
            return this.keyLanguage;
        }

        public int hashCode() {
            return Integer.hashCode(this.keyLanguage) + (Boolean.hashCode(this.hasPurchased) * 31);
        }

        public String toString() {
            return "Success(hasPurchased=" + this.hasPurchased + ", keyLanguage=" + this.keyLanguage + ")";
        }
    }
}
