package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.f;
import nv.p;
import yy.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum Loop {
    ONESHOT,
    LOOP,
    PINGPONG,
    AUTO;

    private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Loop fromIndex(int i11) {
            int iB = ((ry.a) Loop.getEntries()).b();
            if (i11 < 0 || i11 > iB) {
                throw new IndexOutOfBoundsException(p.p("Invalid Loop index value ", i11, iB, ". It must be between 0 and "));
            }
            return (Loop) ((b) Loop.getEntries()).get(i11);
        }

        private Companion() {
        }
    }

    public static yy.a getEntries() {
        return $ENTRIES;
    }
}
