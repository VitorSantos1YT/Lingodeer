package com.lingodeer.data.model;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum ReviewVisibilityMode {
    DEFAULT(0),
    HIDE(1),
    SHOW(2);

    private final int value;
    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ReviewVisibilityMode fromExplicitExcluded(boolean z11) {
            return z11 ? ReviewVisibilityMode.HIDE : ReviewVisibilityMode.SHOW;
        }

        public final ReviewVisibilityMode fromValue(int i11) {
            Object next;
            Iterator<E> it = ReviewVisibilityMode.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ReviewVisibilityMode) next).getValue() != i11);
            ReviewVisibilityMode reviewVisibilityMode = (ReviewVisibilityMode) next;
            return reviewVisibilityMode == null ? ReviewVisibilityMode.DEFAULT : reviewVisibilityMode;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewVisibilityMode.values().length];
            try {
                iArr[ReviewVisibilityMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewVisibilityMode.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewVisibilityMode.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    ReviewVisibilityMode(int i11) {
        this.value = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isExcludedFromReview(int i11) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            return i11 == 2;
        }
        if (i12 == 2) {
            return true;
        }
        if (i12 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
