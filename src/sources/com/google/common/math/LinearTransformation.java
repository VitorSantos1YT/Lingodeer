package com.google.common.math;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class LinearTransformation {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LinearTransformationBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NaNLinearTransformation extends LinearTransformation {
        static {
            new NaNLinearTransformation();
        }

        private NaNLinearTransformation() {
        }

        public final String toString() {
            return "NaN";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RegularLinearTransformation extends LinearTransformation {
        public final String toString() {
            Double dValueOf = Double.valueOf(0.0d);
            return String.format("y = %g * x + %g", dValueOf, dValueOf);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class VerticalLinearTransformation extends LinearTransformation {
        public final String toString() {
            return String.format("x = %g", Double.valueOf(0.0d));
        }
    }
}
