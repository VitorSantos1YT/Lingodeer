package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CarouselStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14159b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrategyType {
        private static final /* synthetic */ StrategyType[] $VALUES;
        public static final StrategyType CONTAINED;
        public static final StrategyType UNCONTAINED;

        static {
            StrategyType strategyType = new StrategyType("CONTAINED", 0);
            CONTAINED = strategyType;
            StrategyType strategyType2 = new StrategyType("UNCONTAINED", 1);
            UNCONTAINED = strategyType2;
            $VALUES = new StrategyType[]{strategyType, strategyType2};
        }

        public static StrategyType valueOf(String str) {
            return (StrategyType) Enum.valueOf(StrategyType.class, str);
        }

        public static StrategyType[] values() {
            return (StrategyType[]) $VALUES.clone();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = iArr[i11] * 2;
        }
        return iArr2;
    }

    public static float b(float f5, float f11, float f12) {
        return 1.0f - ((f5 - f12) / (f11 - f12));
    }
}
