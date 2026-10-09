package com.lingodeer.data.model.uistate;

import com.google.android.material.datepicker.d;
import com.lingodeer.data.model.LanStaticsInfo;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface MasteryUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements MasteryUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -1421872230;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements MasteryUiState {
        private final List<LanStaticsInfo> statics;

        public Success(List<LanStaticsInfo> statics) {
            m.f(statics, "statics");
            this.statics = statics;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = success.statics;
            }
            return success.copy(list);
        }

        public final List<LanStaticsInfo> component1() {
            return this.statics;
        }

        public final Success copy(List<LanStaticsInfo> statics) {
            m.f(statics, "statics");
            return new Success(statics);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m.a(this.statics, ((Success) obj).statics);
        }

        public final List<LanStaticsInfo> getStatics() {
            return this.statics;
        }

        public int hashCode() {
            return this.statics.hashCode();
        }

        public String toString() {
            return d.l(this.statics, "Success(statics=", ")");
        }
    }
}
