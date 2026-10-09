package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.f;
import nv.p;
import yy.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum Alignment {
    TOP_LEFT,
    TOP_CENTER,
    TOP_RIGHT,
    CENTER_LEFT,
    CENTER,
    CENTER_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_CENTER,
    BOTTOM_RIGHT;

    private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Alignment fromIndex(int i11) {
            int iB = ((ry.a) Alignment.getEntries()).b();
            if (i11 < 0 || i11 > iB) {
                throw new IndexOutOfBoundsException(p.p("Invalid Alignment index value ", i11, iB, ". It must be between 0 and "));
            }
            return (Alignment) ((b) Alignment.getEntries()).get(i11);
        }

        private Companion() {
        }
    }

    public static yy.a getEntries() {
        return $ENTRIES;
    }
}
