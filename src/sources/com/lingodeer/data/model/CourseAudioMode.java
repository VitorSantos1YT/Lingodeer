package com.lingodeer.data.model;

import kotlin.NoWhenBranchMatchedException;
import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum CourseAudioMode {
    AUTO_PLAY,
    TAP_TO_PLAY;

    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CourseAudioMode.values().length];
            try {
                iArr[CourseAudioMode.AUTO_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseAudioMode.TAP_TO_PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getWireName() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "auto_play";
        }
        if (i11 == 2) {
            return "tap_to_play";
        }
        throw new NoWhenBranchMatchedException();
    }
}
