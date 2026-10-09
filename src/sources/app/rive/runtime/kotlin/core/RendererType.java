package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.f;
import yy.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum RendererType {
    Rive(0),
    Canvas(1);

    private final int value;
    private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final RendererType fromIndex(int i11) {
            int iB = ((ry.a) RendererType.getEntries()).b();
            if (i11 >= 0 && i11 <= iB) {
                return (RendererType) ((b) RendererType.getEntries()).get(i11);
            }
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + i11 + ". It must be between 0 and " + iB);
        }

        private Companion() {
        }
    }

    RendererType(int i11) {
        this.value = i11;
    }

    public static yy.a getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
